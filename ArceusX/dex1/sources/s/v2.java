package s;

import android.hardware.camera2.CameraCharacteristics;

final class v2 {
    public static boolean a(t.B b2, int i7) {
        int[] iArr = (int[]) b2.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }
}
