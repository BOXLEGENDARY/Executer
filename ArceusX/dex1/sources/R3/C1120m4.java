package R3;

public final class C1120m4 {

    private EnumC1128n4 f5689a;

    private Integer f5690b;

    public final C1120m4 a(EnumC1128n4 enumC1128n4) {
        this.f5689a = enumC1128n4;
        return this;
    }

    public final C1120m4 b(Integer num) {
        this.f5690b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1144p4 d() {
        return new C1144p4(this, null);
    }
}
