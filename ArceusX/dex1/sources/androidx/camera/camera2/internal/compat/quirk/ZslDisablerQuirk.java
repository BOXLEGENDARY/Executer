package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ZslDisablerQuirk implements N0 {

    private static final List<String> f9406a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    private static final List<String> f9407b = Arrays.asList("MI 8");

    private static boolean f(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean g() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f(f9406a);
    }

    private static boolean h() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && f(f9407b);
    }

    static boolean i() {
        return g() || h();
    }
}
