package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class C1839b5 implements ListIterator<String> {

    final ListIterator<String> f15105d;

    final int f15106e;

    final C1855d5 f15107i;

    C1839b5(C1855d5 c1855d5, int i7) {
        this.f15107i = c1855d5;
        this.f15106e = i7;
        this.f15105d = c1855d5.f15124d.listIterator(i7);
    }

    @Override
    public final void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f15105d.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.f15105d.hasPrevious();
    }

    @Override
    public final Object next() {
        return this.f15105d.next();
    }

    @Override
    public final int nextIndex() {
        return this.f15105d.nextIndex();
    }

    @Override
    public final String previous() {
        return this.f15105d.previous();
    }

    @Override
    public final int previousIndex() {
        return this.f15105d.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(String str) {
        throw new UnsupportedOperationException();
    }
}
