package R3;

public final class y6 {

    private static x6 f6034a;

    public static synchronized C1130n6 a(AbstractC1050d6 abstractC1050d6) {
        try {
            if (f6034a == null) {
                f6034a = new x6(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1130n6) f6034a.b(abstractC1050d6);
    }

    public static synchronized C1130n6 b(String str) {
        return a(AbstractC1050d6.d(str).c());
    }
}
