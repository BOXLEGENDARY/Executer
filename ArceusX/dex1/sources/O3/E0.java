package O3;

import java.util.Iterator;

abstract class E0 implements Iterator {

    final Iterator f2752d;

    E0(Iterator it) {
        it.getClass();
        this.f2752d = it;
    }

    abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f2752d.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f2752d.next());
    }

    @Override
    public final void remove() {
        this.f2752d.remove();
    }
}
