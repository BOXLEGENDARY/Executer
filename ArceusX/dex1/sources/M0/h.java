package m0;

import java.util.ArrayList;
import java.util.Iterator;
import l0.C2525a;
import l0.d;
import l0.e;
import m0.C2558b;

public class h {

    private static C2558b.a f21940a = new C2558b.a();

    private static boolean a(l0.e eVar) {
        e.b bVarA = eVar.A();
        e.b bVarQ = eVar.Q();
        l0.f fVar = eVar.K() != null ? (l0.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.Q();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z7 = bVarA == bVar3 || bVarA == e.b.WRAP_CONTENT || (bVarA == e.b.MATCH_CONSTRAINT && eVar.f21644p == 0 && eVar.f21610W == 0.0f && eVar.X(0)) || eVar.g0();
        boolean z8 = bVarQ == bVar3 || bVarQ == e.b.WRAP_CONTENT || (bVarQ == e.b.MATCH_CONSTRAINT && eVar.f21646q == 0 && eVar.f21610W == 0.0f && eVar.X(1)) || eVar.h0();
        if (eVar.f21610W <= 0.0f || !(z7 || z8)) {
            return z7 && z8;
        }
        return true;
    }

    private static void b(l0.e eVar, C2558b.InterfaceC0209b interfaceC0209b, boolean z7) {
        l0.d dVar;
        l0.d dVar2;
        l0.d dVar3;
        l0.d dVar4;
        l0.d dVar5;
        if (!(eVar instanceof l0.f) && eVar.f0() && a(eVar)) {
            l0.f.F1(eVar, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
        }
        l0.d dVarO = eVar.o(d.b.LEFT);
        l0.d dVarO2 = eVar.o(d.b.RIGHT);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<l0.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                l0.d next = it.next();
                l0.e eVar2 = next.f21568d;
                boolean zA = a(eVar2);
                if (eVar2.f0() && zA) {
                    l0.f.F1(eVar2, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
                }
                e.b bVarA = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!eVar2.f0()) {
                        l0.d dVar6 = eVar2.f21595H;
                        if (next == dVar6 && eVar2.f21597J.f21570f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.s0(iF, eVar2.T() + iF);
                            b(eVar2, interfaceC0209b, z7);
                        } else {
                            l0.d dVar7 = eVar2.f21597J;
                            if (next == dVar7 && dVar6.f21570f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.s0(iF2 - eVar2.T(), iF2);
                                b(eVar2, interfaceC0209b, z7);
                            } else if (next == dVar6 && (dVar3 = dVar7.f21570f) != null && dVar3.n() && !eVar2.b0()) {
                                d(interfaceC0209b, eVar2, z7);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.f21652t >= 0 && eVar2.f21650s >= 0 && (eVar2.S() == 8 || (eVar2.f21644p == 0 && eVar2.v() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.e0() && ((next == eVar2.f21595H && (dVar5 = eVar2.f21597J.f21570f) != null && dVar5.n()) || (next == eVar2.f21597J && (dVar4 = eVar2.f21595H.f21570f) != null && dVar4.n()))) {
                        if (!eVar2.b0()) {
                            e(eVar, interfaceC0209b, eVar2, z7);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof l0.h) || dVarO2.d() == null || !dVarO2.n()) {
            return;
        }
        Iterator<l0.d> it2 = dVarO2.d().iterator();
        while (it2.hasNext()) {
            l0.d next2 = it2.next();
            l0.e eVar3 = next2.f21568d;
            boolean zA2 = a(eVar3);
            if (eVar3.f0() && zA2) {
                l0.f.F1(eVar3, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
            }
            boolean z8 = (next2 == eVar3.f21595H && (dVar2 = eVar3.f21597J.f21570f) != null && dVar2.n()) || (next2 == eVar3.f21597J && (dVar = eVar3.f21595H.f21570f) != null && dVar.n());
            e.b bVarA2 = eVar3.A();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVarA2 != bVar2 || zA2) {
                if (!eVar3.f0()) {
                    l0.d dVar8 = eVar3.f21595H;
                    if (next2 == dVar8 && eVar3.f21597J.f21570f == null) {
                        int iF3 = dVar8.f() + iE2;
                        eVar3.s0(iF3, eVar3.T() + iF3);
                        b(eVar3, interfaceC0209b, z7);
                    } else {
                        l0.d dVar9 = eVar3.f21597J;
                        if (next2 == dVar9 && dVar8.f21570f == null) {
                            int iF4 = iE2 - dVar9.f();
                            eVar3.s0(iF4 - eVar3.T(), iF4);
                            b(eVar3, interfaceC0209b, z7);
                        } else if (z8 && !eVar3.b0()) {
                            d(interfaceC0209b, eVar3, z7);
                        }
                    }
                }
            } else if (eVar3.A() == bVar2 && eVar3.f21652t >= 0 && eVar3.f21650s >= 0 && (eVar3.S() == 8 || (eVar3.f21644p == 0 && eVar3.v() == 0.0f))) {
                if (!eVar3.b0() && !eVar3.e0() && z8 && !eVar3.b0()) {
                    e(eVar, interfaceC0209b, eVar3, z7);
                }
            }
        }
    }

    private static void c(C2525a c2525a, C2558b.InterfaceC0209b interfaceC0209b, int i7, boolean z7) {
        if (c2525a.f1()) {
            if (i7 == 0) {
                b(c2525a, interfaceC0209b, z7);
            } else {
                i(c2525a, interfaceC0209b);
            }
        }
    }

    private static void d(C2558b.InterfaceC0209b interfaceC0209b, l0.e eVar, boolean z7) {
        float fY = eVar.y();
        int iE = eVar.f21595H.f21570f.e();
        int iE2 = eVar.f21597J.f21570f.e();
        int iF = eVar.f21595H.f() + iE;
        int iF2 = iE2 - eVar.f21597J.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iT = eVar.T();
        int i7 = (iE2 - iE) - iT;
        if (iE > iE2) {
            i7 = (iE - iE2) - iT;
        }
        int i8 = ((int) ((fY * i7) + 0.5f)) + iE;
        int i9 = i8 + iT;
        if (iE > iE2) {
            i9 = i8 - iT;
        }
        eVar.s0(i8, i9);
        b(eVar, interfaceC0209b, z7);
    }

    private static void e(l0.e eVar, C2558b.InterfaceC0209b interfaceC0209b, l0.e eVar2, boolean z7) {
        float fY = eVar2.y();
        int iE = eVar2.f21595H.f21570f.e() + eVar2.f21595H.f();
        int iE2 = eVar2.f21597J.f21570f.e() - eVar2.f21597J.f();
        if (iE2 >= iE) {
            int iT = eVar2.T();
            if (eVar2.S() != 8) {
                int i7 = eVar2.f21644p;
                if (i7 == 2) {
                    iT = (int) (eVar2.y() * 0.5f * (eVar instanceof l0.f ? eVar.T() : eVar.K().T()));
                } else if (i7 == 0) {
                    iT = iE2 - iE;
                }
                iT = Math.max(eVar2.f21650s, iT);
                int i8 = eVar2.f21652t;
                if (i8 > 0) {
                    iT = Math.min(i8, iT);
                }
            }
            int i9 = iE + ((int) ((fY * ((iE2 - iE) - iT)) + 0.5f));
            eVar2.s0(i9, iT + i9);
            b(eVar2, interfaceC0209b, z7);
        }
    }

    private static void f(C2558b.InterfaceC0209b interfaceC0209b, l0.e eVar) {
        float fO = eVar.O();
        int iE = eVar.f21596I.f21570f.e();
        int iE2 = eVar.f21598K.f21570f.e();
        int iF = eVar.f21596I.f() + iE;
        int iF2 = iE2 - eVar.f21598K.f();
        if (iE == iE2) {
            fO = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = eVar.x();
        int i7 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i7 = (iE - iE2) - iX;
        }
        int i8 = (int) ((fO * i7) + 0.5f);
        int i9 = iE + i8;
        int i10 = i9 + iX;
        if (iE > iE2) {
            i9 = iE - i8;
            i10 = i9 - iX;
        }
        eVar.v0(i9, i10);
        i(eVar, interfaceC0209b);
    }

    private static void g(l0.e eVar, C2558b.InterfaceC0209b interfaceC0209b, l0.e eVar2) {
        float fO = eVar2.O();
        int iE = eVar2.f21596I.f21570f.e() + eVar2.f21596I.f();
        int iE2 = eVar2.f21598K.f21570f.e() - eVar2.f21598K.f();
        if (iE2 >= iE) {
            int iX = eVar2.x();
            if (eVar2.S() != 8) {
                int i7 = eVar2.f21646q;
                if (i7 == 2) {
                    iX = (int) (fO * 0.5f * (eVar instanceof l0.f ? eVar.x() : eVar.K().x()));
                } else if (i7 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(eVar2.f21656v, iX);
                int i8 = eVar2.f21658w;
                if (i8 > 0) {
                    iX = Math.min(i8, iX);
                }
            }
            int i9 = iE + ((int) ((fO * ((iE2 - iE) - iX)) + 0.5f));
            eVar2.v0(i9, iX + i9);
            i(eVar2, interfaceC0209b);
        }
    }

    public static void h(l0.f fVar, C2558b.InterfaceC0209b interfaceC0209b) {
        e.b bVarA = fVar.A();
        e.b bVarQ = fVar.Q();
        fVar.l0();
        ArrayList<l0.e> arrayListD1 = fVar.d1();
        int size = arrayListD1.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayListD1.get(i7).l0();
        }
        boolean zC1 = fVar.C1();
        if (bVarA == e.b.FIXED) {
            fVar.s0(0, fVar.T());
        } else {
            fVar.t0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            l0.e eVar = arrayListD1.get(i8);
            if (eVar instanceof l0.h) {
                l0.h hVar = (l0.h) eVar;
                if (hVar.e1() == 1) {
                    if (hVar.f1() != -1) {
                        hVar.i1(hVar.f1());
                    } else if (hVar.g1() != -1 && fVar.g0()) {
                        hVar.i1(fVar.T() - hVar.g1());
                    } else if (fVar.g0()) {
                        hVar.i1((int) ((hVar.h1() * fVar.T()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((eVar instanceof C2525a) && ((C2525a) eVar).j1() == 0) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i9 = 0; i9 < size; i9++) {
                l0.e eVar2 = arrayListD1.get(i9);
                if (eVar2 instanceof l0.h) {
                    l0.h hVar2 = (l0.h) eVar2;
                    if (hVar2.e1() == 1) {
                        b(hVar2, interfaceC0209b, zC1);
                    }
                }
            }
        }
        b(fVar, interfaceC0209b, zC1);
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                l0.e eVar3 = arrayListD1.get(i10);
                if (eVar3 instanceof C2525a) {
                    C2525a c2525a = (C2525a) eVar3;
                    if (c2525a.j1() == 0) {
                        c(c2525a, interfaceC0209b, 0, zC1);
                    }
                }
            }
        }
        if (bVarQ == e.b.FIXED) {
            fVar.v0(0, fVar.x());
        } else {
            fVar.u0(0);
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            l0.e eVar4 = arrayListD1.get(i11);
            if (eVar4 instanceof l0.h) {
                l0.h hVar3 = (l0.h) eVar4;
                if (hVar3.e1() == 0) {
                    if (hVar3.f1() != -1) {
                        hVar3.i1(hVar3.f1());
                    } else if (hVar3.g1() != -1 && fVar.h0()) {
                        hVar3.i1(fVar.x() - hVar3.g1());
                    } else if (fVar.h0()) {
                        hVar3.i1((int) ((hVar3.h1() * fVar.x()) + 0.5f));
                    }
                    z9 = true;
                }
            } else if ((eVar4 instanceof C2525a) && ((C2525a) eVar4).j1() == 1) {
                z10 = true;
            }
        }
        if (z9) {
            for (int i12 = 0; i12 < size; i12++) {
                l0.e eVar5 = arrayListD1.get(i12);
                if (eVar5 instanceof l0.h) {
                    l0.h hVar4 = (l0.h) eVar5;
                    if (hVar4.e1() == 0) {
                        i(hVar4, interfaceC0209b);
                    }
                }
            }
        }
        i(fVar, interfaceC0209b);
        if (z10) {
            for (int i13 = 0; i13 < size; i13++) {
                l0.e eVar6 = arrayListD1.get(i13);
                if (eVar6 instanceof C2525a) {
                    C2525a c2525a2 = (C2525a) eVar6;
                    if (c2525a2.j1() == 1) {
                        c(c2525a2, interfaceC0209b, 1, zC1);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            l0.e eVar7 = arrayListD1.get(i14);
            if (eVar7.f0() && a(eVar7)) {
                l0.f.F1(eVar7, interfaceC0209b, f21940a, C2558b.a.f21894k);
                b(eVar7, interfaceC0209b, zC1);
                i(eVar7, interfaceC0209b);
            }
        }
    }

    private static void i(l0.e eVar, C2558b.InterfaceC0209b interfaceC0209b) {
        l0.d dVar;
        l0.d dVar2;
        l0.d dVar3;
        l0.d dVar4;
        l0.d dVar5;
        if (!(eVar instanceof l0.f) && eVar.f0() && a(eVar)) {
            l0.f.F1(eVar, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
        }
        l0.d dVarO = eVar.o(d.b.TOP);
        l0.d dVarO2 = eVar.o(d.b.BOTTOM);
        int iE = dVarO.e();
        int iE2 = dVarO2.e();
        if (dVarO.d() != null && dVarO.n()) {
            Iterator<l0.d> it = dVarO.d().iterator();
            while (it.hasNext()) {
                l0.d next = it.next();
                l0.e eVar2 = next.f21568d;
                boolean zA = a(eVar2);
                if (eVar2.f0() && zA) {
                    l0.f.F1(eVar2, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
                }
                e.b bVarQ = eVar2.Q();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar || zA) {
                    if (!eVar2.f0()) {
                        l0.d dVar6 = eVar2.f21596I;
                        if (next == dVar6 && eVar2.f21598K.f21570f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.v0(iF, eVar2.x() + iF);
                            i(eVar2, interfaceC0209b);
                        } else {
                            l0.d dVar7 = eVar2.f21598K;
                            if (next == dVar7 && dVar7.f21570f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.v0(iF2 - eVar2.x(), iF2);
                                i(eVar2, interfaceC0209b);
                            } else if (next == dVar6 && (dVar3 = dVar7.f21570f) != null && dVar3.n()) {
                                f(interfaceC0209b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.Q() == bVar && eVar2.f21658w >= 0 && eVar2.f21656v >= 0 && (eVar2.S() == 8 || (eVar2.f21646q == 0 && eVar2.v() == 0.0f))) {
                    if (!eVar2.d0() && !eVar2.e0() && ((next == eVar2.f21596I && (dVar5 = eVar2.f21598K.f21570f) != null && dVar5.n()) || (next == eVar2.f21598K && (dVar4 = eVar2.f21596I.f21570f) != null && dVar4.n()))) {
                        if (!eVar2.d0()) {
                            g(eVar, interfaceC0209b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof l0.h) {
            return;
        }
        if (dVarO2.d() != null && dVarO2.n()) {
            Iterator<l0.d> it2 = dVarO2.d().iterator();
            while (it2.hasNext()) {
                l0.d next2 = it2.next();
                l0.e eVar3 = next2.f21568d;
                boolean zA2 = a(eVar3);
                if (eVar3.f0() && zA2) {
                    l0.f.F1(eVar3, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
                }
                boolean z7 = (next2 == eVar3.f21596I && (dVar2 = eVar3.f21598K.f21570f) != null && dVar2.n()) || (next2 == eVar3.f21598K && (dVar = eVar3.f21596I.f21570f) != null && dVar.n());
                e.b bVarQ2 = eVar3.Q();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarQ2 != bVar2 || zA2) {
                    if (!eVar3.f0()) {
                        l0.d dVar8 = eVar3.f21596I;
                        if (next2 == dVar8 && eVar3.f21598K.f21570f == null) {
                            int iF3 = dVar8.f() + iE2;
                            eVar3.v0(iF3, eVar3.x() + iF3);
                            i(eVar3, interfaceC0209b);
                        } else {
                            l0.d dVar9 = eVar3.f21598K;
                            if (next2 == dVar9 && dVar8.f21570f == null) {
                                int iF4 = iE2 - dVar9.f();
                                eVar3.v0(iF4 - eVar3.x(), iF4);
                                i(eVar3, interfaceC0209b);
                            } else if (z7 && !eVar3.d0()) {
                                f(interfaceC0209b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.Q() == bVar2 && eVar3.f21658w >= 0 && eVar3.f21656v >= 0 && (eVar3.S() == 8 || (eVar3.f21646q == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.d0() && !eVar3.e0() && z7 && !eVar3.d0()) {
                        g(eVar, interfaceC0209b, eVar3);
                    }
                }
            }
        }
        l0.d dVarO3 = eVar.o(d.b.BASELINE);
        if (dVarO3.d() == null || !dVarO3.n()) {
            return;
        }
        int iE3 = dVarO3.e();
        Iterator<l0.d> it3 = dVarO3.d().iterator();
        while (it3.hasNext()) {
            l0.d next3 = it3.next();
            l0.e eVar4 = next3.f21568d;
            boolean zA3 = a(eVar4);
            if (eVar4.f0() && zA3) {
                l0.f.F1(eVar4, interfaceC0209b, new C2558b.a(), C2558b.a.f21894k);
            }
            if (eVar4.Q() != e.b.MATCH_CONSTRAINT || zA3) {
                if (!eVar4.f0() && next3 == eVar4.f21599L) {
                    eVar4.r0(iE3);
                    i(eVar4, interfaceC0209b);
                }
            }
        }
    }
}
