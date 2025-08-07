package com.google.firebase.iid;

import java.util.concurrent.Executor;

final class t implements Executor {

    static final Executor f19078d = new t();

    private t() {
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
