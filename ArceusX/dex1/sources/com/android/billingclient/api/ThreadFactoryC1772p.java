package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ThreadFactoryC1772p implements ThreadFactory {

    private final ThreadFactory f13548a = Executors.defaultThreadFactory();

    private final AtomicInteger f13549b = new AtomicInteger(1);

    ThreadFactoryC1772p(C1759c c1759c) {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f13549b;
        Thread threadNewThread = this.f13548a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
