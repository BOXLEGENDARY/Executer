package androidx.camera.view.internal.compat.quirk;

import C.N0;
import C.O0;
import java.util.ArrayList;
import java.util.List;

public class b {
    static List<N0> a(O0 o02) {
        ArrayList arrayList = new ArrayList();
        if (o02.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.i())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (o02.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.f())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
