package D4;

import android.content.Context;

public final class a0 {

    private static V f930a;

    public static synchronized V a(Context context) {
        try {
            if (f930a == null) {
                H h7 = new H(null);
                h7.a(new C0379j(E4.N.a(context)));
                f930a = h7.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f930a;
    }
}
