package N3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractExecutorServiceC0549u extends c0 implements ExecutorService {
    protected AbstractExecutorServiceC0549u() {
    }

    @Override
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) throws InterruptedException {
        return b().awaitTermination(j7, timeUnit);
    }

    protected abstract ExecutorService b();

    @Override
    public final List invokeAll(Collection collection) throws InterruptedException {
        return b().invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) throws ExecutionException, InterruptedException {
        return b().invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return b().isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return b().isTerminated();
    }

    @Override
    public final void shutdown() {
        b().shutdown();
    }

    @Override
    public final List shutdownNow() {
        return b().shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return b().submit(runnable);
    }

    @Override
    public final List invokeAll(Collection collection, long j7, TimeUnit timeUnit) throws InterruptedException {
        return b().invokeAll(collection, j7, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return b().invokeAny(collection, j7, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return b().submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return b().submit(callable);
    }
}
