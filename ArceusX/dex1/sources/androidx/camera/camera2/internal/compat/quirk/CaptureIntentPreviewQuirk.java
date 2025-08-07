package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import C.R0;
import java.util.Iterator;

public interface CaptureIntentPreviewQuirk extends N0 {
    static boolean e(R0 r02) {
        Iterator it = r02.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    default boolean c() {
        return true;
    }
}
