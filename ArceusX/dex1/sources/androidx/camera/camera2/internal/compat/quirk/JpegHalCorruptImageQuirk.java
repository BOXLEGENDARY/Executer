package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import t.B;

public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {

    private static final Set<String> f9399a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    static boolean f(B b2) {
        return f9399a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
