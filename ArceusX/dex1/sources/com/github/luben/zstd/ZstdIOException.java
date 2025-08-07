package com.github.luben.zstd;

import java.io.IOException;

public class ZstdIOException extends IOException {
    private long code;

    public ZstdIOException(long j7) {
        this(Zstd.getErrorCode(j7), Zstd.getErrorName(j7));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdIOException(long j7, String str) {
        super(str);
        this.code = j7;
    }
}
