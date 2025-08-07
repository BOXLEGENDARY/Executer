package m0;

import java.util.ArrayList;
import k0.C2510d;
import l0.d;
import l0.e;

public class C2558b {

    private final ArrayList<l0.e> f21891a = new ArrayList<>();

    private a f21892b = new a();

    private l0.f f21893c;

    public static class a {

        public static int f21894k = 0;

        public static int f21895l = 1;

        public static int f21896m = 2;

        public e.b f21897a;

        public e.b f21898b;

        public int f21899c;

        public int f21900d;

        public int f21901e;

        public int f21902f;

        public int f21903g;

        public boolean f21904h;

        public boolean f21905i;

        public int f21906j;
    }

    public interface InterfaceC0209b {
        void a();

        void b(l0.e eVar, a aVar);
    }

    public C2558b(l0.f fVar) {
        this.f21893c = fVar;
    }

    private boolean a(InterfaceC0209b interfaceC0209b, l0.e eVar, int i7) {
        this.f21892b.f21897a = eVar.A();
        this.f21892b.f21898b = eVar.Q();
        this.f21892b.f21899c = eVar.T();
        this.f21892b.f21900d = eVar.x();
        a aVar = this.f21892b;
        aVar.f21905i = false;
        aVar.f21906j = i7;
        e.b bVar = aVar.f21897a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f21898b == bVar2;
        boolean z9 = z7 && eVar.f21610W > 0.0f;
        boolean z10 = z8 && eVar.f21610W > 0.0f;
        if (z9 && eVar.f21648r[0] == 4) {
            aVar.f21897a = e.b.FIXED;
        }
        if (z10 && eVar.f21648r[1] == 4) {
            aVar.f21898b = e.b.FIXED;
        }
        interfaceC0209b.b(eVar, aVar);
        eVar.X0(this.f21892b.f21901e);
        eVar.y0(this.f21892b.f21902f);
        eVar.x0(this.f21892b.f21904h);
        eVar.n0(this.f21892b.f21903g);
        a aVar2 = this.f21892b;
        aVar2.f21906j = a.f21894k;
        return aVar2.f21905i;
    }

    private void b(l0.f r13) {
        throw new UnsupportedOperationException("Method not decompiled: m0.C2558b.b(l0.f):void");
    }

    private void c(l0.f fVar, String str, int i7, int i8) {
        int I2 = fVar.I();
        int iH = fVar.H();
        fVar.N0(0);
        fVar.M0(0);
        fVar.X0(i7);
        fVar.y0(i8);
        fVar.N0(I2);
        fVar.M0(iH);
        this.f21893c.e1();
    }

