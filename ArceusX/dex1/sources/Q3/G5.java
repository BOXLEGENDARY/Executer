package Q3;

public final class G5 {

    private static F5 f4034a;

    public static synchronized C1006x5 a(AbstractC0971s5 abstractC0971s5) {
        try {
            if (f4034a == null) {
                f4034a = new F5(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1006x5) f4034a.b(abstractC0971s5);
    }

    public static synchronized C1006x5 b(String str) {
        return a(AbstractC0971s5.d("vision-common").c());
    }
}
