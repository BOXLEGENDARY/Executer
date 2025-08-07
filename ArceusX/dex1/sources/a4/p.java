package a4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class p<T> implements q<T> {

    private final CountDownLatch f8320a = new CountDownLatch(1);

    p(o oVar) {
    }

    @Override
    public final void a() {
        this.f8320a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f8320a.await();
    }

    public final boolean c(long j7, TimeUnit timeUnit) throws InterruptedException {
        return this.f8320a.await(j7, timeUnit);
    }

    @Override
    public final void onFailure(Exception exc) {
        this.f8320a.countDown();
    }

    @Override
    public final void onSuccess(T t7) {
        this.f8320a.countDown();
    }
}
