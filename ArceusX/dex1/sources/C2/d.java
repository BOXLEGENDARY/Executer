package C2;

public final class d implements u2.b<C2.a> {

    private static final class a {

        private static final d f800a = new d();
    }

    public static d a() {
        return a.f800a;
    }

    public static C2.a c() {
        return (C2.a) u2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C2.a get() {
        return c();
    }
}
