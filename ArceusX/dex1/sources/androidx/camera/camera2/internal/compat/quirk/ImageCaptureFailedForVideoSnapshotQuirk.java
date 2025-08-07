package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ImageCaptureFailedForVideoSnapshotQuirk implements N0 {

    private static final Set<String> f9389a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    private static boolean f() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        Set<String> set = f9389a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!set.contains(str.toLowerCase(locale)) && (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
            String str2 = Build.HARDWARE;
            if (!str2.toLowerCase(locale).startsWith("ums") && (!"itel".equalsIgnoreCase(Build.BRAND) || !str2.toLowerCase(locale).startsWith("sp"))) {
                return false;
            }
        }
        return true;
    }

    static boolean h() {
        return g() || f();
    }
}
