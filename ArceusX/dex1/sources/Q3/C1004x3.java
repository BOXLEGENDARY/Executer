package Q3;

public final class C1004x3 {

    private Long f4789a;

    private EnumC1011y3 f4790b;

    private EnumC0969s3 f4791c;

    private Integer f4792d;

    private Integer f4793e;

    private Integer f4794f;

    private Integer f4795g;

    public final C1004x3 b(Long l7) {
        this.f4789a = Long.valueOf(l7.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1004x3 c(Integer num) {
        this.f4792d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1004x3 d(EnumC0969s3 enumC0969s3) {
        this.f4791c = enumC0969s3;
        return this;
    }

    public final C1004x3 e(Integer num) {
        this.f4794f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1004x3 f(EnumC1011y3 enumC1011y3) {
        this.f4790b = enumC1011y3;
        return this;
    }

    public final C1004x3 g(Integer num) {
        this.f4793e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1004x3 h(Integer num) {
        this.f4795g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
