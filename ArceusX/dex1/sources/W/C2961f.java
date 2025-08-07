package w;

import C.d1;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.List;

public class C2961f {

    private final ExtraSupportedSurfaceCombinationsQuirk f24199a = (ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedSurfaceCombinationsQuirk.class);

    public List<d1> a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f24199a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.h(str);
    }
}
