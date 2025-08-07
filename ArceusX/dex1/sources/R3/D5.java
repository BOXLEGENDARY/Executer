package R3;

public final class D5 {

    private String f5167a;

    private String f5168b;

    private String f5169c;

    private String f5170d;

    private P f5171e;

    private String f5172f;

    private Boolean f5173g;

    private Boolean f5174h;

    private Boolean f5175i;

    private Integer f5176j;

    private Integer f5177k;

    public final D5 b(String str) {
        this.f5167a = str;
        return this;
    }

    public final D5 c(String str) {
        this.f5168b = str;
        return this;
    }

    public final D5 d(Integer num) {
        this.f5176j = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final D5 e(Boolean bool) {
        this.f5173g = bool;
        return this;
    }

    public final D5 f(Boolean bool) {
        this.f5175i = bool;
        return this;
    }

    public final D5 g(Boolean bool) {
        this.f5174h = bool;
        return this;
    }

    public final D5 h(P p7) {
        this.f5171e = p7;
        return this;
    }

    public final D5 i(String str) {
        this.f5172f = str;
        return this;
    }

    public final D5 j(String str) {
        this.f5169c = str;
        return this;
    }

    public final D5 k(Integer num) {
        this.f5177k = num;
        return this;
    }

    public final D5 l(String str) {
        this.f5170d = str;
        return this;
    }

    public final F5 m() {
        return new F5(this, null);
    }
}
