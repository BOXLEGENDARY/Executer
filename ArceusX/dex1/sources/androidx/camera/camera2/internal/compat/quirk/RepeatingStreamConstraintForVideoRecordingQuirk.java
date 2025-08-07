package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class RepeatingStreamConstraintForVideoRecordingQuirk implements N0 {
    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
