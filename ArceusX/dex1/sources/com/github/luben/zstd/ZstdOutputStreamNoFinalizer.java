package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    private static final int dstSize;
    private final BufferPool bufferPool;
    private boolean closeFrameOnFlush;
    private final byte[] dst;
    private final ByteBuffer dstByteBuffer;
    private long dstPos;
    private boolean frameClosed;
    private boolean frameStarted;
    private boolean isClosed;
    private long srcPos;
    private final long stream;

    static {
        Native.load();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i7) throws IOException {
        this(outputStream, NoPool.INSTANCE);
        Zstd.setCompressionLevel(this.stream, i7);
    }

    private native int compressStream(long j7, byte[] bArr, int i7, byte[] bArr2, int i8);

    private static native long createCStream();

    private native int endStream(long j7, byte[] bArr, int i7);

    private native int flushStream(long j7, byte[] bArr, int i7);

    private static native int freeCStream(long j7);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j7);

    @Override
    public synchronized void close() throws IOException {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() throws IOException {
        close(false);
    }

    @Override
    public synchronized void flush() throws IOException {
        int iFlushStream;
        int iEndStream;
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (!this.frameClosed) {
                if (this.closeFrameOnFlush) {
                    do {
                        iEndStream = endStream(this.stream, this.dst, dstSize);
                        long j7 = iEndStream;
                        if (Zstd.isError(j7)) {
                            throw new ZstdIOException(j7);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (iEndStream > 0);
                    this.frameClosed = true;
                } else {
                    do {
                        iFlushStream = flushStream(this.stream, this.dst, dstSize);
                        long j8 = iFlushStream;
                        if (Zstd.isError(j8)) {
                            throw new ZstdIOException(j8);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (iFlushStream > 0);
                }
                ((FilterOutputStream) this).out.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChainLog(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChainLog = Zstd.setCompressionChainLog(this.stream, i7);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdIOException(compressionChainLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChecksums = Zstd.setCompressionChecksums(this.stream, z7);
            if (Zstd.isError(compressionChecksums)) {
                throw new ZstdIOException(compressionChecksums);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z7) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.closeFrameOnFlush = z7;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long jLoadDictCompress = Zstd.loadDictCompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(jLoadDictCompress)) {
                throw new ZstdIOException(jLoadDictCompress);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setHashLog(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionHashLog = Zstd.setCompressionHashLog(this.stream, i7);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdIOException(compressionHashLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setJobSize(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionJobSize = Zstd.setCompressionJobSize(this.stream, i7);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdIOException(compressionJobSize);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLevel = Zstd.setCompressionLevel(this.stream, i7);
            if (Zstd.isError(compressionLevel)) {
                throw new ZstdIOException(compressionLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLong = Zstd.setCompressionLong(this.stream, i7);
            if (Zstd.isError(compressionLong)) {
                throw new ZstdIOException(compressionLong);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setMinMatch(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.stream, i7);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdIOException(compressionMinMatch);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setOverlapLog(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.stream, i7);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdIOException(compressionOverlapLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setSearchLog(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.stream, i7);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdIOException(compressionSearchLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setStrategy(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionStrategy = Zstd.setCompressionStrategy(this.stream, i7);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdIOException(compressionStrategy);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setTargetLength(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.stream, i7);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdIOException(compressionTargetLength);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWindowLog(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.stream, i7);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdIOException(compressionWindowLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i7) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWorkers = Zstd.setCompressionWorkers(this.stream, i7);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdIOException(compressionWorkers);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override
    public synchronized void write(byte[] bArr, int i7, int i8) throws IOException {
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (this.frameClosed) {
                long jResetCStream = resetCStream(this.stream);
                if (Zstd.isError(jResetCStream)) {
                    throw new ZstdIOException(jResetCStream);
                }
                this.frameClosed = false;
                this.frameStarted = true;
            }
            int i9 = i8 + i7;
            this.srcPos = i7;
            while (this.srcPos < i9) {
                long jCompressStream = compressStream(this.stream, this.dst, dstSize, bArr, i9);
                if (Zstd.isError(jCompressStream)) {
                    throw new ZstdIOException(jCompressStream);
                }
                long j7 = this.dstPos;
                if (j7 > 0) {
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) j7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) throws IOException {
        this(outputStream, NoPool.INSTANCE);
    }

    private void close(boolean z7) throws IOException {
        int iEndStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameStarted) {
                long jResetCStream = resetCStream(this.stream);
                if (!Zstd.isError(jResetCStream)) {
                    this.frameClosed = false;
                } else {
                    throw new ZstdIOException(jResetCStream);
                }
            }
            if (!this.frameClosed) {
                do {
                    iEndStream = endStream(this.stream, this.dst, dstSize);
                    long j7 = iEndStream;
                    if (!Zstd.isError(j7)) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } else {
                        throw new ZstdIOException(j7);
                    }
                } while (iEndStream > 0);
            }
            if (z7) {
                ((FilterOutputStream) this).out.close();
            }
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
        } catch (Throwable th) {
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
            throw th;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool, int i7) throws IOException {
        this(outputStream, bufferPool);
        Zstd.setCompressionLevel(this.stream, i7);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool) throws IOException {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.isClosed = false;
        this.closeFrameOnFlush = false;
        this.frameClosed = true;
        this.frameStarted = false;
        this.stream = createCStream();
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, dstSize);
        this.dstByteBuffer = arrayBackedBuffer;
        this.dst = arrayBackedBuffer.array();
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) throws IOException {
        try {
            if (this.frameClosed) {
                long jLoadFastDictCompress = Zstd.loadFastDictCompress(this.stream, zstdDictCompress);
                if (Zstd.isError(jLoadFastDictCompress)) {
                    throw new ZstdIOException(jLoadFastDictCompress);
                }
            } else {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override
    public void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }
}
