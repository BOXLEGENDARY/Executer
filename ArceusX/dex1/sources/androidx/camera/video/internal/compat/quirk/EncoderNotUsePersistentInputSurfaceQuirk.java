package androidx.camera.video.internal.compat.quirk;

import C.N0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

public class EncoderNotUsePersistentInputSurfaceQuirk implements N0 {

    private static final List<String> f9559a = Arrays.asList("SM-N9208", "SM-G920V");

    static boolean f() {
        return f9559a.contains(Build.MODEL.toUpperCase());
    }
}
