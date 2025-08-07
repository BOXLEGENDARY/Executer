package R3;

import java.util.Iterator;
import java.util.Map;

final class C1076h0 extends T {

    private final transient S f5555i;

    private final transient Object[] f5556v;

    private final transient int f5557w;

    C1076h0(S s7, Object[] objArr, int i7, int i8) {
        this.f5555i = s7;
        this.f5556v = objArr;
        this.f5557w = i8;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5555i.get(key))) {
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
    final P l() {
        return new C1068g0(this);
    }

    @Override
    public final int size() {
        return this.f5557w;
    }
}
