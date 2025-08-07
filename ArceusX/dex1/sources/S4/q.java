package S4;

import e2.vb.oyfFwvPUKctyaG;
import z3.AdxZ.bpTQi;

public final class q {

    private final Class<?> f7372a;

    private final int f7373b;

    private final int f7374c;

    private q(Class<?> cls, int i7, int i8) {
        this.f7372a = (Class) C.c(cls, "Null dependency anInterface.");
        this.f7373b = i7;
        this.f7374c = i8;
    }

    private static String a(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return bpTQi.PEjjkNzBU;
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    public static q g(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q h(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> b() {
        return this.f7372a;
    }

    public boolean c() {
        return this.f7374c == 2;
    }

    public boolean d() {
        return this.f7374c == 0;
    }

    public boolean e() {
        return this.f7373b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7372a == qVar.f7372a && this.f7373b == qVar.f7373b && this.f7374c == qVar.f7374c;
    }

    public boolean f() {
        return this.f7373b == 2;
    }

    public int hashCode() {
        return ((((this.f7372a.hashCode() ^ 1000003) * 1000003) ^ this.f7373b) * 1000003) ^ this.f7374c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f7372a);
        sb.append(", type=");
        int i7 = this.f7373b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? oyfFwvPUKctyaG.VKrqTfn : "set");
        sb.append(", injection=");
        sb.append(a(this.f7374c));
        sb.append("}");
        return sb.toString();
    }
}
