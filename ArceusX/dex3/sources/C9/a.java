package C9;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

abstract class a<K, V, V2> implements d<Map<K, V2>> {
    private final Map<K, h<V>> a;

    public static abstract class AbstractC0015a<K, V, V2> {
        final LinkedHashMap<K, h<V>> a;

        AbstractC0015a(int i) {
            this.a = b.c(i);
        }

        AbstractC0015a<K, V, V2> a(K k, h<V> hVar) {
            this.a.put(g.c(k, "key"), (h) g.c(hVar, "provider"));
            return this;
        }
    }

    a(Map<K, h<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    final Map<K, h<V>> a() {
        return this.a;
    }
}
