package ha;

import C9.d;
import C9.g;
import e.c;

public final class C0403z implements d<c<String>> {
    private final C0401w a;

    public C0403z(C0401w c0401w) {
        this.a = c0401w;
    }

    public static C0403z a(C0401w c0401w) {
        return new C0403z(c0401w);
    }

    public static c<String> c(C0401w c0401w) {
        return (c) g.d(c0401w.a());
    }

    public c<String> get() {
        return c(this.a);
    }
}
