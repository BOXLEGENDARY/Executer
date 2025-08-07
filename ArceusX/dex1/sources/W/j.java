package w;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import r.C2739a;

public class j {
    public void a(int i7, C2739a.C0218a c0218a) {
        if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i7 == 0) {
            c0218a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i7 != 1) {
                return;
            }
            c0218a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
