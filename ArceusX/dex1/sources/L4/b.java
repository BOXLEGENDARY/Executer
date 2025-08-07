package L4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

public abstract class b<E> extends AbstractCollection<E> implements Serializable {

    private static final Object[] f2063d = new Object[0];

    b() {
    }

    @Override
    @Deprecated
    public final boolean add(E e7) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    int d(Object[] objArr, int i7) {
        j<E> it = iterator();
        while (it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
        return i7;
    }

    Object[] e() {
        return null;
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int j() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract j<E> iterator();

    @Override
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return toArray(f2063d);
    }

    @Override
    public final <T> T[] toArray(T[] tArr) {
        K4.g.g(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return (T[]) g.a(objArrE, j(), g(), tArr);
            }
            tArr = (T[]) f.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        d(tArr, 0);
        return tArr;
    }
}
