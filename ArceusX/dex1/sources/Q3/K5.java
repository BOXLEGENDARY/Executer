package Q3;

public final class K5 {

    private static K5 f4103a;

    private K5() {
    }

    public static synchronized K5 a() {
        try {
            if (f4103a == null) {
                f4103a = new K5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4103a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
