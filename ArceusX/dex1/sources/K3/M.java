package K3;

import java.util.NoSuchElementException;

final class M extends AbstractC0460d0 {

    boolean f1797d;

    final Object f1798e;

    M(Object obj) {
        this.f1798e = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f1797d;
    }

    @Override
    public final Object next() {
        if (this.f1797d) {
            throw new NoSuchElementException();
        }
        this.f1797d = true;
        return this.f1798e;
    }
}
