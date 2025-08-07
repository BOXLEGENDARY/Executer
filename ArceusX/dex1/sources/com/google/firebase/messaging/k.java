package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final class k implements Executor {

    static final Executor f19141d = new k();

    private k() {
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
