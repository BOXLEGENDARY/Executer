package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C1857e implements Iterator<r> {

    private int f15125d = 0;

    final C1865f f15126e;

    C1857e(C1865f c1865f) {
        this.f15126e = c1865f;
    }

    @Override
    public final boolean hasNext() {
        return this.f15125d < this.f15126e.n();
    }

    @Override
    public final r next() {
        if (this.f15125d < this.f15126e.n()) {
            C1865f c1865f = this.f15126e;
            int i7 = this.f15125d;
            this.f15125d = i7 + 1;
            return c1865f.o(i7);
        }
        int i8 = this.f15125d;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i8);
        throw new NoSuchElementException(sb.toString());
    }
}
