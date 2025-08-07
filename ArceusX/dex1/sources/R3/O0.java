package R3;

public final class O0 {

    private A4 f5305a;

    private Boolean f5306b;

    private C1112l4 f5307c;

    private Integer f5308d;

    private Integer f5309e;

    public final O0 a(Integer num) {
        this.f5308d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final O0 b(C1112l4 c1112l4) {
        this.f5307c = c1112l4;
        return this;
    }

    public final O0 c(A4 a42) {
        this.f5305a = a42;
        return this;
    }

    public final O0 d(Boolean bool) {
        this.f5306b = bool;
        return this;
    }

    public final O0 e(Integer num) {
        this.f5309e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final Q0 f() {
        return new Q0(this, null);
    }
}
