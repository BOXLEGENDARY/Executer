package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class AbstractC2105m0 extends AbstractC2099l0 implements NavigableSet, L0 {

    final transient Comparator f16089i;

    transient AbstractC2105m0 f16090v;

    AbstractC2105m0(Comparator comparator) {
        this.f16089i = comparator;
    }

    static I0 x(Comparator comparator) {
        if (C2146t0.f16149d.equals(comparator)) {
            return I0.f15817y;
        }
        int i7 = AbstractC2057e0.f16029i;
        return new I0(B0.f15769y, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.f16089i;
    }

    @Override
    public final NavigableSet descendingSet() {
        AbstractC2105m0 abstractC2105m0 = this.f16090v;
        if (abstractC2105m0 != null) {
            return abstractC2105m0;
        }
        AbstractC2105m0 abstractC2105m0S = s();
        this.f16090v = abstractC2105m0S;
        abstractC2105m0S.f16090v = this;
        return abstractC2105m0S;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return t(obj, false);
    }

    public abstract Object last();

    @Override
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    abstract AbstractC2105m0 s();

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    abstract AbstractC2105m0 t(Object obj, boolean z7);

    @Override
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return w(obj, true);
    }

    @Override
    public final AbstractC2105m0 subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        obj.getClass();
        obj2.getClass();
        if (this.f16089i.compare(obj, obj2) <= 0) {
            return v(obj, z7, obj2, z8);
        }
        throw new IllegalArgumentException();
    }

    abstract AbstractC2105m0 v(Object obj, boolean z7, Object obj2, boolean z8);

    abstract AbstractC2105m0 w(Object obj, boolean z7);

    @Override
    public final NavigableSet headSet(Object obj, boolean z7) {
        obj.getClass();
        return t(obj, z7);
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z7) {
        obj.getClass();
        return w(obj, z7);
    }
}
