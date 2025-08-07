package S3;

public final class C9 {

    private static B9 f6426a;

    public static synchronized C1440r9 a(AbstractC1342i9 abstractC1342i9) {
        try {
            if (f6426a == null) {
                f6426a = new B9(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1440r9) f6426a.b(abstractC1342i9);
    }

    public static synchronized C1440r9 b(String str) {
        return a(AbstractC1342i9.d(str).c());
    }
}
