package R3;

public final class z6 {

    private static z6 f6064a;

    private z6() {
    }

    public static synchronized z6 a() {
        try {
            if (f6064a == null) {
                f6064a = new z6();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6064a;
    }
}
