package L4;

import java.util.Iterator;

public abstract class j<E> implements Iterator<E> {
    protected j() {
    }

    @Override
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
