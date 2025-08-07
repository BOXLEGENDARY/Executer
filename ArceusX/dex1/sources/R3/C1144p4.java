package R3;

import n3.C2649g;

public final class C1144p4 {

    private final EnumC1128n4 f5775a;

    private final Integer f5776b;

    private final Integer f5777c = null;

    private final Boolean f5778d = null;

    C1144p4(C1120m4 c1120m4, C1136o4 c1136o4) {
        this.f5775a = c1120m4.f5689a;
        this.f5776b = c1120m4.f5690b;
    }

    public final EnumC1128n4 a() {
        return this.f5775a;
    }

    public final Integer b() {
        return this.f5776b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1144p4)) {
            return false;
        }
        C1144p4 c1144p4 = (C1144p4) obj;
        return C2649g.b(this.f5775a, c1144p4.f5775a) && C2649g.b(this.f5776b, c1144p4.f5776b) && C2649g.b(null, null) && C2649g.b(null, null);
    }

    public final int hashCode() {
        return C2649g.c(this.f5775a, this.f5776b, null, null);
    }
}
