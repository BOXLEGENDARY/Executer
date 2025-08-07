package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.B;

public class ImageCaptureWithFlashUnderexposureQuirk implements UseTorchAsFlashQuirk {

    public static final List<String> f9394a = Arrays.asList("sm-a260f", "sm-j530f", "sm-j600g", "sm-j701f", "sm-g610f", "sm-j710mn");

    static boolean f(B b2) {
        return f9394a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
