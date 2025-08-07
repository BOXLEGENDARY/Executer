package O3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class U extends AbstractSet {

    final X f3295d;

    U(X x7) {
        this.f3295d = x7;
    }

    @Override
    public final void clear() {
        this.f3295d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f3295d.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        X x7 = this.f3295d;
        Map mapP = x7.p();
        return mapP != null ? mapP.keySet().iterator() : new M(x7);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapP = this.f3295d.p();
        return mapP != null ? mapP.keySet().remove(obj) : this.f3295d.C(obj) != X.f3326C;
    }

    @Override
    public final int size() {
        return this.f3295d.size();
    }
}
