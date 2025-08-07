package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class Preview3AThreadCrashQuirk implements N0 {
    static boolean f() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
