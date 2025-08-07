package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

final class C2123p0 extends N0 {

    private final Object f16117d;

    private boolean f16118e;

    C2123p0(Object obj) {
        this.f16117d = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f16118e;
    }

    @Override
    public final Object next() {
        if (this.f16118e) {
            throw new NoSuchElementException();
        }
        this.f16118e = true;
        return this.f16117d;
    }
}
