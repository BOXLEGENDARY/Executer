package a4;

import Y3.qE.KpBmp;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n3.C2651i;

public final class C1576m {
    public static <TResult> TResult a(Task<TResult> task) throws ExecutionException, InterruptedException {
        C2651i.j();
        C2651i.h();
        C2651i.m(task, "Task must not be null");
        if (task.n()) {
            return (TResult) i(task);
        }
        p pVar = new p(null);
        j(task, pVar);
        pVar.b();
        return (TResult) i(task);
    }

    public static <TResult> TResult b(Task<TResult> task, long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C2651i.j();
        C2651i.h();
        C2651i.m(task, "Task must not be null");
        C2651i.m(timeUnit, "TimeUnit must not be null");
        if (task.n()) {
            return (TResult) i(task);
        }
        p pVar = new p(null);
        j(task, pVar);
        if (pVar.c(j7, timeUnit)) {
            return (TResult) i(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> Task<TResult> c(Executor executor, Callable<TResult> callable) {
        C2651i.m(executor, KpBmp.WvFwHZJsvLBwOXI);
        C2651i.m(callable, "Callback must not be null");
        M m7 = new M();
        executor.execute(new N(m7, callable));
        return m7;
    }

    public static <TResult> Task<TResult> d() {
        M m7 = new M();
        m7.t();
        return m7;
    }

    public static <TResult> Task<TResult> e(Exception exc) {
        M m7 = new M();
        m7.r(exc);
        return m7;
    }

    public static <TResult> Task<TResult> f(TResult tresult) {
        M m7 = new M();
        m7.s(tresult);
        return m7;
    }

    public static Task<Void> g(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        M m7 = new M();
        r rVar = new r(collection.size(), m7);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            j(it2.next(), rVar);
        }
        return m7;
    }

    public static Task<Void> h(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? f(null) : g(Arrays.asList(taskArr));
    }

    private static Object i(Task task) throws ExecutionException {
        if (task.o()) {
            return task.k();
        }
        if (task.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.j());
    }

    private static void j(Task task, q qVar) {
        Executor executor = C1575l.f8318b;
        task.f(executor, qVar);
        task.d(executor, qVar);
        task.a(executor, qVar);
    }
}
