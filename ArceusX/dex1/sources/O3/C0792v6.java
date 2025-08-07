package O3;

import n3.C2649g;

public final class C0792v6 {

    private final EnumC0770t6 f3614a;

    private final Integer f3615b;

    private final Integer f3616c = null;

    private final Boolean f3617d = null;

    C0792v6(C0759s6 c0759s6, C0781u6 c0781u6) {
        this.f3614a = c0759s6.f3568a;
        this.f3615b = c0759s6.f3569b;
    }

    public final EnumC0770t6 a() {
        return this.f3614a;
    }

    public final Integer b() {
        return this.f3615b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0792v6)) {
            return false;
        }
        C0792v6 c0792v6 = (C0792v6) obj;
        return C2649g.b(this.f3614a, c0792v6.f3614a) && C2649g.b(this.f3615b, c0792v6.f3615b) && C2649g.b(null, null) && C2649g.b(null, null);
    }

    public final int hashCode() {
        return C2649g.c(this.f3614a, this.f3615b, null, null);
    }
}
