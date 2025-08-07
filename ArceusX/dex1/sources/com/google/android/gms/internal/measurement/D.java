package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class D implements Comparator<r> {

    final AbstractC1905k f14689d;

    final T1 f14690e;

    D(AbstractC1905k abstractC1905k, T1 t1) {
        this.f14689d = abstractC1905k;
        this.f14690e = t1;
    }

    @Override
    public final int compare(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        AbstractC1905k abstractC1905k = this.f14689d;
        T1 t1 = this.f14690e;
        if (rVar3 instanceof C2000w) {
            return !(rVar4 instanceof C2000w) ? 1 : 0;
        }
        if (rVar4 instanceof C2000w) {
            return -1;
        }
        return abstractC1905k == null ? rVar3.e().compareTo(rVar4.e()) : (int) C1987u2.a(abstractC1905k.a(t1, Arrays.asList(rVar3, rVar4)).f().doubleValue());
    }
}
