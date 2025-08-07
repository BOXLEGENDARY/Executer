package R3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class P extends K implements List, RandomAccess {

    private static final AbstractC1140p0 f5323e = new N(C1060f0.f5518w, 0);

    P() {
    }

    static P l(Object[] objArr) {
        return m(objArr, objArr.length);
    }

    static P m(Object[] objArr, int i7) {
        return i7 == 0 ? C1060f0.f5518w : new C1060f0(objArr, i7);
    }

    public static P n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException("at index " + i7);
            }
        }
        return m(objArr, 2);
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
    public final boolean contains(Object obj) {
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
                        if (Q6.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !Q6.a(it.next(), it2.next())) {
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

    @Override
    public final int indexOf(Object obj) {
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
    public P subList(int i7, int i8) {
        C1035c.c(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? C1060f0.f5518w : new O(this, i7, i9);
    }

    @Override
    public final int lastIndexOf(Object obj) {
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

    @Override
    public final AbstractC1140p0 listIterator(int i7) {
        C1035c.b(i7, size(), "index");
        return isEmpty() ? f5323e : new N(this, i7);
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
}
