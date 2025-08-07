package androidx.camera.core.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LowMemoryQuirk implements N0 {

    private static final Set<String> f9482a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean f() {
        return f9482a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
