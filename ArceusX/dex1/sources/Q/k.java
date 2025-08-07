package Q;

import C.F;
import C.H0;
import C.I;
import C.J;
import Q.h;
import java.util.Collection;
import z.G0;

class k implements J {

    private final J f3762d;

    private final q f3763e;

    private final r f3764i;

    private final G0.b f3765v;

    k(J j7, G0.b bVar, h.a aVar) {
        this.f3762d = j7;
        this.f3765v = bVar;
        this.f3763e = new q(j7.h(), aVar);
        this.f3764i = new r(j7.q());
    }

    @Override
    public H0<J.a> b() {
        return this.f3762d.b();
    }

    @Override
    public void d(G0 g02) {
        E.p.a();
        this.f3765v.d(g02);
    }

    @Override
    public void e(G0 g02) {
        E.p.a();
        this.f3765v.e(g02);
    }

    @Override
    public F h() {
        return this.f3763e;
    }

    @Override
    public void j(G0 g02) {
        E.p.a();
        this.f3765v.j(g02);
    }

    @Override
    public void l(Collection<G0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override
    public void m(G0 g02) {
        E.p.a();
        this.f3765v.m(g02);
    }

    @Override
    public void n(Collection<G0> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public I q() {
        return this.f3764i;
    }

    void r(int i7) {
        this.f3764i.r(i7);
    }
}
