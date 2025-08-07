package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class V3 extends AbstractC1905k {

    private final C1841c f15052i;

    public V3(C1841c c1841c) {
        super("internal.eventLogger");
        this.f15052i = c1841c;
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        C1987u2.h(this.f15197d, 3, list);
        String strE = t1.b(list.get(0)).e();
        long jA = (long) C1987u2.a(t1.b(list.get(1)).f().doubleValue());
        r rVarB = t1.b(list.get(2));
        this.f15052i.e(strE, jA, rVarB instanceof C1937o ? C1987u2.g((C1937o) rVarB) : new HashMap<>());
        return r.f15282g;
    }
}
