package C;

import C.H0;
import Q6.QtA.QXojhh;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x0.InterfaceC2984a;
import z.C3043d0;

public final class P0 {

    public static final O0 f422b = O0.b();

    private static final P0 f423c = new P0();

    private final F0<O0> f424a = F0.h(f422b);

    private static class a<T> implements H0.a<T> {

        private final InterfaceC2984a<T> f425a;

        a(InterfaceC2984a<T> interfaceC2984a) {
            this.f425a = interfaceC2984a;
        }

        @Override
        public void a(T t7) {
            this.f425a.accept(t7);
        }

        @Override
        public void onError(Throwable th) {
            C3043d0.d("ObserverToConsumerAdapter", QXojhh.QTpY, th);
        }
    }

    public static P0 b() {
        return f423c;
    }

    public O0 a() {
        try {
            return this.f424a.d().get();
        } catch (InterruptedException | ExecutionException e7) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e7);
        }
    }

    public void c(Executor executor, InterfaceC2984a<O0> interfaceC2984a) {
        this.f424a.a(executor, new a(interfaceC2984a));
    }

    public void d(O0 o02) {
        this.f424a.g(o02);
    }
}
