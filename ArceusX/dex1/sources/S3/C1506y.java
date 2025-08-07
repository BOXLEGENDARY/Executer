package S3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class C1506y extends AbstractSet {

    final C f7297d;

    C1506y(C c2) {
        this.f7297d = c2;
    }

    @Override
    public final void clear() {
        this.f7297d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f7297d.containsKey(obj);
    }

    @Override
    public final Iterator iterator() {
        C c2 = this.f7297d;
        Map mapP = c2.p();
        return mapP != null ? mapP.keySet().iterator() : new C1441s(c2);
    }

    @Override
    public final boolean remove(Object obj) {
        Map mapP = this.f7297d.p();
        return mapP != null ? mapP.keySet().remove(obj) : this.f7297d.C(obj) != C.f6403C;
    }

    @Override
    public final int size() {
        return this.f7297d.size();
    }
}
