package C;

import C.H0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class Z<T> implements H0<T> {

    private static final Z<Object> f502b = new Z<>(null);

    private final com.google.common.util.concurrent.p<T> f503a;

    private Z(T t7) {
        this.f503a = G.n.p(t7);
    }

    public void e(H0.a aVar) {
        try {
            aVar.a(this.f503a.get());
        } catch (InterruptedException | ExecutionException e7) {
            aVar.onError(e7);
        }
    }

    public static <U> H0<U> f(U u7) {
        return u7 == null ? f502b : new Z(u7);
    }

    @Override
    public void a(Executor executor, final H0.a<? super T> aVar) {
        this.f503a.c(new Runnable() {
            @Override
            public final void run() {
                this.f499d.e(aVar);
            }
        }, executor);
    }

    @Override
    public void b(H0.a<? super T> aVar) {
    }

    @Override
    public com.google.common.util.concurrent.p<T> d() {
        return this.f503a;
    }
}
