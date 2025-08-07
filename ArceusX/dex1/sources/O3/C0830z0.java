package O3;

import java.util.Iterator;

final class C0830z0 extends AbstractC0666k0 {

    private final transient AbstractC0655j0 f3678i;

    private final transient AbstractC0633h0 f3679v;

    C0830z0(AbstractC0655j0 abstractC0655j0, AbstractC0633h0 abstractC0633h0) {
        this.f3678i = abstractC0655j0;
        this.f3679v = abstractC0633h0;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f3678i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f3679v.d(objArr, i7);
    }

    @Override
    public final Iterator iterator() {
        return this.f3679v.listIterator(0);
    }

    @Override
    public final F0 iterator() {
        return this.f3679v.listIterator(0);
    }

    @Override
    public final int size() {
        return 1;
    }
}
