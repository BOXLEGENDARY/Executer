package ha;

import C9.d;
import C9.g;
import C9.h;
import f9.C0575b;
import f9.InterfaceC0574a;

public final class C0444C implements d<InterfaceC0574a> {
    private final C0479x a;
    private final h<C0575b> b;

    public C0444C(C0479x c0479x, h<C0575b> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static C0444C a(C0479x c0479x, h<C0575b> hVar) {
        return new C0444C(c0479x, hVar);
    }

    public static InterfaceC0574a c(C0479x c0479x, C0575b c0575b) {
        return (InterfaceC0574a) g.d(c0479x.e(c0575b));
    }

    public InterfaceC0574a get() {
        return c(this.a, (C0575b) this.b.get());
    }
}
