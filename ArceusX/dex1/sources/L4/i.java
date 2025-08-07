package L4;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class i {
    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }
}
