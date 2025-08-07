package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import s.C2852u;
import t.B;

public class TorchFlashRequiredFor3aUpdateQuirk implements N0 {

    private static final List<String> f9403b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    private final B f9404a;

    public TorchFlashRequiredFor3aUpdateQuirk(B b2) {
        this.f9404a = b2;
    }

    private static boolean f(B b2) {
        return g() && j(b2);
    }

    private static boolean g() {
        Iterator<String> it = f9403b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(B b2) {
        return Build.VERSION.SDK_INT >= 28 && C2852u.N(b2, 5) == 5;
    }

    private static boolean j(B b2) {
        return ((Integer) b2.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean k(B b2) {
        return f(b2);
    }

    public boolean i() {
        return !h(this.f9404a);
    }
}
