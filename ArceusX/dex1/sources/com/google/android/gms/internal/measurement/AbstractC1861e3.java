package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractC1861e3<E> extends AbstractList<E> implements InterfaceC1830a4<E> {

    private boolean f15131d = true;

    AbstractC1861e3() {
    }

    @Override
    public final boolean a() {
        return this.f15131d;
    }

    @Override
    public boolean add(E e7) {
        d();
        return super.add(e7);
    }

    @Override
    public boolean addAll(int i7, Collection<? extends E> collection) {
        d();
        return super.addAll(i7, collection);
    }

    @Override
    public void clear() {
        d();
        super.clear();
    }

    protected final void d() {
        if (!this.f15131d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!get(i7).equals(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    @Override
    public abstract E remove(int i7);

    @Override
    public final boolean remove(Object obj) {
        d();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection<?> collection) {
        d();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection<?> collection) {
        d();
        return super.retainAll(collection);
    }

    @Override
    public final void zzb() {
        this.f15131d = false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        d();
        return super.addAll(collection);
    }
}
