package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements N0 {
    static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29;
    }
}
