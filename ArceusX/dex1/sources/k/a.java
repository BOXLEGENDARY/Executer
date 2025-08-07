package K;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;

public class a {

    private final CaptureFailedRetryQuirk f1729a = (CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.a.b(CaptureFailedRetryQuirk.class);

    public int a() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.f1729a;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.f();
    }
}
