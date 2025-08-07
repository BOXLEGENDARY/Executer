package a4;

import java.util.concurrent.Executor;

final class K implements Executor {
    K() {
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
