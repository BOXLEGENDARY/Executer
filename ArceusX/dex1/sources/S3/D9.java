package S3;

public final class D9 {

    private static D9 f6431a;

    private D9() {
    }

    public static synchronized D9 a() {
        try {
            if (f6431a == null) {
                f6431a = new D9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6431a;
    }
}
