package Z;

import C.I;
import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import C.R0;
import X.i0;
import X.k0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.InterfaceC2621a;
import x0.g;

public class a implements InterfaceC0334j0 {

    private final InterfaceC0334j0 f8172c;

    private Map<Integer, InterfaceC0336k0> f8173d;

    public a(InterfaceC0334j0 interfaceC0334j0, R0 r02, I i7, InterfaceC2621a<i0, k0> interfaceC2621a) {
        this.f8172c = interfaceC0334j0;
        List listC = r02.c(ExtraSupportedQualityQuirk.class);
        if (listC.isEmpty()) {
            return;
        }
        g.i(listC.size() == 1);
        Map<Integer, InterfaceC0336k0> mapF = ((ExtraSupportedQualityQuirk) listC.get(0)).f(i7, interfaceC0334j0, interfaceC2621a);
        if (mapF != null) {
            this.f8173d = new HashMap(mapF);
        }
    }

    private InterfaceC0336k0 c(int i7) {
        Map<Integer, InterfaceC0336k0> map = this.f8173d;
        return (map == null || !map.containsKey(Integer.valueOf(i7))) ? this.f8172c.b(i7) : this.f8173d.get(Integer.valueOf(i7));
    }

    @Override
    public boolean a(int i7) {
        return c(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        return c(i7);
    }
}
