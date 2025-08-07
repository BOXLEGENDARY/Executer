package com.google.android.gms.internal.measurement;

import java.util.List;

public final class L extends AbstractC2016y {
    protected L() {
        this.f15378a.add(O.ADD);
        this.f15378a.add(O.f14932P);
        this.f15378a.add(O.MODULUS);
        this.f15378a.add(O.MULTIPLY);
        this.f15378a.add(O.NEGATE);
        this.f15378a.add(O.POST_DECREMENT);
        this.f15378a.add(O.POST_INCREMENT);
        this.f15378a.add(O.PRE_DECREMENT);
        this.f15378a.add(O.PRE_INCREMENT);
        this.f15378a.add(O.SUBTRACT);
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        O o2 = O.ADD;
        int iOrdinal = C1987u2.e(str).ordinal();
        if (iOrdinal == 0) {
            C1987u2.h(O.ADD.name(), 2, list);
            r rVarB = t1.b(list.get(0));
            r rVarB2 = t1.b(list.get(1));
            if (!(rVarB instanceof InterfaceC1929n) && !(rVarB instanceof C1992v) && !(rVarB2 instanceof InterfaceC1929n) && !(rVarB2 instanceof C1992v)) {
                return new C1897j(Double.valueOf(rVarB.f().doubleValue() + rVarB2.f().doubleValue()));
            }
            String strValueOf = String.valueOf(rVarB.e());
            String strValueOf2 = String.valueOf(rVarB2.e());
            return new C1992v(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
        if (iOrdinal == 21) {
            C1987u2.h(O.f14932P.name(), 2, list);
            return new C1897j(Double.valueOf(t1.b(list.get(0)).f().doubleValue() / t1.b(list.get(1)).f().doubleValue()));
        }
        if (iOrdinal == 59) {
            C1987u2.h(O.SUBTRACT.name(), 2, list);
            return new C1897j(Double.valueOf(t1.b(list.get(0)).f().doubleValue() + new C1897j(Double.valueOf(-t1.b(list.get(1)).f().doubleValue())).f().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            C1987u2.h(str, 2, list);
            r rVarB3 = t1.b(list.get(0));
            t1.b(list.get(1));
            return rVarB3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            C1987u2.h(str, 1, list);
            return t1.b(list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                C1987u2.h(O.MODULUS.name(), 2, list);
                return new C1897j(Double.valueOf(t1.b(list.get(0)).f().doubleValue() % t1.b(list.get(1)).f().doubleValue()));
            case 45:
                C1987u2.h(O.MULTIPLY.name(), 2, list);
                return new C1897j(Double.valueOf(t1.b(list.get(0)).f().doubleValue() * t1.b(list.get(1)).f().doubleValue()));
            case 46:
                C1987u2.h(O.NEGATE.name(), 1, list);
                return new C1897j(Double.valueOf(-t1.b(list.get(0)).f().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
