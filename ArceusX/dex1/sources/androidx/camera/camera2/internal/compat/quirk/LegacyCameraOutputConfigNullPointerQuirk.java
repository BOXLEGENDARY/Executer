package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import t.B;

public class LegacyCameraOutputConfigNullPointerQuirk implements N0 {
    static boolean f(B b2) {
        Integer num = (Integer) b2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
