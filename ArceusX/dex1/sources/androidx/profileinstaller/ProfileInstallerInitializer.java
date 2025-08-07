package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements f1.a<b> {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    public void h(Context context, long j7) {
        g(context);
    }

    public static void k(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() {
            @Override
            public final void run() throws PackageManager.NameNotFoundException {
                androidx.profileinstaller.f.i(context);
            }
        });
    }

    @Override
    public List<Class<? extends f1.a<?>>> b() {
        return Collections.emptyList();
    }

    @Override
    public b a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j7) {
                this.f7641d.h(applicationContext, j7);
            }
        });
        return new b();
    }

    void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
            @Override
            public final void run() {
                ProfileInstallerInitializer.k(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
