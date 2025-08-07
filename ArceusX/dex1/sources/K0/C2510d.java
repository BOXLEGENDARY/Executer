package k0;

import java.util.Arrays;
import java.util.HashMap;
import k0.i;
import l0.d;

public class C2510d {

    public static boolean f21179r = false;

    public static boolean f21180s = true;

    public static boolean f21181t = true;

    public static boolean f21182u = true;

    public static boolean f21183v = false;

    private static int f21184w = 1000;

    public static long f21185x;

    public static long f21186y;

    private a f21190d;

    C2508b[] f21193g;

    final C2509c f21200n;

    private a f21203q;

    public boolean f21187a = false;

    int f21188b = 0;

    private HashMap<String, i> f21189c = null;

    private int f21191e = 32;

    private int f21192f = 32;

    public boolean f21194h = false;

    public boolean f21195i = false;

    private boolean[] f21196j = new boolean[32];

    int f21197k = 1;

    int f21198l = 0;

    private int f21199m = 32;

    private i[] f21201o = new i[f21184w];

    private int f21202p = 0;

    interface a {
        i a(C2510d c2510d, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends C2508b {
        public b(C2509c c2509c) {
            this.f21173e = new j(this, c2509c);
        }
    }

    public C2510d() {
        this.f21193g = null;
        this.f21193g = new C2508b[32];
        D();
        C2509c c2509c = new C2509c();
        this.f21200n = c2509c;
        this.f21190d = new C2514h(c2509c);
        if (f21183v) {
            this.f21203q = new b(c2509c);
        } else {
            this.f21203q = new C2508b(c2509c);
        }
    }

    private final int C(a aVar, boolean z7) {
        for (int i7 = 0; i7 < this.f21197k; i7++) {
            this.f21196j[i7] = false;
        }
        boolean z8 = false;
        int i8 = 0;
        while (!z8) {
            i8++;
            if (i8 >= this.f21197k * 2) {
                return i8;
            }
            if (aVar.getKey() != null) {
                this.f21196j[aVar.getKey().f21220c] = true;
            }
            i iVarA = aVar.a(this, this.f21196j);
            if (iVarA != null) {
                boolean[] zArr = this.f21196j;
                int i9 = iVarA.f21220c;
                if (zArr[i9]) {
                    return i8;
                }
                zArr[i9] = true;
            }
            if (iVarA != null) {
                float f7 = Float.MAX_VALUE;
                int i10 = -1;
                for (int i11 = 0; i11 < this.f21198l; i11++) {
                    C2508b c2508b = this.f21193g[i11];
                    if (c2508b.f21169a.f21227j != i.a.UNRESTRICTED && !c2508b.f21174f && c2508b.t(iVarA)) {
                        float fI = c2508b.f21173e.i(iVarA);
                        if (fI < 0.0f) {
                            float f8 = (-c2508b.f21170b) / fI;
                            if (f8 < f7) {
                                i10 = i11;
                                f7 = f8;
                            }
                        }
                    }
                }
                if (i10 > -1) {
                    C2508b c2508b2 = this.f21193g[i10];
                    c2508b2.f21169a.f21221d = -1;
                    c2508b2.x(iVarA);
                    i iVar = c2508b2.f21169a;
                    iVar.f21221d = i10;
                    iVar.g(this, c2508b2);
                }
            } else {
                z8 = true;
            }
        }
        return i8;
    }

    private void D() {
        int i7 = 0;
        if (f21183v) {
            while (i7 < this.f21198l) {
                C2508b c2508b = this.f21193g[i7];
                if (c2508b != null) {
                    this.f21200n.f21175a.a(c2508b);
                }
                this.f21193g[i7] = null;
                i7++;
            }
            return;
        }
        while (i7 < this.f21198l) {
            C2508b c2508b2 = this.f21193g[i7];
            if (c2508b2 != null) {
                this.f21200n.f21176b.a(c2508b2);
            }
            this.f21193g[i7] = null;
            i7++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f21200n.f21177c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.f(aVar, str);
        } else {
            iVarB.d();
            iVarB.f(aVar, str);
        }
        int i7 = this.f21202p;
        int i8 = f21184w;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            f21184w = i9;
            this.f21201o = (i[]) Arrays.copyOf(this.f21201o, i9);
        }
        i[] iVarArr = this.f21201o;
        int i10 = this.f21202p;
        this.f21202p = i10 + 1;
        iVarArr[i10] = iVarB;
        return iVarB;
    }

