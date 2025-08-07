package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ZstdDecompressCtx extends AutoCloseBase {
    private ZstdDictDecompress decompression_dict = null;
    private long nativePtr;

    static {
        Native.load();
    }

    public ZstdDecompressCtx() {
        this.nativePtr = 0L;
        long jInit = init();
        this.nativePtr = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
        }
        storeFence();
    }

    private static native long decompressByteArray0(long j7, byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10);

    private static native long decompressDirectByteBuffer0(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    private static native long decompressDirectByteBufferStream0(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    private static native void free(long j7);

    private static native long init();

    private static native long loadDDict0(long j7, byte[] bArr);

    private static native long loadDDictFast0(long j7, ZstdDictDecompress zstdDictDecompress);

    private static native void reset0(long j7);

    @Override
    public void close() {
        super.close();
    }

    public int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws ZstdException {
        int iDecompressDirectByteBuffer = decompressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iDecompressDirectByteBuffer);
        return iDecompressDirectByteBuffer;
    }

    public int decompressByteArray(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10) {
        Objects.checkFromIndexSize(i9, i10, bArr2.length);
        Objects.checkFromIndexSize(i7, i8, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jDecompressByteArray0 = decompressByteArray0(this.nativePtr, bArr, i7, i8, bArr2, i9, i10);
            if (Zstd.isError(jDecompressByteArray0)) {
                throw new ZstdException(jDecompressByteArray0);
            }
            if (jDecompressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i11 = (int) jDecompressByteArray0;
            releaseSharedLock();
            return i11;
        } catch (Throwable th) {
            releaseSharedLock();
            throw th;
        }
    }

    public int decompressDirectByteBuffer(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        ensureOpen();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        Objects.checkFromIndexSize(i9, i10, byteBuffer2.limit());
        Objects.checkFromIndexSize(i7, i8, byteBuffer.limit());
        acquireSharedLock();
        try {
            long jDecompressDirectByteBuffer0 = decompressDirectByteBuffer0(this.nativePtr, byteBuffer, i7, i8, byteBuffer2, i9, i10);
            if (Zstd.isError(jDecompressDirectByteBuffer0)) {
                throw new ZstdException(jDecompressDirectByteBuffer0);
            }
            if (jDecompressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i11 = (int) jDecompressDirectByteBuffer0;
            releaseSharedLock();
            return i11;
        } catch (Throwable th) {
            releaseSharedLock();
            throw th;
        }
    }

    public boolean decompressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ensureOpen();
        long jDecompressDirectByteBufferStream0 = decompressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit());
        if ((2147483648L & jDecompressDirectByteBufferStream0) != 0) {
            long j7 = 255 & jDecompressDirectByteBufferStream0;
            throw new ZstdException(j7, Zstd.getErrorName(j7));
        }
        byteBuffer2.position((int) (2147483647L & jDecompressDirectByteBufferStream0));
        byteBuffer.position(((int) (jDecompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
        return (jDecompressDirectByteBufferStream0 >>> 63) == 1;
    }

    @Override
    void doClose() {
        long j7 = this.nativePtr;
        if (j7 != 0) {
            free(j7);
            this.nativePtr = 0L;
        }
    }

    public ZstdDecompressCtx loadDict(ZstdDictDecompress zstdDictDecompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadDDictFast0 = loadDDictFast0(this.nativePtr, zstdDictDecompress);
            if (Zstd.isError(jLoadDDictFast0)) {
                throw new ZstdException(jLoadDDictFast0);
            }
            this.decompression_dict = zstdDictDecompress;
            return this;
        } finally {
            zstdDictDecompress.releaseSharedLock();
            releaseSharedLock();
        }
    }

    public void reset() {
        ensureOpen();
        reset0(this.nativePtr);
    }

    public ZstdDecompressCtx setMagicless(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setDecompressionMagicless(this.nativePtr, z7);
        releaseSharedLock();
        return this;
    }

    public ByteBuffer decompress(ByteBuffer byteBuffer, int i7) throws ZstdException {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7);
        decompressDirectByteBuffer(byteBufferAllocateDirect, 0, i7, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return byteBufferAllocateDirect;
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] decompress(byte[] bArr, int i7) throws ZstdException {
        if (i7 >= 0) {
            byte[] bArr2 = new byte[i7];
            int iDecompress = decompress(bArr2, bArr);
            return iDecompress != i7 ? Arrays.copyOfRange(bArr2, 0, iDecompress) : bArr2;
        }
        throw new ZstdException(Zstd.errGeneric(), "Original size should not be negative");
    }

    public ZstdDecompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jLoadDDict0 = loadDDict0(this.nativePtr, bArr);
            if (!Zstd.isError(jLoadDDict0)) {
                this.decompression_dict = null;
                return this;
            }
            throw new ZstdException(jLoadDDict0);
        } finally {
            releaseSharedLock();
        }
    }
}
