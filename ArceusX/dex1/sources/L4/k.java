package L4;

import java.util.ListIterator;

public abstract class k<E> extends j<E> implements ListIterator<E> {
    protected k() {
    }

    @Override
    @Deprecated
    public final void add(E e7) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void set(E e7) {
        throw new UnsupportedOperationException();
    }
}
