package R3;

import n3.C2649g;

public final class Q0 {

    private final A4 f5332a;

    private final Boolean f5333b;

    private final C1144p4 f5334c = null;

    private final C1112l4 f5335d;

    private final Integer f5336e;

    private final Integer f5337f;

    Q0(O0 o02, P0 p02) {
        this.f5332a = o02.f5305a;
        this.f5333b = o02.f5306b;
        this.f5335d = o02.f5307c;
        this.f5336e = o02.f5308d;
        this.f5337f = o02.f5309e;
    }

    public final C1112l4 a() {
        return this.f5335d;
    }

    public final A4 b() {
        return this.f5332a;
    }

    public final Boolean c() {
        return this.f5333b;
    }

    public final Integer d() {
        return this.f5336e;
    }

    public final Integer e() {
        return this.f5337f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return C2649g.b(this.f5332a, q02.f5332a) && C2649g.b(this.f5333b, q02.f5333b) && C2649g.b(null, null) && C2649g.b(this.f5335d, q02.f5335d) && C2649g.b(this.f5336e, q02.f5336e) && C2649g.b(this.f5337f, q02.f5337f);
    }

    public final int hashCode() {
        return C2649g.c(this.f5332a, this.f5333b, null, this.f5335d, this.f5336e, this.f5337f);
    }
}
