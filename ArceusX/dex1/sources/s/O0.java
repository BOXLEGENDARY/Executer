package s;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.C2894g;
import z.C3039b0;

public final class O0 {
    public static boolean a(t.O o2, String str) throws C3039b0 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) o2.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C2894g e7) {
            throw new C3039b0(R0.a(e7));
        }
    }
}
