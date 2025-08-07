package S0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.BAKp.xAQOwX;

abstract class c<Result> {

    private static Handler f6381w;

    private volatile e f6383e = e.PENDING;

    final AtomicBoolean f6384i = new AtomicBoolean();

    final AtomicBoolean f6385v = new AtomicBoolean();

    private final FutureTask<Result> f6382d = new b(new a());

    class a implements Callable<Result> {
        a() {
        }

        @Override
        public Result call() {
            c.this.f6385v.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        @Override
        protected void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e7) {
                Log.w(xAQOwX.zLBvNEPUaWP, e7);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e8) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    class RunnableC0051c implements Runnable {

        final Object f6388d;

        RunnableC0051c(Object obj) {
            this.f6388d = obj;
        }

        @Override
        public void run() {
            c.this.d(this.f6388d);
        }
    }

    static class d {

        static final int[] f6390a;

        static {
            int[] iArr = new int[e.values().length];
            f6390a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6390a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f6381w == null) {
                    f6381w = new Handler(Looper.getMainLooper());
                }
                handler = f6381w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean a(boolean z7) {
        this.f6384i.set(true);
        return this.f6382d.cancel(z7);
    }

    protected abstract Result b();

    public final void c(Executor executor) {
        if (this.f6383e == e.PENDING) {
            this.f6383e = e.RUNNING;
            executor.execute(this.f6382d);
            return;
        }
        int i7 = d.f6390a[this.f6383e.ordinal()];
        if (i7 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.f6383e = e.FINISHED;
    }

    public final boolean f() {
        return this.f6384i.get();
    }

    protected void g(Result result) {
    }

    protected void h(Result result) {
    }

    void i(Result result) {
        e().post(new RunnableC0051c(result));
    }

    void j(Result result) {
        if (this.f6385v.get()) {
            return;
        }
        i(result);
    }
}
