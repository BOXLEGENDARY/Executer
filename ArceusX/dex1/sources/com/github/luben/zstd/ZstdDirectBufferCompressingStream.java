package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferCompressingStream implements Closeable, Flushable {
    private boolean finalize;
    ZstdDirectBufferCompressingStreamNoFinalizer inner;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStream(ByteBuffer byteBuffer, int i7) throws IOException {
        this.inner = new ZstdDirectBufferCompressingStreamNoFinalizer(byteBuffer, i7) {
            @Override
            protected ByteBuffer flushBuffer(ByteBuffer byteBuffer2) throws IOException {
                return ZstdDirectBufferCompressingStream.this.flushBuffer(byteBuffer2);
            }
        };
    }

    public static int recommendedOutputBufferSize() {
        return ZstdDirectBufferCompressingStreamNoFinalizer.recommendedOutputBufferSize();
    }

    @Override
    public synchronized void close() throws IOException {
        this.inner.close();
    }

    public synchronized void compress(ByteBuffer byteBuffer) throws IOException {
        this.inner.compress(byteBuffer);
    }

    protected void finalize() throws Throwable {
        if (this.finalize) {
            close();
        }
    }

    @Override
    public synchronized void flush() throws IOException {
        this.inner.flush();
    }

    protected ByteBuffer flushBuffer(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }

    public synchronized ZstdDirectBufferCompressingStream setDict(byte[] bArr) throws IOException {
        this.inner.setDict(bArr);
        return this;
    }

    public void setFinalize(boolean z7) {
        this.finalize = z7;
    }

    public synchronized ZstdDirectBufferCompressingStream setDict(ZstdDictCompress zstdDictCompress) throws IOException {
        this.inner.setDict(zstdDictCompress);
        return this;
    }
}
