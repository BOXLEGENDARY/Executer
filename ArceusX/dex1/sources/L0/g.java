package l0;

import java.util.ArrayList;
import k0.C2510d;
import l0.e;

public class g extends l {
    private e[] p1;

    private int f21698S0 = -1;
    private int T0 = -1;
    private int U0 = -1;
    private int V0 = -1;

    private int f21699W0 = -1;

    private int f21700X0 = -1;

    private float f21701Y0 = 0.5f;

    private float f21702Z0 = 0.5f;

    private float f21703a1 = 0.5f;

    private float f21704b1 = 0.5f;

    private float f21705c1 = 0.5f;

    private float f21706d1 = 0.5f;

    private int f21707e1 = 0;

    private int f21708f1 = 0;

    private int f21709g1 = 2;

    private int f21710h1 = 2;

    private int f21711i1 = 0;

    private int f21712j1 = -1;
    private int k1 = 0;
    private ArrayList<a> l1 = new ArrayList<>();
    private e[] m1 = null;
    private e[] n1 = null;
    private int[] o1 = null;
    private int q1 = 0;

    private class a {

        private int f21713a;

        private d f21716d;

        private d f21717e;

        private d f21718f;

        private d f21719g;

        private int f21720h;

        private int f21721i;

        private int f21722j;

        private int f21723k;

        private int f21729q;

        private e f21714b = null;

        int f21715c = 0;

        private int f21724l = 0;

        private int f21725m = 0;

        private int f21726n = 0;

        private int f21727o = 0;

        private int f21728p = 0;

        public a(int i7, d dVar, d dVar2, d dVar3, d dVar4, int i8) {
            this.f21720h = 0;
            this.f21721i = 0;
            this.f21722j = 0;
            this.f21723k = 0;
            this.f21729q = 0;
            this.f21713a = i7;
            this.f21716d = dVar;
            this.f21717e = dVar2;
            this.f21718f = dVar3;
            this.f21719g = dVar4;
            this.f21720h = g.this.k1();
            this.f21721i = g.this.m1();
            this.f21722j = g.this.l1();
            this.f21723k = g.this.j1();
            this.f21729q = i8;
        }

