package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

public class C2957b {

    private final boolean f24195a;

    private final boolean f24196b;

    public C2957b(R0 r02) {
        this.f24195a = r02.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f24196b = androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i7) {
        if ((this.f24195a || this.f24196b) && i7 == 2) {
            return 1;
        }
        return i7;
    }
}
