package O3;

import n3.C2649g;

public final class C0642h9 {

    private final AbstractC0633h0 f3474a;

    C0642h9(C0620f9 c0620f9, C0631g9 c0631g9) {
        this.f3474a = c0620f9.f3460a;
    }

    public final AbstractC0633h0 a() {
        return this.f3474a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0642h9) {
            return C2649g.b(this.f3474a, ((C0642h9) obj).f3474a);
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(this.f3474a);
    }
}
