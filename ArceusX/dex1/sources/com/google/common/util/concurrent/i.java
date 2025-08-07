package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

enum i implements Executor {
    INSTANCE;

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
