package F;

import java.util.concurrent.Executor;

final class b implements Executor {

    private static volatile b f1222d;

    b() {
    }

    static Executor a() {
        if (f1222d != null) {
            return f1222d;
        }
        synchronized (b.class) {
            try {
                if (f1222d == null) {
                    f1222d = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1222d;
    }

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
