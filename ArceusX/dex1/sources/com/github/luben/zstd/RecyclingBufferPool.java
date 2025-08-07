package com.github.luben.zstd;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    private static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> pool = new ConcurrentLinkedQueue<>();

    private RecyclingBufferPool() {
    }

    @Override
    public ByteBuffer get(int i7) {
        ByteBuffer byteBuffer;
        int i8 = buffSize;
        if (i7 <= i8) {
            do {
                SoftReference<ByteBuffer> softReferencePoll = this.pool.poll();
                if (softReferencePoll == null) {
                    return ByteBuffer.allocate(buffSize);
                }
                byteBuffer = softReferencePoll.get();
            } while (byteBuffer == null);
            return byteBuffer;
        }
        throw new RuntimeException("Unsupported buffer size: " + i7 + ". Supported buffer sizes: " + i8 + " or smaller.");
    }

    @Override
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference<>(byteBuffer));
        }
    }
}
