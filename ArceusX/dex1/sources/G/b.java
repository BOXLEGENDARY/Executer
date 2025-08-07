package G;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class b<I, O> extends d<O> implements Runnable {

    private G.a<? super I, ? extends O> f1265i;

    private final BlockingQueue<Boolean> f1266v = new LinkedBlockingQueue(1);

    private final CountDownLatch f1267w = new CountDownLatch(1);

    private com.google.common.util.concurrent.p<? extends I> f1268y;

    volatile com.google.common.util.concurrent.p<? extends O> f1269z;

    class a implements Runnable {

        final com.google.common.util.concurrent.p f1270d;

        a(com.google.common.util.concurrent.p pVar) {
            this.f1270d = pVar;
        }

        @Override
        public void run() {
            try {
                try {
                    b.this.b(n.m(this.f1270d));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f1269z = null;
                    return;
                } catch (ExecutionException e7) {
                    b.this.d(e7.getCause());
                }
                b.this.f1269z = null;
            } catch (Throwable th) {
                b.this.f1269z = null;
                throw th;
            }
        }
    }

    b(G.a<? super I, ? extends O> aVar, com.google.common.util.concurrent.p<? extends I> pVar) {
        this.f1265i = (G.a) x0.g.g(aVar);
        this.f1268y = (com.google.common.util.concurrent.p) x0.g.g(pVar);
    }

    private void h(Future<?> future, boolean z7) {
        if (future != null) {
            future.cancel(z7);
        }
    }

    private <E> void i(BlockingQueue<E> blockingQueue, E e7) {
        boolean z7 = false;
        while (true) {
            try {
                blockingQueue.put(e7);
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E j(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z7 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override
    public boolean cancel(boolean z7) {
        if (!super.cancel(z7)) {
            return false;
        }
        i(this.f1266v, Boolean.valueOf(z7));
        h(this.f1268y, z7);
        h(this.f1269z, z7);
        return true;
    }

    @Override
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            com.google.common.util.concurrent.p<? extends I> pVar = this.f1268y;
            if (pVar != null) {
                pVar.get();
            }
            this.f1267w.await();
            com.google.common.util.concurrent.p<? extends O> pVar2 = this.f1269z;
            if (pVar2 != null) {
                pVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override
    public void run() {
        com.google.common.util.concurrent.p<? extends O> pVarApply;
        ?? r02 = (G.a<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            pVarApply = this.f1265i.apply(n.m(this.f1268y));
                            this.f1269z = pVarApply;
                        } catch (Exception e7) {
                            d(e7);
                        }
                    } catch (Error e8) {
                        d(e8);
                    }
                } finally {
                    this.f1265i = null;
                    this.f1268y = null;
                    this.f1267w.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e9) {
                d(e9.getCause());
            }
        } catch (UndeclaredThrowableException e10) {
            d(e10.getCause());
        }
        if (!isCancelled()) {
            pVarApply.c(new a(pVarApply), F.a.a());
        } else {
            pVarApply.cancel(((Boolean) j(this.f1266v)).booleanValue());
            this.f1269z = null;
        }
    }

    @Override
    public O get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j7 = timeUnit2.convert(j7, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.p<? extends I> pVar = this.f1268y;
            if (pVar != null) {
                long jNanoTime = System.nanoTime();
                pVar.get(j7, timeUnit);
                j7 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f1267w.await(j7, timeUnit)) {
                j7 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                com.google.common.util.concurrent.p<? extends O> pVar2 = this.f1269z;
                if (pVar2 != null) {
                    pVar2.get(j7, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j7, timeUnit);
    }
}
