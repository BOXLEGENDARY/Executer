package S3;

import java.util.Iterator;

final class C1355k0 extends P {

    private final transient O f6981i;

    private final transient M f6982v;

    C1355k0(O o2, M m7) {
        this.f6981i = o2;
        this.f6982v = m7;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6981i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f6982v.d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return this.f6982v.listIterator(0);
    }

    @Override
    public final int size() {
        return 1;
    }
}
