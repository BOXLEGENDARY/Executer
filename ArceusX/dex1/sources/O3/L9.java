package O3;

public final class L9 {

    private static L9 f2937a;

    private L9() {
    }

    public static synchronized L9 a() {
        try {
            if (f2937a == null) {
                f2937a = new L9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2937a;
    }
}
