package o5;

import N3.AbstractExecutorServiceC0549u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n3.C2651i;

public class C2693j extends AbstractExecutorServiceC0549u {

    private static final ThreadLocal f22444e = new ThreadLocal();

    private final ThreadPoolExecutor f22445d;

    public C2693j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            @Override
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() {
                    @Override
                    public final void run() {
                        C2693j.d(runnable);
                    }
                });
            }
        });
        this.f22445d = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static void d(Runnable runnable) {
        f22444e.set(new ArrayDeque());
        runnable.run();
    }

    public static void e(Deque deque, Runnable runnable) {
        C2651i.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override
    protected final Object a() {
        return this.f22445d;
    }

    @Override
    protected final ExecutorService b() {
        return this.f22445d;
    }

    @Override
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f22444e.get();
        if (deque == null || deque.size() > 1) {
            this.f22445d.execute(new Runnable() {
                @Override
                public final void run() {
                    C2693j.e((Deque) C2693j.f22444e.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }
}
