package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.B;

public class CaptureNoResponseQuirk implements N0 {
    static boolean f(B b2) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
