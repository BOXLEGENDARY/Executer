package C2;

public final class c implements u2.b<C2.a> {

    private static final class a {

        private static final c f799a = new c();
    }

    public static c a() {
        return a.f799a;
    }

    public static C2.a b() {
        return (C2.a) u2.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C2.a get() {
        return b();
    }
}
