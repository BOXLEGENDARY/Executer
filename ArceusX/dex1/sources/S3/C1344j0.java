package S3;

import java.util.Iterator;
import java.util.Map;

final class C1344j0 extends P {

    private final transient O f6970i;

    private final transient Object[] f6971v;

    private final transient int f6972w = 1;

    C1344j0(O o2, Object[] objArr, int i7, int i8) {
        this.f6970i = o2;
        this.f6971v = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6970i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return k().d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return k().listIterator(0);
    }

    @Override
    final M l() {
        return new C1333i0(this);
    }

    @Override
    public final int size() {
        return this.f6972w;
    }
}
