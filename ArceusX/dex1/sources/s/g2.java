package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

public final class g2 {
    public static boolean a(t.B b2) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) b2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i7 : iArr) {
                if (i7 == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
