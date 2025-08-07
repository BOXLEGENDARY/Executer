package K3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class V extends K {

    static final V f1817y;

    final transient A f1818w;

    static {
        int i7 = A.f1764i;
        f1817y = new V(T.f1807y, P.f1801d);
    }

    V(A a2, Comparator comparator) {
        super(comparator);
        this.f1818w = a2;
    }

    @Override
    public final AbstractC0460d0 descendingIterator() {
        return this.f1818w.l().listIterator(0);
    }

    final int C(Object obj, boolean z7) {
        A a2 = this.f1818w;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(a2, obj, this.f1792i);
        return iBinarySearch >= 0 ? z7 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int D(Object obj, boolean z7) {
        A a2 = this.f1818w;
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(a2, obj, this.f1792i);
        return iBinarySearch >= 0 ? z7 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final V E(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == this.f1818w.size()) {
                return this;
            }
            i7 = 0;
        }
        return i7 < i8 ? new V(this.f1818w.subList(i7, i8), this.f1792i) : K.x(this.f1792i);
    }

    @Override
    public final Object ceiling(Object obj) {
        int iD = D(obj, true);
        if (iD == this.f1818w.size()) {
            return null;
        }
        return this.f1818w.get(iD);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f1818w, obj, this.f1792i) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof O) {
            collection = ((O) collection).zza();
        }
        if (!C0458c0.a(this.f1792i, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC0462e0 abstractC0462e0ListIterator = this.f1818w.listIterator(0);
        Iterator it = collection.iterator();
        if (!abstractC0462e0ListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = abstractC0462e0ListIterator.next();
        while (true) {
            try {
                int iCompare = this.f1792i.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!abstractC0462e0ListIterator.hasNext()) {
                        return false;
                    }
                    next2 = abstractC0462e0ListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f1818w.d(objArr, 0);
    }

    @Override
    final int e() {
        return this.f1818w.e();
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f1818w.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C0458c0.a(this.f1792i, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC0462e0 abstractC0462e0ListIterator = this.f1818w.listIterator(0);
            while (abstractC0462e0ListIterator.hasNext()) {
                E next = abstractC0462e0ListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f1792i.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f1818w.get(0);
    }

    @Override
    public final Object floor(Object obj) {
        int iC = C(obj, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f1818w.get(iC);
    }

    @Override
    final int g() {
        return this.f1818w.g();
    }

    @Override
    public final Object higher(Object obj) {
        int iD = D(obj, false);
        if (iD == this.f1818w.size()) {
            return null;
        }
        return this.f1818w.get(iD);
    }

    @Override
    public final Iterator iterator() {
        return this.f1818w.listIterator(0);
    }

    @Override
    public final AbstractC0460d0 iterator() {
        return this.f1818w.listIterator(0);
    }

    @Override
    final Object[] k() {
        return this.f1818w.k();
    }

    @Override
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f1818w.get(r0.size() - 1);
    }

    @Override
    public final Object lower(Object obj) {
        int iC = C(obj, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f1818w.get(iC);
    }

    @Override
    public final A o() {
        return this.f1818w;
    }

    @Override
    final K r() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f1792i);
        return isEmpty() ? K.x(comparatorReverseOrder) : new V(this.f1818w.l(), comparatorReverseOrder);
    }

    @Override
    public final int size() {
        return this.f1818w.size();
    }

    @Override
    final K t(Object obj, boolean z7) {
        return E(0, C(obj, z7));
    }

    @Override
    final K v(Object obj, boolean z7, Object obj2, boolean z8) {
        return w(obj, z7).t(obj2, z8);
    }

    @Override
    final K w(Object obj, boolean z7) {
        return E(D(obj, z7), this.f1818w.size());
    }
}
