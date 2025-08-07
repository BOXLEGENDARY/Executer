package N3;

public final class X {

    private static X f2599a;

    private X() {
    }

    public static synchronized X a() {
        try {
            if (f2599a == null) {
                f2599a = new X();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2599a;
    }

    public static void b() {
        W.a();
    }
}
