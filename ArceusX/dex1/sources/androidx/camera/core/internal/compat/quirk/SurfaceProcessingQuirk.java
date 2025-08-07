package androidx.camera.core.internal.compat.quirk;

import C.N0;
import C.R0;
import java.util.Iterator;

public interface SurfaceProcessingQuirk extends N0 {
    static boolean a(R0 r02) {
        Iterator it = r02.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
