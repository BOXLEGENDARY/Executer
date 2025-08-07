package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class CaptureSessionShouldUseMrirQuirk implements N0 {
    static boolean f() {
        return "google".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
