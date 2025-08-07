package S3;

import java.util.Iterator;

abstract class AbstractC1410p0 implements Iterator {

    final Iterator f7067d;

    AbstractC1410p0(Iterator it) {
        it.getClass();
        this.f7067d = it;
    }

    abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f7067d.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f7067d.next());
    }

    @Override
    public final void remove() {
        this.f7067d.remove();
    }
}
