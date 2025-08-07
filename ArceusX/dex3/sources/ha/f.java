package ha;

import C9.d;
import C9.h;
import J8.q;
import com.squareup.moshi.w;
import ha.C0462j;

public final class f implements d<C0343e> {
    private final h<q> a;
    private final h<w> b;
    private final h<C0462j> c;

    public f(h<q> hVar, h<w> hVar2, h<C0462j> hVar3) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
    }

    public static f a(h<q> hVar, h<w> hVar2, h<C0462j> hVar3) {
        return new f(hVar, hVar2, hVar3);
    }

    public static C0343e c(q qVar, w wVar, C0462j c0462j) {
        return new C0343e(qVar, wVar, c0462j);
    }

    public C0343e get() {
        return c((q) this.a.get(), (w) this.b.get(), (C0462j) this.c.get());
    }
}
