package L4;

import java.util.Iterator;

public final class d {
    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !K4.c.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
