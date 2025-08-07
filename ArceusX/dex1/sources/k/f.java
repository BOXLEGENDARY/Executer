package K;

import C.AbstractC0324e0;
import C.X0;
import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z.o0;

public class f {

    private final boolean f1733a;

    public f() {
        this.f1733a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    private int b(AbstractC0324e0 abstractC0324e0) {
        if (abstractC0324e0.g() == MediaCodec.class) {
            return 2;
        }
        return abstractC0324e0.g() == o0.class ? 0 : 1;
    }

    public int c(X0.f fVar, X0.f fVar2) {
        return b(fVar.f()) - b(fVar2.f());
    }

    public void d(List<X0.f> list) {
        if (this.f1733a) {
            Collections.sort(list, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f1732d.c((X0.f) obj, (X0.f) obj2);
                }
            });
        }
    }
}
