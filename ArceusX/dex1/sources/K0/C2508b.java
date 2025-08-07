package k0;

import java.util.ArrayList;
import k0.C2510d;
import k0.i;

public class C2508b implements C2510d.a {

    public a f21173e;

    i f21169a = null;

    float f21170b = 0.0f;

    boolean f21171c = false;

    ArrayList<i> f21172d = new ArrayList<>();

    boolean f21174f = false;

    public interface a {
        float a(i iVar, boolean z7);

        boolean b(i iVar);

        int c();

        void clear();

        i d(int i7);

        void e();

        float f(int i7);

        void g(i iVar, float f7, boolean z7);

        float h(C2508b c2508b, boolean z7);

        float i(i iVar);

        void j(float f7);

        void k(i iVar, float f7);
    }

    public C2508b() {
    }

    private boolean u(i iVar, C2510d c2510d) {
        return iVar.f21230m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iC = this.f21173e.c();
        i iVar2 = null;
        float f7 = 0.0f;
        for (int i7 = 0; i7 < iC; i7++) {
            float f8 = this.f21173e.f(i7);
            if (f8 < 0.0f) {
                i iVarD = this.f21173e.d(i7);
                if ((zArr == null || !zArr[iVarD.f21220c]) && iVarD != iVar && (((aVar = iVarD.f21227j) == i.a.SLACK || aVar == i.a.ERROR) && f8 < f7)) {
                    f7 = f8;
                    iVar2 = iVarD;
                }
            }
        }
        return iVar2;
    }

    public void A(C2510d c2510d, i iVar, boolean z7) {
        if (iVar.f21224g) {
            this.f21170b += iVar.f21223f * this.f21173e.i(iVar);
            this.f21173e.a(iVar, z7);
            if (z7) {
                iVar.c(this);
            }
            if (C2510d.f21181t && this.f21173e.c() == 0) {
                this.f21174f = true;
                c2510d.f21187a = true;
            }
        }
    }

    public void B(C2510d c2510d, C2508b c2508b, boolean z7) {
        this.f21170b += c2508b.f21170b * this.f21173e.h(c2508b, z7);
        if (z7) {
            c2508b.f21169a.c(this);
        }
        if (C2510d.f21181t && this.f21169a != null && this.f21173e.c() == 0) {
            this.f21174f = true;
            c2510d.f21187a = true;
        }
    }

    public void C(C2510d c2510d, i iVar, boolean z7) {
        if (iVar.f21231n) {
            float fI = this.f21173e.i(iVar);
            this.f21170b += iVar.f21233p * fI;
            this.f21173e.a(iVar, z7);
            if (z7) {
                iVar.c(this);
            }
            this.f21173e.g(c2510d.f21200n.f21178d[iVar.f21232o], fI, z7);
            if (C2510d.f21181t && this.f21173e.c() == 0) {
                this.f21174f = true;
                c2510d.f21187a = true;
            }
        }
    }

