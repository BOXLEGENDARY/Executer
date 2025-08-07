package C9;

import C9.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f<K, V> extends C9.a<K, V, V> {
    private static final h<Map<Object, Object>> b = e.a(Collections.emptyMap());

    public static final class b<K, V> extends a.AbstractC0015a<K, V, V> {
        public f<K, V> b() {
            return new f<>(this.a);
        }

        public b<K, V> c(K k, h<V> hVar) {
            super.a(k, hVar);
            return this;
        }

        private b(int i) {
            super(i);
        }
    }

    public static <K, V> b<K, V> b(int i) {
        return new b<>(i);
    }

    public Map<K, V> get() {
        LinkedHashMap linkedHashMapC = C9.b.c(a().size());
        for (Map.Entry<K, h<V>> entry : a().entrySet()) {
            linkedHashMapC.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }

    private f(Map<K, h<V>> map) {
        super(map);
    }
}
