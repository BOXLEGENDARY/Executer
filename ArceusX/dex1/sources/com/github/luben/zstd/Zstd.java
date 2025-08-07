package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

public class Zstd {

    public enum ParamSwitch {
        AUTO(0),
        ENABLE(1),
        DISABLE(2);

        private int val;

        ParamSwitch(int i7) {
            this.val = i7;
        }

        public int getValue() {
            return this.val;
        }
    }

    static {
        Native.load();
    }

    public static native int blockSizeMax();

    public static native int chainLogMax();

    public static native int chainLogMin();

    public static long compress(byte[] bArr, byte[] bArr2, int i7, boolean z7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i7);
            zstdCompressCtx.setChecksum(z7);
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static native long compressBound(long j7);

    public static long compressByteArray(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10, int i11, boolean z7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i11);
            zstdCompressCtx.setChecksum(z7);
            return zstdCompressCtx.compressByteArray(bArr, i7, i8, bArr2, i9, i10);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, int i11, boolean z7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i11);
            zstdCompressCtx.setChecksum(z7);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, byte[] bArr, int i11) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i11);
            zstdCompressCtx.loadDict(bArr);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressFastDict(byte[] bArr, int i7, byte[] bArr2, int i8, int i9, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, i9);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUnsafe(long j7, long j8, long j9, long j10, int i7) {
        return compressUnsafe(j7, j8, j9, j10, i7, false);
    }

    public static native long compressUnsafe(long j7, long j8, long j9, long j10, int i7, boolean z7);

    public static long compressUsingDict(byte[] bArr, int i7, byte[] bArr2, int i8, int i9, byte[] bArr3, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i10);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, i9);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, bArr2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressByteArray(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressByteArray(bArr, i7, i8, bArr2, i9, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBuffer(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressFastDict(byte[] bArr, int i7, byte[] bArr2, int i8, int i9, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, i9);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static native long decompressUnsafe(long j7, long j8, long j9, long j10);

    public static long decompressUsingDict(byte[] bArr, int i7, byte[] bArr2, int i8, int i9, byte[] bArr3) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr3);
            return zstdDecompressCtx.decompressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, i9);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i7, int i8) {
        return decompressedDirectByteBufferSize(byteBuffer, i7, i8, false);
    }

    @Deprecated
    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i7, int i8, boolean z7);

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i7, int i8, boolean z7) {
        if (i7 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i7);
        }
        int i9 = i7 + i8;
        if (i9 <= bArr.length) {
            return decompressedSize0(bArr, i7, i8, z7);
        }
        throw new ArrayIndexOutOfBoundsException(i9);
    }

    private static native long decompressedSize0(byte[] bArr, int i7, int i8, boolean z7);

    public static native int defaultCompressionLevel();

    public static native long errChecksumWrong();

    public static native long errCorruptionDetected();

    public static native long errDictionaryCorrupted();

    public static native long errDictionaryCreationFailed();

    public static native long errDictionaryWrong();

    public static native long errDstBufferNull();

    public static native long errDstSizeTooSmall();

    public static native long errFrameParameterUnsupported();

    public static native long errFrameParameterWindowTooLarge();

    public static native long errGeneric();

    public static native long errInitMissing();

    public static native long errMaxSymbolValueTooLarge();

    public static native long errMaxSymbolValueTooSmall();

    public static native long errMemoryAllocation();

    public static native long errNoError();

    public static native long errParameterOutOfBound();

    public static native long errParameterUnsupported();

    public static native long errPrefixUnknown();

    public static native long errSrcSizeWrong();

    public static native long errStageWrong();

    public static native long errTableLogTooLarge();

    public static native long errVersionUnsupported();

    public static native long errWorkSpaceTooSmall();

    static native void generateSequences(long j7, long j8, long j9, long j10, long j11);

    static ByteBuffer getArrayBackedBuffer(BufferPool bufferPool, int i7) throws ZstdIOException {
        ByteBuffer byteBuffer = bufferPool.get(i7);
        if (byteBuffer != null) {
            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                return byteBuffer;
            }
            bufferPool.release(byteBuffer);
            throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
        }
        throw new ZstdIOException(errMemoryAllocation(), "Cannot get ByteBuffer of size " + i7 + " from the BufferPool");
    }

    static native long getBuiltinSequenceProducer();

    public static native long getDictIdFromDict(byte[] bArr);

    public static long getDictIdFromDictDirect(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            return getDictIdFromDictDirect(byteBuffer, byteBuffer.position(), iLimit);
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }

    private static native long getDictIdFromDictDirect(ByteBuffer byteBuffer, int i7, int i8);

    public static native long getDictIdFromFrame(byte[] bArr);

    public static native long getDictIdFromFrameBuffer(ByteBuffer byteBuffer);

    public static long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i7, int i8) {
        return getDirectByteBufferFrameContentSize(byteBuffer, i7, i8, false);
    }

    public static native long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i7, int i8, boolean z7);

    public static native long getErrorCode(long j7);

    public static native String getErrorName(long j7);

    public static long getFrameContentSize(byte[] bArr, int i7, int i8, boolean z7) {
        if (i7 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i7);
        }
        int i9 = i7 + i8;
        if (i9 <= bArr.length) {
            return getFrameContentSize0(bArr, i7, i8, z7);
        }
        throw new ArrayIndexOutOfBoundsException(i9);
    }

    private static native long getFrameContentSize0(byte[] bArr, int i7, int i8, boolean z7);

    static native long getStubSequenceProducer();

    public static native int hashLogMax();

    public static native int hashLogMin();

    public static native boolean isError(long j7);

    public static native int loadDictCompress(long j7, byte[] bArr, int i7);

    public static native int loadDictDecompress(long j7, byte[] bArr, int i7);

    public static native int loadFastDictCompress(long j7, ZstdDictCompress zstdDictCompress);

    public static native int loadFastDictDecompress(long j7, ZstdDictDecompress zstdDictDecompress);

    public static native int magicNumber();

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static native void registerSequenceProducer(long j7, long j8, long j9);

    public static native int searchLengthMax();

    public static native int searchLengthMin();

    public static native int searchLogMax();

    public static native int searchLogMin();

    public static native int setCompressionChainLog(long j7, int i7);

    public static native int setCompressionChecksums(long j7, boolean z7);

    public static native int setCompressionHashLog(long j7, int i7);

    public static native int setCompressionJobSize(long j7, int i7);

    public static native int setCompressionLevel(long j7, int i7);

    public static native int setCompressionLong(long j7, int i7);

    public static native int setCompressionMagicless(long j7, boolean z7);

    public static native int setCompressionMinMatch(long j7, int i7);

    public static native int setCompressionOverlapLog(long j7, int i7);

    public static native int setCompressionSearchLog(long j7, int i7);

    public static native int setCompressionStrategy(long j7, int i7);

    public static native int setCompressionTargetLength(long j7, int i7);

    public static native int setCompressionWindowLog(long j7, int i7);

    public static native int setCompressionWorkers(long j7, int i7);

    public static native int setDecompressionLongMax(long j7, int i7);

    public static native int setDecompressionMagicless(long j7, boolean z7);

    public static native int setEnableLongDistanceMatching(long j7, int i7);

    public static native int setRefMultipleDDicts(long j7, boolean z7);

    public static native int setSearchForExternalRepcodes(long j7, int i7);

    public static native int setSequenceProducerFallback(long j7, boolean z7);

    public static native int setValidateSequences(long j7, int i7);

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z7) {
        if (bArr.length > 10) {
            return trainFromBuffer0(bArr, bArr2, z7);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    private static native long trainFromBuffer0(byte[][] bArr, byte[] bArr2, boolean z7);

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z7) {
        if (iArr.length > 10) {
            return trainFromBufferDirect0(byteBuffer, iArr, byteBuffer2, z7);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    private static native long trainFromBufferDirect0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z7);

    public static native int windowLogMax();

    public static native int windowLogMin();

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2) {
        return trainFromBuffer(bArr, bArr2, false);
    }

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, false);
    }

    public static byte[] decompress(byte[] bArr, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i7, int i8) {
        return decompressedSize(bArr, i7, i8, false);
    }

    public static long getFrameContentSize(byte[] bArr, int i7, int i8) {
        return getFrameContentSize(bArr, i7, i8, false);
    }

    public static long compress(byte[] bArr, byte[] bArr2, int i7) {
        return compress(bArr, bArr2, i7, false);
    }

    public static long compressByteArray(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10, int i11) {
        return compressByteArray(bArr, i7, i8, bArr2, i9, i10, i11, false);
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, int i11) {
        return compressDirectByteBuffer(byteBuffer, i7, i8, byteBuffer2, i9, i10, i11, false);
    }

    public static long compressFastDict(byte[] bArr, int i7, byte[] bArr2, int i8, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, bArr2.length - i8);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUsingDict(byte[] bArr, int i7, byte[] bArr2, int i8, byte[] bArr3, int i9) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i9);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i7, bArr.length - i7, bArr2, i8, bArr2.length - i8);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i7) {
        return decompressedSize(bArr, i7, bArr.length - i7);
    }

    public static long getFrameContentSize(byte[] bArr, int i7) {
        return getFrameContentSize(bArr, i7, bArr.length - i7);
    }

    public static long compress(byte[] bArr, byte[] bArr2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr) {
        return decompressedSize(bArr, 0);
    }

    public static long getFrameContentSize(byte[] bArr) {
        return getFrameContentSize(bArr, 0);
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(ByteBuffer byteBuffer) {
        return decompressedDirectByteBufferSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static long getFrameContentSize(ByteBuffer byteBuffer) {
        return getDirectByteBufferFrameContentSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Deprecated
    public static long compressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i7);
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, defaultCompressionLevel());
    }

    public static byte[] compressUsingDict(byte[] bArr, byte[] bArr2, int i7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr2);
            zstdCompressCtx.setLevel(i7);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, int i7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i7);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(bArr, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return compress(byteBuffer, byteBuffer2, defaultCompressionLevel());
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i7, boolean z7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i7);
            zstdCompressCtx.setChecksum(z7);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr2);
            return zstdDecompressCtx.decompress(bArr, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i7) {
        return compress(byteBuffer, byteBuffer2, i7, false);
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, int i7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i7);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long compress(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i7);
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr, int i7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i7);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, ZstdDictDecompress zstdDictDecompress, int i7) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, i7);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i7);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }
}
