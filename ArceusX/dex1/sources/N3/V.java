package N3;

public final class V {

    private static U f2597a;

    public static synchronized M a(I i7) {
        try {
            if (f2597a == null) {
                f2597a = new U(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (M) f2597a.b(i7);
    }

    public static synchronized M b(String str) {
        return a(I.d("common").c());
    }
}
