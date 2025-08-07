package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C1984u implements Iterator<r> {

    private int f15338d = 0;

    final C1992v f15339e;

    C1984u(C1992v c1992v) {
        this.f15339e = c1992v;
    }

    @Override
    public final boolean hasNext() {
        return this.f15338d < this.f15339e.f15344d.length();
    }

    @Override
    public final r next() {
        if (this.f15338d >= this.f15339e.f15344d.length()) {
            throw new NoSuchElementException();
        }
        String str = this.f15339e.f15344d;
        int i7 = this.f15338d;
        this.f15338d = i7 + 1;
        return new C1992v(String.valueOf(str.charAt(i7)));
    }
}
