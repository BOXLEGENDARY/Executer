package S3;

import n3.C2649g;

public final class C1405o6 {

    private final EnumC1383m6 f7052a;

    private final Integer f7053b;

    private final Integer f7054c = null;

    private final Boolean f7055d = null;

    C1405o6(C1372l6 c1372l6, C1394n6 c1394n6) {
        this.f7052a = c1372l6.f7009a;
        this.f7053b = c1372l6.f7010b;
    }

    public final EnumC1383m6 a() {
        return this.f7052a;
    }

    public final Integer b() {
        return this.f7053b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1405o6)) {
            return false;
        }
        C1405o6 c1405o6 = (C1405o6) obj;
        return C2649g.b(this.f7052a, c1405o6.f7052a) && C2649g.b(this.f7053b, c1405o6.f7053b) && C2649g.b(null, null) && C2649g.b(null, null);
    }

    public final int hashCode() {
        return C2649g.c(this.f7052a, this.f7053b, null, null);
    }
}
