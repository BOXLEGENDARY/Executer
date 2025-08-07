package G;

import g1.kQwt.YGBtcyQ;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import z.C3043d0;

abstract class o<V> implements com.google.common.util.concurrent.p<V> {

    static class a<V> extends o<V> {

        private final Throwable f1302d;

        a(Throwable th) {
            this.f1302d = th;
        }

        @Override
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f1302d);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f1302d + YGBtcyQ.jHhYYzIJZIsmmRO;
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        b(Throwable th) {
            super(th);
        }

        @Override
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    static final class c<V> extends o<V> {

        static final o<Object> f1303e = new c(null);

        private final V f1304d;

        c(V v7) {
            this.f1304d = v7;
        }

        @Override
        public V get() {
            return this.f1304d;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f1304d + "]]";
        }
    }

    o() {
    }

    public static <V> com.google.common.util.concurrent.p<V> e() {
        return c.f1303e;
    }

    @Override
    public void c(Runnable runnable, Executor executor) {
        x0.g.g(runnable);
        x0.g.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            C3043d0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e7);
        }
    }

    @Override
    public boolean cancel(boolean z7) {
        return false;
    }

    @Override
    public abstract V get() throws ExecutionException;

    @Override
    public V get(long j7, TimeUnit timeUnit) throws ExecutionException {
        x0.g.g(timeUnit);
        return get();
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }
}
