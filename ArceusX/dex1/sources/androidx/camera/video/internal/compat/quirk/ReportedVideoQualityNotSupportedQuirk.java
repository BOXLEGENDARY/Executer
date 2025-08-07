package androidx.camera.video.internal.compat.quirk;

import C.I;
import S.C1230l;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    private static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean i() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return f() || g() || j() || h() || i();
    }

    @Override
    public boolean b() {
        return f() || g() || h() || i();
    }

    @Override
    public boolean d(I i7, C1230l c1230l) {
        if (f() || g()) {
            return c1230l == C1230l.f6339d;
        }
        if (j()) {
            return c1230l == C1230l.f6337b || c1230l == C1230l.f6338c;
        }
        if (h()) {
            return i7.h() == 0 && (c1230l == C1230l.f6338c || c1230l == C1230l.f6337b);
        }
        if (i()) {
            return i7.h() == 1 && c1230l == C1230l.f6339d;
        }
        return false;
    }
}
