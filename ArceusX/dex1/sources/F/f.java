package F;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

final class f {

    private static volatile ScheduledExecutorService f1242a;

    private f() {
    }

    static ScheduledExecutorService a() {
        if (f1242a != null) {
            return f1242a;
        }
        synchronized (f.class) {
            try {
                if (f1242a == null) {
                    f1242a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1242a;
    }
}
