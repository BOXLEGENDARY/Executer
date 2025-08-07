package E;

import android.os.Handler;
import android.os.Looper;

public final class l {

    private static volatile Handler f1064a;

    private l() {
    }

    public static Handler a() {
        if (f1064a != null) {
            return f1064a;
        }
        synchronized (l.class) {
            try {
                if (f1064a == null) {
                    f1064a = u0.h.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1064a;
    }
}
