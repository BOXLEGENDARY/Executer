package o5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class o {

    private boolean f22490b;

    private final Object f22489a = new Object();

    private final Queue f22491c = new ArrayDeque();

    private final AtomicReference f22492d = new AtomicReference();

    public final void d() {
        synchronized (this.f22489a) {
            try {
                if (this.f22491c.isEmpty()) {
                    this.f22490b = false;
                } else {
                    I i7 = (I) this.f22491c.remove();
                    e(i7.f22429a, i7.f22430b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    K k7 = new K(this.f22427d, null);
                    try {
                        runnable.run();
                        k7.close();
                    } catch (Throwable th) {
                        try {
                            k7.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f22489a) {
            try {
                if (this.f22490b) {
                    this.f22491c.add(new I(executor, runnable, null));
                } else {
                    this.f22490b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
