package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final class u implements ThreadFactory {

    static final ThreadFactory f19079a = new u();

    private u() {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        return C2343a.a(runnable);
    }
}
