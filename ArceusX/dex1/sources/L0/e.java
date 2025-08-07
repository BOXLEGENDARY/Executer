package l0;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k0.C2509c;
import k0.C2510d;
import l0.d;
import m0.C2559c;
import m0.n;
import m0.p;

public class e {

    public static float f21585C0 = 0.5f;

    public int f21587A0;

    public int f21589B0;

    private boolean f21591D;

    public d f21602O;

    public d[] f21603P;

    protected ArrayList<d> f21604Q;

    private boolean[] f21605R;

    public b[] f21606S;

    public e f21607T;

    int f21608U;

    int f21609V;

    public float f21610W;

    protected int f21611X;

    protected int f21612Y;

    protected int f21613Z;

    int f21615a0;

    int f21617b0;

    public C2559c f21618c;

    protected int f21619c0;

    public C2559c f21620d;

    protected int f21621d0;

    int f21623e0;

    protected int f21625f0;

    protected int f21627g0;

    float f21629h0;

    float f21631i0;

    private Object f21633j0;

    private int f21635k0;

    private int f21637l0;

    private String f21639m0;

    private String f21641n0;

    boolean f21643o0;

    boolean f21645p0;

    boolean f21647q0;

    int f21649r0;

    int f21651s0;

    boolean f21653t0;

    boolean f21655u0;

    public float[] f21657v0;

    protected e[] f21659w0;

    protected e[] f21661x0;

    e f21663y0;

    e f21665z0;

    public boolean f21614a = false;

    public p[] f21616b = new p[2];

    public m0.l f21622e = null;

    public n f21624f = null;

    public boolean[] f21626g = {true, true};

    boolean f21628h = false;

    private boolean f21630i = true;

    private boolean f21632j = false;

    private boolean f21634k = true;

    private boolean f21636l = false;

    private boolean f21638m = false;

    public int f21640n = -1;

    public int f21642o = -1;

    public int f21644p = 0;

    public int f21646q = 0;

    public int[] f21648r = new int[2];

    public int f21650s = 0;

    public int f21652t = 0;

    public float f21654u = 1.0f;

    public int f21656v = 0;

    public int f21658w = 0;

    public float f21660x = 1.0f;

    int f21662y = -1;

    float f21664z = 1.0f;

    private int[] f21586A = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    private float f21588B = 0.0f;

    private boolean f21590C = false;

    private boolean f21592E = false;

    private int f21593F = 0;

    private int f21594G = 0;

    public d f21595H = new d(this, d.b.LEFT);

    public d f21596I = new d(this, d.b.TOP);

    public d f21597J = new d(this, d.b.RIGHT);

    public d f21598K = new d(this, d.b.BOTTOM);

    public d f21599L = new d(this, d.b.BASELINE);

    d f21600M = new d(this, d.b.CENTER_X);

    d f21601N = new d(this, d.b.CENTER_Y);

    static class a {

        static final int[] f21666a;

        static final int[] f21667b;

