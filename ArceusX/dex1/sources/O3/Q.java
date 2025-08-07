package O3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class Q extends AbstractSet {

    final X f3244d;

    Q(X x7) {
        this.f3244d = x7;
    }

    @Override
    public final void clear() {
        this.f3244d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Map mapP = this.f3244d.p();
        if (mapP != null) {
            return mapP.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iA = this.f3244d.A(entry.getKey());
            if (iA != -1 && C0720p.a(X.n(this.f3244d, iA), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        X x7 = this.f3244d;
        Map mapP = x7.p();
        return mapP != null ? mapP.entrySet().iterator() : new O(x7);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapP = this.f3244d.p();
        if (mapP != null) {
            return mapP.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        X x7 = this.f3244d;
        if (x7.v()) {
            return false;
        }
        int iZ = x7.z();
        Object key = entry.getKey();
        Object value = entry.getValue();
        X x8 = this.f3244d;
        int iB = Y.b(key, value, iZ, X.m(x8), x8.a(), x8.b(), x8.c());
        if (iB == -1) {
            return false;
        }
        this.f3244d.u(iB, iZ);
        X x9 = this.f3244d;
        x9.f3334y--;
        this.f3244d.s();
        return true;
    }

    @Override
    public final int size() {
        return this.f3244d.size();
    }
}
