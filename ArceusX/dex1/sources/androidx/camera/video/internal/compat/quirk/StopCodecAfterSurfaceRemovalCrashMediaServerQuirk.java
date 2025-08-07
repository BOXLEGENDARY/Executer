package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements N0 {
    private static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
