package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdDirectBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdDirectBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        this.source = byteBuffer;
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private static native long createDStreamNative();

    private native long decompressStreamNative(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    private static native long freeDStreamNative(long j7);

    private native long initDStreamNative(long j7);

    private static native long recommendedDOutSizeNative();

    public static int recommendedTargetBufferSize() {
        return (int) recommendedDOutSizeNative();
    }

    @Override
    long createDStream() {
        return createDStreamNative();
    }

    @Override
    long decompressStream(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        return decompressStreamNative(j7, byteBuffer, i7, i8, byteBuffer2, i9, i10);
    }

    @Override
    long freeDStream(long j7) {
        return freeDStreamNative(j7);
    }

    @Override
    long initDStream(long j7) {
        return initDStreamNative(j7);
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.isDirect()) {
            return readInternal(byteBuffer, true);
        }
        throw new IllegalArgumentException("Target buffer should be a direct buffer");
    }
}
