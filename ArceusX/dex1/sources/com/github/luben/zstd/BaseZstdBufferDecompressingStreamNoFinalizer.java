package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class BaseZstdBufferDecompressingStreamNoFinalizer implements Closeable {
    private int consumed;
    private int produced;
    protected ByteBuffer source;
    protected long stream;
    protected boolean closed = false;
    private boolean finishedFrame = false;
    private boolean streamEnd = false;

    BaseZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        this.source = byteBuffer;
    }

    @Override
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            freeDStream(this.stream);
        } finally {
            this.closed = true;
            this.source = null;
        }
    }

    abstract long createDStream();

    abstract long decompressStream(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    abstract long freeDStream(long j7);

    public boolean hasRemaining() {
        return !this.streamEnd && (this.source.hasRemaining() || !this.finishedFrame);
    }

    abstract long initDStream(long j7);

    public abstract int read(ByteBuffer byteBuffer) throws IOException;

    int readInternal(ByteBuffer byteBuffer, boolean z7) throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.streamEnd) {
            return 0;
        }
        long j7 = this.stream;
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.source;
        long jDecompressStream = decompressStream(j7, byteBuffer, iPosition, iRemaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
        if (Zstd.isError(jDecompressStream)) {
            throw new ZstdIOException(jDecompressStream);
        }
        ByteBuffer byteBuffer3 = this.source;
        byteBuffer3.position(byteBuffer3.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!this.source.hasRemaining()) {
            ByteBuffer byteBufferRefill = refill(this.source);
            this.source = byteBufferRefill;
            if (!z7 && byteBufferRefill.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
            }
            if (z7 && !this.source.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z8 = jDecompressStream == 0;
        this.finishedFrame = z8;
        if (z8) {
            this.streamEnd = !this.source.hasRemaining();
        }
        return this.produced;
    }

    protected ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setLongMax(int i7) throws IOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i7);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
            return this;
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
    }
}
