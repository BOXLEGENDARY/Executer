package o5;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractC2688e<K, V> {

    private final Map f22437a = new HashMap();

    protected abstract V a(K k7);

    public V b(K k7) {
        synchronized (this.f22437a) {
            try {
                if (this.f22437a.containsKey(k7)) {
                    return (V) this.f22437a.get(k7);
                }
                V vA = a(k7);
                this.f22437a.put(k7, vA);
                return vA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
