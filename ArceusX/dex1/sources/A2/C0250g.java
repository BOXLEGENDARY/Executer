package A2;

public final class C0250g implements u2.b<String> {

    private static final class a {

        private static final C0250g f60a = new C0250g();
    }

    public static C0250g a() {
        return a.f60a;
    }

    public static String b() {
        return (String) u2.d.c(AbstractC0249f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public String get() {
        return b();
    }
}
