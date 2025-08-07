package w;

import C.R0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class y {

    private final boolean f24226a;

    private final boolean f24227b;

    public y(R0 r02) {
        this.f24226a = CaptureIntentPreviewQuirk.e(r02);
        this.f24227b = r02.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map<CaptureRequest.Key<?>, Object> a(int i7) {
        if (i7 == 3 && this.f24226a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i7 != 4 || !this.f24227b) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
