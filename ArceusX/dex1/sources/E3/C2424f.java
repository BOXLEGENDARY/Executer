package e3;

@Deprecated
public final class C2424f {

    protected Boolean f20421a;

    protected String f20422b;

    public C2424f() {
        this.f20421a = Boolean.FALSE;
    }

    public final C2424f a(String str) {
        this.f20422b = str;
        return this;
    }

    public C2424f(C2425g c2425g) {
        this.f20421a = Boolean.FALSE;
        C2425g.b(c2425g);
        this.f20421a = Boolean.valueOf(c2425g.f20425e);
        this.f20422b = c2425g.f20426i;
    }
}
