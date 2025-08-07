package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C1849d implements Iterator<r> {

    final Iterator f15120d;

    final Iterator f15121e;

    C1849d(C1865f c1865f, Iterator it, Iterator it2) {
        this.f15120d = it;
        this.f15121e = it2;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15120d.hasNext()) {
            return true;
        }
        return this.f15121e.hasNext();
    }

    @Override
    public final r next() {
        if (this.f15120d.hasNext()) {
            return new C1992v(((Integer) this.f15120d.next()).toString());
        }
        if (this.f15121e.hasNext()) {
            return new C1992v((String) this.f15121e.next());
        }
        throw new NoSuchElementException();
    }
}
