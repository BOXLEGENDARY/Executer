package l0;

import k0.C2510d;
import l0.d;
import l0.e;

public class C2525a extends j {

    private int f21539F0 = 0;

    private boolean f21540G0 = true;

    private int f21541H0 = 0;

    boolean f21542I0 = false;

    public boolean f1() {
        int i7;
        int i8;
        int i9;
        boolean z7 = true;
        int i10 = 0;
        while (true) {
            i7 = this.f21740E0;
            if (i10 >= i7) {
                break;
            }
            e eVar = this.f21739D0[i10];
            if ((this.f21540G0 || eVar.h()) && ((((i8 = this.f21539F0) == 0 || i8 == 1) && !eVar.g0()) || (((i9 = this.f21539F0) == 2 || i9 == 3) && !eVar.h0()))) {
                z7 = false;
            }
            i10++;
        }
        if (!z7 || i7 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z8 = false;
        for (int i11 = 0; i11 < this.f21740E0; i11++) {
            e eVar2 = this.f21739D0[i11];
            if (this.f21540G0 || eVar2.h()) {
                if (!z8) {
                    int i12 = this.f21539F0;
                    if (i12 == 0) {
                        iMax = eVar2.o(d.b.LEFT).e();
                    } else if (i12 == 1) {
                        iMax = eVar2.o(d.b.RIGHT).e();
                    } else if (i12 == 2) {
                        iMax = eVar2.o(d.b.TOP).e();
                    } else if (i12 == 3) {
                        iMax = eVar2.o(d.b.BOTTOM).e();
                    }
                    z8 = true;
                }
                int i13 = this.f21539F0;
                if (i13 == 0) {
                    iMax = Math.min(iMax, eVar2.o(d.b.LEFT).e());
                } else if (i13 == 1) {
                    iMax = Math.max(iMax, eVar2.o(d.b.RIGHT).e());
                } else if (i13 == 2) {
                    iMax = Math.min(iMax, eVar2.o(d.b.TOP).e());
                } else if (i13 == 3) {
                    iMax = Math.max(iMax, eVar2.o(d.b.BOTTOM).e());
                }
            }
        }
        int i14 = iMax + this.f21541H0;
        int i15 = this.f21539F0;
        if (i15 == 0 || i15 == 1) {
            s0(i14, i14);
        } else {
            v0(i14, i14);
        }
        this.f21542I0 = true;
        return true;
    }

    @Override
    public void g(C2510d c2510d, boolean z7) {
        d[] dVarArr;
        boolean z8;
        int i7;
        int i8;
        int i9;
        d[] dVarArr2 = this.f21603P;
        dVarArr2[0] = this.f21595H;
        dVarArr2[2] = this.f21596I;
        dVarArr2[1] = this.f21597J;
        dVarArr2[3] = this.f21598K;
        int i10 = 0;
        while (true) {
            dVarArr = this.f21603P;
            if (i10 >= dVarArr.length) {
                break;
            }
            d dVar = dVarArr[i10];
            dVar.f21573i = c2510d.q(dVar);
            i10++;
        }
        int i11 = this.f21539F0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        d dVar2 = dVarArr[i11];
        if (!this.f21542I0) {
            f1();
        }
        if (this.f21542I0) {
            this.f21542I0 = false;
            int i12 = this.f21539F0;
            if (i12 == 0 || i12 == 1) {
                c2510d.f(this.f21595H.f21573i, this.f21612Y);
                c2510d.f(this.f21597J.f21573i, this.f21612Y);
                return;
            } else {
                if (i12 == 2 || i12 == 3) {
                    c2510d.f(this.f21596I.f21573i, this.f21613Z);
                    c2510d.f(this.f21598K.f21573i, this.f21613Z);
                    return;
                }
                return;
            }
        }
        for (int i13 = 0; i13 < this.f21740E0; i13++) {
            e eVar = this.f21739D0[i13];
            if ((this.f21540G0 || eVar.h()) && ((((i8 = this.f21539F0) == 0 || i8 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f21595H.f21570f != null && eVar.f21597J.f21570f != null) || (((i9 = this.f21539F0) == 2 || i9 == 3) && eVar.Q() == e.b.MATCH_CONSTRAINT && eVar.f21596I.f21570f != null && eVar.f21598K.f21570f != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = this.f21595H.l() || this.f21597J.l();
        boolean z10 = this.f21596I.l() || this.f21598K.l();
        int i14 = !(!z8 && (((i7 = this.f21539F0) == 0 && z9) || ((i7 == 2 && z10) || ((i7 == 1 && z9) || (i7 == 3 && z10))))) ? 4 : 5;
        for (int i15 = 0; i15 < this.f21740E0; i15++) {
            e eVar2 = this.f21739D0[i15];
            if (this.f21540G0 || eVar2.h()) {
                k0.i iVarQ = c2510d.q(eVar2.f21603P[this.f21539F0]);
                d[] dVarArr3 = eVar2.f21603P;
                int i16 = this.f21539F0;
                d dVar3 = dVarArr3[i16];
                dVar3.f21573i = iVarQ;
                d dVar4 = dVar3.f21570f;
                int i17 = (dVar4 == null || dVar4.f21568d != this) ? 0 : dVar3.f21571g;
                if (i16 == 0 || i16 == 2) {
                    c2510d.i(dVar2.f21573i, iVarQ, this.f21541H0 - i17, z8);
                } else {
                    c2510d.g(dVar2.f21573i, iVarQ, this.f21541H0 + i17, z8);
                }
                c2510d.e(dVar2.f21573i, iVarQ, this.f21541H0 + i17, i14);
            }
        }
        int i18 = this.f21539F0;
        if (i18 == 0) {
            c2510d.e(this.f21597J.f21573i, this.f21595H.f21573i, 0, 8);
            c2510d.e(this.f21595H.f21573i, this.f21607T.f21597J.f21573i, 0, 4);
            c2510d.e(this.f21595H.f21573i, this.f21607T.f21595H.f21573i, 0, 0);
            return;
        }
        if (i18 == 1) {
            c2510d.e(this.f21595H.f21573i, this.f21597J.f21573i, 0, 8);
            c2510d.e(this.f21595H.f21573i, this.f21607T.f21595H.f21573i, 0, 4);
            c2510d.e(this.f21595H.f21573i, this.f21607T.f21597J.f21573i, 0, 0);
        } else if (i18 == 2) {
            c2510d.e(this.f21598K.f21573i, this.f21596I.f21573i, 0, 8);
            c2510d.e(this.f21596I.f21573i, this.f21607T.f21598K.f21573i, 0, 4);
            c2510d.e(this.f21596I.f21573i, this.f21607T.f21596I.f21573i, 0, 0);
        } else if (i18 == 3) {
            c2510d.e(this.f21596I.f21573i, this.f21598K.f21573i, 0, 8);
            c2510d.e(this.f21596I.f21573i, this.f21607T.f21596I.f21573i, 0, 4);
            c2510d.e(this.f21596I.f21573i, this.f21607T.f21598K.f21573i, 0, 0);
        }
    }

    @Override
    public boolean g0() {
        return this.f21542I0;
    }

    public boolean g1() {
        return this.f21540G0;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h0() {
        return this.f21542I0;
    }

    public int h1() {
        return this.f21539F0;
    }

    public int i1() {
        return this.f21541H0;
    }

    public int j1() {
        int i7 = this.f21539F0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    protected void k1() {
        for (int i7 = 0; i7 < this.f21740E0; i7++) {
            e eVar = this.f21739D0[i7];
            int i8 = this.f21539F0;
            if (i8 == 0 || i8 == 1) {
                eVar.F0(0, true);
            } else if (i8 == 2 || i8 == 3) {
                eVar.F0(1, true);
            }
        }
    }

    public void l1(boolean z7) {
        this.f21540G0 = z7;
    }

    public void m1(int i7) {
        this.f21539F0 = i7;
    }

    public void n1(int i7) {
        this.f21541H0 = i7;
    }

    @Override
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i7 = 0; i7 < this.f21740E0; i7++) {
            e eVar = this.f21739D0[i7];
            if (i7 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }
}
