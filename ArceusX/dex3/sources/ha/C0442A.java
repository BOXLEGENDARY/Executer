package ha;

import C9.d;
import C9.h;
import d9.b;
import d9.g;

public final class C0442A implements d<b> {
    private final C0479x a;
    private final h<g> b;

    public C0442A(C0479x c0479x, h<g> hVar) {
        this.a = c0479x;
        this.b = hVar;
    }

    public static C0442A a(C0479x c0479x, h<g> hVar) {
        return new C0442A(c0479x, hVar);
    }

    public static b b(C0479x c0479x, g gVar) {
        return (b) C9.g.d(c0479x.c(gVar));
    }

    public b get() {
        return b(this.a, (g) this.b.get());
    }
}
