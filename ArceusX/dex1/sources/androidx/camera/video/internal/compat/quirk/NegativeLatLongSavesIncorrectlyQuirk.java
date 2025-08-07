package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;

public class NegativeLatLongSavesIncorrectlyQuirk implements N0 {
    static boolean f() {
        return Build.VERSION.SDK_INT < 34;
    }
}
