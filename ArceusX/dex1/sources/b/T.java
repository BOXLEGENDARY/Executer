package B;

import B.f0;
import android.graphics.Bitmap;
import androidx.concurrent.futures.c;
import java.util.Objects;
import z.T;

public class T implements V {

    private final f0 f165a;

    private final f0.a f166b;

    private c.a<Void> f169e;

    private c.a<Void> f170f;

    private com.google.common.util.concurrent.p<Void> f173i;

    private boolean f171g = false;

    private boolean f172h = false;

    private final com.google.common.util.concurrent.p<Void> f167c = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
        @Override
        public final Object a(c.a aVar) {
            return this.f163a.r(aVar);
        }
    });

    private final com.google.common.util.concurrent.p<Void> f168d = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
        @Override
        public final Object a(c.a aVar) {
            return this.f164a.s(aVar);
        }
    });

    T(f0 f0Var, f0.a aVar) {
        this.f165a = f0Var;
        this.f166b = aVar;
    }

    private void l(z.U u7) {
        E.p.a();
        this.f171g = true;
        com.google.common.util.concurrent.p<Void> pVar = this.f173i;
        Objects.requireNonNull(pVar);
        pVar.cancel(true);
        this.f169e.f(u7);
        this.f170f.c(null);
    }

    private void o() {
        x0.g.j(this.f167c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public Object r(c.a aVar) throws Exception {
        this.f169e = aVar;
        return "CaptureCompleteFuture";
    }

    public Object s(c.a aVar) throws Exception {
        this.f170f = aVar;
        return "RequestCompleteFuture";
    }

    private void t() {
        x0.g.j(!this.f168d.isDone(), "The callback can only complete once.");
        this.f170f.c(null);
    }

    private void u(z.U u7) {
        E.p.a();
        this.f165a.x(u7);
    }

    @Override
    public void a(int i7) {
        E.p.a();
        if (this.f171g) {
            return;
        }
        this.f165a.w(i7);
    }

    @Override
    public void b(Bitmap bitmap) {
        E.p.a();
        if (this.f171g) {
            return;
        }
        this.f165a.y(bitmap);
    }

    @Override
    public void c() {
        E.p.a();
        if (this.f171g || this.f172h) {
            return;
        }
        this.f172h = true;
        this.f165a.j();
        T.f fVarL = this.f165a.l();
        if (fVarL != null) {
            fVarL.c();
        }
    }

    @Override
    public boolean d() {
        return this.f171g;
    }

    @Override
    public void e() {
        E.p.a();
        if (this.f171g) {
            return;
        }
        if (!this.f172h) {
            c();
        }
        this.f169e.c(null);
    }

    @Override
    public void f(z.U u7) {
        E.p.a();
        if (this.f171g) {
            return;
        }
        boolean zF = this.f165a.f();
        if (!zF) {
            u(u7);
        }
        t();
        this.f169e.f(u7);
        if (zF) {
            this.f166b.a(this.f165a);
        }
    }

    @Override
    public void g(z.U u7) {
        E.p.a();
        if (this.f171g) {
            return;
        }
        o();
        t();
        u(u7);
    }

    @Override
    public void h(T.h hVar) {
        E.p.a();
        if (this.f171g) {
            return;
        }
        o();
        t();
        this.f165a.A(hVar);
    }

    @Override
    public void i(androidx.camera.core.n nVar) {
        E.p.a();
        if (this.f171g) {
            nVar.close();
            return;
        }
        o();
        t();
        this.f165a.z(nVar);
    }

    void m(z.U u7) {
        E.p.a();
        if (this.f168d.isDone()) {
            return;
        }
        l(u7);
        u(u7);
    }

    void n() {
        E.p.a();
        if (this.f168d.isDone()) {
            return;
        }
        l(new z.U(3, "The request is aborted silently and retried.", null));
        this.f166b.a(this.f165a);
    }

    com.google.common.util.concurrent.p<Void> p() {
        E.p.a();
        return this.f167c;
    }

    com.google.common.util.concurrent.p<Void> q() {
        E.p.a();
        return this.f168d;
    }

    public void v(com.google.common.util.concurrent.p<Void> pVar) {
        E.p.a();
        x0.g.j(this.f173i == null, "CaptureRequestFuture can only be set once.");
        this.f173i = pVar;
    }
}
