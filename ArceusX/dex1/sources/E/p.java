package E;

import android.os.Handler;
import android.os.Looper;

public final class p {
    public static void a() {
        x0.g.j(c(), "Not in application's main thread");
    }

    private static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            x0.g.j(b().post(runnable), "Unable to post to main thread");
        }
    }
}
