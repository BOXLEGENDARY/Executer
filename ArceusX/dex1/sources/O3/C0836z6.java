package O3;

public final class C0836z6 {

    private Long f3684a;

    private M6 f3685b;

    private Boolean f3686c;

    private Boolean f3687d;

    private Boolean f3688e;

    public final C0836z6 a(Boolean bool) {
        this.f3687d = bool;
        return this;
    }

    public final C0836z6 b(Boolean bool) {
        this.f3688e = bool;
        return this;
    }

    public final C0836z6 c(Long l7) {
        this.f3684a = Long.valueOf(l7.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0836z6 d(M6 m62) {
        this.f3685b = m62;
        return this;
    }

    public final C0836z6 e(Boolean bool) {
        this.f3686c = bool;
        return this;
    }

    public final B6 f() {
        return new B6(this, null);
    }
}
