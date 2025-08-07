package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import e2.vb.oyfFwvPUKctyaG;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import t.B;

public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    private static final List<String> f9387a = Arrays.asList(oyfFwvPUKctyaG.nZfUqkrUhQul, "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    private static boolean f() {
        Iterator<String> it = f9387a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean g(B b2) {
        return f() && ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
