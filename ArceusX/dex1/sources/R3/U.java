package R3;

import java.util.Iterator;

public final class U {
    static void a(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
