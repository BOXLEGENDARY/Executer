package A2;

public final class C0253j implements u2.b<AbstractC0248e> {

    private static final class a {

        private static final C0253j f63a = new C0253j();
    }

    public static C0253j a() {
        return a.f63a;
    }

    public static AbstractC0248e c() {
        return (AbstractC0248e) u2.d.c(AbstractC0249f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public AbstractC0248e get() {
        return c();
    }
}
