package ha;

import C9.d;
import C9.h;
import ha.InterfaceC0555e;

public final class C0587b implements d<C0586a> {
    private final h<InterfaceC0555e> a;

    public C0587b(h<InterfaceC0555e> hVar) {
        this.a = hVar;
    }

    public static C0587b a(h<InterfaceC0555e> hVar) {
        return new C0587b(hVar);
    }

    public static C0586a c(InterfaceC0555e interfaceC0555e) {
        return new C0586a(interfaceC0555e);
    }

    public C0586a get() {
        return c((InterfaceC0555e) this.a.get());
    }
}
