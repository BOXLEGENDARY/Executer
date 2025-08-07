package S3;

import java.util.Iterator;

public final class Q {
    static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
