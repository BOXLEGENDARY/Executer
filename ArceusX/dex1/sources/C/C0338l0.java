package C;

import java.util.HashMap;
import java.util.Map;

public final class C0338l0 {

    private static final Object f630a = new Object();

    private static final Map<Object, D> f631b = new HashMap();

    public static D a(Object obj) {
        D d7;
        synchronized (f630a) {
            d7 = f631b.get(obj);
        }
        return d7 == null ? D.f382a : d7;
    }
}
