package ha;

import C9.d;
import C9.h;

public final class C0554d implements d<C0553c> {
    private final h<InterfaceC0555e> a;

    public C0554d(h<InterfaceC0555e> hVar) {
        this.a = hVar;
    }

    public static C0554d a(h<InterfaceC0555e> hVar) {
        return new C0554d(hVar);
    }

    public static C0553c c(InterfaceC0555e interfaceC0555e) {
        return new C0553c(interfaceC0555e);
    }

    public C0553c get() {
        return c((InterfaceC0555e) this.a.get());
    }
}
