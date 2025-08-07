package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import android.util.Size;

public class ExtraSupportedOutputSizeQuirk implements N0 {
    private Size[] g() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        return h();
    }

    public Size[] f(int i7) {
        return (i7 == 34 && h()) ? g() : new Size[0];
    }
}
