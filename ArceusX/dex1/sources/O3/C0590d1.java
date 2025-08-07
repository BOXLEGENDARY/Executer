package O3;

import n3.C2649g;

public final class C0590d1 {

    private final M6 f3417a;

    private final Boolean f3419c;

    private final C0642h9 f3421e;

    private final AbstractC0633h0 f3422f;

    private final AbstractC0633h0 f3423g;

    private final Boolean f3418b = null;

    private final C0792v6 f3420d = null;

    C0590d1(C0568b1 c0568b1, C0579c1 c0579c1) {
        this.f3417a = c0568b1.f3396a;
        this.f3419c = c0568b1.f3397b;
        this.f3421e = c0568b1.f3398c;
        this.f3422f = c0568b1.f3399d;
        this.f3423g = c0568b1.f3400e;
    }

    public final AbstractC0633h0 a() {
        return this.f3422f;
    }

    public final AbstractC0633h0 b() {
        return this.f3423g;
    }

    public final M6 c() {
        return this.f3417a;
    }

    public final C0642h9 d() {
        return this.f3421e;
    }

    public final Boolean e() {
        return this.f3419c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0590d1)) {
            return false;
        }
        C0590d1 c0590d1 = (C0590d1) obj;
        return C2649g.b(this.f3417a, c0590d1.f3417a) && C2649g.b(null, null) && C2649g.b(this.f3419c, c0590d1.f3419c) && C2649g.b(null, null) && C2649g.b(this.f3421e, c0590d1.f3421e) && C2649g.b(this.f3422f, c0590d1.f3422f) && C2649g.b(this.f3423g, c0590d1.f3423g);
    }

    public final int hashCode() {
        return C2649g.c(this.f3417a, null, this.f3419c, null, this.f3421e, this.f3422f, this.f3423g);
    }
}
