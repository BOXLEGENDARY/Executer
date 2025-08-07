package j5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    private static volatile d f21149b;

    private final Set<f> f21150a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f21149b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f21149b;
                    if (dVar == null) {
                        dVar = new d();
                        f21149b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f21150a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f21150a);
        }
        return setUnmodifiableSet;
    }
}