    private final void l(C2508b c2508b) {
        int i7;
        if (f21181t && c2508b.f21174f) {
            c2508b.f21169a.e(this, c2508b.f21170b);
        } else {
            C2508b[] c2508bArr = this.f21193g;
            int i8 = this.f21198l;
            c2508bArr[i8] = c2508b;
            i iVar = c2508b.f21169a;
            iVar.f21221d = i8;
            this.f21198l = i8 + 1;
            iVar.g(this, c2508b);
        }
        if (f21181t && this.f21187a) {
            int i9 = 0;
            while (i9 < this.f21198l) {
                if (this.f21193g[i9] == null) {
                    System.out.println("WTF");
                }
                C2508b c2508b2 = this.f21193g[i9];
                if (c2508b2 != null && c2508b2.f21174f) {
                    c2508b2.f21169a.e(this, c2508b2.f21170b);
                    if (f21183v) {
                        this.f21200n.f21175a.a(c2508b2);
                    } else {
                        this.f21200n.f21176b.a(c2508b2);
                    }
                    this.f21193g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.f21198l;
                        if (i10 >= i7) {
                            break;
                        }
                        C2508b[] c2508bArr2 = this.f21193g;
                        int i12 = i10 - 1;
                        C2508b c2508b3 = c2508bArr2[i10];
                        c2508bArr2[i12] = c2508b3;
                        i iVar2 = c2508b3.f21169a;
                        if (iVar2.f21221d == i10) {
                            iVar2.f21221d = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f21193g[i11] = null;
                    }
                    this.f21198l = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f21187a = false;
        }
    }

    private void n() {
        for (int i7 = 0; i7 < this.f21198l; i7++) {
            C2508b c2508b = this.f21193g[i7];
            c2508b.f21169a.f21223f = c2508b.f21170b;
        }
    }

    public static C2508b s(C2510d c2510d, i iVar, i iVar2, float f7) {
        return c2510d.r().j(iVar, iVar2, f7);
    }

    private int u(a aVar) throws Exception {
        for (int i7 = 0; i7 < this.f21198l; i7++) {
            C2508b c2508b = this.f21193g[i7];
            if (c2508b.f21169a.f21227j != i.a.UNRESTRICTED && c2508b.f21170b < 0.0f) {
                boolean z7 = false;
                int i8 = 0;
                while (!z7) {
                    i8++;
                    float f7 = Float.MAX_VALUE;
                    int i9 = 0;
                    int i10 = -1;
                    int i11 = -1;
                    int i12 = 0;
                    while (true) {
                        if (i9 >= this.f21198l) {
                            break;
                        }
                        C2508b c2508b2 = this.f21193g[i9];
                        if (c2508b2.f21169a.f21227j != i.a.UNRESTRICTED && !c2508b2.f21174f && c2508b2.f21170b < 0.0f) {
                            int i13 = 9;
                            if (f21182u) {
                                int iC = c2508b2.f21173e.c();
                                int i14 = 0;
                                while (i14 < iC) {
                                    i iVarD = c2508b2.f21173e.d(i14);
                                    float fI = c2508b2.f21173e.i(iVarD);
                                    if (fI > 0.0f) {
                                        int i15 = 0;
                                        while (i15 < i13) {
                                            float f8 = iVarD.f21225h[i15] / fI;
                                            if ((f8 < f7 && i15 == i12) || i15 > i12) {
                                                i12 = i15;
                                                i11 = iVarD.f21220c;
                                                i10 = i9;
                                                f7 = f8;
                                            }
                                            i15++;
                                            i13 = 9;
                                        }
                                    }
                                    i14++;
                                    i13 = 9;
                                }
                            } else {
                                for (int i16 = 1; i16 < this.f21197k; i16++) {
                                    i iVar = this.f21200n.f21178d[i16];
                                    float fI2 = c2508b2.f21173e.i(iVar);
                                    if (fI2 > 0.0f) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f9 = iVar.f21225h[i17] / fI2;
                                            if ((f9 < f7 && i17 == i12) || i17 > i12) {
                                                i10 = i9;
                                                i11 = i16;
                                                i12 = i17;
                                                f7 = f9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i9++;
                    }
                    if (i10 != -1) {
                        C2508b c2508b3 = this.f21193g[i10];
                        c2508b3.f21169a.f21221d = -1;
                        c2508b3.x(this.f21200n.f21178d[i11]);
                        i iVar2 = c2508b3.f21169a;
                        iVar2.f21221d = i10;
                        iVar2.g(this, c2508b3);
                    } else {
                        z7 = true;
                    }
                    if (i8 > this.f21197k / 2) {
                        z7 = true;
                    }
                }
                return i8;
            }
        }
        return 0;
    }

    public static C2511e x() {
        return null;
    }

    private void z() {
        int i7 = this.f21191e * 2;
        this.f21191e = i7;
        this.f21193g = (C2508b[]) Arrays.copyOf(this.f21193g, i7);
        C2509c c2509c = this.f21200n;
        c2509c.f21178d = (i[]) Arrays.copyOf(c2509c.f21178d, this.f21191e);
        int i8 = this.f21191e;
        this.f21196j = new boolean[i8];
        this.f21192f = i8;
        this.f21199m = i8;
    }

    public void A() throws Exception {
        if (this.f21190d.isEmpty()) {
            n();
            return;
        }
        if (!this.f21194h && !this.f21195i) {
            B(this.f21190d);
            return;
        }
        for (int i7 = 0; i7 < this.f21198l; i7++) {
            if (!this.f21193g[i7].f21174f) {
                B(this.f21190d);
                return;
            }
        }
        n();
    }

    void B(a aVar) throws Exception {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        C2509c c2509c;
        int i7 = 0;
        while (true) {
            c2509c = this.f21200n;
            i[] iVarArr = c2509c.f21178d;
            if (i7 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i7];
            if (iVar != null) {
                iVar.d();
            }
            i7++;
        }
        c2509c.f21177c.c(this.f21201o, this.f21202p);
        this.f21202p = 0;
        Arrays.fill(this.f21200n.f21178d, (Object) null);
        HashMap<String, i> map = this.f21189c;
        if (map != null) {
            map.clear();
        }
        this.f21188b = 0;
        this.f21190d.clear();
        this.f21197k = 1;
        for (int i8 = 0; i8 < this.f21198l; i8++) {
            C2508b c2508b = this.f21193g[i8];
            if (c2508b != null) {
                c2508b.f21171c = false;
            }
        }
        D();
        this.f21198l = 0;
        if (f21183v) {
            this.f21203q = new b(this.f21200n);
        } else {
            this.f21203q = new C2508b(this.f21200n);
        }
    }

    public void b(l0.e eVar, l0.e eVar2, float f7, int i7) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.o(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.o(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.o(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.o(bVar4));
        i iVarQ5 = q(eVar2.o(bVar));
        i iVarQ6 = q(eVar2.o(bVar2));
        i iVarQ7 = q(eVar2.o(bVar3));
        i iVarQ8 = q(eVar2.o(bVar4));
        C2508b c2508bR = r();
        double d7 = f7;
        double d8 = i7;
        c2508bR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d7) * d8));
        d(c2508bR);
        C2508b c2508bR2 = r();
        c2508bR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d7) * d8));
        d(c2508bR2);
    }

    public void c(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8, int i9) {
        C2508b c2508bR = r();
        c2508bR.h(iVar, iVar2, i7, f7, iVar3, iVar4, i8);
        if (i9 != 8) {
            c2508bR.d(this, i9);
        }
        d(c2508bR);
    }

    public void d(k0.C2508b r6) {
        throw new UnsupportedOperationException("Method not decompiled: k0.C2510d.d(k0.b):void");
    }

    public C2508b e(i iVar, i iVar2, int i7, int i8) {
        if (f21180s && i8 == 8 && iVar2.f21224g && iVar.f21221d == -1) {
            iVar.e(this, iVar2.f21223f + i7);
            return null;
        }
        C2508b c2508bR = r();
        c2508bR.n(iVar, iVar2, i7);
        if (i8 != 8) {
            c2508bR.d(this, i8);
        }
        d(c2508bR);
        return c2508bR;
    }

    public void f(i iVar, int i7) {
        if (f21180s && iVar.f21221d == -1) {
            float f7 = i7;
            iVar.e(this, f7);
            for (int i8 = 0; i8 < this.f21188b + 1; i8++) {
                i iVar2 = this.f21200n.f21178d[i8];
                if (iVar2 != null && iVar2.f21231n && iVar2.f21232o == iVar.f21220c) {
                    iVar2.e(this, iVar2.f21233p + f7);
                }
            }
            return;
        }
        int i9 = iVar.f21221d;
        if (i9 == -1) {
            C2508b c2508bR = r();
            c2508bR.i(iVar, i7);
            d(c2508bR);
            return;
        }
        C2508b c2508b = this.f21193g[i9];
        if (c2508b.f21174f) {
            c2508b.f21170b = i7;
            return;
        }
        if (c2508b.f21173e.c() == 0) {
            c2508b.f21174f = true;
            c2508b.f21170b = i7;
        } else {
            C2508b c2508bR2 = r();
            c2508bR2.m(iVar, i7);
            d(c2508bR2);
        }
    }

    public void g(i iVar, i iVar2, int i7, boolean z7) {
        C2508b c2508bR = r();
        i iVarT = t();
        iVarT.f21222e = 0;
        c2508bR.o(iVar, iVar2, iVarT, i7);
        d(c2508bR);
    }

    public void h(i iVar, i iVar2, int i7, int i8) {
        C2508b c2508bR = r();
        i iVarT = t();
        iVarT.f21222e = 0;
        c2508bR.o(iVar, iVar2, iVarT, i7);
        if (i8 != 8) {
            m(c2508bR, (int) (c2508bR.f21173e.i(iVarT) * (-1.0f)), i8);
        }
        d(c2508bR);
    }

    public void i(i iVar, i iVar2, int i7, boolean z7) {
        C2508b c2508bR = r();
        i iVarT = t();
        iVarT.f21222e = 0;
        c2508bR.p(iVar, iVar2, iVarT, i7);
        d(c2508bR);
    }

    public void j(i iVar, i iVar2, int i7, int i8) {
        C2508b c2508bR = r();
        i iVarT = t();
        iVarT.f21222e = 0;
        c2508bR.p(iVar, iVar2, iVarT, i7);
        if (i8 != 8) {
            m(c2508bR, (int) (c2508bR.f21173e.i(iVarT) * (-1.0f)), i8);
        }
        d(c2508bR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f7, int i7) {
        C2508b c2508bR = r();
        c2508bR.k(iVar, iVar2, iVar3, iVar4, f7);
        if (i7 != 8) {
            c2508bR.d(this, i7);
        }
        d(c2508bR);
    }

    void m(C2508b c2508b, int i7, int i8) {
        c2508b.e(o(i8, null), i7);
    }

    public i o(int i7, String str) {
        if (this.f21197k + 1 >= this.f21192f) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i8 = this.f21188b + 1;
        this.f21188b = i8;
        this.f21197k++;
        iVarA.f21220c = i8;
        iVarA.f21222e = i7;
        this.f21200n.f21178d[i8] = iVarA;
        this.f21190d.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f21197k + 1 >= this.f21192f) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i7 = this.f21188b + 1;
        this.f21188b = i7;
        this.f21197k++;
        iVarA.f21220c = i7;
        this.f21200n.f21178d[i7] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f21197k + 1 >= this.f21192f) {
            z();
        }
        if (obj instanceof l0.d) {
            l0.d dVar = (l0.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f21200n);
                iVarI = dVar.i();
            }
            int i7 = iVarI.f21220c;
            if (i7 == -1 || i7 > this.f21188b || this.f21200n.f21178d[i7] == null) {
                if (i7 != -1) {
                    iVarI.d();
                }
                int i8 = this.f21188b + 1;
                this.f21188b = i8;
                this.f21197k++;
                iVarI.f21220c = i8;
                iVarI.f21227j = i.a.UNRESTRICTED;
                this.f21200n.f21178d[i8] = iVarI;
            }
        }
        return iVarI;
    }

    public C2508b r() {
        C2508b c2508bB;
        if (f21183v) {
            c2508bB = this.f21200n.f21175a.b();
            if (c2508bB == null) {
                c2508bB = new b(this.f21200n);
                f21186y++;
            } else {
                c2508bB.y();
            }
        } else {
            c2508bB = this.f21200n.f21176b.b();
            if (c2508bB == null) {
                c2508bB = new C2508b(this.f21200n);
                f21185x++;
            } else {
                c2508bB.y();
            }
        }
        i.b();
        return c2508bB;
    }

    public i t() {
        if (this.f21197k + 1 >= this.f21192f) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i7 = this.f21188b + 1;
        this.f21188b = i7;
        this.f21197k++;
        iVarA.f21220c = i7;
        this.f21200n.f21178d[i7] = iVarA;
        return iVarA;
    }

    public void v(C2511e c2511e) {
    }

    public C2509c w() {
        return this.f21200n;
    }

    public int y(Object obj) {
        i iVarI = ((l0.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f21223f + 0.5f);
        }
        return 0;
    }
}
