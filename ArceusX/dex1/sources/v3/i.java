package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C1823h;

public final class i {

    private static Boolean f24140a;

    private static Boolean f24141b;

    private static Boolean f24142c;

    private static Boolean f24143d;

    private static Boolean f24144e;

    private static Boolean f24145f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f24144e == null) {
            boolean z7 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f24144e = Boolean.valueOf(z7);
        }
        return f24144e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f24145f == null) {
            boolean z7 = false;
            if (m.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z7 = true;
            }
            f24145f = Boolean.valueOf(z7);
        }
        return f24145f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f24142c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z7 = true;
            }
            f24142c = Boolean.valueOf(z7);
        }
        return f24142c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i7 = C1823h.f14217a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !m.h()) {
            return true;
        }
        if (h(context)) {
            return !m.i() || m.l();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f24141b == null) {
            boolean z7 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z7 = true;
            }
            f24141b = Boolean.valueOf(z7);
        }
        return f24141b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f24143d == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f24143d = Boolean.valueOf(z7);
        }
        return f24143d.booleanValue();
    }

    public static boolean j(PackageManager packageManager) {
        if (f24140a == null) {
            boolean z7 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z7 = true;
            }
            f24140a = Boolean.valueOf(z7);
        }
        return f24140a.booleanValue();
    }
}
