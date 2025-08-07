package Z;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import C.R0;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class b implements InterfaceC0334j0 {

    private final InterfaceC0334j0 f8174c;

    private final R0 f8175d;

    private final Map<Integer, InterfaceC0336k0> f8176e = new HashMap();

    public b(InterfaceC0334j0 interfaceC0334j0, R0 r02) {
        this.f8174c = interfaceC0334j0;
        this.f8175d = r02;
    }

    private InterfaceC0336k0 c(InterfaceC0336k0 interfaceC0336k0, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC0336k0.c> it = interfaceC0336k0.d().iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0336k0.b.h(interfaceC0336k0.a(), interfaceC0336k0.b(), interfaceC0336k0.c(), arrayList);
    }

    private static InterfaceC0336k0.c d(InterfaceC0336k0.c cVar, Size size) {
        return InterfaceC0336k0.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private Size e(int i7) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f8175d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.f(i7);
            }
        }
        return null;
    }

    private InterfaceC0336k0 f(int i7) {
        InterfaceC0336k0 interfaceC0336k0C;
        if (this.f8176e.containsKey(Integer.valueOf(i7))) {
            return this.f8176e.get(Integer.valueOf(i7));
        }
        if (this.f8174c.a(i7)) {
            InterfaceC0336k0 interfaceC0336k0B = this.f8174c.b(i7);
            Objects.requireNonNull(interfaceC0336k0B);
            interfaceC0336k0C = interfaceC0336k0B;
            Size sizeE = e(i7);
            if (sizeE != null) {
                interfaceC0336k0C = c(interfaceC0336k0C, sizeE);
            }
        } else {
            interfaceC0336k0C = null;
        }
        this.f8176e.put(Integer.valueOf(i7), interfaceC0336k0C);
        return interfaceC0336k0C;
    }

    @Override
    public boolean a(int i7) {
        return this.f8174c.a(i7) && f(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        return f(i7);
    }
}
