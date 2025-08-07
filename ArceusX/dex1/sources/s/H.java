package S;

import C.H0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z.F0;

public abstract class H {

    static final H f6197a = d(0, a.INACTIVE);

    static final Set<Integer> f6198b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    static final H0<H> f6199c = C.Z.f(d(0, a.f6200d));

    enum a {
        f6200d,
        INACTIVE
    }

    H() {
    }

    static H d(int i7, a aVar) {
        return new C1225g(i7, aVar, null);
    }

    static H e(int i7, a aVar, F0.h hVar) {
        return new C1225g(i7, aVar, hVar);
    }

    public abstract int a();

    public abstract F0.h b();

    public abstract a c();
}
