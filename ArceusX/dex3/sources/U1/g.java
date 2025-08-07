package U1;

import g0.j;

public class g {
    private static final g b = new g();
    private final j<String, P1.d> a = new j<>(20);

    g() {
    }

    public static g b() {
        return b;
    }

    public P1.d a(String str) {
        if (str == null) {
            return null;
        }
        return (P1.d) this.a.d(str);
    }

    public void c(String str, P1.d dVar) {
        if (str == null) {
            return;
        }
        this.a.f(str, dVar);
    }
}
