package C;

import C.X;
import S5.Cg.XjqcfAbdbc;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public final class E0 extends J0 implements D0 {

    private static final X.c f385L = X.c.OPTIONAL;

    private E0(TreeMap<X.a<?>, Map<X.c, Object>> treeMap) {
        super(treeMap);
    }

    public static E0 d0() {
        return new E0(new TreeMap(J0.f399J));
    }

    public static E0 e0(X x7) {
        TreeMap treeMap = new TreeMap(J0.f399J);
        for (X.a<?> aVar : x7.c()) {
            Set<X.c> setD = x7.d(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (X.c cVar : setD) {
                arrayMap.put(cVar, x7.h(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new E0(treeMap);
    }

    @Override
    public <ValueT> void T(X.a<ValueT> aVar, X.c cVar, ValueT valuet) {
        Map<X.c, Object> map = this.f401I.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f401I.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        X.c cVar2 = (X.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !X.A(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + XjqcfAbdbc.KkWUIhwuxiqKlTv + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    public <ValueT> ValueT f0(X.a<ValueT> aVar) {
        return (ValueT) this.f401I.remove(aVar);
    }

    @Override
    public <ValueT> void l(X.a<ValueT> aVar, ValueT valuet) {
        T(aVar, f385L, valuet);
    }
}
