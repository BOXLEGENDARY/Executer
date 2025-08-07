package w;

import C.R0;
import C.X;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import r.C2739a;

public class C2956a {

    private final Range<Integer> f24194a;

    public C2956a(R0 r02) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) r02.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f24194a = null;
        } else {
            this.f24194a = aeFpsRangeLegacyQuirk.g();
        }
    }

    public void a(C2739a.C0218a c0218a) {
        Range<Integer> range = this.f24194a;
        if (range != null) {
            c0218a.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, X.c.REQUIRED);
        }
    }
}
