package N3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class AbstractC0535f extends AbstractC0532c implements List, RandomAccess {

    private static final AbstractC0548t f2607e = new C0533d(C0541l.f2619y, 0);

    public static final int f2608i = 0;

    AbstractC0535f() {
    }

    static AbstractC0535f l(Object[] objArr, int i7) {
        return i7 == 0 ? C0541l.f2619y : new C0541l(objArr, i7);
    }

    public static AbstractC0535f m(Object obj) {
        Object[] objArr = {obj};
        C0540k.a(objArr, 1);
        return l(objArr, 1);
    }

    public static AbstractC0535f n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        C0540k.a(objArr, 9);
        return l(objArr, 9);
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
                        if (G.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !G.a(it.next(), it2.next())) {
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
    public AbstractC0535f subList(int i7, int i8) {
        Y.c(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? C0541l.f2619y : new C0534e(this, i7, i9);
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
    public final AbstractC0548t listIterator(int i7) {
        Y.b(i7, size(), "index");
        return isEmpty() ? f2607e : new C0533d(this, i7);
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
