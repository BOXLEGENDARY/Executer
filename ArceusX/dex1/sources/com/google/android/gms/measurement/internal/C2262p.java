package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class C2262p implements Iterator<String> {

    final Iterator<String> f16951d;

    final zzar f16952e;

    C2262p(zzar zzarVar) {
        this.f16952e = zzarVar;
        this.f16951d = zzarVar.f17141d.keySet().iterator();
    }

    @Override
    public final String next() {
        return this.f16951d.next();
    }

    @Override
    public final boolean hasNext() {
        return this.f16951d.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
