package L3;

public final class a {

    private static final b f2041a;

    private static volatile b f2042b;

    static {
        c cVar = new c();
        f2041a = cVar;
        f2042b = cVar;
    }

    public static b a() {
        return f2042b;
    }
}
