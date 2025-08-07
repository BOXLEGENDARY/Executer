package a4;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import n3.C2651i;

final class M<TResult> extends Task<TResult> {

    private final Object f8307a = new Object();

    private final I f8308b = new I();

    private boolean f8309c;

    private volatile boolean f8310d;

    private Object f8311e;

    private Exception f8312f;

    M() {
    }

    private final void w() {
        C2651i.q(this.f8309c, "Task is not yet complete");
    }

    private final void x() {
        if (this.f8310d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        if (this.f8309c) {
            throw C1567d.a(this);
        }
    }

    private final void z() {
        synchronized (this.f8307a) {
            try {
                if (this.f8309c) {
                    this.f8308b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final Task<TResult> a(Executor executor, InterfaceC1568e interfaceC1568e) {
        this.f8308b.a(new y(executor, interfaceC1568e));
        z();
        return this;
    }

    @Override
    public final Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        this.f8308b.a(new C1562A(C1575l.f8317a, onCompleteListener));
        z();
        return this;
    }

    @Override
    public final Task<TResult> b(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f8308b.a(new C1562A(executor, onCompleteListener));
        z();
        return this;
    }

    @Override
    public final Task<TResult> c(InterfaceC1569f interfaceC1569f) {
        d(C1575l.f8317a, interfaceC1569f);
        return this;
    }

    @Override
    public final Task<TResult> d(Executor executor, InterfaceC1569f interfaceC1569f) {
        this.f8308b.a(new C(executor, interfaceC1569f));
        z();
        return this;
    }

    @Override
    public final Task<TResult> e(InterfaceC1570g<? super TResult> interfaceC1570g) {
        f(C1575l.f8317a, interfaceC1570g);
        return this;
    }

    @Override
    public final Task<TResult> f(Executor executor, InterfaceC1570g<? super TResult> interfaceC1570g) {
        this.f8308b.a(new E(executor, interfaceC1570g));
        z();
        return this;
    }

    @Override
    public final <TContinuationResult> Task<TContinuationResult> g(Executor executor, InterfaceC1566c<TResult, TContinuationResult> interfaceC1566c) {
        M m7 = new M();
        this.f8308b.a(new u(executor, interfaceC1566c, m7));
        z();
        return m7;
    }

    @Override
    public final <TContinuationResult> Task<TContinuationResult> h(InterfaceC1566c<TResult, Task<TContinuationResult>> interfaceC1566c) {
        return i(C1575l.f8317a, interfaceC1566c);
    }

    @Override
    public final <TContinuationResult> Task<TContinuationResult> i(Executor executor, InterfaceC1566c<TResult, Task<TContinuationResult>> interfaceC1566c) {
        M m7 = new M();
        this.f8308b.a(new w(executor, interfaceC1566c, m7));
        z();
        return m7;
    }

    @Override
    public final Exception j() {
        Exception exc;
        synchronized (this.f8307a) {
            exc = this.f8312f;
        }
        return exc;
    }

    @Override
    public final TResult k() {
        TResult tresult;
        synchronized (this.f8307a) {
            try {
                w();
                x();
                Exception exc = this.f8312f;
                if (exc != null) {
                    throw new C1572i(exc);
                }
                tresult = (TResult) this.f8311e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override
    public final <X extends Throwable> TResult l(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f8307a) {
            try {
                w();
                x();
                if (cls.isInstance(this.f8312f)) {
                    throw cls.cast(this.f8312f);
                }
                Exception exc = this.f8312f;
                if (exc != null) {
                    throw new C1572i(exc);
                }
                tresult = (TResult) this.f8311e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override
    public final boolean m() {
        return this.f8310d;
    }

    @Override
    public final boolean n() {
        boolean z7;
        synchronized (this.f8307a) {
            z7 = this.f8309c;
        }
        return z7;
    }

    @Override
    public final boolean o() {
        boolean z7;
        synchronized (this.f8307a) {
            try {
                z7 = false;
                if (this.f8309c && !this.f8310d && this.f8312f == null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override
    public final <TContinuationResult> Task<TContinuationResult> p(InterfaceC1573j<TResult, TContinuationResult> interfaceC1573j) {
        Executor executor = C1575l.f8317a;
        M m7 = new M();
        this.f8308b.a(new G(executor, interfaceC1573j, m7));
        z();
        return m7;
    }

    @Override
    public final <TContinuationResult> Task<TContinuationResult> q(Executor executor, InterfaceC1573j<TResult, TContinuationResult> interfaceC1573j) {
        M m7 = new M();
        this.f8308b.a(new G(executor, interfaceC1573j, m7));
        z();
        return m7;
    }

    public final void r(Exception exc) {
        C2651i.m(exc, "Exception must not be null");
        synchronized (this.f8307a) {
            y();
            this.f8309c = true;
            this.f8312f = exc;
        }
        this.f8308b.b(this);
    }

    public final void s(Object obj) {
        synchronized (this.f8307a) {
            y();
            this.f8309c = true;
            this.f8311e = obj;
        }
        this.f8308b.b(this);
    }

    public final boolean t() {
        synchronized (this.f8307a) {
            try {
                if (this.f8309c) {
                    return false;
                }
                this.f8309c = true;
                this.f8310d = true;
                this.f8308b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Exception exc) {
        C2651i.m(exc, "Exception must not be null");
        synchronized (this.f8307a) {
            try {
                if (this.f8309c) {
                    return false;
                }
                this.f8309c = true;
                this.f8312f = exc;
                this.f8308b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(Object obj) {
        synchronized (this.f8307a) {
            try {
                if (this.f8309c) {
                    return false;
                }
                this.f8309c = true;
                this.f8311e = obj;
                this.f8308b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
