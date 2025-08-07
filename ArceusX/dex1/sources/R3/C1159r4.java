package R3;

public final class C1159r4 {

    private Long f5822a;

    private A4 f5823b;

    private Boolean f5824c;

    private Boolean f5825d;

    private Boolean f5826e;

    public final C1159r4 a(Boolean bool) {
        this.f5825d = bool;
        return this;
    }

    public final C1159r4 b(Boolean bool) {
        this.f5826e = bool;
        return this;
    }

    public final C1159r4 c(Long l7) {
        this.f5822a = Long.valueOf(l7.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1159r4 d(A4 a42) {
        this.f5823b = a42;
        return this;
    }

    public final C1159r4 e(Boolean bool) {
        this.f5824c = bool;
        return this;
    }

    public final C1175t4 f() {
        return new C1175t4(this, null);
    }
}