    public long d(l0.f fVar, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z7;
        boolean zT1;
        int i16;
        l0.f fVar2;
        int i17;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i18;
        boolean z12;
        int i19;
        int i20;
        boolean z13;
        int i21;
        InterfaceC0209b interfaceC0209bV1 = fVar.v1();
        int size = fVar.f21755D0.size();
        int iT = fVar.T();
        int iX = fVar.x();
        boolean zB = l0.k.b(i7, 128);
        int i22 = 1;
        boolean z14 = zB || l0.k.b(i7, 64);
        if (z14) {
            for (int i23 = 0; i23 < size; i23++) {
                l0.e eVar = fVar.f21755D0.get(i23);
                e.b bVarA = eVar.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z15 = (bVarA == bVar) && (eVar.Q() == bVar) && eVar.v() > 0.0f;
                if ((eVar.b0() && z15) || ((eVar.d0() && z15) || (eVar instanceof l0.l) || eVar.b0() || eVar.d0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            boolean z16 = C2510d.f21179r;
        }
        boolean z17 = z14 & ((i10 == 1073741824 && i12 == 1073741824) || zB);
        int i24 = 2;
        if (z17) {
            int iMin = Math.min(fVar.G(), i11);
            int iMin2 = Math.min(fVar.F(), i13);
            if (i10 == 1073741824 && fVar.T() != iMin) {
                fVar.X0(iMin);
                fVar.z1();
            }
            if (i12 == 1073741824 && fVar.x() != iMin2) {
                fVar.y0(iMin2);
                fVar.z1();
            }
            if (i10 == 1073741824 && i12 == 1073741824) {
                zT1 = fVar.r1(zB);
                i16 = 2;
                z7 = false;
            } else {
                boolean zS1 = fVar.s1(zB);
                z7 = false;
                if (i10 == 1073741824) {
                    zS1 &= fVar.t1(zB, 0);
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                if (i12 == 1073741824) {
                    zT1 = fVar.t1(zB, 1) & zS1;
                    i16++;
                } else {
                    zT1 = zS1;
                }
            }
            if (zT1) {
                fVar.b1(i10 == 1073741824 ? true : z7, i12 == 1073741824 ? true : z7);
            }
        } else {
            z7 = false;
            zT1 = false;
            i16 = 0;
        }
        if (zT1 && i16 == 2) {
            return 0L;
        }
        int iW1 = fVar.w1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f21891a.size();
        if (size > 0) {
            c(fVar, "First pass", iT, iX);
        }
        if (size2 > 0) {
            e.b bVarA2 = fVar.A();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z18 = bVarA2 == bVar2 ? true : z7;
            boolean z19 = fVar.Q() == bVar2 ? true : z7;
            int iMax = Math.max(fVar.T(), this.f21893c.I());
            int iMax2 = Math.max(fVar.x(), this.f21893c.H());
            boolean z20 = z7;
            boolean zQ1 = z20;
            ?? r15 = z20;
            while (r15 < size2) {
                l0.e eVar2 = this.f21891a.get(r15);
                if (eVar2 instanceof l0.l) {
                    int iT2 = eVar2.T();
                    int iX2 = eVar2.x();
                    i20 = iW1;
                    boolean zA = zQ1 | a(interfaceC0209bV1, eVar2, a.f21895l);
                    int iT3 = eVar2.T();
                    int iX3 = eVar2.x();
                    if (iT3 != iT2) {
                        eVar2.X0(iT3);
                        if (z18 && eVar2.M() > iMax) {
                            iMax = Math.max(iMax, eVar2.M() + eVar2.o(d.b.RIGHT).f());
                        }
                        z13 = true;
                    } else {
                        z13 = zA;
                    }
                    if (iX3 != iX2) {
                        eVar2.y0(iX3);
                        if (z19 && eVar2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.r() + eVar2.o(d.b.BOTTOM).f());
                        }
                        z13 = true;
                    }
                    zQ1 = z13 | ((l0.l) eVar2).q1();
                    i21 = 1;
                } else {
                    i20 = iW1;
                    i21 = i22;
                }
                iW1 = i20;
                i22 = i21;
                i24 = 2;
                r15 += i21;
            }
            int i25 = iW1;
            int i26 = i24;
            int i27 = 0;
            while (true) {
                if (i27 >= i26) {
                    fVar2 = fVar;
                    z8 = true;
                    break;
                }
                int i28 = 0;
                while (i28 < size2) {
                    l0.e eVar3 = this.f21891a.get(i28);
                    if (((eVar3 instanceof l0.i) && !(eVar3 instanceof l0.l)) || (eVar3 instanceof l0.h) || eVar3.S() == 8 || ((z17 && eVar3.f21622e.f21973e.f21927j && eVar3.f21624f.f21973e.f21927j) || (eVar3 instanceof l0.l))) {
                        z11 = z17;
                        i18 = size2;
                    } else {
                        int iT4 = eVar3.T();
                        int iX4 = eVar3.x();
                        int iP = eVar3.p();
                        int i29 = a.f21895l;
                        z11 = z17;
                        if (i27 == 1) {
                            i29 = a.f21896m;
                        }
                        boolean zA2 = zQ1 | a(interfaceC0209bV1, eVar3, i29);
                        int iT5 = eVar3.T();
                        i18 = size2;
                        int iX5 = eVar3.x();
                        if (iT5 != iT4) {
                            eVar3.X0(iT5);
                            if (z18 && eVar3.M() > iMax) {
                                iMax = Math.max(iMax, eVar3.M() + eVar3.o(d.b.RIGHT).f());
                            }
                            z12 = true;
                        } else {
                            z12 = zA2;
                        }
                        if (iX5 != iX4) {
                            eVar3.y0(iX5);
                            if (z19 && eVar3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.r() + eVar3.o(d.b.BOTTOM).f());
                            }
                            z12 = true;
                        }
                        if (!eVar3.W() || iP == eVar3.p()) {
                            zQ1 = z12;
                        } else {
                            i19 = 1;
                            zQ1 = true;
                            i28 += i19;
                            size2 = i18;
                            z17 = z11;
                        }
                    }
                    i19 = 1;
                    i28 += i19;
                    size2 = i18;
                    z17 = z11;
                }
                boolean z21 = z17;
                int i30 = size2;
                z8 = true;
                if (!zQ1) {
                    fVar2 = fVar;
                    break;
                }
                c(fVar, "intermediate pass", iT, iX);
                i27++;
                size2 = i30;
                z17 = z21;
                i26 = 2;
                zQ1 = false;
            }
            if (zQ1) {
                c(fVar2, "2nd pass", iT, iX);
                if (fVar.T() < iMax) {
                    fVar2.X0(iMax);
                    z9 = z8;
                } else {
                    z9 = false;
                }
                if (fVar.x() < iMax2) {
                    fVar2.y0(iMax2);
                    z10 = z8;
                } else {
                    z10 = z9;
                }
                if (z10) {
                    c(fVar2, "3rd pass", iT, iX);
                }
            }
            i17 = i25;
        } else {
            fVar2 = fVar;
            i17 = iW1;
        }
        fVar2.J1(i17);
        return 0L;
    }

    public void e(l0.f fVar) {
        this.f21891a.clear();
        int size = fVar.f21755D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            l0.e eVar = fVar.f21755D0.get(i7);
            e.b bVarA = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || eVar.Q() == bVar) {
                this.f21891a.add(eVar);
            }
        }
        fVar.z1();
    }
}
