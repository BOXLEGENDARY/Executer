package u5;

import B9.a;
import C9.c;
import C9.d;
import C9.g;
import C9.h;
import o8.InterfaceC0723a;
import o8.b;

public final class C0626l implements d<InterfaceC0723a> {
    private final C0625k a;
    private final h<b> b;

    public C0626l(C0625k c0625k, h<b> hVar) {
        this.a = c0625k;
        this.b = hVar;
    }

    public static InterfaceC0723a a(C0625k c0625k, a<b> aVar) {
        return (InterfaceC0723a) g.d(c0625k.a(aVar));
    }

    public static C0626l b(C0625k c0625k, h<b> hVar) {
        return new C0626l(c0625k, hVar);
    }

    public InterfaceC0723a get() {
        return a(this.a, c.b(this.b));
    }
}
