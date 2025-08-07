package z;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorC3058m implements Executor {

    private static final ThreadFactory f24663i = new a();

    private final Object f24664d = new Object();

    private ThreadPoolExecutor f24665e = b();

    class a implements ThreadFactory {

        private final AtomicInteger f24666a = new AtomicInteger(0);

        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f24666a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f24663i);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C3043d0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void c(C.H h7) {
        ThreadPoolExecutor threadPoolExecutor;
        x0.g.g(h7);
        synchronized (this.f24664d) {
            try {
                if (this.f24665e.isShutdown()) {
                    this.f24665e = b();
                }
                threadPoolExecutor = this.f24665e;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, h7.a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override
    public void execute(Runnable runnable) {
        x0.g.g(runnable);
        synchronized (this.f24664d) {
            this.f24665e.execute(runnable);
        }
    }
}
