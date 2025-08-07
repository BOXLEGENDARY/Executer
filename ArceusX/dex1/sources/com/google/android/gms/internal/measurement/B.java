package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class B extends AbstractC2016y {
    protected B() {
        this.f15378a.add(O.APPLY);
        this.f15378a.add(O.BLOCK);
        this.f15378a.add(O.BREAK);
        this.f15378a.add(O.CASE);
        this.f15378a.add(O.DEFAULT);
        this.f15378a.add(O.CONTINUE);
        this.f15378a.add(O.DEFINE_FUNCTION);
        this.f15378a.add(O.FN);
        this.f15378a.add(O.IF);
        this.f15378a.add(O.QUOTE);
        this.f15378a.add(O.RETURN);
        this.f15378a.add(O.SWITCH);
        this.f15378a.add(O.TERNARY);
    }

    private static r c(T1 t1, List<r> list) {
        C1987u2.i(O.FN.name(), 2, list);
        r rVarB = t1.b(list.get(0));
        r rVarB2 = t1.b(list.get(1));
        if (!(rVarB2 instanceof C1865f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", rVarB2.getClass().getCanonicalName()));
        }
        List<r> listR = ((C1865f) rVarB2).r();
        List<r> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1953q(rVarB.e(), listR, arrayList, t1);
    }

    @Override
    public final com.google.android.gms.internal.measurement.r a(java.lang.String r8, com.google.android.gms.internal.measurement.T1 r9, java.util.List<com.google.android.gms.internal.measurement.r> r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B.a(java.lang.String, com.google.android.gms.internal.measurement.T1, java.util.List):com.google.android.gms.internal.measurement.r");
    }
}
