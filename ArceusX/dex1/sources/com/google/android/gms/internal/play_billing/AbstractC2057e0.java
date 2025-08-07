package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

public abstract class AbstractC2057e0 extends Z implements List, RandomAccess {

    private static final O0 f16028e = new C2039b0(B0.f15769y, 0);

    public static final int f16029i = 0;

    AbstractC2057e0() {
    }

    static AbstractC2057e0 p(Object[] objArr, int i7) {
        return i7 == 0 ? B0.f15769y : new B0(objArr, i7);
    }

    public static AbstractC2057e0 q(Collection collection) {
        if (!(collection instanceof Z)) {
            Object[] array = collection.toArray();
            int length = array.length;
            C2152u0.b(array, length);
            return p(array, length);
        }
        AbstractC2057e0 abstractC2057e0J = ((Z) collection).j();
        if (!abstractC2057e0J.l()) {
            return abstractC2057e0J;
        }
        Object[] array2 = abstractC2057e0J.toArray();
        return p(array2, array2.length);
    }

    public static AbstractC2057e0 r() {
        return B0.f15769y;
    }

    public static AbstractC2057e0 s(Object obj) {
        Object[] objArr = {obj};
        C2152u0.b(objArr, 1);
        return p(objArr, 1);
    }

    public static Collector u() {
        return K.a();
    }

    @Override
    @Deprecated
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    int d(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (C2139s.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C2139s.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    @Deprecated
    public final AbstractC2057e0 j() {
        return this;
    }

    @Override
    public final N0 iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public AbstractC2057e0 n() {
        return size() <= 1 ? this : new C2045c0(this);
    }

    @Override
    public AbstractC2057e0 subList(int i7, int i8) {
        C2145t.e(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? B0.f15769y : new C2051d0(this, i7, i9);
    }

    @Override
    @Deprecated
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final O0 listIterator(int i7) {
        C2145t.b(i7, size(), "index");
        return isEmpty() ? f16028e : new C2039b0(this, i7);
    }
}
