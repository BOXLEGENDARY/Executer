package androidx.camera.video.internal.compat.quirk;

import C.I;
import S.C1230l;
import android.os.Build;

public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J260F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J530F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "sm-j600g".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean k() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J701F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean l() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean m() {
        return f() || g() || h() || i() || k() || l() || j();
    }

    @Override
    public boolean d(I i7, C1230l c1230l) {
        return g() ? c1230l == C1230l.f6338c || c1230l == C1230l.f6339d : (f() || h() || i() || k() || l() || j()) && c1230l == C1230l.f6338c;
    }
}
