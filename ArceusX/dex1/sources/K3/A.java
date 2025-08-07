package K3;

import androidx.appcompat.app.FN.krlBPZZeK;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class A extends AbstractC0496w implements List, RandomAccess {

    private static final AbstractC0462e0 f1763e = new C0498x(T.f1807y, 0);

    public static final int f1764i = 0;

    A() {
    }

    static A n(Object[] objArr, int i7) {
        return i7 == 0 ? T.f1807y : new T(objArr, i7);
    }

    public static A o(Object[] objArr) {
        if (objArr.length == 0) {
            return T.f1807y;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        Q.b(objArr2, length);
        return n(objArr2, length);
    }

    public static A p(Object obj) {
        Object[] objArr = {obj};
        Q.b(objArr, 1);
        return n(objArr, 1);
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
                        if (C0483p.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C0483p.a(it.next(), it2.next())) {
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
    public final AbstractC0460d0 iterator() {
        return listIterator(0);
    }

    public A l() {
        return size() <= 1 ? this : new C0500y(this);
    }

    @Override
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

    @Override
    public A subList(int i7, int i8) {
        C0485q.e(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? T.f1807y : new C0502z(this, i7, i9);
    }

    @Override
    public final AbstractC0462e0 listIterator(int i7) {
        C0485q.b(i7, size(), krlBPZZeK.PqpxZnYwAy);
        return isEmpty() ? f1763e : new C0498x(this, i7);
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
