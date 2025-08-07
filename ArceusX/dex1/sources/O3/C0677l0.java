package O3;

import java.util.Iterator;

public final class C0677l0 {
    static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
