package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.B;
import z3.AdxZ.bpTQi;

public class ImageCaptureWashedOutImageQuirk implements UseTorchAsFlashQuirk {

    public static final List<String> f9393a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", bpTQi.VCQCeGBfpSmwtA, "SM-SCV33", "SM-G9350", tAjeAKSIqDqzNP.MMBAwlBMRI, "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    static boolean f(B b2) {
        return f9393a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
