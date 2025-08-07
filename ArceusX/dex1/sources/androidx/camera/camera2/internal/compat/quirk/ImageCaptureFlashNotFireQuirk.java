package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.B;

public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    private static final List<String> f9390a = Arrays.asList("itel w6004");

    private static final List<String> f9391b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean f(B b2) {
        List<String> list = f9391b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f9390a.contains(str.toLowerCase(locale));
    }
}
