package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class C2523d extends AbstractC2524e {

    private final Object f21534a = new Object();

    private final ExecutorService f21535b = Executors.newFixedThreadPool(4, new a());

    private volatile Handler f21536c;

    class a implements ThreadFactory {

        private final AtomicInteger f21537a = new AtomicInteger(0);

        a() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f21537a.getAndIncrement());
            return thread;
        }
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.f21535b.execute(runnable);
    }

    @Override
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override
    public void c(Runnable runnable) {
        if (this.f21536c == null) {
            synchronized (this.f21534a) {
                try {
                    if (this.f21536c == null) {
                        this.f21536c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f21536c.post(runnable);
    }
}
