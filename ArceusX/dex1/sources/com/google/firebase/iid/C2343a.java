package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class C2343a {

    private static final Executor f19027a = t.f19078d;

    static final Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    static Executor b() {
        return f19027a;
    }

    static Executor c() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), u.f19079a);
    }
}
