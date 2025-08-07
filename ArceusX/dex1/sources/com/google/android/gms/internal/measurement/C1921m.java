package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class C1921m implements Iterator<r> {

    final Iterator f15210d;

    C1921m(Iterator it) {
        this.f15210d = it;
    }

    @Override
    public final boolean hasNext() {
        return this.f15210d.hasNext();
    }

    @Override
    public final r next() {
        return new C1992v((String) this.f15210d.next());
    }
}
