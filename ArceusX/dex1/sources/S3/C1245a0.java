package S3;

import java.util.Iterator;
import java.util.Map;

class C1245a0 extends AbstractC1388n0 {

    final Map f6886d;

    C1245a0(Map map) {
        map.getClass();
        this.f6886d = map;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6886d.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f6886d.isEmpty();
    }

    @Override
    public Iterator iterator() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f6886d.size();
    }
}