    public void D(C2510d c2510d) {
        if (c2510d.f21193g.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int iC = this.f21173e.c();
            for (int i7 = 0; i7 < iC; i7++) {
                i iVarD = this.f21173e.d(i7);
                if (iVarD.f21221d != -1 || iVarD.f21224g || iVarD.f21231n) {
                    this.f21172d.add(iVarD);
                }
            }
            int size = this.f21172d.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    i iVar = this.f21172d.get(i8);
                    if (iVar.f21224g) {
                        A(c2510d, iVar, true);
                    } else if (iVar.f21231n) {
                        C(c2510d, iVar, true);
                    } else {
                        B(c2510d, c2510d.f21193g[iVar.f21221d], true);
                    }
                }
                this.f21172d.clear();
            } else {
                z7 = true;
            }
        }
        if (C2510d.f21181t && this.f21169a != null && this.f21173e.c() == 0) {
            this.f21174f = true;
            c2510d.f21187a = true;
        }
    }

    @Override
    public i a(C2510d c2510d, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override
    public void b(C2510d.a aVar) {
        if (aVar instanceof C2508b) {
            C2508b c2508b = (C2508b) aVar;
            this.f21169a = null;
            this.f21173e.clear();
            for (int i7 = 0; i7 < c2508b.f21173e.c(); i7++) {
                this.f21173e.g(c2508b.f21173e.d(i7), c2508b.f21173e.f(i7), true);
            }
        }
    }

    @Override
    public void c(i iVar) {
        int i7 = iVar.f21222e;
        float f7 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f7 = 1000.0f;
            } else if (i7 == 3) {
                f7 = 1000000.0f;
            } else if (i7 == 4) {
                f7 = 1.0E9f;
            } else if (i7 == 5) {
                f7 = 1.0E12f;
            }
        }
        this.f21173e.k(iVar, f7);
    }

    @Override
    public void clear() {
        this.f21173e.clear();
        this.f21169a = null;
        this.f21170b = 0.0f;
    }

    public C2508b d(C2510d c2510d, int i7) {
        this.f21173e.k(c2510d.o(i7, "ep"), 1.0f);
        this.f21173e.k(c2510d.o(i7, "em"), -1.0f);
        return this;
    }

    C2508b e(i iVar, int i7) {
        this.f21173e.k(iVar, i7);
        return this;
    }

    boolean f(C2510d c2510d) {
        boolean z7;
        i iVarG = g(c2510d);
        if (iVarG == null) {
            z7 = true;
        } else {
            x(iVarG);
            z7 = false;
        }
        if (this.f21173e.c() == 0) {
            this.f21174f = true;
        }
        return z7;
    }

    i g(C2510d c2510d) {
        int iC = this.f21173e.c();
        i iVar = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        i iVar2 = null;
        for (int i7 = 0; i7 < iC; i7++) {
            float f9 = this.f21173e.f(i7);
            i iVarD = this.f21173e.d(i7);
            if (iVarD.f21227j == i.a.UNRESTRICTED) {
                if (iVar == null || f7 > f9) {
                    boolean zU = u(iVarD, c2510d);
                    z7 = zU;
                    f7 = f9;
                    iVar = iVarD;
                } else if (!z7 && u(iVarD, c2510d)) {
                    f7 = f9;
                    iVar = iVarD;
                    z7 = true;
                }
            } else if (iVar == null && f9 < 0.0f) {
                if (iVar2 == null || f8 > f9) {
                    boolean zU2 = u(iVarD, c2510d);
                    z8 = zU2;
                    f8 = f9;
                    iVar2 = iVarD;
                } else if (!z8 && u(iVarD, c2510d)) {
                    f8 = f9;
                    iVar2 = iVarD;
                    z8 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override
    public i getKey() {
        return this.f21169a;
    }

    C2508b h(i iVar, i iVar2, int i7, float f7, i iVar3, i iVar4, int i8) {
        if (iVar2 == iVar3) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar4, 1.0f);
            this.f21173e.k(iVar2, -2.0f);
            return this;
        }
        if (f7 == 0.5f) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
            this.f21173e.k(iVar3, -1.0f);
            this.f21173e.k(iVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                this.f21170b = (-i7) + i8;
            }
        } else if (f7 <= 0.0f) {
            this.f21173e.k(iVar, -1.0f);
            this.f21173e.k(iVar2, 1.0f);
            this.f21170b = i7;
        } else if (f7 >= 1.0f) {
            this.f21173e.k(iVar4, -1.0f);
            this.f21173e.k(iVar3, 1.0f);
            this.f21170b = -i8;
        } else {
            float f8 = 1.0f - f7;
            this.f21173e.k(iVar, f8 * 1.0f);
            this.f21173e.k(iVar2, f8 * (-1.0f));
            this.f21173e.k(iVar3, (-1.0f) * f7);
            this.f21173e.k(iVar4, 1.0f * f7);
            if (i7 > 0 || i8 > 0) {
                this.f21170b = ((-i7) * f8) + (i8 * f7);
            }
        }
        return this;
    }

    C2508b i(i iVar, int i7) {
        this.f21169a = iVar;
        float f7 = i7;
        iVar.f21223f = f7;
        this.f21170b = f7;
        this.f21174f = true;
        return this;
    }

    @Override
    public boolean isEmpty() {
        return this.f21169a == null && this.f21170b == 0.0f && this.f21173e.c() == 0;
    }

    C2508b j(i iVar, i iVar2, float f7) {
        this.f21173e.k(iVar, -1.0f);
        this.f21173e.k(iVar2, f7);
        return this;
    }

    public C2508b k(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f21173e.k(iVar, -1.0f);
        this.f21173e.k(iVar2, 1.0f);
        this.f21173e.k(iVar3, f7);
        this.f21173e.k(iVar4, -f7);
        return this;
    }

    public C2508b l(float f7, float f8, float f9, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f21170b = 0.0f;
        if (f8 == 0.0f || f7 == f9) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
            this.f21173e.k(iVar4, 1.0f);
            this.f21173e.k(iVar3, -1.0f);
        } else if (f7 == 0.0f) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
        } else if (f9 == 0.0f) {
            this.f21173e.k(iVar3, 1.0f);
            this.f21173e.k(iVar4, -1.0f);
        } else {
            float f10 = (f7 / f8) / (f9 / f8);
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
            this.f21173e.k(iVar4, f10);
            this.f21173e.k(iVar3, -f10);
        }
        return this;
    }

    public C2508b m(i iVar, int i7) {
        if (i7 < 0) {
            this.f21170b = i7 * (-1);
            this.f21173e.k(iVar, 1.0f);
        } else {
            this.f21170b = i7;
            this.f21173e.k(iVar, -1.0f);
        }
        return this;
    }

    public C2508b n(i iVar, i iVar2, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f21170b = i7;
        }
        if (z7) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
        } else {
            this.f21173e.k(iVar, -1.0f);
            this.f21173e.k(iVar2, 1.0f);
        }
        return this;
    }

    public C2508b o(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f21170b = i7;
        }
        if (z7) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
            this.f21173e.k(iVar3, -1.0f);
        } else {
            this.f21173e.k(iVar, -1.0f);
            this.f21173e.k(iVar2, 1.0f);
            this.f21173e.k(iVar3, 1.0f);
        }
        return this;
    }

    public C2508b p(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f21170b = i7;
        }
        if (z7) {
            this.f21173e.k(iVar, 1.0f);
            this.f21173e.k(iVar2, -1.0f);
            this.f21173e.k(iVar3, 1.0f);
        } else {
            this.f21173e.k(iVar, -1.0f);
            this.f21173e.k(iVar2, 1.0f);
            this.f21173e.k(iVar3, -1.0f);
        }
        return this;
    }

    public C2508b q(i iVar, i iVar2, i iVar3, i iVar4, float f7) {
        this.f21173e.k(iVar3, 0.5f);
        this.f21173e.k(iVar4, 0.5f);
        this.f21173e.k(iVar, -0.5f);
        this.f21173e.k(iVar2, -0.5f);
        this.f21170b = -f7;
        return this;
    }

    void r() {
        float f7 = this.f21170b;
        if (f7 < 0.0f) {
            this.f21170b = f7 * (-1.0f);
            this.f21173e.e();
        }
    }

    boolean s() {
        i iVar = this.f21169a;
        return iVar != null && (iVar.f21227j == i.a.UNRESTRICTED || this.f21170b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f21173e.b(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f21169a;
        if (iVar2 != null) {
            this.f21173e.k(iVar2, -1.0f);
            this.f21169a.f21221d = -1;
            this.f21169a = null;
        }
        float fA = this.f21173e.a(iVar, true) * (-1.0f);
        this.f21169a = iVar;
        if (fA == 1.0f) {
            return;
        }
        this.f21170b /= fA;
        this.f21173e.j(fA);
    }

    public void y() {
        this.f21169a = null;
        this.f21173e.clear();
        this.f21170b = 0.0f;
        this.f21174f = false;
    }

    java.lang.String z() {
        throw new UnsupportedOperationException("Method not decompiled: k0.C2508b.z():java.lang.String");
    }

    public C2508b(C2509c c2509c) {
        this.f21173e = new C2507a(this, c2509c);
    }
}
