package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.B;

public class AfRegionFlipHorizontallyQuirk implements N0 {
    static boolean f(B b2) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
