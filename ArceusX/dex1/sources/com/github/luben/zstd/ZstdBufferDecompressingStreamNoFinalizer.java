package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ZstdBufferDecompressingStreamNoFinalizer extends BaseZstdBufferDecompressingStreamNoFinalizer {
    static {
        Native.load();
    }

    public ZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
        }
        long jCreateDStream = createDStream();
        this.stream = jCreateDStream;
        initDStream(jCreateDStream);
    }

    private native long createDStreamNative();

    private native long decompressStreamNative(long j7, byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10);

    private native long freeDStreamNative(long j7);

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
        if (!byteBuffer2.hasArray()) {
            throw new IllegalArgumentException("provided source ByteBuffer lacks array");
        }
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("provided destination ByteBuffer lacks array");
        }
        return decompressStreamNative(j7, byteBuffer.array(), i7 + byteBuffer.arrayOffset(), i8, byteBuffer2.array(), i9 + byteBuffer2.arrayOffset(), i10);
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
            throw new IllegalArgumentException("Target buffer should be a non-direct buffer");
        }
        return readInternal(byteBuffer, false);
    }
}
