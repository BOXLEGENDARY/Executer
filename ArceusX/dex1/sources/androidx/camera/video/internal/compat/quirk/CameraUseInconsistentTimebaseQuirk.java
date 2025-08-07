package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CameraUseInconsistentTimebaseQuirk implements N0 {

    private static final Set<String> f9556a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    private static final Set<String> f9557b = new HashSet(Arrays.asList("sm4350", "sm6375", wtzgsqRsIZB.SsmdIHF));

    private static final Set<String> f9558c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean f() {
        return f9558c.contains(Build.MODEL.toLowerCase());
    }

    private static boolean g() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f9556a.contains(Build.HARDWARE.toLowerCase());
    }

    static boolean h() {
        return i() || g() || f();
    }

    private static boolean i() {
        return Build.VERSION.SDK_INT >= 31 && f9557b.contains(Build.SOC_MODEL.toLowerCase());
    }
}
