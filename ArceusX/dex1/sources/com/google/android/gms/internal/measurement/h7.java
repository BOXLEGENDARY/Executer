package com.google.android.gms.internal.measurement;

import java.util.List;

public final class h7 extends AbstractC1905k {

    private final l7 f15178i;

    public h7(l7 l7Var) {
        super("internal.registerCallback");
        this.f15178i = l7Var;
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        C1987u2.h(this.f15197d, 3, list);
        String strE = t1.b(list.get(0)).e();
        r rVarB = t1.b(list.get(1));
        if (!(rVarB instanceof C1953q)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        r rVarB2 = t1.b(list.get(2));
        if (!(rVarB2 instanceof C1937o)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C1937o c1937o = (C1937o) rVarB2;
        if (!c1937o.l0("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f15178i.a(strE, c1937o.l0("priority") ? C1987u2.b(c1937o.D("priority").f().doubleValue()) : 1000, (C1953q) rVarB, c1937o.D("type").e());
        return r.f15282g;
    }
}
