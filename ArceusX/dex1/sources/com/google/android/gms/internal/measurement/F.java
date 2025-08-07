package com.google.android.gms.internal.measurement;

import java.util.List;

public final class F extends AbstractC2016y {
    protected F() {
        this.f15378a.add(O.AND);
        this.f15378a.add(O.NOT);
        this.f15378a.add(O.OR);
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        O o2 = O.ADD;
        int iOrdinal = C1987u2.e(str).ordinal();
        if (iOrdinal == 1) {
            C1987u2.h(O.AND.name(), 2, list);
            r rVarB = t1.b(list.get(0));
            return !rVarB.g().booleanValue() ? rVarB : t1.b(list.get(1));
        }
        if (iOrdinal == 47) {
            C1987u2.h(O.NOT.name(), 1, list);
            return new C1873g(Boolean.valueOf(!t1.b(list.get(0)).g().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        C1987u2.h(O.OR.name(), 2, list);
        r rVarB2 = t1.b(list.get(0));
        return rVarB2.g().booleanValue() ? rVarB2 : t1.b(list.get(1));
    }
}
