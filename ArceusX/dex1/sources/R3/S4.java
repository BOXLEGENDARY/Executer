package R3;

public final class S4 {

    private C1175t4 f5366a;

    private C1144p4 f5367b;

    private C1112l4 f5368c;

    private Integer f5369d;

    private Integer f5370e;

    public final S4 d(Integer num) {
        this.f5369d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final S4 e(C1112l4 c1112l4) {
        this.f5368c = c1112l4;
        return this;
    }

    public final S4 f(C1144p4 c1144p4) {
        this.f5367b = c1144p4;
        return this;
    }

    public final S4 g(C1175t4 c1175t4) {
        this.f5366a = c1175t4;
        return this;
    }

    public final S4 h(Integer num) {
        this.f5370e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final U4 i() {
        return new U4(this, null);
    }
}
