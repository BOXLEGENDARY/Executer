package com.github.luben.zstd;

import java.nio.ByteBuffer;

public class NoPool implements BufferPool {
    public static final BufferPool INSTANCE = new NoPool();

    private NoPool() {
    }

    @Override
    public ByteBuffer get(int i7) {
        return ByteBuffer.allocate(i7);
    }

    @Override
    public void release(ByteBuffer byteBuffer) {
    }
}
