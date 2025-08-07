package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Locale;

public class StillCaptureFlashStopRepeatingQuirk implements N0 {
    static boolean f() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
