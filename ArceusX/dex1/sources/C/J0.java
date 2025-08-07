package C;

import C.X;
import android.util.ArrayMap;
import e2.vb.oyfFwvPUKctyaG;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J0 implements X {

    protected static final Comparator<X.a<?>> f399J;

    private static final J0 f400K;

    protected final TreeMap<X.a<?>, Map<X.c, Object>> f401I;

    static {
        Comparator<X.a<?>> comparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return J0.c0((X.a) obj, (X.a) obj2);
            }
        };
        f399J = comparator;
        f400K = new J0(new TreeMap(comparator));
    }

    J0(TreeMap<X.a<?>, Map<X.c, Object>> treeMap) {
        this.f401I = treeMap;
    }

    public static J0 a0() {
        return f400K;
    }

    public static J0 b0(X x7) {
        if (J0.class.equals(x7.getClass())) {
            return (J0) x7;
        }
        TreeMap treeMap = new TreeMap(f399J);
        for (X.a<?> aVar : x7.c()) {
            Set<X.c> setD = x7.d(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (X.c cVar : setD) {
                arrayMap.put(cVar, x7.h(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new J0(treeMap);
    }

    public static int c0(X.a aVar, X.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override
    public <ValueT> ValueT a(X.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) f(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override
    public boolean b(X.a<?> aVar) {
        return this.f401I.containsKey(aVar);
    }

    @Override
    public Set<X.a<?>> c() {
        return Collections.unmodifiableSet(this.f401I.keySet());
    }

    @Override
    public Set<X.c> d(X.a<?> aVar) {
        Map<X.c, Object> map = this.f401I.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override
    public <ValueT> ValueT f(X.a<ValueT> aVar) {
        Map<X.c, Object> map = this.f401I.get(aVar);
        if (map != null) {
            return (ValueT) map.get((X.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override
    public X.c g(X.a<?> aVar) {
        Map<X.c, Object> map = this.f401I.get(aVar);
        if (map != null) {
            return (X.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException(oyfFwvPUKctyaG.hHrafkOGn + aVar);
    }

    @Override
    public <ValueT> ValueT h(X.a<ValueT> aVar, X.c cVar) {
        Map<X.c, Object> map = this.f401I.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override
    public void i(String str, X.b bVar) {
        for (Map.Entry<X.a<?>, Map<X.c, Object>> entry : this.f401I.tailMap(X.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }
}
