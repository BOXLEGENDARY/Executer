package C;

import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.InterfaceC3060o;

public interface Z0 {

    public interface a {
    }

    void b();

    default int c(X x7, g1 g1Var, a aVar) {
        return -1;
    }

    void d();

    void e(T0 t02);

    void f();

    X0 g(InterfaceC3060o interfaceC3060o, L0 l02);

    default Set<Integer> h() {
        return Collections.emptySet();
    }

    int i(boolean z7, g1 g1Var, a aVar);

    int j(g1 g1Var, a aVar);

    void k(X x7);

    default Map<Integer, List<Size>> l(Size size) {
        return Collections.emptyMap();
    }
}
