package F;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class d implements Executor {

    private static volatile Executor f1235e;

    private final ExecutorService f1236d = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    static Executor a() {
        if (f1235e != null) {
            return f1235e;
        }
        synchronized (d.class) {
            try {
                if (f1235e == null) {
                    f1235e = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1235e;
    }

    @Override
    public void execute(Runnable runnable) {
        this.f1236d.execute(runnable);
    }
}
