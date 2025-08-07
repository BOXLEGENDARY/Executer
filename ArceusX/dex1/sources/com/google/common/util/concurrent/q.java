package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class q {

    class a implements Executor {

        final Executor f18971d;

        final com.google.common.util.concurrent.a f18972e;

        a(Executor executor, com.google.common.util.concurrent.a aVar) {
            this.f18971d = executor;
            this.f18972e = aVar;
        }

        @Override
        public void execute(Runnable runnable) {
            try {
                this.f18971d.execute(runnable);
            } catch (RejectedExecutionException e7) {
                this.f18972e.E(e7);
            }
        }
    }

    public static Executor a() {
        return i.INSTANCE;
    }

    static Executor b(Executor executor, com.google.common.util.concurrent.a<?> aVar) {
        K4.g.g(executor);
        K4.g.g(aVar);
        return executor == a() ? executor : new a(executor, aVar);
    }
}
