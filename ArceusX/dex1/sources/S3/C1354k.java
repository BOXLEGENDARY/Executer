package S3;

import java.util.List;
import java.util.ListIterator;

final class C1354k extends C1332i implements ListIterator {

    final C1365l f6980v;

    C1354k(C1365l c1365l) {
        super(c1365l);
        this.f6980v = c1365l;
    }

    @Override
    public final void add(Object obj) {
        boolean zIsEmpty = this.f6980v.isEmpty();
        a();
        ((ListIterator) this.f6957d).add(obj);
        this.f6980v.f7001y.f7018v++;
        if (zIsEmpty) {
            this.f6980v.d();
        }
    }

    @Override
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f6957d).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f6957d).nextIndex();
    }

    @Override
    public final Object previous() {
        a();
        return ((ListIterator) this.f6957d).previous();
    }

    @Override
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f6957d).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f6957d).set(obj);
    }

    public C1354k(C1365l c1365l, int i7) {
        super(c1365l, ((List) c1365l.f6966e).listIterator(i7));
        this.f6980v = c1365l;
    }
}
