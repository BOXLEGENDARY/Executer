package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

public class ZstdDictCompress extends SharedDictBase {
    private int level;
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    public ZstdDictCompress(byte[] bArr, int i7) {
        this(bArr, 0, bArr.length, i7);
    }

    private native void free();

    private native void init(byte[] bArr, int i7, int i8, int i9);

    private native void initDirect(ByteBuffer byteBuffer, int i7, int i8, int i9, int i10);

    @Override
    public void close() {
        super.close();
    }

    @Override
    void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
            this.sharedDict = null;
        }
    }

    public ByteBuffer getByReferenceBuffer() {
        return this.sharedDict;
    }

    int level() {
        return this.level;
    }

    public ZstdDictCompress(byte[] bArr, int i7, int i8, int i9) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        Zstd.defaultCompressionLevel();
        this.level = i9;
        if (bArr.length - i7 < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        init(bArr, i7, i8, i9);
        if (0 == this.nativePtr) {
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        storeFence();
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i7) {
        this(byteBuffer, i7, false);
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i7, boolean z7) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        Zstd.defaultCompressionLevel();
        this.level = i7;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), iLimit, i7, z7 ? 1 : 0);
            if (this.nativePtr != 0) {
                if (z7) {
                    this.sharedDict = byteBuffer;
                }
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}
