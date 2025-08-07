package K3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class AbstractC0496w extends AbstractCollection implements Serializable {

    private static final Object[] f1901d = new Object[0];

    AbstractC0496w() {
    }

    @Override
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object obj);

    int d(Object[] objArr, int i7) {
        AbstractC0460d0 abstractC0460d0J = j();
        int i8 = 0;
        while (abstractC0460d0J.hasNext()) {
            objArr[i8] = abstractC0460d0J.next();
            i8++;
        }
        return i8;
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0460d0 j();

    Object[] k() {
        return null;
    }

    @Override
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return toArray(f1901d);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrK = k();
            if (objArrK != null) {
                return Arrays.copyOfRange(objArrK, g(), e(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
