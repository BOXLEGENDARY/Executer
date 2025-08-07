package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    private int level;
    private final long stream;
    private ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i7) throws IOException {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.target = byteBuffer;
        this.level = i7;
        this.stream = createCStream();
    }

    private native long compressDirectByteBuffer(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    private static native long createCStream();

    private native long endStream(long j7, ByteBuffer byteBuffer, int i7, int i8);

    private native long flushStream(long j7, ByteBuffer byteBuffer, int i7, int i8);

    private static native long freeCStream(long j7);

    private native long initCStream(long j7, int i7);

    private native long initCStreamWithDict(long j7, byte[] bArr, int i7, int i8);

    private native long initCStreamWithFastDict(long j7, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    @Override
    public void close() throws IOException {
        long jEndStream;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                do {
                    long j7 = this.stream;
                    ByteBuffer byteBuffer = this.target;
                    jEndStream = endStream(j7, byteBuffer, byteBuffer.position(), this.target.remaining());
                    if (Zstd.isError(jEndStream)) {
                        throw new ZstdIOException(jEndStream);
                    }
                    ByteBuffer byteBuffer2 = this.target;
                    byteBuffer2.position(byteBuffer2.position() + this.produced);
                    ByteBuffer byteBufferFlushBuffer = flushBuffer(this.target);
                    this.target = byteBufferFlushBuffer;
                    if (!byteBufferFlushBuffer.isDirect()) {
                        throw new IllegalArgumentException("Target buffer should be a direct buffer");
                    }
                    if (jEndStream > 0 && !this.target.hasRemaining()) {
                        throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    }
                } while (jEndStream > 0);
            }
        } finally {
            freeCStream(this.stream);
            this.closed = true;
            this.initialized = false;
            this.target = null;
        }
    }

    public void compress(ByteBuffer byteBuffer) throws IOException {
        long jInitCStreamWithDict;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (!this.initialized) {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                zstdDictCompress.acquireSharedLock();
                try {
                    jInitCStreamWithDict = initCStreamWithFastDict(this.stream, zstdDictCompress);
                } finally {
                    zstdDictCompress.releaseSharedLock();
                }
            } else {
                byte[] bArr = this.dict;
                jInitCStreamWithDict = bArr != null ? initCStreamWithDict(this.stream, bArr, bArr.length, this.level) : initCStream(this.stream, this.level);
            }
            if (Zstd.isError(jInitCStreamWithDict)) {
                throw new ZstdIOException(jInitCStreamWithDict);
            }
            this.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!this.target.hasRemaining()) {
                ByteBuffer byteBufferFlushBuffer = flushBuffer(this.target);
                this.target = byteBufferFlushBuffer;
                if (!byteBufferFlushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j7 = this.stream;
            ByteBuffer byteBuffer2 = this.target;
            long jCompressDirectByteBuffer = compressDirectByteBuffer(j7, byteBuffer2, byteBuffer2.position(), this.target.remaining(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(jCompressDirectByteBuffer)) {
                throw new ZstdIOException(jCompressDirectByteBuffer);
            }
            ByteBuffer byteBuffer3 = this.target;
            byteBuffer3.position(byteBuffer3.position() + this.produced);
            byteBuffer.position(byteBuffer.position() + this.consumed);
        }
    }

    @Override
    public void flush() throws IOException {
        long jFlushStream;
        if (this.closed) {
            throw new IOException("Already closed");
        }
        if (this.initialized) {
            do {
                long j7 = this.stream;
                ByteBuffer byteBuffer = this.target;
                jFlushStream = flushStream(j7, byteBuffer, byteBuffer.position(), this.target.remaining());
                if (Zstd.isError(jFlushStream)) {
                    throw new ZstdIOException(jFlushStream);
                }
                ByteBuffer byteBuffer2 = this.target;
                byteBuffer2.position(byteBuffer2.position() + this.produced);
                ByteBuffer byteBufferFlushBuffer = flushBuffer(this.target);
                this.target = byteBufferFlushBuffer;
                if (!byteBufferFlushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (jFlushStream > 0 && !this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            } while (jFlushStream > 0);
        }
    }

    protected ByteBuffer flushBuffer(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (this.initialized) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.dict = bArr;
        this.fastDict = null;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new IllegalStateException("Change of parameter on initialized stream");
    }
}
