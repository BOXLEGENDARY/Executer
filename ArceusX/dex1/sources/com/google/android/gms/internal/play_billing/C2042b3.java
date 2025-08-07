package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class C2042b3 implements Iterator {

    private final Iterator f15996d;

    public C2042b3(Iterator it) {
        this.f15996d = it;
    }

    @Override
    public final boolean hasNext() {
        return this.f15996d.hasNext();
    }

    @Override
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f15996d.next();
        return entry.getValue() instanceof C2054d3 ? new C2036a3(entry, null) : entry;
    }

    @Override
    public final void remove() {
        this.f15996d.remove();
    }
}
