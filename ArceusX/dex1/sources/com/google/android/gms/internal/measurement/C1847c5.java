package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class C1847c5 implements Iterator<String> {

    final Iterator<String> f15115d;

    final C1855d5 f15116e;

    C1847c5(C1855d5 c1855d5) {
        this.f15116e = c1855d5;
        this.f15115d = c1855d5.f15124d.iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.f15115d.hasNext();
    }

    @Override
    public final String next() {
        return this.f15115d.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
