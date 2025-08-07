package K3;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class K extends L implements NavigableSet, InterfaceC0454a0 {

    final transient Comparator f1792i;

    transient K f1793v;

    K(Comparator comparator) {
        this.f1792i = comparator;
    }

    static V x(Comparator comparator) {
        if (P.f1801d.equals(comparator)) {
            return V.f1817y;
        }
        int i7 = A.f1764i;
        return new V(T.f1807y, comparator);
    }

    @Override
    public final Comparator comparator() {
        return this.f1792i;
    }

    @Override
    public abstract Object first();

    @Override
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return t(obj, false);
    }

    @Override
    public abstract Object last();

    @Override
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract K r();

    @Override
    public final K descendingSet() {
        K k7 = this.f1793v;
        if (k7 != null) {
            return k7;
        }
        K kR = r();
        this.f1793v = kR;
        kR.f1793v = this;
        return kR;
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    abstract K t(Object obj, boolean z7);

    @Override
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return w(obj, true);
    }

    @Override
    public final K subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        obj.getClass();
        obj2.getClass();
        C0485q.c(this.f1792i.compare(obj, obj2) <= 0);
        return v(obj, z7, obj2, z8);
    }

    abstract K v(Object obj, boolean z7, Object obj2, boolean z8);

    abstract K w(Object obj, boolean z7);

    @Override
    public final NavigableSet headSet(Object obj, boolean z7) {
        obj.getClass();
        return t(obj, z7);
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z7) {
        obj.getClass();
        return w(obj, z7);
    }
}
