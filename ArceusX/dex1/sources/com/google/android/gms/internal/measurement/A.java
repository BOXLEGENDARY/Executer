package com.google.android.gms.internal.measurement;

import java.util.List;

public final class A extends AbstractC2016y {
    public A() {
        this.f15378a.add(O.EQUALS);
        this.f15378a.add(O.GREATER_THAN);
        this.f15378a.add(O.GREATER_THAN_EQUALS);
        this.f15378a.add(O.IDENTITY_EQUALS);
        this.f15378a.add(O.IDENTITY_NOT_EQUALS);
        this.f15378a.add(O.LESS_THAN);
        this.f15378a.add(O.LESS_THAN_EQUALS);
        this.f15378a.add(O.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        if (rVar.getClass().equals(rVar2.getClass())) {
            if ((rVar instanceof C2000w) || (rVar instanceof C1945p)) {
                return true;
            }
            return rVar instanceof C1897j ? (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()) || rVar.f().doubleValue() != rVar2.f().doubleValue()) ? false : true : rVar instanceof C1992v ? rVar.e().equals(rVar2.e()) : rVar instanceof C1873g ? rVar.g().equals(rVar2.g()) : rVar == rVar2;
        }
        if (((rVar instanceof C2000w) || (rVar instanceof C1945p)) && ((rVar2 instanceof C2000w) || (rVar2 instanceof C1945p))) {
            return true;
        }
        boolean z7 = rVar instanceof C1897j;
        if (z7 && (rVar2 instanceof C1992v)) {
            return c(rVar, new C1897j(rVar2.f()));
        }
        boolean z8 = rVar instanceof C1992v;
        if ((!z8 || !(rVar2 instanceof C1897j)) && !(rVar instanceof C1873g)) {
            if (rVar2 instanceof C1873g) {
                return c(rVar, new C1897j(rVar2.f()));
            }
            if ((z8 || z7) && (rVar2 instanceof InterfaceC1929n)) {
                return c(rVar, new C1992v(rVar2.e()));
            }
            if ((rVar instanceof InterfaceC1929n) && ((rVar2 instanceof C1992v) || (rVar2 instanceof C1897j))) {
                return c(new C1992v(rVar.e()), rVar2);
            }
            return false;
        }
        return c(new C1897j(rVar.f()), rVar2);
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC1929n) {
            rVar = new C1992v(rVar.e());
        }
        if (rVar2 instanceof InterfaceC1929n) {
            rVar2 = new C1992v(rVar2.e());
        }
        if ((rVar instanceof C1992v) && (rVar2 instanceof C1992v)) {
            return rVar.e().compareTo(rVar2.e()) < 0;
        }
        double dDoubleValue = rVar.f().doubleValue();
        double dDoubleValue2 = rVar2.f().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC1929n) {
            rVar = new C1992v(rVar.e());
        }
        if (rVar2 instanceof InterfaceC1929n) {
            rVar2 = new C1992v(rVar2.e());
        }
        return (((rVar instanceof C1992v) && (rVar2 instanceof C1992v)) || !(Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()))) && !d(rVar2, rVar);
    }

    @Override
    public final r a(String str, T1 t1, List<r> list) {
        boolean zC;
        boolean zC2;
        C1987u2.h(C1987u2.e(str).name(), 2, list);
        r rVarB = t1.b(list.get(0));
        r rVarB2 = t1.b(list.get(1));
        int iOrdinal = C1987u2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(rVarB, rVarB2);
            } else if (iOrdinal == 42) {
                zC = d(rVarB, rVarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(rVarB2, rVarB);
                        break;
                    case 38:
                        zC = e(rVarB2, rVarB);
                        break;
                    case 39:
                        zC = C1987u2.l(rVarB, rVarB2);
                        break;
                    case 40:
                        zC2 = C1987u2.l(rVarB, rVarB2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(rVarB, rVarB2);
            }
            zC = !zC2;
        } else {
            zC = c(rVarB, rVarB2);
        }
        return zC ? r.f15287m : r.f15288n;
    }
}
