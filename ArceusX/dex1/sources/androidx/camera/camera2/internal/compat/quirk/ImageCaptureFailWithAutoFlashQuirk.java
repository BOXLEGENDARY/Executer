package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.B;

public class ImageCaptureFailWithAutoFlashQuirk implements N0 {

    private static final List<String> f9388a = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean f(B b2) {
        return f9388a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
