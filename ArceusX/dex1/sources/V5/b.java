package V5;

import h7.l;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class b<T> implements Runnable {

    private T f7554d;

    private ScheduledExecutorService f7555e;

    private ScheduledFuture<?> f7556i;

    protected String f7557v;

    public b(String str) {
        this.f7557v = str;
    }

    private ScheduledExecutorService b() {
        if (this.f7555e == null) {
            this.f7555e = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f7555e;
    }

    private synchronized T c() {
        return this.f7554d;
    }

    private void d(long j7) {
        this.f7556i = b().schedule(this, j7, TimeUnit.MILLISECONDS);
    }

    protected abstract void a(T t7);

    public void e(T t7, long j7) {
        ScheduledFuture<?> scheduledFuture = this.f7556i;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f7556i.cancel(true);
        }
        if (j7 <= 0) {
            a(t7);
            return;
        }
        l.g(this.f7557v, "queue value: " + t7);
        this.f7554d = t7;
        d(j7);
    }

    @Override
    public void run() {
        a(c());
    }
}
