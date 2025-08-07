package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C1976t implements Iterator<r> {

    private int f15318d = 0;

    final C1992v f15319e;

    C1976t(C1992v c1992v) {
        this.f15319e = c1992v;
    }

    @Override
    public final boolean hasNext() {
        return this.f15318d < this.f15319e.f15344d.length();
    }

    @Override
    public final r next() {
        if (this.f15318d >= this.f15319e.f15344d.length()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f15318d;
        this.f15318d = i7 + 1;
        return new C1992v(String.valueOf(i7));
    }
}
