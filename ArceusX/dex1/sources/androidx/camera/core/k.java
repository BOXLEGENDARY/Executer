package androidx.camera.core;

import C.InterfaceC0353t0;
import androidx.camera.core.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class k extends i {

    final Executor f9486t;

    private final Object f9487u = new Object();

    n f9488v;

    private b f9489w;

    class a implements G.c<Void> {

        final b f9490a;

        a(b bVar) {
            this.f9490a = bVar;
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            this.f9490a.close();
        }
    }

    static class b extends e {

        final WeakReference<k> f9492v;

        b(n nVar, k kVar) {
            super(nVar);
            this.f9492v = new WeakReference<>(kVar);
            b(new e.a() {
                @Override
                public final void b(n nVar2) {
                    this.f9493a.u(nVar2);
                }
            });
        }

        public void u(n nVar) {
            final k kVar = this.f9492v.get();
            if (kVar != null) {
                kVar.f9486t.execute(new Runnable() {
                    @Override
                    public final void run() {
                        kVar.z();
                    }
                });
            }
        }
    }

    k(Executor executor) {
        this.f9486t = executor;
    }

    @Override
    n d(InterfaceC0353t0 interfaceC0353t0) {
        return interfaceC0353t0.c();
    }

    @Override
    void g() {
        synchronized (this.f9487u) {
            try {
                n nVar = this.f9488v;
                if (nVar != null) {
                    nVar.close();
                    this.f9488v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    void o(n nVar) {
        synchronized (this.f9487u) {
            try {
                if (!this.f9474s) {
                    nVar.close();
                    return;
                }
                if (this.f9489w == null) {
                    b bVar = new b(nVar, this);
                    this.f9489w = bVar;
                    G.n.j(e(bVar), new a(bVar), F.a.a());
                } else {
                    if (nVar.D0().d() <= this.f9489w.D0().d()) {
                        nVar.close();
                    } else {
                        n nVar2 = this.f9488v;
                        if (nVar2 != null) {
                            nVar2.close();
                        }
                        this.f9488v = nVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this.f9487u) {
            try {
                this.f9489w = null;
                n nVar = this.f9488v;
                if (nVar != null) {
                    this.f9488v = null;
                    o(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
