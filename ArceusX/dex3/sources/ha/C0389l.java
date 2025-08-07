package ha;

import C9.d;
import C9.g;
import e.c;

public final class C0389l implements d<c<String[]>> {
    private final C0384g a;

    public C0389l(C0384g c0384g) {
        this.a = c0384g;
    }

    public static C0389l a(C0384g c0384g) {
        return new C0389l(c0384g);
    }

    public static c<String[]> c(C0384g c0384g) {
        return (c) g.d(c0384g.a());
    }

    public c<String[]> get() {
        return c(this.a);
    }
}
