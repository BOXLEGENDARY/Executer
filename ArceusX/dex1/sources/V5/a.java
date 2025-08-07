package V5;

import h7.l;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<T> implements Runnable {

    private AtomicBoolean f7548d = new AtomicBoolean(false);

    private AtomicInteger f7549e = new AtomicInteger(0);

    private T f7550i;

    private ScheduledExecutorService f7551v;

    private ScheduledFuture<?> f7552w;

    protected String f7553y;

    public a(String str) {
        this.f7553y = str;
    }

    private ScheduledExecutorService b() {
        if (this.f7551v == null) {
            this.f7551v = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f7551v;
    }

    private synchronized T c() {
        return this.f7550i;
    }

    private void d(long j7) {
        this.f7552w = b().schedule(this, j7, TimeUnit.MILLISECONDS);
    }

    protected abstract void a(T t7);

    public synchronized void e(T t7) {
        try {
            if (!this.f7548d.get() && (g() <= 0 || this.f7549e.incrementAndGet() < g())) {
                long jF = f();
                if (jF <= 0) {
                    a(t7);
                    return;
                }
                l.g(this.f7553y, "queue value: " + t7);
                this.f7550i = t7;
                if (this.f7552w == null) {
                    d(jF);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f7552w;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f7550i = t7;
            l.g(this.f7553y, "set immediately: " + t7);
            a(t7);
            this.f7548d.set(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract long f();

    protected abstract int g();

    @Override
    public synchronized void run() {
        a(c());
        this.f7548d.set(true);
    }
}
