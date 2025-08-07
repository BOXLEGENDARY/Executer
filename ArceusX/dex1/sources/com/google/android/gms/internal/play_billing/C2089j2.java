package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

final class C2089j2 extends AbstractC2095k2 {

    private int f16073d = 0;

    private final int f16074e;

    final AbstractC2131q2 f16075i;

    C2089j2(AbstractC2131q2 abstractC2131q2) {
        this.f16075i = abstractC2131q2;
        this.f16074e = abstractC2131q2.g();
    }

    @Override
    public final boolean hasNext() {
        return this.f16073d < this.f16074e;
    }

    @Override
    public final byte zza() {
        int i7 = this.f16073d;
        if (i7 >= this.f16074e) {
            throw new NoSuchElementException();
        }
        this.f16073d = i7 + 1;
        return this.f16075i.e(i7);
    }
}
