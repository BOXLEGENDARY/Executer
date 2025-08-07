package L3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class c implements b {
    private c() {
    }

    @Override
    public final ScheduledExecutorService a(int i7, ThreadFactory threadFactory, int i8) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    @Override
    public final ExecutorService b(ThreadFactory threadFactory, int i7) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
