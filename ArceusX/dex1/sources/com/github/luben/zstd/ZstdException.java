package com.github.luben.zstd;

public class ZstdException extends RuntimeException {
    private long code;

    public ZstdException(long j7) {
        this(Zstd.getErrorCode(j7), Zstd.getErrorName(j7));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdException(long j7, String str) {
        super(str);
        this.code = j7;
    }
}
