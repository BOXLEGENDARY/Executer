package O3;

import java.util.Iterator;
import java.util.Map;

class C0721p0 extends C0 {

    final Map f3532d;

    C0721p0(Map map) {
        this.f3532d = map;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f3532d.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f3532d.isEmpty();
    }

    @Override
    public Iterator iterator() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f3532d.size();
    }
}
