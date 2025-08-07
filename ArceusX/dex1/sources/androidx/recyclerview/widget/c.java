package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c<T> {

    private final Executor f11829a;

    private final Executor f11830b;

    private final h.f<T> f11831c;

    public static final class a<T> {

        private static final Object f11832d = new Object();

        private static Executor f11833e;

        private Executor f11834a;

        private Executor f11835b;

        private final h.f<T> f11836c;

        public a(h.f<T> fVar) {
            this.f11836c = fVar;
        }

        public c<T> a() {
            if (this.f11835b == null) {
                synchronized (f11832d) {
                    try {
                        if (f11833e == null) {
                            f11833e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f11835b = f11833e;
            }
            return new c<>(this.f11834a, this.f11835b, this.f11836c);
        }
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f11829a = executor;
        this.f11830b = executor2;
        this.f11831c = fVar;
    }

    public Executor a() {
        return this.f11830b;
    }

    public h.f<T> b() {
        return this.f11831c;
    }

    public Executor c() {
        return this.f11829a;
    }
}
