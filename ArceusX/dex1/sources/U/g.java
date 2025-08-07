package U;

import C.InterfaceC0336k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class g implements InterfaceC0336k0 {
    public static g h(int i7, int i8, List<InterfaceC0336k0.a> list, List<InterfaceC0336k0.c> list2) {
        x0.g.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i7, i8, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    public static g i(InterfaceC0336k0 interfaceC0336k0) {
        return h(interfaceC0336k0.a(), interfaceC0336k0.b(), interfaceC0336k0.c(), interfaceC0336k0.d());
    }

    public abstract InterfaceC0336k0.a j();

    public abstract InterfaceC0336k0.c k();
}
