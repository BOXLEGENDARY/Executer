package R3;

import java.util.List;
import java.util.ListIterator;

final class C1131o extends C1115m implements ListIterator {

    final C1139p f5734v;

    C1131o(C1139p c1139p) {
        super(c1139p);
        this.f5734v = c1139p;
    }

    @Override
    public final void add(Object obj) {
        boolean zIsEmpty = this.f5734v.isEmpty();
        a();
        ((ListIterator) this.f5668d).add(obj);
        AbstractC1147q.g(this.f5734v.f5756y);
        if (zIsEmpty) {
            this.f5734v.d();
        }
    }

    @Override
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f5668d).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f5668d).nextIndex();
    }

    @Override
    public final Object previous() {
        a();
        return ((ListIterator) this.f5668d).previous();
    }

    @Override
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f5668d).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f5668d).set(obj);
    }

    public C1131o(C1139p c1139p, int i7) {
        super(c1139p, ((List) c1139p.f5692e).listIterator(i7));
        this.f5734v = c1139p;
    }
}
