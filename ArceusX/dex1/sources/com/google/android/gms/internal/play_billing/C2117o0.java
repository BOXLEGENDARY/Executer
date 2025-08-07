package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class C2117o0 implements InterfaceC2164w0 {

    private final Iterator f16102d;

    private boolean f16103e;

    private Object f16104i;

    public C2117o0(Iterator it) {
        it.getClass();
        this.f16102d = it;
    }

    @Override
    public final boolean hasNext() {
        return this.f16103e || this.f16102d.hasNext();
    }

    @Override
    public final Object next() {
        if (!this.f16103e) {
            return this.f16102d.next();
        }
        Object obj = this.f16104i;
        this.f16103e = false;
        this.f16104i = null;
        return obj;
    }

    @Override
    public final void remove() {
        if (this.f16103e) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f16102d.remove();
    }

    @Override
    public final Object zza() {
        if (!this.f16103e) {
            this.f16104i = this.f16102d.next();
            this.f16103e = true;
        }
        return this.f16104i;
    }
}
