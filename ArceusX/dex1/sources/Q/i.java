package Q;

import C.D0;
import C.E0;
import C.J0;
import C.o1;
import C.p1;
import java.util.UUID;

class i implements o1.a<h, j, i> {

    private final E0 f3759a;

    i() {
        this(E0.d0());
    }

    @Override
    public j d() {
        return new j(J0.b0(this.f3759a));
    }

    public i b(p1.b bVar) {
        c().l(o1.f663B, bVar);
        return this;
    }

    @Override
    public D0 c() {
        return this.f3759a;
    }

    public i e(Class<h> cls) {
        c().l(H.m.f1524G, cls);
        if (c().a(H.m.f1523F, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public i f(String str) {
        c().l(H.m.f1523F, str);
        return this;
    }

    i(E0 e02) {
        this.f3759a = e02;
        Class cls = (Class) e02.a(H.m.f1524G, null);
        if (cls == null || cls.equals(h.class)) {
            b(p1.b.STREAM_SHARING);
            e(h.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
