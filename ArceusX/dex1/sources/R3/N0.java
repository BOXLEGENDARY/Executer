package R3;

public final class N0 {

    private Q0 f5287a;

    private Integer f5288b;

    private C1040c4 f5289c;

    public final N0 a(Integer num) {
        this.f5288b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final N0 b(C1040c4 c1040c4) {
        this.f5289c = c1040c4;
        return this;
    }

    public final N0 c(Q0 q02) {
        this.f5287a = q02;
        return this;
    }

    public final S0 e() {
        return new S0(this, null);
    }
}
