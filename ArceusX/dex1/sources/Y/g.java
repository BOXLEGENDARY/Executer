package y;

import C.X;
import G.n;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.p;
import java.util.concurrent.Executor;
import r.C2739a;
import s.C2852u;
import z.InterfaceC3054j;

public final class g {

    private final C2852u f24345c;

    final Executor f24346d;

    c.a<Void> f24349g;

    private boolean f24343a = false;

    private boolean f24344b = false;

    final Object f24347e = new Object();

    private C2739a.C0218a f24348f = new C2739a.C0218a();

    public g(C2852u c2852u, Executor executor) {
        this.f24345c = c2852u;
        this.f24346d = executor;
    }

    private void h(j jVar) {
        synchronized (this.f24347e) {
            this.f24348f.b(jVar);
        }
    }

    private void k() {
        synchronized (this.f24347e) {
            this.f24348f = new C2739a.C0218a();
        }
    }

    public void l() {
        c.a<Void> aVar = this.f24349g;
        if (aVar != null) {
            aVar.c(null);
            this.f24349g = null;
        }
    }

    private void m(Exception exc) {
        c.a<Void> aVar = this.f24349g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f24349g = null;
        }
    }

    public Object p(final c.a aVar) throws Exception {
        this.f24346d.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24341d.o(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public Object r(final c.a aVar) throws Exception {
        this.f24346d.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24338d.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public void s(boolean z7) {
        if (this.f24343a == z7) {
            return;
        }
        this.f24343a = z7;
        if (!z7) {
            m(new InterfaceC3054j.a("The camera control has became inactive."));
        } else if (this.f24344b) {
            w();
        }
    }

    public void q(c.a<Void> aVar) {
        this.f24344b = true;
        m(new InterfaceC3054j.a("Camera2CameraControl was updated with new options."));
        this.f24349g = aVar;
        if (this.f24343a) {
            w();
        }
    }

    private void w() {
        this.f24345c.s0().c(new Runnable() {
            @Override
            public final void run() {
                this.f24340d.l();
            }
        }, this.f24346d);
        this.f24344b = false;
    }

    public p<Void> g(j jVar) {
        h(jVar);
        return n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f24334a.p(aVar);
            }
        }));
    }

    public void i(C2739a.C0218a c0218a) {
        synchronized (this.f24347e) {
            c0218a.e(this.f24348f.c(), X.c.ALWAYS_OVERRIDE);
        }
    }

    public p<Void> j() {
        k();
        return n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f24337a.r(aVar);
            }
        }));
    }

    public C2739a n() {
        C2739a c2739aA;
        synchronized (this.f24347e) {
            c2739aA = this.f24348f.a();
        }
        return c2739aA;
    }

    public void t(final boolean z7) {
        this.f24346d.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24335d.s(z7);
            }
        });
    }
}
