package N3;

import java.util.Iterator;

final class C0544o extends AbstractC0539j {

    private final transient AbstractC0538i f2626i;

    private final transient AbstractC0535f f2627v;

    C0544o(AbstractC0538i abstractC0538i, AbstractC0535f abstractC0535f) {
        this.f2626i = abstractC0538i;
        this.f2627v = abstractC0535f;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f2626i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f2627v.d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return this.f2627v.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f2626i.size();
    }
}
