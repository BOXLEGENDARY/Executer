package S3;

import java.util.ListIterator;

abstract class AbstractC1421q0 extends AbstractC1410p0 implements ListIterator {
    AbstractC1421q0(ListIterator listIterator) {
        super(listIterator);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f7067d).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f7067d).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f7067d).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f7067d).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
