package O3;

public final class K9 {

    private static I9 f2915a;

    public static synchronized C0828y9 a(AbstractC0741q9 abstractC0741q9) {
        try {
            if (f2915a == null) {
                f2915a = new I9(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0828y9) f2915a.b(abstractC0741q9);
    }

    public static synchronized C0828y9 b(String str) {
        return a(AbstractC0741q9.d(str).c());
    }
}
