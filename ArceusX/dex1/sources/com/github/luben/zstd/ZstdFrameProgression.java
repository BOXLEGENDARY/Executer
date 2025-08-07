package com.github.luben.zstd;

public class ZstdFrameProgression {
    private long consumed;
    private int currentJobID;
    private long flushed;
    private long ingested;
    private int nbActiveWorkers;
    private long produced;

    public ZstdFrameProgression(long j7, long j8, long j9, long j10, int i7, int i8) {
        this.ingested = j7;
        this.consumed = j8;
        this.produced = j9;
        this.flushed = j10;
        this.currentJobID = i7;
        this.nbActiveWorkers = i8;
    }

    public long getConsumed() {
        return this.consumed;
    }

    public int getCurrentJobID() {
        return this.currentJobID;
    }

    public long getFlushed() {
        return this.flushed;
    }

    public long getIngested() {
        return this.ingested;
    }

    public int getNbActiveWorkers() {
        return this.nbActiveWorkers;
    }

    public long getProduced() {
        return this.produced;
    }
}
