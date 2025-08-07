package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import t.B;

public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    private static final Set<String> f9398a = new HashSet(Arrays.asList("redmi note 8 pro"));

    static boolean f(B b2) {
        return f9398a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
