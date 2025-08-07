package O3;

import java.util.Iterator;

public abstract class F0 implements Iterator {
    protected F0() {
    }

    @Override
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
