package Q3;

import java.util.Iterator;
import java.util.Map;

final class U5 extends Q5 {

    private final transient P5 f4213i;

    private final transient Object[] f4214v;

    private final transient int f4215w;

    U5(P5 p52, Object[] objArr, int i7, int i8) {
        this.f4213i = p52;
        this.f4214v = objArr;
        this.f4215w = i8;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4213i.get(key))) {
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
    final N5 l() {
        return new T5(this);
    }

    @Override
    public final int size() {
        return this.f4215w;
    }
}
