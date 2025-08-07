package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.B;

public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean f() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g(B b2) {
        return f() && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
