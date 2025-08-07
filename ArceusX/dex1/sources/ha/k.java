package ha;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class k {

    private static final int f2142a;

    private static final int f2143b;

    private static final ThreadFactory f2144c;

    private static final BlockingQueue<Runnable> f2145d;

    private static Executor f2146e;

    class a implements ThreadFactory {

        private final AtomicInteger f2147a = new AtomicInteger(1);

        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f2147a.getAndIncrement());
        }
    }

    static class b implements RejectedExecutionHandler {
        b() {
        }

        @Override
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f2142a = iAvailableProcessors;
        f2143b = (iAvailableProcessors * 2) + 1;
        f2144c = new a();
        f2145d = new LinkedBlockingQueue(128);
    }

    public static synchronized Executor a() {
        try {
            if (f2146e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, f2143b, 30L, TimeUnit.SECONDS, f2145d, f2144c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f2146e = threadPoolExecutor;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2146e;
    }
}