        private void h() {
            this.f21724l = 0;
            this.f21725m = 0;
            this.f21714b = null;
            this.f21715c = 0;
            int i7 = this.f21727o;
            for (int i8 = 0; i8 < i7 && this.f21726n + i8 < g.this.q1; i8++) {
                e eVar = g.this.p1[this.f21726n + i8];
                if (this.f21713a == 0) {
                    int iT = eVar.T();
                    int i9 = g.this.f21707e1;
                    if (eVar.S() == 8) {
                        i9 = 0;
                    }
                    this.f21724l += iT + i9;
                    int iV1 = g.this.V1(eVar, this.f21729q);
                    if (this.f21714b == null || this.f21715c < iV1) {
                        this.f21714b = eVar;
                        this.f21715c = iV1;
                        this.f21725m = iV1;
                    }
                } else {
                    int iW1 = g.this.W1(eVar, this.f21729q);
                    int iV12 = g.this.V1(eVar, this.f21729q);
                    int i10 = g.this.f21708f1;
                    if (eVar.S() == 8) {
                        i10 = 0;
                    }
                    this.f21725m += iV12 + i10;
                    if (this.f21714b == null || this.f21715c < iW1) {
                        this.f21714b = eVar;
                        this.f21715c = iW1;
                        this.f21724l = iW1;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f21713a == 0) {
                int iW1 = g.this.W1(eVar, this.f21729q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f21728p++;
                    iW1 = 0;
                }
                this.f21724l += iW1 + (eVar.S() != 8 ? g.this.f21707e1 : 0);
                int iV1 = g.this.V1(eVar, this.f21729q);
                if (this.f21714b == null || this.f21715c < iV1) {
                    this.f21714b = eVar;
                    this.f21715c = iV1;
                    this.f21725m = iV1;
                }
            } else {
                int iW12 = g.this.W1(eVar, this.f21729q);
                int iV12 = g.this.V1(eVar, this.f21729q);
                if (eVar.Q() == e.b.MATCH_CONSTRAINT) {
                    this.f21728p++;
                    iV12 = 0;
                }
                this.f21725m += iV12 + (eVar.S() != 8 ? g.this.f21708f1 : 0);
                if (this.f21714b == null || this.f21715c < iW12) {
                    this.f21714b = eVar;
                    this.f21715c = iW12;
                    this.f21724l = iW12;
                }
            }
            this.f21727o++;
        }

        public void c() {
            this.f21715c = 0;
            this.f21714b = null;
            this.f21724l = 0;
            this.f21725m = 0;
            this.f21726n = 0;
            this.f21727o = 0;
            this.f21728p = 0;
        }

        public void d(boolean z7, int i7, boolean z8) {
            e eVar;
            char c2;
            int i8 = this.f21727o;
            for (int i9 = 0; i9 < i8 && this.f21726n + i9 < g.this.q1; i9++) {
                e eVar2 = g.this.p1[this.f21726n + i9];
                if (eVar2 != null) {
                    eVar2.k0();
                }
            }
            if (i8 == 0 || this.f21714b == null) {
                return;
            }
            boolean z9 = z8 && i7 == 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = z7 ? (i8 - 1) - i12 : i12;
                if (this.f21726n + i13 >= g.this.q1) {
                    break;
                }
                if (g.this.p1[this.f21726n + i13].S() == 0) {
                    if (i10 == -1) {
                        i10 = i12;
                    }
                    i11 = i12;
                }
            }
            e eVar3 = null;
            if (this.f21713a != 0) {
                e eVar4 = this.f21714b;
                eVar4.A0(g.this.f21698S0);
                int i14 = this.f21720h;
                if (i7 > 0) {
                    i14 += g.this.f21707e1;
                }
                if (z7) {
                    eVar4.f21597J.a(this.f21718f, i14);
                    if (z8) {
                        eVar4.f21595H.a(this.f21716d, this.f21722j);
                    }
                    if (i7 > 0) {
                        this.f21718f.f21568d.f21595H.a(eVar4.f21597J, 0);
                    }
                } else {
                    eVar4.f21595H.a(this.f21716d, i14);
                    if (z8) {
                        eVar4.f21597J.a(this.f21718f, this.f21722j);
                    }
                    if (i7 > 0) {
                        this.f21716d.f21568d.f21597J.a(eVar4.f21595H, 0);
                    }
                }
                int i15 = 0;
                while (i15 < i8 && this.f21726n + i15 < g.this.q1) {
                    e eVar5 = g.this.p1[this.f21726n + i15];
                    if (i15 == 0) {
                        eVar5.k(eVar5.f21596I, this.f21717e, this.f21721i);
                        int i16 = g.this.T0;
                        float f7 = g.this.f21702Z0;
                        if (this.f21726n == 0 && g.this.V0 != -1) {
                            i16 = g.this.V0;
                            f7 = g.this.f21704b1;
                        } else if (z8 && g.this.f21700X0 != -1) {
                            i16 = g.this.f21700X0;
                            f7 = g.this.f21706d1;
                        }
                        eVar5.R0(i16);
                        eVar5.Q0(f7);
                    }
                    if (i15 == i8 - 1) {
                        eVar5.k(eVar5.f21598K, this.f21719g, this.f21723k);
                    }
                    if (eVar3 != null) {
                        eVar5.f21596I.a(eVar3.f21598K, g.this.f21708f1);
                        if (i15 == i10) {
                            eVar5.f21596I.u(this.f21721i);
                        }
                        eVar3.f21598K.a(eVar5.f21596I, 0);
                        if (i15 == i11 + 1) {
                            eVar3.f21598K.u(this.f21723k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z7) {
                            int i17 = g.this.f21709g1;
                            if (i17 == 0) {
                                eVar5.f21597J.a(eVar4.f21597J, 0);
                            } else if (i17 == 1) {
                                eVar5.f21595H.a(eVar4.f21595H, 0);
                            } else if (i17 == 2) {
                                eVar5.f21595H.a(eVar4.f21595H, 0);
                                eVar5.f21597J.a(eVar4.f21597J, 0);
                            }
                        } else {
                            int i18 = g.this.f21709g1;
                            if (i18 == 0) {
                                eVar5.f21595H.a(eVar4.f21595H, 0);
                            } else if (i18 == 1) {
                                eVar5.f21597J.a(eVar4.f21597J, 0);
                            } else if (i18 == 2) {
                                if (z9) {
                                    eVar5.f21595H.a(this.f21716d, this.f21720h);
                                    eVar5.f21597J.a(this.f21718f, this.f21722j);
                                } else {
                                    eVar5.f21595H.a(eVar4.f21595H, 0);
                                    eVar5.f21597J.a(eVar4.f21597J, 0);
                                }
                            }
                        }
                    }
                    i15++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f21714b;
            eVar6.R0(g.this.T0);
            int i19 = this.f21721i;
            if (i7 > 0) {
                i19 += g.this.f21708f1;
            }
            eVar6.f21596I.a(this.f21717e, i19);
            if (z8) {
                eVar6.f21598K.a(this.f21719g, this.f21723k);
            }
            if (i7 > 0) {
                this.f21717e.f21568d.f21598K.a(eVar6.f21596I, 0);
            }
            if (g.this.f21710h1 != 3 || eVar6.W()) {
                eVar = eVar6;
            } else {
                for (int i20 = 0; i20 < i8; i20++) {
                    int i21 = z7 ? (i8 - 1) - i20 : i20;
                    if (this.f21726n + i21 >= g.this.q1) {
                        break;
                    }
                    eVar = g.this.p1[this.f21726n + i21];
                    if (eVar.W()) {
                        break;
                    }
                }
                eVar = eVar6;
            }
            int i22 = 0;
            while (i22 < i8) {
                int i23 = z7 ? (i8 - 1) - i22 : i22;
                if (this.f21726n + i23 >= g.this.q1) {
                    return;
                }
                e eVar7 = g.this.p1[this.f21726n + i23];
                if (i22 == 0) {
                    eVar7.k(eVar7.f21595H, this.f21716d, this.f21720h);
                }
                if (i23 == 0) {
                    int i24 = g.this.f21698S0;
                    float f8 = g.this.f21701Y0;
                    if (this.f21726n == 0 && g.this.U0 != -1) {
                        i24 = g.this.U0;
                        f8 = g.this.f21703a1;
                    } else if (z8 && g.this.f21699W0 != -1) {
                        i24 = g.this.f21699W0;
                        f8 = g.this.f21705c1;
                    }
                    eVar7.A0(i24);
                    eVar7.z0(f8);
                }
                if (i22 == i8 - 1) {
                    eVar7.k(eVar7.f21597J, this.f21718f, this.f21722j);
                }
                if (eVar3 != null) {
                    eVar7.f21595H.a(eVar3.f21597J, g.this.f21707e1);
                    if (i22 == i10) {
                        eVar7.f21595H.u(this.f21720h);
                    }
                    eVar3.f21597J.a(eVar7.f21595H, 0);
                    if (i22 == i11 + 1) {
                        eVar3.f21597J.u(this.f21722j);
                    }
                }
                if (eVar7 != eVar6) {
                    c2 = 3;
                    if (g.this.f21710h1 == 3 && eVar.W() && eVar7 != eVar && eVar7.W()) {
                        eVar7.f21599L.a(eVar.f21599L, 0);
                    } else {
                        int i25 = g.this.f21710h1;
                        if (i25 == 0) {
                            eVar7.f21596I.a(eVar6.f21596I, 0);
                        } else if (i25 == 1) {
                            eVar7.f21598K.a(eVar6.f21598K, 0);
                        } else if (z9) {
                            eVar7.f21596I.a(this.f21717e, this.f21721i);
                            eVar7.f21598K.a(this.f21719g, this.f21723k);
                        } else {
                            eVar7.f21596I.a(eVar6.f21596I, 0);
                            eVar7.f21598K.a(eVar6.f21598K, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                i22++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f21713a == 1 ? this.f21725m - g.this.f21708f1 : this.f21725m;
        }

        public int f() {
            return this.f21713a == 0 ? this.f21724l - g.this.f21707e1 : this.f21724l;
        }

        public void g(int i7) {
            int i8 = this.f21728p;
            if (i8 == 0) {
                return;
            }
            int i9 = this.f21727o;
            int i10 = i7 / i8;
            for (int i11 = 0; i11 < i9 && this.f21726n + i11 < g.this.q1; i11++) {
                e eVar = g.this.p1[this.f21726n + i11];
                if (this.f21713a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f21644p == 0) {
                        g.this.o1(eVar, e.b.FIXED, i10, eVar.Q(), eVar.x());
                    }
                } else if (eVar != null && eVar.Q() == e.b.MATCH_CONSTRAINT && eVar.f21646q == 0) {
                    g.this.o1(eVar, eVar.A(), eVar.T(), e.b.FIXED, i10);
                }
            }
            h();
        }

        public void i(int i7) {
            this.f21726n = i7;
        }

        public void j(int i7, d dVar, d dVar2, d dVar3, d dVar4, int i8, int i9, int i10, int i11, int i12) {
            this.f21713a = i7;
            this.f21716d = dVar;
            this.f21717e = dVar2;
            this.f21718f = dVar3;
            this.f21719g = dVar4;
            this.f21720h = i8;
            this.f21721i = i9;
            this.f21722j = i10;
            this.f21723k = i11;
            this.f21729q = i12;
        }
    }

    private void U1(boolean z7) {
        e eVar;
        if (this.o1 == null || this.n1 == null || this.m1 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.q1; i7++) {
            this.p1[i7].k0();
        }
        int[] iArr = this.o1;
        int i8 = iArr[0];
        int i9 = iArr[1];
        e eVar2 = null;
        for (int i10 = 0; i10 < i8; i10++) {
            e eVar3 = this.n1[z7 ? (i8 - i10) - 1 : i10];
            if (eVar3 != null && eVar3.S() != 8) {
                if (i10 == 0) {
                    eVar3.k(eVar3.f21595H, this.f21595H, k1());
                    eVar3.A0(this.f21698S0);
                    eVar3.z0(this.f21701Y0);
                }
                if (i10 == i8 - 1) {
                    eVar3.k(eVar3.f21597J, this.f21597J, l1());
                }
                if (i10 > 0) {
                    eVar3.k(eVar3.f21595H, eVar2.f21597J, this.f21707e1);
                    eVar2.k(eVar2.f21597J, eVar3.f21595H, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i11 = 0; i11 < i9; i11++) {
            e eVar4 = this.m1[i11];
            if (eVar4 != null && eVar4.S() != 8) {
                if (i11 == 0) {
                    eVar4.k(eVar4.f21596I, this.f21596I, m1());
                    eVar4.R0(this.T0);
                    eVar4.Q0(this.f21702Z0);
                }
                if (i11 == i9 - 1) {
                    eVar4.k(eVar4.f21598K, this.f21598K, j1());
                }
                if (i11 > 0) {
                    eVar4.k(eVar4.f21596I, eVar2.f21598K, this.f21708f1);
                    eVar2.k(eVar2.f21598K, eVar4.f21596I, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i12 = 0; i12 < i8; i12++) {
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = (i13 * i8) + i12;
                if (this.k1 == 1) {
                    i14 = (i12 * i9) + i13;
                }
                e[] eVarArr = this.p1;
                if (i14 < eVarArr.length && (eVar = eVarArr[i14]) != null && eVar.S() != 8) {
                    e eVar5 = this.n1[i12];
                    e eVar6 = this.m1[i13];
                    if (eVar != eVar5) {
                        eVar.k(eVar.f21595H, eVar5.f21595H, 0);
                        eVar.k(eVar.f21597J, eVar5.f21597J, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.f21596I, eVar6.f21596I, 0);
                        eVar.k(eVar.f21598K, eVar6.f21598K, 0);
                    }
                }
            }
        }
    }

    public final int V1(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.Q() == e.b.MATCH_CONSTRAINT) {
            int i8 = eVar.f21646q;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.f21660x * i7);
                if (i9 != eVar.x()) {
                    eVar.L0(true);
                    o1(eVar, eVar.A(), eVar.T(), e.b.FIXED, i9);
                }
                return i9;
            }
            if (i8 == 1) {
                return eVar.x();
            }
            if (i8 == 3) {
                return (int) ((eVar.T() * eVar.f21610W) + 0.5f);
            }
        }
        return eVar.x();
    }

    public final int W1(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i8 = eVar.f21644p;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.f21654u * i7);
                if (i9 != eVar.T()) {
                    eVar.L0(true);
                    o1(eVar, e.b.FIXED, i9, eVar.Q(), eVar.x());
                }
                return i9;
            }
            if (i8 == 1) {
                return eVar.T();
            }
            if (i8 == 3) {
                return (int) ((eVar.x() * eVar.f21610W) + 0.5f);
            }
        }
        return eVar.T();
    }

    private void X1(l0.e[] r11, int r12, int r13, int r14, int[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: l0.g.X1(l0.e[], int, int, int, int[]):void");
    }

    private void Y1(e[] eVarArr, int i7, int i8, int i9, int[] iArr) {
        int i10;
        int i11;
        int i12;
        d dVar;
        int iL1;
        d dVar2;
        int iJ1;
        int i13;
        if (i7 == 0) {
            return;
        }
        this.l1.clear();
        a aVar = new a(i8, this.f21595H, this.f21596I, this.f21597J, this.f21598K, i9);
        this.l1.add(aVar);
        if (i8 == 0) {
            i10 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i7) {
                e eVar = eVarArr[i15];
                int iW1 = W1(eVar, i9);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i16 = i10;
                boolean z7 = (i14 == i9 || (this.f21707e1 + i14) + iW1 > i9) && aVar.f21714b != null;
                if (!z7 && i15 > 0 && (i13 = this.f21712j1) > 0 && i15 % i13 == 0) {
                    z7 = true;
                }
                if (z7) {
                    aVar = new a(i8, this.f21595H, this.f21596I, this.f21597J, this.f21598K, i9);
                    aVar.i(i15);
                    this.l1.add(aVar);
                } else {
                    if (i15 > 0) {
                        i14 += this.f21707e1 + iW1;
                    }
                    aVar.b(eVar);
                    i15++;
                    i10 = i16;
                }
                i14 = iW1;
                aVar.b(eVar);
                i15++;
                i10 = i16;
            }
        } else {
            i10 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i7) {
                e eVar2 = eVarArr[i18];
                int iV1 = V1(eVar2, i9);
                if (eVar2.Q() == e.b.MATCH_CONSTRAINT) {
                    i10++;
                }
                int i19 = i10;
                boolean z8 = (i17 == i9 || (this.f21708f1 + i17) + iV1 > i9) && aVar.f21714b != null;
                if (!z8 && i18 > 0 && (i11 = this.f21712j1) > 0 && i18 % i11 == 0) {
                    z8 = true;
                }
                if (z8) {
                    aVar = new a(i8, this.f21595H, this.f21596I, this.f21597J, this.f21598K, i9);
                    aVar.i(i18);
                    this.l1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f21708f1 + iV1;
                    }
                    aVar.b(eVar2);
                    i18++;
                    i10 = i19;
                }
                i17 = iV1;
                aVar.b(eVar2);
                i18++;
                i10 = i19;
            }
        }
        int size = this.l1.size();
        d dVar3 = this.f21595H;
        d dVar4 = this.f21596I;
        d dVar5 = this.f21597J;
        d dVar6 = this.f21598K;
        int iK1 = k1();
        int iM1 = m1();
        int iL12 = l1();
        int iJ12 = j1();
        e.b bVarA = A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z9 = bVarA == bVar || Q() == bVar;
        if (i10 > 0 && z9) {
            for (int i20 = 0; i20 < size; i20++) {
                a aVar2 = this.l1.get(i20);
                if (i8 == 0) {
                    aVar2.g(i9 - aVar2.f());
                } else {
                    aVar2.g(i9 - aVar2.e());
                }
            }
        }
        int i21 = iM1;
        int i22 = iL12;
        int iE = 0;
        int iF = 0;
        int i23 = 0;
        int i24 = iK1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i25 = iJ12;
        while (i23 < size) {
            a aVar3 = this.l1.get(i23);
            if (i8 == 0) {
                if (i23 < size - 1) {
                    dVar2 = this.l1.get(i23 + 1).f21714b.f21596I;
                    iJ1 = 0;
                } else {
                    dVar2 = this.f21598K;
                    iJ1 = j1();
                }
                d dVar9 = aVar3.f21714b.f21598K;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i26 = iE;
                d dVar12 = dVar7;
                int i27 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i12 = i23;
                aVar3.j(i8, dVar10, dVar12, dVar13, dVar2, i24, i21, i22, iJ1, i9);
                int iMax = Math.max(i27, aVar3.f());
                iE = i26 + aVar3.e();
                if (i12 > 0) {
                    iE += this.f21708f1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i21 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i28 = iJ1;
                dVar6 = dVar2;
                i25 = i28;
            } else {
                d dVar15 = dVar8;
                int i29 = iE;
                int i30 = iF;
                i12 = i23;
                if (i12 < size - 1) {
                    dVar = this.l1.get(i12 + 1).f21714b.f21595H;
                    iL1 = 0;
                } else {
                    dVar = this.f21597J;
                    iL1 = l1();
                }
                d dVar16 = aVar3.f21714b.f21597J;
                aVar3.j(i8, dVar15, dVar7, dVar, dVar6, i24, i21, iL1, i25, i9);
                iF = i30 + aVar3.f();
                int iMax2 = Math.max(i29, aVar3.e());
                if (i12 > 0) {
                    iF += this.f21707e1;
                }
                iE = iMax2;
                i24 = 0;
                i22 = iL1;
                dVar8 = dVar16;
            }
            i23 = i12 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void Z1(e[] eVarArr, int i7, int i8, int i9, int[] iArr) {
        a aVar;
        if (i7 == 0) {
            return;
        }
        if (this.l1.size() == 0) {
            aVar = new a(i8, this.f21595H, this.f21596I, this.f21597J, this.f21598K, i9);
            this.l1.add(aVar);
        } else {
            a aVar2 = this.l1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i8, this.f21595H, this.f21596I, this.f21597J, this.f21598K, k1(), m1(), l1(), j1(), i9);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            aVar.b(eVarArr[i10]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void a2(float f7) {
        this.f21703a1 = f7;
    }

    public void b2(int i7) {
        this.U0 = i7;
    }

    public void c2(float f7) {
        this.f21704b1 = f7;
    }

    public void d2(int i7) {
        this.V0 = i7;
    }

    public void e2(int i7) {
        this.f21709g1 = i7;
    }

    public void f2(float f7) {
        this.f21701Y0 = f7;
    }

    @Override
    public void g(C2510d c2510d, boolean z7) {
        super.g(c2510d, z7);
        boolean zC1 = K() != null ? ((f) K()).C1() : false;
        int i7 = this.f21711i1;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = this.l1.size();
                int i8 = 0;
                while (i8 < size) {
                    this.l1.get(i8).d(zC1, i8, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 == 2) {
                U1(zC1);
            }
        } else if (this.l1.size() > 0) {
            this.l1.get(0).d(zC1, 0, true);
        }
        r1(false);
    }

    public void g2(int i7) {
        this.f21707e1 = i7;
    }

    public void h2(int i7) {
        this.f21698S0 = i7;
    }

    public void i2(float f7) {
        this.f21705c1 = f7;
    }

    public void j2(int i7) {
        this.f21699W0 = i7;
    }

    public void k2(float f7) {
        this.f21706d1 = f7;
    }

    public void l2(int i7) {
        this.f21700X0 = i7;
    }

    public void m2(int i7) {
        this.f21712j1 = i7;
    }

    @Override
    public void n1(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int[] iArr;
        boolean z7;
        if (this.f21740E0 > 0 && !p1()) {
            s1(0, 0);
            r1(false);
            return;
        }
        int iK1 = k1();
        int iL1 = l1();
        int iM1 = m1();
        int iJ1 = j1();
        int[] iArr2 = new int[2];
        int i13 = (i8 - iK1) - iL1;
        int i14 = this.k1;
        if (i14 == 1) {
            i13 = (i10 - iM1) - iJ1;
        }
        int i15 = i13;
        if (i14 == 0) {
            if (this.f21698S0 == -1) {
                this.f21698S0 = 0;
            }
            if (this.T0 == -1) {
                this.T0 = 0;
            }
        } else {
            if (this.f21698S0 == -1) {
                this.f21698S0 = 0;
            }
            if (this.T0 == -1) {
                this.T0 = 0;
            }
        }
        e[] eVarArr = this.f21739D0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i11 = this.f21740E0;
            if (i16 >= i11) {
                break;
            }
            if (this.f21739D0[i16].S() == 8) {
                i17++;
            }
            i16++;
        }
        if (i17 > 0) {
            eVarArr = new e[i11 - i17];
            int i18 = 0;
            for (int i19 = 0; i19 < this.f21740E0; i19++) {
                e eVar = this.f21739D0[i19];
                if (eVar.S() != 8) {
                    eVarArr[i18] = eVar;
                    i18++;
                }
            }
            i12 = i18;
        } else {
            i12 = i11;
        }
        this.p1 = eVarArr;
        this.q1 = i12;
        int i20 = this.f21711i1;
        if (i20 == 0) {
            iArr = iArr2;
            z7 = true;
            Z1(eVarArr, i12, this.k1, i15, iArr2);
        } else if (i20 == 1) {
            z7 = true;
            iArr = iArr2;
            Y1(eVarArr, i12, this.k1, i15, iArr2);
        } else if (i20 != 2) {
            z7 = true;
            iArr = iArr2;
        } else {
            z7 = true;
            iArr = iArr2;
            X1(eVarArr, i12, this.k1, i15, iArr2);
        }
        int iMin = iArr[0] + iK1 + iL1;
        int iMin2 = iArr[z7 ? 1 : 0] + iM1 + iJ1;
        if (i7 == 1073741824) {
            iMin = i8;
        } else if (i7 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i8);
        } else if (i7 != 0) {
            iMin = 0;
        }
        if (i9 == 1073741824) {
            iMin2 = i10;
        } else if (i9 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i10);
        } else if (i9 != 0) {
            iMin2 = 0;
        }
        s1(iMin, iMin2);
        X0(iMin);
        y0(iMin2);
        if (this.f21740E0 <= 0) {
            z7 = false;
        }
        r1(z7);
    }

    public void n2(int i7) {
        this.k1 = i7;
    }

    public void o2(int i7) {
        this.f21710h1 = i7;
    }

    public void p2(float f7) {
        this.f21702Z0 = f7;
    }

    public void q2(int i7) {
        this.f21708f1 = i7;
    }

    public void r2(int i7) {
        this.T0 = i7;
    }

    public void s2(int i7) {
        this.f21711i1 = i7;
    }
}
