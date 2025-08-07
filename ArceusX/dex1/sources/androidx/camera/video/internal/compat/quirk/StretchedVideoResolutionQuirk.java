package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;
import android.util.Size;

public class StretchedVideoResolutionQuirk implements N0 {
    private static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return g();
    }

    public Size f(int i7) {
        if (i7 == 4) {
            return new Size(640, 480);
        }
        if (i7 == 5) {
            return new Size(960, 720);
        }
        if (i7 != 6) {
            return null;
        }
        return new Size(1440, 1080);
    }
}
