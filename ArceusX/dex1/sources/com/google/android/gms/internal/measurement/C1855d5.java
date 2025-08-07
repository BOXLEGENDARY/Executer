package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class C1855d5 extends AbstractList<String> implements RandomAccess, InterfaceC1886h4 {

    private final InterfaceC1886h4 f15124d;

    public C1855d5(InterfaceC1886h4 interfaceC1886h4) {
        this.f15124d = interfaceC1886h4;
    }

    @Override
    public final InterfaceC1886h4 b() {
        return this;
    }

    @Override
    public final Object c(int i7) {
        return this.f15124d.c(i7);
    }

    @Override
    public final List<?> f() {
        return this.f15124d.f();
    }

    @Override
    public final Object get(int i7) {
        return ((C1878g4) this.f15124d).get(i7);
    }

    @Override
    public final void i(AbstractC1980t3 abstractC1980t3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Iterator<String> iterator() {
        return new C1847c5(this);
    }

    @Override
    public final ListIterator<String> listIterator(int i7) {
        return new C1839b5(this, i7);
    }

    @Override
    public final int size() {
        return this.f15124d.size();
    }
}
