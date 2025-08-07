package R3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class C extends AbstractSet {

    final F f5128d;

    C(F f7) {
        this.f5128d = f7;
    }

    @Override
    public final void clear() {
        this.f5128d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f5128d.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        F f7 = this.f5128d;
        Map mapO = f7.o();
        return mapO != null ? mapO.keySet().iterator() : new C1191w(f7);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapO = this.f5128d.o();
        return mapO != null ? mapO.keySet().remove(obj) : this.f5128d.A(obj) != F.f5194C;
    }

    @Override
    public final int size() {
        return this.f5128d.size();
    }
}
