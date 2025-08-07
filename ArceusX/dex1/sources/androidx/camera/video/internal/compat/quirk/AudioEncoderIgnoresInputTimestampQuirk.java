package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class AudioEncoderIgnoresInputTimestampQuirk implements N0 {
    private static boolean f() {
        return "Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
