package G4;

import java.util.Collections;
import java.util.Map;

abstract class u {
    u() {
    }

    abstract u a(int i7);

    abstract u b(Map map);

    abstract v c();

    abstract Map d();

    final v e() {
        b(Collections.unmodifiableMap(d()));
        return c();
    }
}
