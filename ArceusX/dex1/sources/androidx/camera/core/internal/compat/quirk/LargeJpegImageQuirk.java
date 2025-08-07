package androidx.camera.core.internal.compat.quirk;

import C.N0;
import Z.tNT.PexNRiLSd;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class LargeJpegImageQuirk implements N0 {

    private static final Set<String> f9480a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", PexNRiLSd.hMDql, "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    private static final Set<String> f9481b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f9480a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean h() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f9481b.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    static boolean i() {
        return f() || h();
    }

    public boolean j(byte[] bArr) {
        return g() || h() || bArr.length > 10000000;
    }
}
