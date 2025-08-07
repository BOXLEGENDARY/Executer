package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.B;

public class LegacyCameraSurfaceCleanupQuirk implements N0 {
    static boolean f(B b2) {
        Integer num = (Integer) b2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    static boolean g(B b2) {
        return Build.VERSION.SDK_INT < 29 && f(b2);
    }
}
