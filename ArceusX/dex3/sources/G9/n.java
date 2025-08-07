package G9;

import G9.l;
import Sa.u;
import Sa.v;
import Sa.w;
import Sa.x;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class n implements l {
    private final g a;
    private final q b;
    private final t c;
    private final Map<Class<? extends Sa.r>, l.c<? extends Sa.r>> d;
    private final l.a e;

    static class a implements l.b {
        private final Map<Class<? extends Sa.r>, l.c<? extends Sa.r>> a = new HashMap();
        private l.a b;

        a() {
        }

        @Override
        @NonNull
        public <N extends Sa.r> l.b a(@NonNull Class<N> cls, l.c<? super N> cVar) {
            if (cVar == null) {
                this.a.remove(cls);
            } else {
                this.a.put(cls, cVar);
            }
            return this;
        }

        @Override
        @NonNull
        public l b(@NonNull g gVar, @NonNull q qVar) {
            l.a bVar = this.b;
            if (bVar == null) {
                bVar = new b();
            }
            return new n(gVar, qVar, new t(), Collections.unmodifiableMap(this.a), bVar);
        }
    }

    n(@NonNull g gVar, @NonNull q qVar, @NonNull t tVar, @NonNull Map<Class<? extends Sa.r>, l.c<? extends Sa.r>> map, @NonNull l.a aVar) {
        this.a = gVar;
        this.b = qVar;
        this.c = tVar;
        this.d = map;
        this.e = aVar;
    }

    private void H(@NonNull Sa.r rVar) {
        l.c<? extends Sa.r> cVar = this.d.get(rVar.getClass());
        if (cVar != null) {
            cVar.a(this, rVar);
        } else {
            u(rVar);
        }
    }

    @Override
    @NonNull
    public q A() {
        return this.b;
    }

    @Override
    public void B(Sa.o oVar) {
        H(oVar);
    }

    @Override
    public void C(Sa.q qVar) {
        H(qVar);
    }

    @Override
    public void D(u uVar) {
        H(uVar);
    }

    @Override
    public void E(Sa.k kVar) {
        H(kVar);
    }

    @Override
    public void F(Sa.j jVar) {
        H(jVar);
    }

    public <N extends Sa.r> void G(@NonNull Class<N> cls, int i) {
        s sVarA = this.a.c().a(cls);
        if (sVarA != null) {
            e(i, sVarA.a(this.a, this.b));
        }
    }

    @Override
    public void a(x xVar) {
        H(xVar);
    }

    @Override
    public void b(Sa.n nVar) {
        H(nVar);
    }

    @Override
    public boolean c(@NonNull Sa.r rVar) {
        return rVar.e() != null;
    }

    @Override
    public void d(Sa.b bVar) {
        H(bVar);
    }

    @Override
    public void e(int i, Object obj) {
        t tVar = this.c;
        t.j(tVar, obj, i, tVar.length());
    }

    @Override
    public void f(Sa.d dVar) {
        H(dVar);
    }

    @Override
    public void g(@NonNull Sa.r rVar) {
        this.e.b(this, rVar);
    }

    @Override
    public void h(w wVar) {
        H(wVar);
    }

    @Override
    public void i(Sa.f fVar) {
        H(fVar);
    }

    @Override
    public void j(Sa.s sVar) {
        H(sVar);
    }

    @Override
    public void k(Sa.t tVar) {
        H(tVar);
    }

    @Override
    public void l(@NonNull Sa.r rVar) {
        this.e.a(this, rVar);
    }

    @Override
    public int length() {
        return this.c.length();
    }

    @Override
    public void m(Sa.e eVar) {
        H(eVar);
    }

    @Override
    @NonNull
    public t n() {
        return this.c;
    }

    @Override
    public void o(Sa.g gVar) {
        H(gVar);
    }

    @Override
    public void p(Sa.l lVar) {
        H(lVar);
    }

    @Override
    @NonNull
    public g q() {
        return this.a;
    }

    @Override
    public void r(Sa.c cVar) {
        H(cVar);
    }

    @Override
    public void s() {
        this.c.append('\n');
    }

    @Override
    public <N extends Sa.r> void t(@NonNull N n, int i) {
        G(n.getClass(), i);
    }

    @Override
    public void u(@NonNull Sa.r rVar) {
        Sa.r rVarC = rVar.c();
        while (rVarC != null) {
            Sa.r rVarE = rVarC.e();
            rVarC.a(this);
            rVarC = rVarE;
        }
    }

    @Override
    public void v(Sa.m mVar) {
        H(mVar);
    }

    @Override
    public void w(Sa.h hVar) {
        H(hVar);
    }

    @Override
    public void x() {
        if (this.c.length() <= 0 || '\n' == this.c.h()) {
            return;
        }
        this.c.append('\n');
    }

    @Override
    public void y(v vVar) {
        H(vVar);
    }

    @Override
    public void z(Sa.i iVar) {
        H(iVar);
    }
}
