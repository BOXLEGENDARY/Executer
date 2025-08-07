package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class I0 extends AbstractC2105m0 {

    static final I0 f15817y;

    final transient AbstractC2057e0 f15818w;

    static {
        int i7 = AbstractC2057e0.f16029i;
        f15817y = new I0(B0.f15769y, C2146t0.f16149d);
    }

    I0(AbstractC2057e0 abstractC2057e0, Comparator comparator) {
        super(comparator);
        this.f15818w = abstractC2057e0;
    }

    @Override
    public final N0 descendingIterator() {
        return this.f15818w.n().listIterator(0);
    }

    final int C(Object obj, boolean z7) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f15818w, obj, this.f16089i);
        return iBinarySearch >= 0 ? z7 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int D(Object obj, boolean z7) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f15818w, obj, this.f16089i);
        return iBinarySearch >= 0 ? z7 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final I0 E(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == this.f15818w.size()) {
                return this;
            }
            i7 = 0;
        }
        if (i7 >= i8) {
            return AbstractC2105m0.x(this.f16089i);
        }
        AbstractC2057e0 abstractC2057e0 = this.f15818w;
        return new I0(abstractC2057e0.subList(i7, i8), this.f16089i);
    }

    @Override
    public final Object ceiling(Object obj) {
        AbstractC2057e0 abstractC2057e0 = this.f15818w;
        int iD = D(obj, true);
        if (iD == abstractC2057e0.size()) {
            return null;
        }
        return this.f15818w.get(iD);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f15818w, obj, this.f16089i) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC2140s0) {
            collection = ((InterfaceC2140s0) collection).zza();
        }
        if (!M0.a(this.f16089i, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        O0 o0ListIterator = this.f15818w.listIterator(0);
        Iterator it = collection.iterator();
        if (!o0ListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = o0ListIterator.next();
        while (true) {
            try {
                int iCompare = this.f16089i.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!o0ListIterator.hasNext()) {
                        return false;
                    }
                    next2 = o0ListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f15818w.d(objArr, 0);
    }

    @Override
    final int e() {
        return this.f15818w.e();
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
        if (this.f15818w.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!M0.a(this.f16089i, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            O0 o0ListIterator = this.f15818w.listIterator(0);
            while (o0ListIterator.hasNext()) {
                E next = o0ListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f16089i.compare(next, next2) != 0) {
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
        return this.f15818w.get(0);
    }

    @Override
    public final Object floor(Object obj) {
        int iC = C(obj, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f15818w.get(iC);
    }

    @Override
    final int g() {
        return this.f15818w.g();
    }

    @Override
    public final Object higher(Object obj) {
        AbstractC2057e0 abstractC2057e0 = this.f15818w;
        int iD = D(obj, false);
        if (iD == abstractC2057e0.size()) {
            return null;
        }
        return this.f15818w.get(iD);
    }

    @Override
    public final Iterator iterator() {
        return this.f15818w.listIterator(0);
    }

    @Override
    public final AbstractC2057e0 j() {
        return this.f15818w;
    }

    @Override
    public final N0 iterator() {
        return this.f15818w.listIterator(0);
    }

    @Override
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f15818w.get(r0.size() - 1);
    }

    @Override
    public final Object lower(Object obj) {
        int iC = C(obj, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.f15818w.get(iC);
    }

    @Override
    final Object[] m() {
        return this.f15818w.m();
    }

    @Override
    final AbstractC2105m0 s() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f16089i);
        return isEmpty() ? AbstractC2105m0.x(comparatorReverseOrder) : new I0(this.f15818w.n(), comparatorReverseOrder);
    }

    @Override
    public final int size() {
        return this.f15818w.size();
    }

    @Override
    final AbstractC2105m0 t(Object obj, boolean z7) {
        return E(0, C(obj, z7));
    }

    @Override
    final AbstractC2105m0 v(Object obj, boolean z7, Object obj2, boolean z8) {
        return w(obj, z7).t(obj2, z8);
    }

    @Override
    final AbstractC2105m0 w(Object obj, boolean z7) {
        return E(D(obj, z7), this.f15818w.size());
    }
}
