package l0;

import k0.C2510d;
import l0.d;
import l0.e;

public class h extends e {

    protected float f21731D0 = -1.0f;

    protected int f21732E0 = -1;

    protected int f21733F0 = -1;

    private d f21734G0 = this.f21596I;

    private int f21735H0 = 0;

    private int f21736I0 = 0;

    private boolean f21737J0;

    static class a {

        static final int[] f21738a;

        static {
            int[] iArr = new int[d.b.values().length];
            f21738a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21738a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21738a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21738a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21738a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21738a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21738a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21738a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21738a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f21604Q.clear();
        this.f21604Q.add(this.f21734G0);
        int length = this.f21603P.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f21603P[i7] = this.f21734G0;
        }
    }

    @Override
    public void c1(C2510d c2510d, boolean z7) {
        if (K() == null) {
            return;
        }
        int iY = c2510d.y(this.f21734G0);
        if (this.f21735H0 == 1) {
            Y0(iY);
            Z0(0);
            y0(K().x());
            X0(0);
            return;
        }
        Y0(0);
        Z0(iY);
        X0(K().T());
        y0(0);
    }

    public d d1() {
        return this.f21734G0;
    }

    public int e1() {
        return this.f21735H0;
    }

    public int f1() {
        return this.f21732E0;
    }

    @Override
    public void g(C2510d c2510d, boolean z7) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d dVarO = fVar.o(d.b.LEFT);
        d dVarO2 = fVar.o(d.b.RIGHT);
        e eVar = this.f21607T;
        boolean z8 = eVar != null && eVar.f21606S[0] == e.b.WRAP_CONTENT;
        if (this.f21735H0 == 0) {
            dVarO = fVar.o(d.b.TOP);
            dVarO2 = fVar.o(d.b.BOTTOM);
            e eVar2 = this.f21607T;
            z8 = eVar2 != null && eVar2.f21606S[1] == e.b.WRAP_CONTENT;
        }
        if (this.f21737J0 && this.f21734G0.n()) {
            k0.i iVarQ = c2510d.q(this.f21734G0);
            c2510d.f(iVarQ, this.f21734G0.e());
            if (this.f21732E0 != -1) {
                if (z8) {
                    c2510d.h(c2510d.q(dVarO2), iVarQ, 0, 5);
                }
            } else if (this.f21733F0 != -1 && z8) {
                k0.i iVarQ2 = c2510d.q(dVarO2);
                c2510d.h(iVarQ, c2510d.q(dVarO), 0, 5);
                c2510d.h(iVarQ2, iVarQ, 0, 5);
            }
            this.f21737J0 = false;
            return;
        }
        if (this.f21732E0 != -1) {
            k0.i iVarQ3 = c2510d.q(this.f21734G0);
            c2510d.e(iVarQ3, c2510d.q(dVarO), this.f21732E0, 8);
            if (z8) {
                c2510d.h(c2510d.q(dVarO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.f21733F0 == -1) {
            if (this.f21731D0 != -1.0f) {
                c2510d.d(C2510d.s(c2510d, c2510d.q(this.f21734G0), c2510d.q(dVarO2), this.f21731D0));
                return;
            }
            return;
        }
        k0.i iVarQ4 = c2510d.q(this.f21734G0);
        k0.i iVarQ5 = c2510d.q(dVarO2);
        c2510d.e(iVarQ4, iVarQ5, -this.f21733F0, 8);
        if (z8) {
            c2510d.h(iVarQ4, c2510d.q(dVarO), 0, 5);
            c2510d.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override
    public boolean g0() {
        return this.f21737J0;
    }

    public int g1() {
        return this.f21733F0;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h0() {
        return this.f21737J0;
    }

    public float h1() {
        return this.f21731D0;
    }

    public void i1(int i7) {
        this.f21734G0.t(i7);
        this.f21737J0 = true;
    }

    public void j1(int i7) {
        if (i7 > -1) {
            this.f21731D0 = -1.0f;
            this.f21732E0 = i7;
            this.f21733F0 = -1;
        }
    }

    public void k1(int i7) {
        if (i7 > -1) {
            this.f21731D0 = -1.0f;
            this.f21732E0 = -1;
            this.f21733F0 = i7;
        }
    }

    public void l1(float f7) {
        if (f7 > -1.0f) {
            this.f21731D0 = f7;
            this.f21732E0 = -1;
            this.f21733F0 = -1;
        }
    }

    public void m1(int i7) {
        if (this.f21735H0 == i7) {
            return;
        }
        this.f21735H0 = i7;
        this.f21604Q.clear();
        if (this.f21735H0 == 1) {
            this.f21734G0 = this.f21595H;
        } else {
            this.f21734G0 = this.f21596I;
        }
        this.f21604Q.add(this.f21734G0);
        int length = this.f21603P.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f21603P[i8] = this.f21734G0;
        }
    }

    @Override
    public d o(d.b bVar) {
        switch (a.f21738a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f21735H0 == 1) {
                    return this.f21734G0;
                }
                break;
            case 3:
            case 4:
                if (this.f21735H0 == 0) {
                    return this.f21734G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
