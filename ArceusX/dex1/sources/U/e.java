package U;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import z.C3070z;

public class e implements InterfaceC0334j0 {

    private final InterfaceC0334j0 f7485c;

    private final C3070z f7486d;

    private final Map<Integer, InterfaceC0336k0> f7487e = new HashMap();

    public e(InterfaceC0334j0 interfaceC0334j0, C3070z c3070z) {
        this.f7485c = interfaceC0334j0;
        this.f7486d = c3070z;
    }

    private static InterfaceC0336k0 c(InterfaceC0336k0 interfaceC0336k0, C3070z c3070z) {
        if (interfaceC0336k0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0336k0.c cVar : interfaceC0336k0.d()) {
            if (Y.b.f(cVar, c3070z)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0336k0.b.h(interfaceC0336k0.a(), interfaceC0336k0.b(), interfaceC0336k0.c(), arrayList);
    }

    private InterfaceC0336k0 d(int i7) {
        if (this.f7487e.containsKey(Integer.valueOf(i7))) {
            return this.f7487e.get(Integer.valueOf(i7));
        }
        if (!this.f7485c.a(i7)) {
            return null;
        }
        InterfaceC0336k0 interfaceC0336k0C = c(this.f7485c.b(i7), this.f7486d);
        this.f7487e.put(Integer.valueOf(i7), interfaceC0336k0C);
        return interfaceC0336k0C;
    }

    @Override
    public boolean a(int i7) {
        return this.f7485c.a(i7) && d(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        return d(i7);
    }
}
