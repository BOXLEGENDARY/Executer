package android.view;

import android.view.AbstractC1694h;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import l.C2522c;
import m.C2556b;

public abstract class LiveData<T> {

    static final Object f11303k = new Object();

    final Object f11304a;

    private C2556b<InterfaceC1710x<? super T>, LiveData<T>.c> f11305b;

    int f11306c;

    private boolean f11307d;

    private volatile Object f11308e;

    volatile Object f11309f;

    private int f11310g;

    private boolean f11311h;

    private boolean f11312i;

    private final Runnable f11313j;

    class LifecycleBoundObserver extends LiveData<T>.c implements InterfaceC1698l {

        final InterfaceC1701o f11314w;

        LifecycleBoundObserver(InterfaceC1701o interfaceC1701o, InterfaceC1710x<? super T> interfaceC1710x) {
            super(interfaceC1710x);
            this.f11314w = interfaceC1701o;
        }

        @Override
        void b() {
            this.f11314w.getLifecycle().d(this);
        }

        @Override
        boolean c(InterfaceC1701o interfaceC1701o) {
            return this.f11314w == interfaceC1701o;
        }

        @Override
        boolean f() {
            return this.f11314w.getLifecycle().b().e(AbstractC1694h.b.STARTED);
        }

        @Override
        public void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
            AbstractC1694h.b bVarB = this.f11314w.getLifecycle().b();
            if (bVarB == AbstractC1694h.b.DESTROYED) {
                LiveData.this.n(this.f11318d);
                return;
            }
            AbstractC1694h.b bVar = null;
            while (bVar != bVarB) {
                a(f());
                bVar = bVarB;
                bVarB = this.f11314w.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            Object obj;
            synchronized (LiveData.this.f11304a) {
                obj = LiveData.this.f11309f;
                LiveData.this.f11309f = LiveData.f11303k;
            }
            LiveData.this.o(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(InterfaceC1710x<? super T> interfaceC1710x) {
            super(interfaceC1710x);
        }

        @Override
        boolean f() {
            return true;
        }
    }

    private abstract class c {

        final InterfaceC1710x<? super T> f11318d;

        boolean f11319e;

        int f11320i = -1;

        c(InterfaceC1710x<? super T> interfaceC1710x) {
            this.f11318d = interfaceC1710x;
        }

        void a(boolean z7) {
            if (z7 == this.f11319e) {
                return;
            }
            this.f11319e = z7;
            LiveData.this.c(z7 ? 1 : -1);
            if (this.f11319e) {
                LiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC1701o interfaceC1701o) {
            return false;
        }

        abstract boolean f();
    }

    public LiveData(T t7) {
        this.f11304a = new Object();
        this.f11305b = new C2556b<>();
        this.f11306c = 0;
        this.f11309f = f11303k;
        this.f11313j = new a();
        this.f11308e = t7;
        this.f11310g = 0;
    }

    static void b(String str) {
        if (C2522c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f11319e) {
            if (!cVar.f()) {
                cVar.a(false);
                return;
            }
            int i7 = cVar.f11320i;
            int i8 = this.f11310g;
            if (i7 >= i8) {
                return;
            }
            cVar.f11320i = i8;
            cVar.f11318d.a((Object) this.f11308e);
        }
    }

    void c(int i7) {
        int i8 = this.f11306c;
        this.f11306c = i7 + i8;
        if (this.f11307d) {
            return;
        }
        this.f11307d = true;
        while (true) {
            try {
                int i9 = this.f11306c;
                if (i8 == i9) {
                    this.f11307d = false;
                    return;
                }
                boolean z7 = i8 == 0 && i9 > 0;
                boolean z8 = i8 > 0 && i9 == 0;
                if (z7) {
                    k();
                } else if (z8) {
                    l();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f11307d = false;
                throw th;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f11311h) {
            this.f11312i = true;
            return;
        }
        this.f11311h = true;
        do {
            this.f11312i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                C2556b<InterfaceC1710x<? super T>, LiveData<T>.c>.d dVarG = this.f11305b.g();
                while (dVarG.hasNext()) {
                    d((c) dVarG.next().getValue());
                    if (this.f11312i) {
                        break;
                    }
                }
            }
        } while (this.f11312i);
        this.f11311h = false;
    }

    public T f() {
        T t7 = (T) this.f11308e;
        if (t7 != f11303k) {
            return t7;
        }
        return null;
    }

    int g() {
        return this.f11310g;
    }

    public boolean h() {
        return this.f11306c > 0;
    }

    public void i(InterfaceC1701o interfaceC1701o, InterfaceC1710x<? super T> interfaceC1710x) {
        b("observe");
        if (interfaceC1701o.getLifecycle().b() == AbstractC1694h.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1701o, interfaceC1710x);
        LiveData<T>.c cVarL = this.f11305b.l(interfaceC1710x, lifecycleBoundObserver);
        if (cVarL != null && !cVarL.c(interfaceC1701o)) {
            throw new IllegalArgumentException(GObvYfBKohxpYX.UTQLyXyOpC);
        }
        if (cVarL != null) {
            return;
        }
        interfaceC1701o.getLifecycle().a(lifecycleBoundObserver);
    }

    public void j(InterfaceC1710x<? super T> interfaceC1710x) {
        b("observeForever");
        b bVar = new b(interfaceC1710x);
        LiveData<T>.c cVarL = this.f11305b.l(interfaceC1710x, bVar);
        if (cVarL instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarL != null) {
            return;
        }
        bVar.a(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(T t7) {
        boolean z7;
        synchronized (this.f11304a) {
            z7 = this.f11309f == f11303k;
            this.f11309f = t7;
        }
        if (z7) {
            C2522c.g().c(this.f11313j);
        }
    }

    public void n(InterfaceC1710x<? super T> interfaceC1710x) {
        b("removeObserver");
        LiveData<T>.c cVarM = this.f11305b.m(interfaceC1710x);
        if (cVarM == null) {
            return;
        }
        cVarM.b();
        cVarM.a(false);
    }

    protected void o(T t7) {
        b("setValue");
        this.f11310g++;
        this.f11308e = t7;
        e(null);
    }

    public LiveData() {
        this.f11304a = new Object();
        this.f11305b = new C2556b<>();
        this.f11306c = 0;
        Object obj = f11303k;
        this.f11309f = obj;
        this.f11313j = new a();
        this.f11308e = obj;
        this.f11310g = -1;
    }
}
