package ha;

import C9.d;
import C9.g;
import C9.h;
import d9.InterfaceC0550a;
import d9.e;

public final class C0481z implements d<InterfaceC0550a> {
    private final C0479x a;
    private final h<e> b;

    public C0481z(C0479x c0479x, h<e> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static C0481z a(C0479x c0479x, h<e> hVar) {
        return new C0481z(c0479x, hVar);
    }

    public static InterfaceC0550a b(C0479x c0479x, e eVar) {
        return (InterfaceC0550a) g.d(c0479x.b(eVar));
    }

    public InterfaceC0550a get() {
        return b(this.a, (e) this.b.get());
    }
}
