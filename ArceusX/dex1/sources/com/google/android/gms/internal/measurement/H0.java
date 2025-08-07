package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class H0 implements ThreadFactory {

    private final ThreadFactory f14778a = Executors.defaultThreadFactory();

    H0(W0 w02) {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f14778a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
