package com.google.android.gms.internal.measurement;

import java.util.List;

final class W4 extends AbstractC1905k {

    final Y5 f15068i;

    W4(C2014x5 c2014x5, String str, Y5 y52) {
        super("getValue");
        this.f15068i = y52;
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        C1987u2.h("getValue", 2, list);
        r rVarB = t1.b(list.get(0));
        r rVarB2 = t1.b(list.get(1));
        String strN = this.f15068i.n(rVarB.e());
        return strN != null ? new C1992v(strN) : rVarB2;
    }
}
