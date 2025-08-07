package com.github.luben.zstd;

abstract class SharedDictBase extends AutoCloseBase {
    SharedDictBase() {
    }

    protected void finalize() {
        close();
    }
}
