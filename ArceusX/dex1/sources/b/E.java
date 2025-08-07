package B;

import C.InterfaceC0353t0;
import C.g1;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import y0.xyyu.hkVlaTTCDY;

public class E implements InterfaceC0353t0 {

    private final InterfaceC0353t0 f122a;

    private P f123b;

    E(InterfaceC0353t0 interfaceC0353t0) {
        this.f122a = interfaceC0353t0;
    }

    private androidx.camera.core.n k(androidx.camera.core.n nVar) {
        if (nVar == null) {
            return null;
        }
        g1 g1VarB = this.f123b == null ? g1.b() : g1.a(new Pair(this.f123b.i(), this.f123b.h().get(0)));
        this.f123b = null;
        return new androidx.camera.core.r(nVar, new Size(nVar.getWidth(), nVar.getHeight()), new H.c(new Q.m(g1VarB, nVar.D0().d())));
    }

    public void l(InterfaceC0353t0.a aVar, InterfaceC0353t0 interfaceC0353t0) {
        aVar.a(this);
    }

    @Override
    public Surface a() {
        return this.f122a.a();
    }

    @Override
    public androidx.camera.core.n c() {
        return k(this.f122a.c());
    }

    @Override
    public void close() {
        this.f122a.close();
    }

    @Override
    public int d() {
        return this.f122a.d();
    }

    @Override
    public void e(final InterfaceC0353t0.a aVar, Executor executor) {
        this.f122a.e(new InterfaceC0353t0.a() {
            @Override
            public final void a(InterfaceC0353t0 interfaceC0353t0) {
                this.f120a.l(aVar, interfaceC0353t0);
            }
        }, executor);
    }

    @Override
    public void f() {
        this.f122a.f();
    }

    @Override
    public int g() {
        return this.f122a.g();
    }

    @Override
    public int getHeight() {
        return this.f122a.getHeight();
    }

    @Override
    public int getWidth() {
        return this.f122a.getWidth();
    }

    @Override
    public androidx.camera.core.n h() {
        return k(this.f122a.h());
    }

    void i(P p7) {
        x0.g.j(this.f123b == null, hkVlaTTCDY.InSfzlveEE);
        this.f123b = p7;
    }

    void j() {
        this.f123b = null;
    }
}
