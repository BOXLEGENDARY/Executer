package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.p;
import java.io.File;
import java.util.concurrent.Executor;
import p0.h;
import u0.g;
import x0.C2985b;

public class a {

    private static final Object f10561a = new Object();

    static class C0085a {
        static Drawable a(Context context, int i7) {
            return context.getDrawable(i7);
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class b {
        static int a(Context context, int i7) {
            return context.getColor(i7);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static class d {
        static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class e {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        C2985b.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : p.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return c.a(context);
    }

    public static int c(Context context, int i7) {
        return b.a(context, i7);
    }

    public static ColorStateList d(Context context, int i7) {
        return h.d(context.getResources(), i7, context.getTheme());
    }

    public static Drawable e(Context context, int i7) {
        return C0085a.a(context, i7);
    }

    @Deprecated
    public static File[] f(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] g(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : g.a(new Handler(context.getMainLooper()));
    }

    public static File i(Context context) {
        return C0085a.b(context);
    }

    public static <T> T j(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void l(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void m(Context context, Intent intent) {
        d.a(context, intent);
    }
}
