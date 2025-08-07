package F;

import G.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.p;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

final class c extends AbstractExecutorService implements ScheduledExecutorService {

    private static ThreadLocal<ScheduledExecutorService> f1223e = new a();

    private final Handler f1224d;

    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return F.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable<Void> {

        final Runnable f1225d;

        b(Runnable runnable) {
            this.f1225d = runnable;
        }

        @Override
        public Void call() {
            this.f1225d.run();
            return null;
        }
    }

    private static class RunnableScheduledFutureC0017c<V> implements RunnableScheduledFuture<V> {

        final AtomicReference<c.a<V>> f1227d = new AtomicReference<>(null);

        private final long f1228e;

        private final Callable<V> f1229i;

        private final p<V> f1230v;

        class a implements c.InterfaceC0078c<V> {

            final Handler f1231a;

            final Callable f1232b;

            class RunnableC0018a implements Runnable {
                RunnableC0018a() {
                }

                @Override
                public void run() {
                    if (RunnableScheduledFutureC0017c.this.f1227d.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f1231a.removeCallbacks(RunnableScheduledFutureC0017c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f1231a = handler;
                this.f1232b = callable;
            }

            @Override
            public Object a(c.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0018a(), F.a.a());
                RunnableScheduledFutureC0017c.this.f1227d.set(aVar);
                return "HandlerScheduledFuture-" + this.f1232b.toString();
            }
        }

        RunnableScheduledFutureC0017c(Handler handler, long j7, Callable<V> callable) {
            this.f1228e = j7;
            this.f1229i = callable;
            this.f1230v = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        @Override
        public boolean cancel(boolean z7) {
            return this.f1230v.cancel(z7);
        }

        @Override
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override
        public V get() throws ExecutionException, InterruptedException {
            return this.f1230v.get();
        }

        @Override
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f1228e - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public boolean isCancelled() {
            return this.f1230v.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.f1230v.isDone();
        }

        @Override
        public boolean isPeriodic() {
            return false;
        }

        @Override
        public void run() {
            c.a andSet = this.f1227d.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f1229i.call());
                } catch (Exception e7) {
                    andSet.f(e7);
                }
            }
        }

        @Override
        public V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f1230v.get(j7, timeUnit);
        }
    }

    c(Handler handler) {
        this.f1224d = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f1224d + " is shutting down");
    }

    @Override
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public void execute(Runnable runnable) {
        if (!this.f1224d.post(runnable)) {
            throw a();
        }
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public ScheduledFuture<?> schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        return schedule(new b(runnable), j7, timeUnit);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j7, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j7, timeUnit);
        RunnableScheduledFutureC0017c runnableScheduledFutureC0017c = new RunnableScheduledFutureC0017c(this.f1224d, jUptimeMillis, callable);
        return this.f1224d.postAtTime(runnableScheduledFutureC0017c, jUptimeMillis) ? runnableScheduledFutureC0017c : n.o(a());
    }
}
