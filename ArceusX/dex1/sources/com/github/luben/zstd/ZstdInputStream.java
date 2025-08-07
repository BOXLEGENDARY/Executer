package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private ZstdInputStreamNoFinalizer inner;

    public ZstdInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    @Override
    public int available() throws IOException {
        return this.inner.available();
    }

    @Override
    public void close() throws IOException {
        this.inner.close();
    }

    protected void finalize() throws Throwable {
        close();
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    @Override
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        return this.inner.read(bArr, i7, i8);
    }

    public ZstdInputStream setContinuous(boolean z7) {
        this.inner.setContinuous(z7);
        return this;
    }

    public ZstdInputStream setDict(byte[] bArr) throws IOException {
        this.inner.setDict(bArr);
        return this;
    }

    @Deprecated
    public void setFinalize(boolean z7) {
    }

    public ZstdInputStream setLongMax(int i7) throws IOException {
        this.inner.setLongMax(i7);
        return this;
    }

    public ZstdInputStream setRefMultipleDDicts(boolean z7) throws IOException {
        this.inner.setRefMultipleDDicts(z7);
        return this;
    }

    @Override
    public long skip(long j7) throws IOException {
        return this.inner.skip(j7);
    }

    @Override
    public int read() throws IOException {
        return this.inner.read();
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ZstdInputStream(InputStream inputStream, BufferPool bufferPool) throws IOException {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream, bufferPool);
    }
}
