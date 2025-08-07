package m0;

import l0.d;
import l0.e;
import m0.f;
import m0.p;

public class l extends p {

    private static int[] f21941k = new int[2];

    static class a {

        static final int[] f21942a;

        static {
            int[] iArr = new int[p.b.values().length];
            f21942a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21942a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21942a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(l0.e eVar) {
        super(eVar);
        this.f21976h.f21922e = f.a.LEFT;
        this.f21977i.f21922e = f.a.RIGHT;
        this.f21974f = 0;
    }

    private void q(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    @Override
    public void a(m0.d r17) {
        throw new UnsupportedOperationException("Method not decompiled: m0.l.a(m0.d):void");
    }

    @Override
    void d() {
        l0.e eVarK;
        l0.e eVarK2;
        l0.e eVar = this.f21970b;
        if (eVar.f21614a) {
            this.f21973e.d(eVar.T());
        }
        if (this.f21973e.f21927j) {
            e.b bVar = this.f21972d;
            e.b bVar2 = e.b.f21671v;
            if (bVar == bVar2 && (((eVarK = this.f21970b.K()) != null && eVarK.A() == e.b.FIXED) || eVarK.A() == bVar2)) {
                b(this.f21976h, eVarK.f21622e.f21976h, this.f21970b.f21595H.f());
                b(this.f21977i, eVarK.f21622e.f21977i, -this.f21970b.f21597J.f());
                return;
            }
        } else {
            e.b bVarA = this.f21970b.A();
            this.f21972d = bVarA;
            if (bVarA != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.f21671v;
                if (bVarA == bVar3 && (((eVarK2 = this.f21970b.K()) != null && eVarK2.A() == e.b.FIXED) || eVarK2.A() == bVar3)) {
                    int iT = (eVarK2.T() - this.f21970b.f21595H.f()) - this.f21970b.f21597J.f();
                    b(this.f21976h, eVarK2.f21622e.f21976h, this.f21970b.f21595H.f());
                    b(this.f21977i, eVarK2.f21622e.f21977i, -this.f21970b.f21597J.f());
                    this.f21973e.d(iT);
                    return;
                }
                if (this.f21972d == e.b.FIXED) {
                    this.f21973e.d(this.f21970b.T());
                }
            }
        }
        g gVar = this.f21973e;
        if (gVar.f21927j) {
            l0.e eVar2 = this.f21970b;
            if (eVar2.f21614a) {
                l0.d[] dVarArr = eVar2.f21603P;
                l0.d dVar = dVarArr[0];
                l0.d dVar2 = dVar.f21570f;
                if (dVar2 != null && dVarArr[1].f21570f != null) {
                    if (eVar2.b0()) {
                        this.f21976h.f21923f = this.f21970b.f21603P[0].f();
                        this.f21977i.f21923f = -this.f21970b.f21603P[1].f();
                        return;
                    }
                    f fVarH = h(this.f21970b.f21603P[0]);
                    if (fVarH != null) {
                        b(this.f21976h, fVarH, this.f21970b.f21603P[0].f());
                    }
                    f fVarH2 = h(this.f21970b.f21603P[1]);
                    if (fVarH2 != null) {
                        b(this.f21977i, fVarH2, -this.f21970b.f21603P[1].f());
                    }
                    this.f21976h.f21919b = true;
                    this.f21977i.f21919b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f21976h, fVarH3, this.f21970b.f21603P[0].f());
                        b(this.f21977i, this.f21976h, this.f21973e.f21924g);
                        return;
                    }
                    return;
                }
                l0.d dVar3 = dVarArr[1];
                if (dVar3.f21570f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f21977i, fVarH4, -this.f21970b.f21603P[1].f());
                        b(this.f21976h, this.f21977i, -this.f21973e.f21924g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof l0.i) || eVar2.K() == null || this.f21970b.o(d.b.CENTER).f21570f != null) {
                    return;
                }
                b(this.f21976h, this.f21970b.K().f21622e.f21976h, this.f21970b.U());
                b(this.f21977i, this.f21976h, this.f21973e.f21924g);
                return;
            }
        }
        if (this.f21972d == e.b.MATCH_CONSTRAINT) {
            l0.e eVar3 = this.f21970b;
            int i7 = eVar3.f21644p;
            if (i7 == 2) {
                l0.e eVarK3 = eVar3.K();
                if (eVarK3 != null) {
                    g gVar2 = eVarK3.f21624f.f21973e;
                    this.f21973e.f21929l.add(gVar2);
                    gVar2.f21928k.add(this.f21973e);
                    g gVar3 = this.f21973e;
                    gVar3.f21919b = true;
                    gVar3.f21928k.add(this.f21976h);
                    this.f21973e.f21928k.add(this.f21977i);
                }
            } else if (i7 == 3) {
                if (eVar3.f21646q == 3) {
                    this.f21976h.f21918a = this;
                    this.f21977i.f21918a = this;
                    n nVar = eVar3.f21624f;
                    nVar.f21976h.f21918a = this;
                    nVar.f21977i.f21918a = this;
                    gVar.f21918a = this;
                    if (eVar3.d0()) {
                        this.f21973e.f21929l.add(this.f21970b.f21624f.f21973e);
                        this.f21970b.f21624f.f21973e.f21928k.add(this.f21973e);
                        n nVar2 = this.f21970b.f21624f;
                        nVar2.f21973e.f21918a = this;
                        this.f21973e.f21929l.add(nVar2.f21976h);
                        this.f21973e.f21929l.add(this.f21970b.f21624f.f21977i);
                        this.f21970b.f21624f.f21976h.f21928k.add(this.f21973e);
                        this.f21970b.f21624f.f21977i.f21928k.add(this.f21973e);
                    } else if (this.f21970b.b0()) {
                        this.f21970b.f21624f.f21973e.f21929l.add(this.f21973e);
                        this.f21973e.f21928k.add(this.f21970b.f21624f.f21973e);
                    } else {
                        this.f21970b.f21624f.f21973e.f21929l.add(this.f21973e);
                    }
                } else {
                    g gVar4 = eVar3.f21624f.f21973e;
                    gVar.f21929l.add(gVar4);
                    gVar4.f21928k.add(this.f21973e);
                    this.f21970b.f21624f.f21976h.f21928k.add(this.f21973e);
                    this.f21970b.f21624f.f21977i.f21928k.add(this.f21973e);
                    g gVar5 = this.f21973e;
                    gVar5.f21919b = true;
                    gVar5.f21928k.add(this.f21976h);
                    this.f21973e.f21928k.add(this.f21977i);
                    this.f21976h.f21929l.add(this.f21973e);
                    this.f21977i.f21929l.add(this.f21973e);
                }
            }
        }
        l0.e eVar4 = this.f21970b;
        l0.d[] dVarArr2 = eVar4.f21603P;
        l0.d dVar4 = dVarArr2[0];
        l0.d dVar5 = dVar4.f21570f;
        if (dVar5 != null && dVarArr2[1].f21570f != null) {
            if (eVar4.b0()) {
                this.f21976h.f21923f = this.f21970b.f21603P[0].f();
                this.f21977i.f21923f = -this.f21970b.f21603P[1].f();
                return;
            }
            f fVarH5 = h(this.f21970b.f21603P[0]);
            f fVarH6 = h(this.f21970b.f21603P[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f21978j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f21976h, fVarH7, this.f21970b.f21603P[0].f());
                c(this.f21977i, this.f21976h, 1, this.f21973e);
                return;
            }
            return;
        }
        l0.d dVar6 = dVarArr2[1];
        if (dVar6.f21570f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f21977i, fVarH8, -this.f21970b.f21603P[1].f());
                c(this.f21976h, this.f21977i, -1, this.f21973e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof l0.i) || eVar4.K() == null) {
            return;
        }
        b(this.f21976h, this.f21970b.K().f21622e.f21976h, this.f21970b.U());
        c(this.f21977i, this.f21976h, 1, this.f21973e);
    }

    @Override
    public void e() {
        f fVar = this.f21976h;
        if (fVar.f21927j) {
            this.f21970b.Y0(fVar.f21924g);
        }
    }

    @Override
    void f() {
        this.f21971c = null;
        this.f21976h.c();
        this.f21977i.c();
        this.f21973e.c();
        this.f21975g = false;
    }

    @Override
    boolean m() {
        return this.f21972d != e.b.MATCH_CONSTRAINT || this.f21970b.f21644p == 0;
    }

    void r() {
        this.f21975g = false;
        this.f21976h.c();
        this.f21976h.f21927j = false;
        this.f21977i.c();
        this.f21977i.f21927j = false;
        this.f21973e.f21927j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f21970b.t();
    }
}
