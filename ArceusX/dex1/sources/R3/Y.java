package R3;

import java.util.Iterator;
import java.util.Map;

class Y extends AbstractC1108l0 {

    final Map f5423d;

    Y(Map map) {
        map.getClass();
        this.f5423d = map;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f5423d.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f5423d.isEmpty();
    }

    @Override
    public Iterator iterator() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f5423d.size();
    }
}
