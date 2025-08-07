package O3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class AbstractC0578c0 extends AbstractCollection implements Serializable {

    private static final Object[] f3405d = new Object[0];

    AbstractC0578c0() {
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
        throw null;
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract F0 iterator();

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
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override
    public final Object[] toArray() {
        return toArray(f3405d);
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
