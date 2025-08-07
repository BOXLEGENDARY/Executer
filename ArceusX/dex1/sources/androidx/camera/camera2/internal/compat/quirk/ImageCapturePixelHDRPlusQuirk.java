package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

public class ImageCapturePixelHDRPlusQuirk implements N0 {

    public static final List<String> f9392a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean f() {
        return f9392a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
