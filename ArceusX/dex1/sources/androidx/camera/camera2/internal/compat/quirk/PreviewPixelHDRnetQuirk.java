package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PreviewPixelHDRnetQuirk implements N0 {

    private static final List<String> f9401a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean f() {
        return "Google".equals(Build.MANUFACTURER) && f9401a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
