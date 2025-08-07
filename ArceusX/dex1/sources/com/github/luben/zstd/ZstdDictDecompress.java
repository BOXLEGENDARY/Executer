package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

public class ZstdDictDecompress extends SharedDictBase {
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i7, int i8);

    private native void initDirect(ByteBuffer byteBuffer, int i7, int i8, int i9);

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

    public ZstdDictDecompress(byte[] bArr, int i7, int i8) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        init(bArr, i7, i8);
        if (this.nativePtr == 0) {
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        storeFence();
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer, boolean z7) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), iLimit, z7 ? 1 : 0);
            if (this.nativePtr != 0) {
                if (z7) {
                    this.sharedDict = byteBuffer;
                }
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}
