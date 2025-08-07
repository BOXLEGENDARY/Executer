package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import Y3.qE.KpBmp;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TorchIsClosedAfterImageCapturingQuirk implements N0 {

    public static final List<String> f9405a = Arrays.asList("mi a1", KpBmp.bEVQOzkhuNjzIg, "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro");

    static boolean f() {
        return f9405a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
