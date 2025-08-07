package C;

import C.H0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b1<T> implements H0<T> {

    private final AtomicReference<Object> f518b;

    private final Object f517a = new Object();

    private int f519c = 0;

    private boolean f520d = false;

    private final Map<H0.a<? super T>, b<T>> f521e = new HashMap();

    private final CopyOnWriteArraySet<b<T>> f522f = new CopyOnWriteArraySet<>();

    static abstract class a {
        a() {
        }

        static a b(Throwable th) {
            return new C0337l(th);
        }

        public abstract Throwable a();
    }

    private static final class b<T> implements Runnable {

        private static final Object f523A = new Object();

        private final Executor f524d;

        private final H0.a<? super T> f525e;

        private final AtomicReference<Object> f527v;

        private final AtomicBoolean f526i = new AtomicBoolean(true);

        private Object f528w = f523A;

        private int f529y = -1;

        private boolean f530z = false;

        b(AtomicReference<Object> atomicReference, Executor executor, H0.a<? super T> aVar) {
            this.f527v = atomicReference;
            this.f524d = executor;
            this.f525e = aVar;
        }

        void a() {
            this.f526i.set(false);
        }

        void b(int i7) {
            synchronized (this) {
                try {
                    if (!this.f526i.get()) {
                        return;
                    }
                    if (i7 <= this.f529y) {
                        return;
                    }
                    this.f529y = i7;
                    if (this.f530z) {
                        return;
                    }
                    this.f530z = true;
                    try {
                        this.f524d.execute(this);
                    } finally {
                        synchronized (this) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f526i.get()) {
                        this.f530z = false;
                        return;
                    }
                    Object obj = this.f527v.get();
                    int i7 = this.f529y;
                    while (true) {
                        if (!Objects.equals(this.f528w, obj)) {
                            this.f528w = obj;
                            if (obj instanceof a) {
                                this.f525e.onError(((a) obj).a());
                            } else {
                                this.f525e.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i7 == this.f529y || !this.f526i.get()) {
                                    break;
                                }
                                obj = this.f527v.get();
                                i7 = this.f529y;
                            } finally {
                            }
                        }
                    }
                    this.f530z = false;
                } finally {
                }
            }
        }
    }

    b1(Object obj, boolean z7) {
        if (!z7) {
            this.f518b = new AtomicReference<>(obj);
        } else {
            x0.g.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f518b = new AtomicReference<>(a.b((Throwable) obj));
        }
    }

    private void c(H0.a<? super T> aVar) {
        b<T> bVarRemove = this.f521e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f522f.remove(bVarRemove);
        }
    }

    private void f(Object obj) {
        Iterator<b<T>> it;
        int i7;
        synchronized (this.f517a) {
            try {
                if (Objects.equals(this.f518b.getAndSet(obj), obj)) {
                    return;
                }
                int i8 = this.f519c + 1;
                this.f519c = i8;
                if (this.f520d) {
                    return;
                }
                this.f520d = true;
                Iterator<b<T>> it2 = this.f522f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i8);
                    } else {
                        synchronized (this.f517a) {
                            try {
                                if (this.f519c == i8) {
                                    this.f520d = false;
                                    return;
                                } else {
                                    it = this.f522f.iterator();
                                    i7 = this.f519c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i8 = i7;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public void a(Executor executor, H0.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f517a) {
            c(aVar);
            bVar = new b<>(this.f518b, executor, aVar);
            this.f521e.put(aVar, bVar);
            this.f522f.add(bVar);
        }
        bVar.b(0);
    }

    @Override
    public void b(H0.a<? super T> aVar) {
        synchronized (this.f517a) {
            c(aVar);
        }
    }

    @Override
    public com.google.common.util.concurrent.p<T> d() {
        Object obj = this.f518b.get();
        return obj instanceof a ? G.n.n(((a) obj).a()) : G.n.p(obj);
    }

    void e(T t7) {
        f(t7);
    }
}
