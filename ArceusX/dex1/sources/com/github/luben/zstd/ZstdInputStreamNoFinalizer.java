package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private final BufferPool bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        Native.load();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) throws IOException {
        this(inputStream, NoPool.INSTANCE);
    }

    private static native long createDStream();

    private native int decompressStream(long j7, byte[] bArr, int i7, byte[] bArr2, int i8);

    private static native int freeDStream(long j7);

    private native int initDStream(long j7);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override
    public synchronized int available() throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override
    public synchronized void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.release(this.srcByteBuffer);
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public synchronized int read(byte[] bArr, int i7, int i8) throws IOException {
        if (i7 >= 0) {
            if (i8 <= bArr.length - i7) {
                int internal = 0;
                if (i8 == 0) {
                    return 0;
                }
                while (internal == 0) {
                    internal = readInternal(bArr, i7, i8);
                }
                return internal;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i8 + " from offset " + i7 + " in buffer of size " + bArr.length);
    }

    int readInternal(byte[] r20, int r21, int r22) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.ZstdInputStreamNoFinalizer.readInternal(byte[], int, int):int");
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z7) {
        this.isContinuous = z7;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setLongMax(int i7) throws IOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i7);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setRefMultipleDDicts(boolean z7) throws IOException {
        long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.stream, z7);
        if (Zstd.isError(refMultipleDDicts)) {
            throw new ZstdIOException(refMultipleDDicts);
        }
        return this;
    }

    @Override
    public synchronized long skip(long j7) throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j7 <= 0) {
            return 0L;
        }
        int iRecommendedDOutSize = (int) recommendedDOutSize();
        if (iRecommendedDOutSize > j7) {
            iRecommendedDOutSize = (int) j7;
        }
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(this.bufferPool, iRecommendedDOutSize);
        try {
            byte[] bArrArray = arrayBackedBuffer.array();
            long j8 = j7;
            while (j8 > 0) {
                int i7 = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j8));
                if (i7 < 0) {
                    break;
                }
                j8 -= i7;
            }
            return j7 - j8;
        } finally {
            this.bufferPool.release(arrayBackedBuffer);
        }
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, BufferPool bufferPool) throws IOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, srcBuffSize);
        this.srcByteBuffer = arrayBackedBuffer;
        this.src = arrayBackedBuffer.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.stream = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    @Override
    public synchronized int read() throws IOException {
        try {
            byte[] bArr = new byte[1];
            int internal = 0;
            while (internal == 0) {
                internal = readInternal(bArr, 0, 1);
            }
            if (internal != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
        return this;
    }
}
