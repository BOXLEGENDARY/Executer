package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferDecompressingStream implements Closeable {
    private boolean finalize = true;
    private ZstdDirectBufferDecompressingStreamNoFinalizer inner;

    static {
        Native.load();
    }

    public ZstdDirectBufferDecompressingStream(ByteBuffer byteBuffer) {
        this.inner = new ZstdDirectBufferDecompressingStreamNoFinalizer(byteBuffer) {
            @Override
            protected ByteBuffer refill(ByteBuffer byteBuffer2) {
                return ZstdDirectBufferDecompressingStream.this.refill(byteBuffer2);
            }
        };
    }

    public static int recommendedTargetBufferSize() {
        return ZstdDirectBufferDecompressingStreamNoFinalizer.recommendedTargetBufferSize();
    }

    @Override
    public synchronized void close() throws IOException {
        this.inner.close();
    }

    protected void finalize() throws Throwable {
        if (this.finalize) {
            close();
        }
    }

    public synchronized boolean hasRemaining() {
        return this.inner.hasRemaining();
    }

    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        return this.inner.read(byteBuffer);
    }

    protected ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public synchronized ZstdDirectBufferDecompressingStream setDict(byte[] bArr) throws IOException {
        this.inner.setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z7) {
        this.finalize = z7;
    }

    public ZstdDirectBufferDecompressingStream setLongMax(int i7) throws IOException {
        this.inner.setLongMax(i7);
        return this;
    }

    public synchronized ZstdDirectBufferDecompressingStream setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }
}
