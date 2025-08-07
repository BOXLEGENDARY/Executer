package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import t2.Dbl.hgESaf;

public class Nexus4AndroidLTargetAspectRatioQuirk implements N0 {

    private static final List<String> f9400a = Arrays.asList("NEXUS 4");

    static boolean g() {
        hgESaf.ezlTlraCpsqKT.equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int f() {
        return 2;
    }
}
