package O3;

import java.util.List;
import java.util.ListIterator;

final class E extends C implements ListIterator {

    final F f2751v;

    E(F f7) {
        super(f7);
        this.f2751v = f7;
    }

    @Override
    public final void add(Object obj) {
        boolean zIsEmpty = this.f2751v.isEmpty();
        a();
        ((ListIterator) this.f2734d).add(obj);
        this.f2751v.f2758y.f2764v++;
        if (zIsEmpty) {
            this.f2751v.d();
        }
    }

    @Override
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f2734d).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f2734d).nextIndex();
    }

    @Override
    public final Object previous() {
        a();
        return ((ListIterator) this.f2734d).previous();
    }

    @Override
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f2734d).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f2734d).set(obj);
    }

    public E(F f7, int i7) {
        super(f7, ((List) f7.f2742e).listIterator(i7));
        this.f2751v = f7;
    }
}
