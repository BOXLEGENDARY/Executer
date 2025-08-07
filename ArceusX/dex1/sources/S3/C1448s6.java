package S3;

public final class C1448s6 {

    private Long f7124a;

    private F6 f7125b;

    private Boolean f7126c;

    private Boolean f7127d;

    private Boolean f7128e;

    public final C1448s6 a(Boolean bool) {
        this.f7127d = bool;
        return this;
    }

    public final C1448s6 b(Boolean bool) {
        this.f7128e = bool;
        return this;
    }

    public final C1448s6 c(Long l7) {
        this.f7124a = Long.valueOf(l7.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1448s6 d(F6 f62) {
        this.f7125b = f62;
        return this;
    }

    public final C1448s6 e(Boolean bool) {
        this.f7126c = bool;
        return this;
    }

    public final C1470u6 f() {
        return new C1470u6(this, null);
    }
}
