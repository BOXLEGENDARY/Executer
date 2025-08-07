package F;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class e implements Executor {

    private static volatile Executor f1238e;

    private final ExecutorService f1239d = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        private final AtomicInteger f1240a = new AtomicInteger(0);

        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f1240a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    static Executor a() {
        if (f1238e != null) {
            return f1238e;
        }
        synchronized (e.class) {
            try {
                if (f1238e == null) {
                    f1238e = new e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1238e;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f1239d.execute(runnable);
    }
}
