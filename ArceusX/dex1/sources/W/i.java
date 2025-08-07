package w;

import C.AbstractC0324e0;
import C.R0;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;
import z.C3043d0;

public class i {

    private final boolean f24201a;

    private final boolean f24202b;

    private final boolean f24203c;

    public i(R0 r02, R0 r03) {
        this.f24201a = r03.a(TextureViewIsClosedQuirk.class);
        this.f24202b = r02.a(PreviewOrientationIncorrectQuirk.class);
        this.f24203c = r02.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List<AbstractC0324e0> list) {
        if (!b() || list == null) {
            return;
        }
        Iterator<AbstractC0324e0> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        C3043d0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f24201a || this.f24202b || this.f24203c;
    }
}
