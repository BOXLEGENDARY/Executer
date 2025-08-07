package com.github.luben.zstd;

public enum EndDirective {
    CONTINUE(0),
    FLUSH(1),
    END(2);

    private final int value;

    EndDirective(int i7) {
        this.value = i7;
    }

    int value() {
        return this.value;
    }
}
