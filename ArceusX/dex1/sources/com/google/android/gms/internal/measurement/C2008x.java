package com.google.android.gms.internal.measurement;

import java.util.List;

public final class C2008x extends AbstractC2016y {
    public C2008x() {
        this.f15378a.add(O.BITWISE_AND);
        this.f15378a.add(O.BITWISE_LEFT_SHIFT);
        this.f15378a.add(O.BITWISE_NOT);
        this.f15378a.add(O.BITWISE_OR);
        this.f15378a.add(O.f14911C);
        this.f15378a.add(O.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f15378a.add(O.BITWISE_XOR);
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        O o2 = O.ADD;
        switch (C1987u2.e(str).ordinal()) {
            case 4:
                C1987u2.h(O.BITWISE_AND.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.b(t1.b(list.get(0)).f().doubleValue()) & C1987u2.b(t1.b(list.get(1)).f().doubleValue())));
            case 5:
                C1987u2.h(O.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.b(t1.b(list.get(0)).f().doubleValue()) << ((int) (C1987u2.d(t1.b(list.get(1)).f().doubleValue()) & 31))));
            case 6:
                C1987u2.h(O.BITWISE_NOT.name(), 1, list);
                return new C1897j(Double.valueOf(~C1987u2.b(t1.b(list.get(0)).f().doubleValue())));
            case 7:
                C1987u2.h(O.BITWISE_OR.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.b(t1.b(list.get(0)).f().doubleValue()) | C1987u2.b(t1.b(list.get(1)).f().doubleValue())));
            case 8:
                C1987u2.h(O.f14911C.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.b(t1.b(list.get(0)).f().doubleValue()) >> ((int) (C1987u2.d(t1.b(list.get(1)).f().doubleValue()) & 31))));
            case 9:
                C1987u2.h(O.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.d(t1.b(list.get(0)).f().doubleValue()) >>> ((int) (C1987u2.d(t1.b(list.get(1)).f().doubleValue()) & 31))));
            case 10:
                C1987u2.h(O.BITWISE_XOR.name(), 2, list);
                return new C1897j(Double.valueOf(C1987u2.b(t1.b(list.get(0)).f().doubleValue()) ^ C1987u2.b(t1.b(list.get(1)).f().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
