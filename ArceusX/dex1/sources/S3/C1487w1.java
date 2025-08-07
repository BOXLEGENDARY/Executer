package S3;

import n3.C2649g;

public final class C1487w1 {

    private final F6 f7277a;

    private final Boolean f7279c;

    private final C1429q8 f7281e;

    private final Boolean f7278b = null;

    private final C1405o6 f7280d = null;

    C1487w1(C1465u1 c1465u1, C1476v1 c1476v1) {
        this.f7277a = c1465u1.f7142a;
        this.f7279c = c1465u1.f7143b;
        this.f7281e = c1465u1.f7144c;
    }

    public final F6 a() {
        return this.f7277a;
    }

    public final C1429q8 b() {
        return this.f7281e;
    }

    public final Boolean c() {
        return this.f7279c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1487w1)) {
            return false;
        }
        C1487w1 c1487w1 = (C1487w1) obj;
        return C2649g.b(this.f7277a, c1487w1.f7277a) && C2649g.b(null, null) && C2649g.b(this.f7279c, c1487w1.f7279c) && C2649g.b(null, null) && C2649g.b(this.f7281e, c1487w1.f7281e);
    }

    public final int hashCode() {
        return C2649g.c(this.f7277a, null, this.f7279c, null, this.f7281e);
    }
}
