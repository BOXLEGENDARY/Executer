package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ZstdOutputStream extends FilterOutputStream {
    private ZstdOutputStreamNoFinalizer inner;

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i7, boolean z7, boolean z8) throws IOException {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i7);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z7);
        this.inner.setChecksum(z8);
    }

    public static long recommendedCOutSize() {
        return ZstdOutputStreamNoFinalizer.recommendedCOutSize();
    }

    @Override
    public void close() throws IOException {
        this.inner.close();
    }

    protected void finalize() throws Throwable {
        close();
    }

    @Override
    public void flush() throws IOException {
        this.inner.flush();
    }

    public ZstdOutputStream setChainLog(int i7) throws IOException {
        this.inner.setChainLog(i7);
        return this;
    }

    public ZstdOutputStream setChecksum(boolean z7) throws IOException {
        this.inner.setChecksum(z7);
        return this;
    }

    public ZstdOutputStream setCloseFrameOnFlush(boolean z7) {
        this.inner.setCloseFrameOnFlush(z7);
        return this;
    }

    public ZstdOutputStream setDict(byte[] bArr) throws IOException {
        this.inner.setDict(bArr);
        return this;
    }

    @Deprecated
    public void setFinalize(boolean z7) {
    }

    public ZstdOutputStream setHashLog(int i7) throws IOException {
        this.inner.setHashLog(i7);
        return this;
    }

    public ZstdOutputStream setJobSize(int i7) throws IOException {
        this.inner.setJobSize(i7);
        return this;
    }

    public ZstdOutputStream setLevel(int i7) throws IOException {
        this.inner.setLevel(i7);
        return this;
    }

    public ZstdOutputStream setLong(int i7) throws IOException {
        this.inner.setLong(i7);
        return this;
    }

    public ZstdOutputStream setMinMatch(int i7) throws IOException {
        this.inner.setMinMatch(i7);
        return this;
    }

    public ZstdOutputStream setOverlapLog(int i7) throws IOException {
        this.inner.setOverlapLog(i7);
        return this;
    }

    public ZstdOutputStream setSearchLog(int i7) throws IOException {
        this.inner.setSearchLog(i7);
        return this;
    }

    public ZstdOutputStream setStrategy(int i7) throws IOException {
        this.inner.setStrategy(i7);
        return this;
    }

    public ZstdOutputStream setTargetLength(int i7) throws IOException {
        this.inner.setTargetLength(i7);
        return this;
    }

    public ZstdOutputStream setWindowLog(int i7) throws IOException {
        this.inner.setWindowLog(i7);
        return this;
    }

    public ZstdOutputStream setWorkers(int i7) throws IOException {
        this.inner.setWorkers(i7);
        return this;
    }

    @Override
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        this.inner.write(bArr, i7, i8);
    }

    public ZstdOutputStream setDict(ZstdDictCompress zstdDictCompress) throws IOException {
        this.inner.setDict(zstdDictCompress);
        return this;
    }

    @Override
    public void write(int i7) throws IOException {
        this.inner.write(i7);
    }

    @Deprecated
    public ZstdOutputStream(OutputStream outputStream, int i7, boolean z7) throws IOException {
        super(outputStream);
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer = new ZstdOutputStreamNoFinalizer(outputStream, i7);
        this.inner = zstdOutputStreamNoFinalizer;
        zstdOutputStreamNoFinalizer.setCloseFrameOnFlush(z7);
    }

    public ZstdOutputStream(OutputStream outputStream, int i7) throws IOException {
        this(outputStream, NoPool.INSTANCE);
        this.inner.setLevel(i7);
    }

    public ZstdOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, NoPool.INSTANCE);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool, int i7) throws IOException {
        this(outputStream, bufferPool);
        this.inner.setLevel(i7);
    }

    public ZstdOutputStream(OutputStream outputStream, BufferPool bufferPool) throws IOException {
        super(outputStream);
        this.inner = new ZstdOutputStreamNoFinalizer(outputStream, bufferPool);
    }
}
