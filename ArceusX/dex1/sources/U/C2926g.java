package u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import t.B;
import z.C3070z;

public final class C2926g {

    private final a f23849a;

    interface a {
        DynamicRangeProfiles a();

        Set<C3070z> b();

        Set<C3070z> c(C3070z c3070z);
    }

    C2926g(a aVar) {
        this.f23849a = aVar;
    }

    public static C2926g a(B b2) {
        C2926g c2926gE = Build.VERSION.SDK_INT >= 33 ? e(C2925f.a(b2.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return c2926gE == null ? i.f23851a : c2926gE;
    }

    public static C2926g e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        x0.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C2926g(new h(dynamicRangeProfiles));
    }

    public Set<C3070z> b(C3070z c3070z) {
        return this.f23849a.c(c3070z);
    }

    public Set<C3070z> c() {
        return this.f23849a.b();
    }

    public DynamicRangeProfiles d() {
        x0.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f23849a.a();
    }
}
