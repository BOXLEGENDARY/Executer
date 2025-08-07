package C;

import C.H0;
import android.os.SystemClock;
import android.view.C1709w;
import android.view.InterfaceC1710x;
import androidx.concurrent.futures.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class B0<T> implements H0<T> {

    final C1709w<b<T>> f374a = new C1709w<>();

    private final Map<H0.a<? super T>, a<T>> f375b = new HashMap();

    static final class a<T> implements InterfaceC1710x<b<T>> {

        final AtomicBoolean f376a = new AtomicBoolean(true);

        final H0.a<? super T> f377b;

        final Executor f378c;

        a(Executor executor, H0.a<? super T> aVar) {
            this.f378c = executor;
            this.f377b = aVar;
        }

        public void d(b bVar) {
            if (this.f376a.get()) {
                if (bVar.a()) {
                    this.f377b.a((Object) bVar.d());
                } else {
                    x0.g.g(bVar.c());
                    this.f377b.onError(bVar.c());
                }
            }
        }

        void c() {
            this.f376a.set(false);
        }

        @Override
        public void a(final b<T> bVar) {
            this.f378c.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f365d.d(bVar);
                }
            });
        }
    }

    public static final class b<T> {

        private final T f379a;

        private final Throwable f380b;

        private b(T t7, Throwable th) {
            this.f379a = t7;
            this.f380b = th;
        }

        static <T> b<T> b(T t7) {
            return new b<>(t7, null);
        }

        public boolean a() {
            return this.f380b == null;
        }

        public Throwable c() {
            return this.f380b;
        }

        public T d() {
            if (a()) {
                return this.f379a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f379a;
            } else {
                str = "Error: " + this.f380b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    public void h(a aVar, a aVar2) {
        if (aVar != null) {
            this.f374a.n(aVar);
        }
        this.f374a.j(aVar2);
    }

    public void i(c.a aVar) {
        b<T> bVarF = this.f374a.f();
        if (bVarF == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (bVarF.a()) {
            aVar.c(bVarF.d());
        } else {
            x0.g.g(bVarF.c());
            aVar.f(bVarF.c());
        }
    }

    public Object j(final c.a aVar) throws Exception {
        F.a.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f776d.i(aVar);
            }
        });
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public void k(a aVar) {
        this.f374a.n(aVar);
    }

    @Override
    public void a(Executor executor, H0.a<? super T> aVar) {
        synchronized (this.f375b) {
            try {
                final a<T> aVar2 = this.f375b.get(aVar);
                if (aVar2 != null) {
                    aVar2.c();
                }
                final a<T> aVar3 = new a<>(executor, aVar);
                this.f375b.put(aVar, aVar3);
                F.a.d().execute(new Runnable() {
                    @Override
                    public final void run() {
                        this.f759d.h(aVar2, aVar3);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void b(H0.a<? super T> aVar) {
        synchronized (this.f375b) {
            try {
                final a<T> aVarRemove = this.f375b.remove(aVar);
                if (aVarRemove != null) {
                    aVarRemove.c();
                    F.a.d().execute(new Runnable() {
                        @Override
                        public final void run() {
                            this.f774d.k(aVarRemove);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public com.google.common.util.concurrent.p<T> d() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f768a.j(aVar);
            }
        });
    }

    public void l(T t7) {
        this.f374a.m(b.b(t7));
    }
}
