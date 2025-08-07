package o5;

import java.util.concurrent.Executor;

enum u implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable) {
        C2690g.a().f22440a.post(runnable);
    }
}
