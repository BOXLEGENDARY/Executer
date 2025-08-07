package N3;

import java.util.Iterator;
import java.util.Map;

final class C0543n extends AbstractC0539j {

    private final transient AbstractC0538i f2623i;

    private final transient Object[] f2624v;

    private final transient int f2625w;

    C0543n(AbstractC0538i abstractC0538i, Object[] objArr, int i7, int i8) {
        this.f2623i = abstractC0538i;
        this.f2624v = objArr;
        this.f2625w = i8;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2623i.get(key))) {
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
    final AbstractC0535f l() {
        return new C0542m(this);
    }

    @Override
    public final int size() {
        return this.f2625w;
    }
}
