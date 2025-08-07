package R3;

import n3.C2649g;

public final class C1112l4 {

    private final EnumC1088i4 f5662a;

    private final EnumC1064f4 f5663b;

    private final EnumC1096j4 f5664c;

    private final EnumC1072g4 f5665d;

    private final Boolean f5666e;

    private final Float f5667f;

    C1112l4(C1056e4 c1056e4, C1104k4 c1104k4) {
        this.f5662a = c1056e4.f5511a;
        this.f5663b = c1056e4.f5512b;
        this.f5664c = c1056e4.f5513c;
        this.f5665d = c1056e4.f5514d;
        this.f5666e = c1056e4.f5515e;
        this.f5667f = c1056e4.f5516f;
    }

    public final EnumC1064f4 a() {
        return this.f5663b;
    }

    public final EnumC1072g4 b() {
        return this.f5665d;
    }

    public final EnumC1088i4 c() {
        return this.f5662a;
    }

    public final EnumC1096j4 d() {
        return this.f5664c;
    }

    public final Boolean e() {
        return this.f5666e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1112l4)) {
            return false;
        }
        C1112l4 c1112l4 = (C1112l4) obj;
        return C2649g.b(this.f5662a, c1112l4.f5662a) && C2649g.b(this.f5663b, c1112l4.f5663b) && C2649g.b(this.f5664c, c1112l4.f5664c) && C2649g.b(this.f5665d, c1112l4.f5665d) && C2649g.b(this.f5666e, c1112l4.f5666e) && C2649g.b(this.f5667f, c1112l4.f5667f);
    }

    public final Float f() {
        return this.f5667f;
    }

    public final int hashCode() {
        return C2649g.c(this.f5662a, this.f5663b, this.f5664c, this.f5665d, this.f5666e, this.f5667f);
    }
}
