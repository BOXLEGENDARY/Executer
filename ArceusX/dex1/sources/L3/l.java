package L3;

import java.io.PrintStream;

public final class l {

    private static final o f2049a;

    private static final int f2050b;

    static final class a extends o {
        a() {
        }

        @Override
        public final void a(Throwable th, Throwable th2) {
        }
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: L3.l.<clinit>():void");
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e7) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e7.printStackTrace(printStream);
            return null;
        }
    }

    public static void b(Throwable th, Throwable th2) {
        f2049a.a(th, th2);
    }
}
