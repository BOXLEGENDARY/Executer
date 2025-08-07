package com.github.luben.zstd;

public interface SequenceProducer {
    long createState();

    void freeState(long j7);

    long getFunctionPointer();
}
