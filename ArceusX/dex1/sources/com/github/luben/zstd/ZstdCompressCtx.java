package com.github.luben.zstd;

import W0.JWp.kNUgEaOjcPdX;
import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.util.Native;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ZstdCompressCtx extends AutoCloseBase {
    private long nativePtr;
    private ZstdDictCompress compression_dict = null;
    private SequenceProducer seqprod = null;
    private long seqprod_state = 0;

    static {
        Native.load();
    }

    public ZstdCompressCtx() {
        this.nativePtr = 0L;
        long jInit = init();
        this.nativePtr = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createCompressCtx failed");
        }
        storeFence();
    }

    private static native long compressByteArray0(long j7, byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10);

    private static native long compressDirectByteBuffer0(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10);

    private static native long compressDirectByteBufferStream0(long j7, ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10, int i11);

    private void ensureOpen() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException(wtzgsqRsIZB.VQTYu);
        }
    }

    private static native void free(long j7);

    private static native ZstdFrameProgression getFrameProgression0(long j7);

    private static native long init();

    private native long loadCDict0(long j7, byte[] bArr);

    private native long loadCDictFast0(long j7, ZstdDictCompress zstdDictCompress);

    private static native long reset0(long j7);

    private static native void setChecksum0(long j7, boolean z7);

    private static native void setContentSize0(long j7, boolean z7);

    private static native void setDictID0(long j7, boolean z7);

    private static native void setLevel0(long j7, int i7);

    private static native long setPledgedSrcSize0(long j7, long j8);

    @Override
    public void close() {
        super.close();
    }

    public int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iCompressDirectByteBuffer = compressDirectByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iCompressDirectByteBuffer);
        return iCompressDirectByteBuffer;
    }

    public int compressByteArray(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, int i10) {
        Objects.checkFromIndexSize(i9, i10, bArr2.length);
        Objects.checkFromIndexSize(i7, i8, bArr.length);
        ensureOpen();
        acquireSharedLock();
        try {
            long jCompressByteArray0 = compressByteArray0(this.nativePtr, bArr, i7, i8, bArr2, i9, i10);
            if (Zstd.isError(jCompressByteArray0)) {
                throw new ZstdException(jCompressByteArray0);
            }
            if (jCompressByteArray0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i11 = (int) jCompressByteArray0;
            releaseSharedLock();
            return i11;
        } catch (Throwable th) {
            releaseSharedLock();
            throw th;
        }
    }

    public int compressDirectByteBuffer(ByteBuffer byteBuffer, int i7, int i8, ByteBuffer byteBuffer2, int i9, int i10) {
        ensureOpen();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException(kNUgEaOjcPdX.KUKKkVVIqVO);
        }
        Objects.checkFromIndexSize(i9, i10, byteBuffer2.limit());
        Objects.checkFromIndexSize(i7, i8, byteBuffer.limit());
        acquireSharedLock();
        try {
            long jCompressDirectByteBuffer0 = compressDirectByteBuffer0(this.nativePtr, byteBuffer, i7, i8, byteBuffer2, i9, i10);
            if (Zstd.isError(jCompressDirectByteBuffer0)) {
                throw new ZstdException(jCompressDirectByteBuffer0);
            }
            if (jCompressDirectByteBuffer0 > 2147483647L) {
                throw new ZstdException(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i11 = (int) jCompressDirectByteBuffer0;
            releaseSharedLock();
            return i11;
        } catch (Throwable th) {
            releaseSharedLock();
            throw th;
        }
    }

    public boolean compressDirectByteBufferStream(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, EndDirective endDirective) {
        ensureOpen();
        long jCompressDirectByteBufferStream0 = compressDirectByteBufferStream0(this.nativePtr, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit(), endDirective.value());
        if ((2147483648L & jCompressDirectByteBufferStream0) != 0) {
            long j7 = 255 & jCompressDirectByteBufferStream0;
            throw new ZstdException(j7, Zstd.getErrorName(j7));
        }
        byteBuffer2.position((int) (2147483647L & jCompressDirectByteBufferStream0));
        byteBuffer.position(((int) (jCompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
        return (jCompressDirectByteBufferStream0 >>> 63) == 1;
    }

    @Override
    void doClose() {
        long j7 = this.nativePtr;
        if (j7 != 0) {
            free(j7);
            this.nativePtr = 0L;
            SequenceProducer sequenceProducer = this.seqprod;
            if (sequenceProducer != null) {
                sequenceProducer.freeState(this.seqprod_state);
                this.seqprod = null;
            }
        }
    }

    public ZstdFrameProgression getFrameProgression() {
        ensureOpen();
        return getFrameProgression0(this.nativePtr);
    }

    long getNativePtr() {
        return this.nativePtr;
    }

    public ZstdCompressCtx loadDict(ZstdDictCompress zstdDictCompress) {
        ensureOpen();
        acquireSharedLock();
        zstdDictCompress.acquireSharedLock();
        try {
            long jLoadCDictFast0 = loadCDictFast0(this.nativePtr, zstdDictCompress);
            if (Zstd.isError(jLoadCDictFast0)) {
                throw new ZstdException(jLoadCDictFast0);
            }
            this.compression_dict = zstdDictCompress;
            return this;
        } finally {
            zstdDictCompress.releaseSharedLock();
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx registerSequenceProducer(SequenceProducer sequenceProducer) {
        ensureOpen();
        acquireSharedLock();
        try {
            try {
                SequenceProducer sequenceProducer2 = this.seqprod;
                if (sequenceProducer2 != null) {
                    sequenceProducer2.freeState(this.seqprod_state);
                    this.seqprod = null;
                }
                if (sequenceProducer == null) {
                    Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                } else {
                    long jCreateState = sequenceProducer.createState();
                    this.seqprod_state = jCreateState;
                    Zstd.registerSequenceProducer(this.nativePtr, jCreateState, sequenceProducer.getFunctionPointer());
                    this.seqprod = sequenceProducer;
                }
                releaseSharedLock();
                return this;
            } catch (Exception e7) {
                this.seqprod = null;
                Zstd.registerSequenceProducer(this.nativePtr, 0L, 0L);
                throw e7;
            }
        } catch (Throwable th) {
            releaseSharedLock();
            throw th;
        }
    }

    public void reset() {
        ensureOpen();
        long jReset0 = reset0(this.nativePtr);
        if (Zstd.isError(jReset0)) {
            throw new ZstdException(jReset0);
        }
    }

    public ZstdCompressCtx setChainLog(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionChainLog = Zstd.setCompressionChainLog(this.nativePtr, i7);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdException(compressionChainLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setChecksum(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        setChecksum0(this.nativePtr, z7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setContentSize(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        setContentSize0(this.nativePtr, z7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setDictID(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        setDictID0(this.nativePtr, z7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setEnableLongDistanceMatching(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long enableLongDistanceMatching = Zstd.setEnableLongDistanceMatching(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(enableLongDistanceMatching)) {
                throw new ZstdException(enableLongDistanceMatching);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setHashLog(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionHashLog = Zstd.setCompressionHashLog(this.nativePtr, i7);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdException(compressionHashLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setJobSize(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionJobSize = Zstd.setCompressionJobSize(this.nativePtr, i7);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdException(compressionJobSize);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setLevel(int i7) {
        ensureOpen();
        acquireSharedLock();
        setLevel0(this.nativePtr, i7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setLong(int i7) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionLong(this.nativePtr, i7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMagicless(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        Zstd.setCompressionMagicless(this.nativePtr, z7);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx setMinMatch(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.nativePtr, i7);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdException(compressionMinMatch);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setOverlapLog(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.nativePtr, i7);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdException(compressionOverlapLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public void setPledgedSrcSize(long j7) {
        ensureOpen();
        long pledgedSrcSize0 = setPledgedSrcSize0(this.nativePtr, j7);
        if (Zstd.isError(pledgedSrcSize0)) {
            throw new ZstdException(pledgedSrcSize0);
        }
    }

    public ZstdCompressCtx setSearchForExternalRepcodes(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long searchForExternalRepcodes = Zstd.setSearchForExternalRepcodes(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(searchForExternalRepcodes)) {
                throw new ZstdException(searchForExternalRepcodes);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setSearchLog(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.nativePtr, i7);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdException(compressionSearchLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setSequenceProducerFallback(boolean z7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long sequenceProducerFallback = Zstd.setSequenceProducerFallback(this.nativePtr, z7);
            if (Zstd.isError(sequenceProducerFallback)) {
                throw new ZstdException(sequenceProducerFallback);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setStrategy(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionStrategy = Zstd.setCompressionStrategy(this.nativePtr, i7);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdException(compressionStrategy);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setTargetLength(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.nativePtr, i7);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdException(compressionTargetLength);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setValidateSequences(Zstd.ParamSwitch paramSwitch) {
        ensureOpen();
        acquireSharedLock();
        try {
            long validateSequences = Zstd.setValidateSequences(this.nativePtr, paramSwitch.getValue());
            if (Zstd.isError(validateSequences)) {
                throw new ZstdException(validateSequences);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setWindowLog(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.nativePtr, i7);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdException(compressionWindowLog);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ZstdCompressCtx setWorkers(int i7) {
        ensureOpen();
        acquireSharedLock();
        try {
            long compressionWorkers = Zstd.setCompressionWorkers(this.nativePtr, i7);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdException(compressionWorkers);
            }
            return this;
        } finally {
            releaseSharedLock();
        }
    }

    public ByteBuffer compress(ByteBuffer byteBuffer) throws ZstdException {
        long jCompressBound = Zstd.compressBound(byteBuffer.limit() - byteBuffer.position());
        if (jCompressBound <= 2147483647L) {
            int i7 = (int) jCompressBound;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i7);
            int iCompressDirectByteBuffer = compressDirectByteBuffer(byteBufferAllocateDirect, 0, i7, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
            byteBuffer.position(byteBuffer.limit());
            byteBufferAllocateDirect.limit(iCompressDirectByteBuffer);
            return byteBufferAllocateDirect;
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }

    public ZstdCompressCtx loadDict(byte[] bArr) {
        ensureOpen();
        acquireSharedLock();
        try {
            long jLoadCDict0 = loadCDict0(this.nativePtr, bArr);
            if (!Zstd.isError(jLoadCDict0)) {
                this.compression_dict = null;
                return this;
            }
            throw new ZstdException(jLoadCDict0);
        } finally {
            releaseSharedLock();
        }
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public byte[] compress(byte[] bArr) {
        long jCompressBound = Zstd.compressBound(bArr.length);
        if (jCompressBound <= 2147483647L) {
            int i7 = (int) jCompressBound;
            byte[] bArr2 = new byte[i7];
            return Arrays.copyOfRange(bArr2, 0, compressByteArray(bArr2, 0, i7, bArr, 0, bArr.length));
        }
        throw new ZstdException(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }
}
