package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractC2047c2 extends AbstractList implements V2 {

    private boolean f15999d;

    AbstractC2047c2(boolean z7) {
        this.f15999d = z7;
    }

    @Override
    public final boolean a() {
        return this.f15999d;
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        d();
        return super.addAll(i7, collection);
    }

    @Override
    public final void clear() {
        d();
        super.clear();
    }

    protected final void d() {
        if (!this.f15999d) {
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
    public abstract Object remove(int i7);

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
    public final boolean removeAll(Collection collection) {
        d();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        d();
        return super.retainAll(collection);
    }

    @Override
    public final void zzb() {
        if (this.f15999d) {
            this.f15999d = false;
        }
    }

    @Override
    public boolean addAll(Collection collection) {
        d();
        return super.addAll(collection);
    }
}
