package W0;

import java.util.concurrent.Executor;

public final class b implements Executor {
    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
