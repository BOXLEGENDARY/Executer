package ha;

import C9.d;
import C9.g;
import e.c;

public final class C0395r implements d<c<String[]>> {
    private final C0392o a;

    public C0395r(C0392o c0392o) {
        this.a = c0392o;
    }

    public static C0395r a(C0392o c0392o) {
        return new C0395r(c0392o);
    }

    public static c<String[]> c(C0392o c0392o) {
        return (c) g.d(c0392o.a());
    }

    public c<String[]> get() {
        return c(this.a);
    }
}
