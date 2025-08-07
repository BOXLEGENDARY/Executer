package m;

import java.util.HashMap;
import java.util.Map;
import m.C2556b;

public class C2555a<K, V> extends C2556b<K, V> {

    private final HashMap<K, C2556b.c<K, V>> f21877w = new HashMap<>();

    public boolean contains(K k7) {
        return this.f21877w.containsKey(k7);
    }

    @Override
    protected C2556b.c<K, V> e(K k7) {
        return this.f21877w.get(k7);
    }

    @Override
    public V l(K k7, V v7) {
        C2556b.c<K, V> cVarE = e(k7);
        if (cVarE != null) {
            return cVarE.f21883e;
        }
        this.f21877w.put(k7, k(k7, v7));
        return null;
    }

    @Override
    public V m(K k7) {
        V v7 = (V) super.m(k7);
        this.f21877w.remove(k7);
        return v7;
    }

    public Map.Entry<K, V> n(K k7) {
        if (contains(k7)) {
            return this.f21877w.get(k7).f21885v;
        }
        return null;
    }
}
