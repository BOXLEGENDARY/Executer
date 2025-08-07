package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZstdDictTrainer {
    private final int allocatedSize;
    private final int dictSize;
    private long filledSize;
    private final List<Integer> sampleSizes = new ArrayList();
    private final ByteBuffer trainingSamples;

    public ZstdDictTrainer(int i7, int i8) {
        this.trainingSamples = ByteBuffer.allocateDirect(i7);
        this.allocatedSize = i7;
        this.dictSize = i8;
    }

    private int[] copyToIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        return iArr;
    }

    public synchronized boolean addSample(byte[] bArr) {
        if (this.filledSize + bArr.length > this.allocatedSize) {
            return false;
        }
        this.trainingSamples.put(bArr);
        this.sampleSizes.add(Integer.valueOf(bArr.length));
        this.filledSize += bArr.length;
        return true;
    }

    public byte[] trainSamples() throws ZstdException {
        return trainSamples(false);
    }

    public ByteBuffer trainSamplesDirect() throws ZstdException {
        return trainSamplesDirect(false);
    }

    public byte[] trainSamples(boolean z7) throws ZstdException {
        ByteBuffer byteBufferTrainSamplesDirect = trainSamplesDirect(z7);
        byte[] bArr = new byte[byteBufferTrainSamplesDirect.remaining()];
        byteBufferTrainSamplesDirect.get(bArr);
        return bArr;
    }

    public synchronized ByteBuffer trainSamplesDirect(boolean z7) throws ZstdException {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.dictSize);
        long jTrainFromBufferDirect = Zstd.trainFromBufferDirect(this.trainingSamples, copyToIntArray(this.sampleSizes), byteBufferAllocateDirect, z7);
        if (Zstd.isError(jTrainFromBufferDirect)) {
            byteBufferAllocateDirect.limit(0);
            throw new ZstdException(jTrainFromBufferDirect);
        }
        byteBufferAllocateDirect.limit(Long.valueOf(jTrainFromBufferDirect).intValue());
        return byteBufferAllocateDirect;
    }
}
