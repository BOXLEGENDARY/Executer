package R3;

import java.util.Iterator;

final class C1084i0 extends T {

    private final transient S f5577i;

    private final transient P f5578v;

    C1084i0(S s7, P p7) {
        this.f5577i = s7;
        this.f5578v = p7;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f5577i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f5578v.d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return this.f5578v.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f5577i.size();
    }
}