        static {
            int[] iArr = new int[b.values().length];
            f21667b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21667b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21667b[b.f21671v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21667b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f21666a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21666a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21666a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21666a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21666a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21666a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21666a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21666a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21666a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        f21671v
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f21602O = dVar;
        this.f21603P = new d[]{this.f21595H, this.f21597J, this.f21596I, this.f21598K, this.f21599L, dVar};
        this.f21604Q = new ArrayList<>();
        this.f21605R = new boolean[2];
        b bVar = b.FIXED;
        this.f21606S = new b[]{bVar, bVar};
        this.f21607T = null;
        this.f21608U = 0;
        this.f21609V = 0;
        this.f21610W = 0.0f;
        this.f21611X = -1;
        this.f21612Y = 0;
        this.f21613Z = 0;
        this.f21615a0 = 0;
        this.f21617b0 = 0;
        this.f21619c0 = 0;
        this.f21621d0 = 0;
        this.f21623e0 = 0;
        float f7 = f21585C0;
        this.f21629h0 = f7;
        this.f21631i0 = f7;
        this.f21635k0 = 0;
        this.f21637l0 = 0;
        this.f21639m0 = null;
        this.f21641n0 = null;
        this.f21647q0 = false;
        this.f21649r0 = 0;
        this.f21651s0 = 0;
        this.f21657v0 = new float[]{-1.0f, -1.0f};
        this.f21659w0 = new e[]{null, null};
        this.f21661x0 = new e[]{null, null};
        this.f21663y0 = null;
        this.f21665z0 = null;
        this.f21587A0 = -1;
        this.f21589B0 = -1;
        d();
    }

    private boolean a0(int i7) {
        d dVar;
        d dVar2;
        int i8 = i7 * 2;
        d[] dVarArr = this.f21603P;
        d dVar3 = dVarArr[i8];
        d dVar4 = dVar3.f21570f;
        return (dVar4 == null || dVar4.f21570f == dVar3 || (dVar2 = (dVar = dVarArr[i8 + 1]).f21570f) == null || dVar2.f21570f != dVar) ? false : true;
    }

    private void d() {
        this.f21604Q.add(this.f21595H);
        this.f21604Q.add(this.f21596I);
        this.f21604Q.add(this.f21597J);
        this.f21604Q.add(this.f21598K);
        this.f21604Q.add(this.f21600M);
        this.f21604Q.add(this.f21601N);
        this.f21604Q.add(this.f21602O);
        this.f21604Q.add(this.f21599L);
    }

    private void i(k0.C2510d r32, boolean r33, boolean r34, boolean r35, boolean r36, k0.i r37, k0.i r38, l0.e.b r39, boolean r40, l0.d r41, l0.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        throw new UnsupportedOperationException("Method not decompiled: l0.e.i(k0.d, boolean, boolean, boolean, boolean, k0.i, k0.i, l0.e$b, boolean, l0.d, l0.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public b A() {
        return this.f21606S[0];
    }

    public void A0(int i7) {
        this.f21649r0 = i7;
    }

    public int B() {
        d dVar = this.f21595H;
        int i7 = dVar != null ? dVar.f21571g : 0;
        d dVar2 = this.f21597J;
        return dVar2 != null ? i7 + dVar2.f21571g : i7;
    }

    public void B0(int i7, int i8) {
        this.f21612Y = i7;
        int i9 = i8 - i7;
        this.f21608U = i9;
        int i10 = this.f21625f0;
        if (i9 < i10) {
            this.f21608U = i10;
        }
    }

    public int C() {
        return this.f21593F;
    }

    public void C0(b bVar) {
        this.f21606S[0] = bVar;
    }

    public int D() {
        return this.f21594G;
    }

    public void D0(int i7, int i8, int i9, float f7) {
        this.f21644p = i7;
        this.f21650s = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.f21652t = i9;
        this.f21654u = f7;
        if (f7 <= 0.0f || f7 >= 1.0f || i7 != 0) {
            return;
        }
        this.f21644p = 2;
    }

    public int E(int i7) {
        if (i7 == 0) {
            return T();
        }
        if (i7 == 1) {
            return x();
        }
        return 0;
    }

    public void E0(float f7) {
        this.f21657v0[0] = f7;
    }

    public int F() {
        return this.f21586A[1];
    }

    protected void F0(int i7, boolean z7) {
        this.f21605R[i7] = z7;
    }

    public int G() {
        return this.f21586A[0];
    }

    public void G0(boolean z7) {
        this.f21591D = z7;
    }

    public int H() {
        return this.f21627g0;
    }

    public void H0(boolean z7) {
        this.f21592E = z7;
    }

    public int I() {
        return this.f21625f0;
    }

    public void I0(int i7, int i8) {
        this.f21593F = i7;
        this.f21594G = i8;
        L0(false);
    }

    public e J(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.f21598K).f21570f) != null && dVar2.f21570f == dVar) {
                return dVar2.f21568d;
            }
            return null;
        }
        d dVar3 = this.f21597J;
        d dVar4 = dVar3.f21570f;
        if (dVar4 == null || dVar4.f21570f != dVar3) {
            return null;
        }
        return dVar4.f21568d;
    }

    public void J0(int i7) {
        this.f21586A[1] = i7;
    }

    public e K() {
        return this.f21607T;
    }

    public void K0(int i7) {
        this.f21586A[0] = i7;
    }

    public e L(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.f21596I).f21570f) != null && dVar2.f21570f == dVar) {
                return dVar2.f21568d;
            }
            return null;
        }
        d dVar3 = this.f21595H;
        d dVar4 = dVar3.f21570f;
        if (dVar4 == null || dVar4.f21570f != dVar3) {
            return null;
        }
        return dVar4.f21568d;
    }

    public void L0(boolean z7) {
        this.f21630i = z7;
    }

    public int M() {
        return U() + this.f21608U;
    }

    public void M0(int i7) {
        if (i7 < 0) {
            this.f21627g0 = 0;
        } else {
            this.f21627g0 = i7;
        }
    }

    public p N(int i7) {
        if (i7 == 0) {
            return this.f21622e;
        }
        if (i7 == 1) {
            return this.f21624f;
        }
        return null;
    }

    public void N0(int i7) {
        if (i7 < 0) {
            this.f21625f0 = 0;
        } else {
            this.f21625f0 = i7;
        }
    }

    public float O() {
        return this.f21631i0;
    }

    public void O0(int i7, int i8) {
        this.f21612Y = i7;
        this.f21613Z = i8;
    }

    public int P() {
        return this.f21651s0;
    }

    public void P0(e eVar) {
        this.f21607T = eVar;
    }

    public b Q() {
        return this.f21606S[1];
    }

    public void Q0(float f7) {
        this.f21631i0 = f7;
    }

    public int R() {
        int i7 = this.f21595H != null ? this.f21596I.f21571g : 0;
        return this.f21597J != null ? i7 + this.f21598K.f21571g : i7;
    }

    public void R0(int i7) {
        this.f21651s0 = i7;
    }

    public int S() {
        return this.f21637l0;
    }

    public void S0(int i7, int i8) {
        this.f21613Z = i7;
        int i9 = i8 - i7;
        this.f21609V = i9;
        int i10 = this.f21627g0;
        if (i9 < i10) {
            this.f21609V = i10;
        }
    }

    public int T() {
        if (this.f21637l0 == 8) {
            return 0;
        }
        return this.f21608U;
    }

    public void T0(b bVar) {
        this.f21606S[1] = bVar;
    }

    public int U() {
        e eVar = this.f21607T;
        return (eVar == null || !(eVar instanceof f)) ? this.f21612Y : ((f) eVar).f21678J0 + this.f21612Y;
    }

    public void U0(int i7, int i8, int i9, float f7) {
        this.f21646q = i7;
        this.f21656v = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.f21658w = i9;
        this.f21660x = f7;
        if (f7 <= 0.0f || f7 >= 1.0f || i7 != 0) {
            return;
        }
        this.f21646q = 2;
    }

    public int V() {
        e eVar = this.f21607T;
        return (eVar == null || !(eVar instanceof f)) ? this.f21613Z : ((f) eVar).f21679K0 + this.f21613Z;
    }

    public void V0(float f7) {
        this.f21657v0[1] = f7;
    }

    public boolean W() {
        return this.f21590C;
    }

    public void W0(int i7) {
        this.f21637l0 = i7;
    }

    public boolean X(int i7) {
        if (i7 == 0) {
            return (this.f21595H.f21570f != null ? 1 : 0) + (this.f21597J.f21570f != null ? 1 : 0) < 2;
        }
        return ((this.f21596I.f21570f != null ? 1 : 0) + (this.f21598K.f21570f != null ? 1 : 0)) + (this.f21599L.f21570f != null ? 1 : 0) < 2;
    }

    public void X0(int i7) {
        this.f21608U = i7;
        int i8 = this.f21625f0;
        if (i7 < i8) {
            this.f21608U = i8;
        }
    }

    public boolean Y() {
        int size = this.f21604Q.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f21604Q.get(i7).m()) {
                return true;
            }
        }
        return false;
    }

    public void Y0(int i7) {
        this.f21612Y = i7;
    }

    public void Z(d.b bVar, e eVar, d.b bVar2, int i7, int i8) {
        o(bVar).b(eVar.o(bVar2), i7, i8, true);
    }

    public void Z0(int i7) {
        this.f21613Z = i7;
    }

    public void a1(boolean z7, boolean z8, boolean z9, boolean z10) {
        if (this.f21662y == -1) {
            if (z9 && !z10) {
                this.f21662y = 0;
            } else if (!z9 && z10) {
                this.f21662y = 1;
                if (this.f21611X == -1) {
                    this.f21664z = 1.0f / this.f21664z;
                }
            }
        }
        if (this.f21662y == 0 && (!this.f21596I.o() || !this.f21598K.o())) {
            this.f21662y = 1;
        } else if (this.f21662y == 1 && (!this.f21595H.o() || !this.f21597J.o())) {
            this.f21662y = 0;
        }
        if (this.f21662y == -1 && (!this.f21596I.o() || !this.f21598K.o() || !this.f21595H.o() || !this.f21597J.o())) {
            if (this.f21596I.o() && this.f21598K.o()) {
                this.f21662y = 0;
            } else if (this.f21595H.o() && this.f21597J.o()) {
                this.f21664z = 1.0f / this.f21664z;
                this.f21662y = 1;
            }
        }
        if (this.f21662y == -1) {
            int i7 = this.f21650s;
            if (i7 > 0 && this.f21656v == 0) {
                this.f21662y = 0;
            } else {
                if (i7 != 0 || this.f21656v <= 0) {
                    return;
                }
                this.f21664z = 1.0f / this.f21664z;
                this.f21662y = 1;
            }
        }
    }

    public boolean b0() {
        d dVar = this.f21595H;
        d dVar2 = dVar.f21570f;
        if (dVar2 != null && dVar2.f21570f == dVar) {
            return true;
        }
        d dVar3 = this.f21597J;
        d dVar4 = dVar3.f21570f;
        return dVar4 != null && dVar4.f21570f == dVar3;
    }

    public void b1(boolean z7, boolean z8) {
        int i7;
        int i8;
        boolean zK = z7 & this.f21622e.k();
        boolean zK2 = z8 & this.f21624f.k();
        m0.l lVar = this.f21622e;
        int i9 = lVar.f21976h.f21924g;
        n nVar = this.f21624f;
        int i10 = nVar.f21976h.f21924g;
        int i11 = lVar.f21977i.f21924g;
        int i12 = nVar.f21977i.f21924g;
        int i13 = i12 - i10;
        if (i11 - i9 < 0 || i13 < 0 || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            i11 = 0;
            i9 = 0;
            i12 = 0;
            i10 = 0;
        }
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        if (zK) {
            this.f21612Y = i9;
        }
        if (zK2) {
            this.f21613Z = i10;
        }
        if (this.f21637l0 == 8) {
            this.f21608U = 0;
            this.f21609V = 0;
            return;
        }
        if (zK) {
            if (this.f21606S[0] == b.FIXED && i14 < (i8 = this.f21608U)) {
                i14 = i8;
            }
            this.f21608U = i14;
            int i16 = this.f21625f0;
            if (i14 < i16) {
                this.f21608U = i16;
            }
        }
        if (zK2) {
            if (this.f21606S[1] == b.FIXED && i15 < (i7 = this.f21609V)) {
                i15 = i7;
            }
            this.f21609V = i15;
            int i17 = this.f21627g0;
            if (i15 < i17) {
                this.f21609V = i17;
            }
        }
    }

    public boolean c0() {
        return this.f21591D;
    }

    public void c1(C2510d c2510d, boolean z7) {
        n nVar;
        m0.l lVar;
        int iY = c2510d.y(this.f21595H);
        int iY2 = c2510d.y(this.f21596I);
        int iY3 = c2510d.y(this.f21597J);
        int iY4 = c2510d.y(this.f21598K);
        if (z7 && (lVar = this.f21622e) != null) {
            m0.f fVar = lVar.f21976h;
            if (fVar.f21927j) {
                m0.f fVar2 = lVar.f21977i;
                if (fVar2.f21927j) {
                    iY = fVar.f21924g;
                    iY3 = fVar2.f21924g;
                }
            }
        }
        if (z7 && (nVar = this.f21624f) != null) {
            m0.f fVar3 = nVar.f21976h;
            if (fVar3.f21927j) {
                m0.f fVar4 = nVar.f21977i;
                if (fVar4.f21927j) {
                    iY2 = fVar3.f21924g;
                    iY4 = fVar4.f21924g;
                }
            }
        }
        int i7 = iY4 - iY2;
        if (iY3 - iY < 0 || i7 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        w0(iY, iY2, iY3, iY4);
    }

    public boolean d0() {
        d dVar = this.f21596I;
        d dVar2 = dVar.f21570f;
        if (dVar2 != null && dVar2.f21570f == dVar) {
            return true;
        }
        d dVar3 = this.f21598K;
        d dVar4 = dVar3.f21570f;
        return dVar4 != null && dVar4.f21570f == dVar3;
    }

    public void e(f fVar, C2510d c2510d, HashSet<e> hashSet, int i7, boolean z7) {
        if (z7) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, c2510d, this);
            hashSet.remove(this);
            g(c2510d, fVar.G1(64));
        }
        if (i7 == 0) {
            HashSet<d> hashSetD = this.f21595H.d();
            if (hashSetD != null) {
                Iterator<d> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().f21568d.e(fVar, c2510d, hashSet, i7, true);
                }
            }
            HashSet<d> hashSetD2 = this.f21597J.d();
            if (hashSetD2 != null) {
                Iterator<d> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().f21568d.e(fVar, c2510d, hashSet, i7, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetD3 = this.f21596I.d();
        if (hashSetD3 != null) {
            Iterator<d> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().f21568d.e(fVar, c2510d, hashSet, i7, true);
            }
        }
        HashSet<d> hashSetD4 = this.f21598K.d();
        if (hashSetD4 != null) {
            Iterator<d> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().f21568d.e(fVar, c2510d, hashSet, i7, true);
            }
        }
        HashSet<d> hashSetD5 = this.f21599L.d();
        if (hashSetD5 != null) {
            Iterator<d> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().f21568d.e(fVar, c2510d, hashSet, i7, true);
            }
        }
    }

    public boolean e0() {
        return this.f21592E;
    }

    boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public boolean f0() {
        return this.f21630i && this.f21637l0 != 8;
    }

    public void g(k0.C2510d r54, boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: l0.e.g(k0.d, boolean):void");
    }

    public boolean g0() {
        return this.f21636l || (this.f21595H.n() && this.f21597J.n());
    }

    public boolean h() {
        return this.f21637l0 != 8;
    }

    public boolean h0() {
        return this.f21638m || (this.f21596I.n() && this.f21598K.n());
    }

    public boolean i0() {
        b[] bVarArr = this.f21606S;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void j(d.b bVar, e eVar, d.b bVar2, int i7) {
        d.b bVar3;
        d.b bVar4;
        boolean z7;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                d.b bVar6 = d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == d.b.RIGHT) {
                    j(bVar6, eVar, bVar2, 0);
                    j(d.b.RIGHT, eVar, bVar2, 0);
                    o(bVar5).a(eVar.o(bVar2), 0);
                    return;
                }
                d.b bVar7 = d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == d.b.BOTTOM) {
                    j(bVar7, eVar, bVar2, 0);
                    j(d.b.BOTTOM, eVar, bVar2, 0);
                    o(bVar5).a(eVar.o(bVar2), 0);
                    return;
                }
                return;
            }
            d.b bVar8 = d.b.LEFT;
            d dVarO = o(bVar8);
            d.b bVar9 = d.b.RIGHT;
            d dVarO2 = o(bVar9);
            d.b bVar10 = d.b.TOP;
            d dVarO3 = o(bVar10);
            d.b bVar11 = d.b.BOTTOM;
            d dVarO4 = o(bVar11);
            boolean z8 = true;
            if ((dVarO == null || !dVarO.o()) && (dVarO2 == null || !dVarO2.o())) {
                j(bVar8, eVar, bVar8, 0);
                j(bVar9, eVar, bVar9, 0);
                z7 = true;
            } else {
                z7 = false;
            }
            if ((dVarO3 == null || !dVarO3.o()) && (dVarO4 == null || !dVarO4.o())) {
                j(bVar10, eVar, bVar10, 0);
                j(bVar11, eVar, bVar11, 0);
            } else {
                z8 = false;
            }
            if (z7 && z8) {
                o(bVar5).a(eVar.o(bVar5), 0);
                return;
            }
            if (z7) {
                d.b bVar12 = d.b.CENTER_X;
                o(bVar12).a(eVar.o(bVar12), 0);
                return;
            } else {
                if (z8) {
                    d.b bVar13 = d.b.CENTER_Y;
                    o(bVar13).a(eVar.o(bVar13), 0);
                    return;
                }
                return;
            }
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d dVarO5 = o(bVar4);
            d dVarO6 = eVar.o(bVar2);
            d dVarO7 = o(d.b.RIGHT);
            dVarO5.a(dVarO6, 0);
            dVarO7.a(dVarO6, 0);
            o(bVar14).a(dVarO6, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d dVarO8 = eVar.o(bVar2);
            o(bVar3).a(dVarO8, 0);
            o(d.b.BOTTOM).a(dVarO8, 0);
            o(bVar15).a(dVarO8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            o(bVar16).a(eVar.o(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            o(bVar17).a(eVar.o(bVar17), 0);
            o(bVar14).a(eVar.o(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            o(bVar18).a(eVar.o(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            o(bVar19).a(eVar.o(bVar19), 0);
            o(bVar15).a(eVar.o(bVar2), 0);
            return;
        }
        d dVarO9 = o(bVar);
        d dVarO10 = eVar.o(bVar2);
        if (dVarO9.p(dVarO10)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d dVarO11 = o(d.b.TOP);
                d dVarO12 = o(d.b.BOTTOM);
                if (dVarO11 != null) {
                    dVarO11.q();
                }
                if (dVarO12 != null) {
                    dVarO12.q();
                }
                i7 = 0;
            } else if (bVar == d.b.TOP || bVar == d.b.BOTTOM) {
                d dVarO13 = o(bVar20);
                if (dVarO13 != null) {
                    dVarO13.q();
                }
                d dVarO14 = o(bVar5);
                if (dVarO14.j() != dVarO10) {
                    dVarO14.q();
                }
                d dVarG = o(bVar).g();
                d dVarO15 = o(bVar15);
                if (dVarO15.o()) {
                    dVarG.q();
                    dVarO15.q();
                }
            } else if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                d dVarO16 = o(bVar5);
                if (dVarO16.j() != dVarO10) {
                    dVarO16.q();
                }
                d dVarG2 = o(bVar).g();
                d dVarO17 = o(bVar14);
                if (dVarO17.o()) {
                    dVarG2.q();
                    dVarO17.q();
                }
            }
            dVarO9.a(dVarO10, i7);
        }
    }

    public void j0() {
        this.f21595H.q();
        this.f21596I.q();
        this.f21597J.q();
        this.f21598K.q();
        this.f21599L.q();
        this.f21600M.q();
        this.f21601N.q();
        this.f21602O.q();
        this.f21607T = null;
        this.f21588B = 0.0f;
        this.f21608U = 0;
        this.f21609V = 0;
        this.f21610W = 0.0f;
        this.f21611X = -1;
        this.f21612Y = 0;
        this.f21613Z = 0;
        this.f21619c0 = 0;
        this.f21621d0 = 0;
        this.f21623e0 = 0;
        this.f21625f0 = 0;
        this.f21627g0 = 0;
        float f7 = f21585C0;
        this.f21629h0 = f7;
        this.f21631i0 = f7;
        b[] bVarArr = this.f21606S;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f21633j0 = null;
        this.f21635k0 = 0;
        this.f21637l0 = 0;
        this.f21641n0 = null;
        this.f21643o0 = false;
        this.f21645p0 = false;
        this.f21649r0 = 0;
        this.f21651s0 = 0;
        this.f21653t0 = false;
        this.f21655u0 = false;
        float[] fArr = this.f21657v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f21640n = -1;
        this.f21642o = -1;
        int[] iArr = this.f21586A;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f21644p = 0;
        this.f21646q = 0;
        this.f21654u = 1.0f;
        this.f21660x = 1.0f;
        this.f21652t = Integer.MAX_VALUE;
        this.f21658w = Integer.MAX_VALUE;
        this.f21650s = 0;
        this.f21656v = 0;
        this.f21628h = false;
        this.f21662y = -1;
        this.f21664z = 1.0f;
        this.f21647q0 = false;
        boolean[] zArr = this.f21626g;
        zArr[0] = true;
        zArr[1] = true;
        this.f21592E = false;
        boolean[] zArr2 = this.f21605R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f21630i = true;
    }

    public void k(d dVar, d dVar2, int i7) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i7);
        }
    }

    public void k0() {
        e eVarK = K();
        if (eVarK != null && (eVarK instanceof f) && ((f) K()).y1()) {
            return;
        }
        int size = this.f21604Q.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f21604Q.get(i7).q();
        }
    }

    public void l(e eVar, float f7, int i7) {
        d.b bVar = d.b.CENTER;
        Z(bVar, eVar, bVar, i7, 0);
        this.f21588B = f7;
    }

    public void l0() {
        this.f21636l = false;
        this.f21638m = false;
        int size = this.f21604Q.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f21604Q.get(i7).r();
        }
    }

    public void m(C2510d c2510d) {
        c2510d.q(this.f21595H);
        c2510d.q(this.f21596I);
        c2510d.q(this.f21597J);
        c2510d.q(this.f21598K);
        if (this.f21623e0 > 0) {
            c2510d.q(this.f21599L);
        }
    }

    public void m0(C2509c c2509c) {
        this.f21595H.s(c2509c);
        this.f21596I.s(c2509c);
        this.f21597J.s(c2509c);
        this.f21598K.s(c2509c);
        this.f21599L.s(c2509c);
        this.f21602O.s(c2509c);
        this.f21600M.s(c2509c);
        this.f21601N.s(c2509c);
    }

    public void n() {
        if (this.f21622e == null) {
            this.f21622e = new m0.l(this);
        }
        if (this.f21624f == null) {
            this.f21624f = new n(this);
        }
    }

    public void n0(int i7) {
        this.f21623e0 = i7;
        this.f21590C = i7 > 0;
    }

    public d o(d.b bVar) {
        switch (a.f21666a[bVar.ordinal()]) {
            case 1:
                return this.f21595H;
            case 2:
                return this.f21596I;
            case 3:
                return this.f21597J;
            case 4:
                return this.f21598K;
            case 5:
                return this.f21599L;
            case 6:
                return this.f21602O;
            case 7:
                return this.f21600M;
            case 8:
                return this.f21601N;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void o0(Object obj) {
        this.f21633j0 = obj;
    }

    public int p() {
        return this.f21623e0;
    }

    public void p0(String str) {
        this.f21639m0 = str;
    }

    public float q(int i7) {
        if (i7 == 0) {
            return this.f21629h0;
        }
        if (i7 == 1) {
            return this.f21631i0;
        }
        return -1.0f;
    }

    public void q0(java.lang.String r9) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: l0.e.q0(java.lang.String):void");
    }

    public int r() {
        return V() + this.f21609V;
    }

    public void r0(int i7) {
        if (this.f21590C) {
            int i8 = i7 - this.f21623e0;
            int i9 = this.f21609V + i8;
            this.f21613Z = i8;
            this.f21596I.t(i8);
            this.f21598K.t(i9);
            this.f21599L.t(i7);
            this.f21638m = true;
        }
    }

    public Object s() {
        return this.f21633j0;
    }

    public void s0(int i7, int i8) {
        this.f21595H.t(i7);
        this.f21597J.t(i8);
        this.f21612Y = i7;
        this.f21608U = i8 - i7;
        this.f21636l = true;
    }

    public String t() {
        return this.f21639m0;
    }

    public void t0(int i7) {
        this.f21595H.t(i7);
        this.f21612Y = i7;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f21641n0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.f21641n0 + " ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        if (this.f21639m0 != null) {
            str3 = "id: " + this.f21639m0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f21612Y);
        sb.append(", ");
        sb.append(this.f21613Z);
        sb.append(") - (");
        sb.append(this.f21608U);
        sb.append(" x ");
        sb.append(this.f21609V);
        sb.append(")");
        return sb.toString();
    }

    public b u(int i7) {
        if (i7 == 0) {
            return A();
        }
        if (i7 == 1) {
            return Q();
        }
        return null;
    }

    public void u0(int i7) {
        this.f21596I.t(i7);
        this.f21613Z = i7;
    }

    public float v() {
        return this.f21610W;
    }

    public void v0(int i7, int i8) {
        this.f21596I.t(i7);
        this.f21598K.t(i8);
        this.f21613Z = i7;
        this.f21609V = i8 - i7;
        if (this.f21590C) {
            this.f21599L.t(i7 + this.f21623e0);
        }
        this.f21638m = true;
    }

    public int w() {
        return this.f21611X;
    }

    public void w0(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = i9 - i7;
        int i14 = i10 - i8;
        this.f21612Y = i7;
        this.f21613Z = i8;
        if (this.f21637l0 == 8) {
            this.f21608U = 0;
            this.f21609V = 0;
            return;
        }
        b[] bVarArr = this.f21606S;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i13 < (i12 = this.f21608U)) {
            i13 = i12;
        }
        if (bVarArr[1] == bVar2 && i14 < (i11 = this.f21609V)) {
            i14 = i11;
        }
        this.f21608U = i13;
        this.f21609V = i14;
        int i15 = this.f21627g0;
        if (i14 < i15) {
            this.f21609V = i15;
        }
        int i16 = this.f21625f0;
        if (i13 < i16) {
            this.f21608U = i16;
        }
    }

    public int x() {
        if (this.f21637l0 == 8) {
            return 0;
        }
        return this.f21609V;
    }

    public void x0(boolean z7) {
        this.f21590C = z7;
    }

    public float y() {
        return this.f21629h0;
    }

    public void y0(int i7) {
        this.f21609V = i7;
        int i8 = this.f21627g0;
        if (i7 < i8) {
            this.f21609V = i8;
        }
    }

    public int z() {
        return this.f21649r0;
    }

    public void z0(float f7) {
        this.f21629h0 = f7;
    }
}
