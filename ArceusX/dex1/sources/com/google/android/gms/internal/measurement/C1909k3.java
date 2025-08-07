package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class C1909k3 extends AbstractC1933n3 {

    private int f15199d = 0;

    private final int f15200e;

    final AbstractC1980t3 f15201i;

    C1909k3(AbstractC1980t3 abstractC1980t3) {
        this.f15201i = abstractC1980t3;
        this.f15200e = abstractC1980t3.g();
    }

    @Override
    public final boolean hasNext() {
        return this.f15199d < this.f15200e;
    }

    @Override
    public final byte zza() {
        int i7 = this.f15199d;
        if (i7 >= this.f15200e) {
            throw new NoSuchElementException();
        }
        this.f15199d = i7 + 1;
        return this.f15201i.e(i7);
    }
}
