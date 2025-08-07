package androidx.camera.view.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class SurfaceViewNotCroppedByParentQuirk implements N0 {
    static boolean f() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
