package R3;

import java.util.Iterator;

abstract class AbstractC1124n0 implements Iterator {

    final Iterator f5696d;

    AbstractC1124n0(Iterator it) {
        it.getClass();
        this.f5696d = it;
    }

    abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f5696d.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f5696d.next());
    }

    @Override
    public final void remove() {
        this.f5696d.remove();
    }
}
