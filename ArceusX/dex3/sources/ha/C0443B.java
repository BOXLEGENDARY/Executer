package ha;

import C9.d;
import C9.g;
import C9.h;

public final class C0443B implements d<InterfaceC0459g> {
    private final C0479x a;
    private final h<C0474s> b;

    public C0443B(C0479x c0479x, h<C0474s> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static C0443B a(C0479x c0479x, h<C0474s> hVar) {
        return new C0443B(c0479x, hVar);
    }

    public static InterfaceC0459g b(C0479x c0479x, C0474s c0474s) {
        return (InterfaceC0459g) g.d(c0479x.d(c0474s));
    }

    public InterfaceC0459g get() {
        return b(this.a, (C0474s) this.b.get());
    }
}
