package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.B;

public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {

    public static final List<String> f9378a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", jUbDmI.hegjUpAHXnLQMN, "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    static boolean f(B b2) {
        return f9378a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
