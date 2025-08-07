package w;

import C.R0;
import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import z.C3049g0;

public class l {

    private final R0 f24205a;

    public l(R0 r02) {
        this.f24205a = r02;
    }

    public PointF a(C3049g0 c3049g0, int i7) {
        return (i7 == 1 && this.f24205a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - c3049g0.c(), c3049g0.d()) : new PointF(c3049g0.c(), c3049g0.d());
    }
}
