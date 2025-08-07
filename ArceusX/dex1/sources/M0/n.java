package m0;

import l0.d;
import l0.e;
import m0.f;
import m0.p;

public class n extends p {

    public f f21951k;

    g f21952l;

    static class a {

        static final int[] f21953a;

        static {
            int[] iArr = new int[p.b.values().length];
            f21953a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21953a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21953a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(l0.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f21951k = fVar;
        this.f21952l = null;
        this.f21976h.f21922e = f.a.TOP;
        this.f21977i.f21922e = f.a.BOTTOM;
        fVar.f21922e = f.a.BASELINE;
        this.f21974f = 1;
    }

    @Override
    public void a(d dVar) {
        float f7;
        float fV;
        float fV2;
        int i7;
        int i8 = a.f21953a[this.f21978j.ordinal()];
        if (i8 == 1) {
            p(dVar);
        } else if (i8 == 2) {
            o(dVar);
        } else if (i8 == 3) {
            l0.e eVar = this.f21970b;
            n(dVar, eVar.f21596I, eVar.f21598K, 1);
            return;
        }
        g gVar = this.f21973e;
        if (gVar.f21920c && !gVar.f21927j && this.f21972d == e.b.MATCH_CONSTRAINT) {
            l0.e eVar2 = this.f21970b;
            int i9 = eVar2.f21646q;
            if (i9 == 2) {
                l0.e eVarK = eVar2.K();
                if (eVarK != null) {
                    if (eVarK.f21624f.f21973e.f21927j) {
                        this.f21973e.d((int) ((r7.f21924g * this.f21970b.f21660x) + 0.5f));
                    }
                }
            } else if (i9 == 3 && eVar2.f21622e.f21973e.f21927j) {
                int iW = eVar2.w();
                if (iW == -1) {
                    l0.e eVar3 = this.f21970b;
                    f7 = eVar3.f21622e.f21973e.f21924g;
                    fV = eVar3.v();
                } else if (iW == 0) {
                    fV2 = r7.f21622e.f21973e.f21924g * this.f21970b.v();
                    i7 = (int) (fV2 + 0.5f);
                    this.f21973e.d(i7);
                } else if (iW != 1) {
                    i7 = 0;
                    this.f21973e.d(i7);
                } else {
                    l0.e eVar4 = this.f21970b;
                    f7 = eVar4.f21622e.f21973e.f21924g;
                    fV = eVar4.v();
                }
                fV2 = f7 / fV;
                i7 = (int) (fV2 + 0.5f);
                this.f21973e.d(i7);
            }
        }
        f fVar = this.f21976h;
        if (fVar.f21920c) {
            f fVar2 = this.f21977i;
            if (fVar2.f21920c) {
                if (fVar.f21927j && fVar2.f21927j && this.f21973e.f21927j) {
                    return;
                }
                if (!this.f21973e.f21927j && this.f21972d == e.b.MATCH_CONSTRAINT) {
                    l0.e eVar5 = this.f21970b;
                    if (eVar5.f21644p == 0 && !eVar5.d0()) {
                        f fVar3 = this.f21976h.f21929l.get(0);
                        f fVar4 = this.f21977i.f21929l.get(0);
                        int i10 = fVar3.f21924g;
                        f fVar5 = this.f21976h;
                        int i11 = i10 + fVar5.f21923f;
                        int i12 = fVar4.f21924g + this.f21977i.f21923f;
                        fVar5.d(i11);
                        this.f21977i.d(i12);
                        this.f21973e.d(i12 - i11);
                        return;
                    }
                }
                if (!this.f21973e.f21927j && this.f21972d == e.b.MATCH_CONSTRAINT && this.f21969a == 1 && this.f21976h.f21929l.size() > 0 && this.f21977i.f21929l.size() > 0) {
                    f fVar6 = this.f21976h.f21929l.get(0);
                    int i13 = (this.f21977i.f21929l.get(0).f21924g + this.f21977i.f21923f) - (fVar6.f21924g + this.f21976h.f21923f);
                    g gVar2 = this.f21973e;
                    int i14 = gVar2.f21939m;
                    if (i13 < i14) {
                        gVar2.d(i13);
                    } else {
                        gVar2.d(i14);
                    }
                }
                if (this.f21973e.f21927j && this.f21976h.f21929l.size() > 0 && this.f21977i.f21929l.size() > 0) {
                    f fVar7 = this.f21976h.f21929l.get(0);
                    f fVar8 = this.f21977i.f21929l.get(0);
                    int i15 = fVar7.f21924g + this.f21976h.f21923f;
                    int i16 = fVar8.f21924g + this.f21977i.f21923f;
                    float fO = this.f21970b.O();
                    if (fVar7 == fVar8) {
                        i15 = fVar7.f21924g;
                        i16 = fVar8.f21924g;
                        fO = 0.5f;
                    }
                    this.f21976h.d((int) (i15 + 0.5f + (((i16 - i15) - this.f21973e.f21924g) * fO)));
                    this.f21977i.d(this.f21976h.f21924g + this.f21973e.f21924g);
                }
            }
        }
    }

    @Override
    void d() {
        l0.e eVarK;
        l0.e eVarK2;
        l0.e eVar = this.f21970b;
        if (eVar.f21614a) {
            this.f21973e.d(eVar.x());
        }
        if (!this.f21973e.f21927j) {
            this.f21972d = this.f21970b.Q();
            if (this.f21970b.W()) {
                this.f21952l = new C2557a(this);
            }
            e.b bVar = this.f21972d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.f21671v && (eVarK2 = this.f21970b.K()) != null && eVarK2.Q() == e.b.FIXED) {
                    int iX = (eVarK2.x() - this.f21970b.f21596I.f()) - this.f21970b.f21598K.f();
                    b(this.f21976h, eVarK2.f21624f.f21976h, this.f21970b.f21596I.f());
                    b(this.f21977i, eVarK2.f21624f.f21977i, -this.f21970b.f21598K.f());
                    this.f21973e.d(iX);
                    return;
                }
                if (this.f21972d == e.b.FIXED) {
                    this.f21973e.d(this.f21970b.x());
                }
            }
        } else if (this.f21972d == e.b.f21671v && (eVarK = this.f21970b.K()) != null && eVarK.Q() == e.b.FIXED) {
            b(this.f21976h, eVarK.f21624f.f21976h, this.f21970b.f21596I.f());
            b(this.f21977i, eVarK.f21624f.f21977i, -this.f21970b.f21598K.f());
            return;
        }
        g gVar = this.f21973e;
        boolean z7 = gVar.f21927j;
        if (z7) {
            l0.e eVar2 = this.f21970b;
            if (eVar2.f21614a) {
                l0.d[] dVarArr = eVar2.f21603P;
                l0.d dVar = dVarArr[2];
                l0.d dVar2 = dVar.f21570f;
                if (dVar2 != null && dVarArr[3].f21570f != null) {
                    if (eVar2.d0()) {
                        this.f21976h.f21923f = this.f21970b.f21603P[2].f();
                        this.f21977i.f21923f = -this.f21970b.f21603P[3].f();
                    } else {
                        f fVarH = h(this.f21970b.f21603P[2]);
                        if (fVarH != null) {
                            b(this.f21976h, fVarH, this.f21970b.f21603P[2].f());
                        }
                        f fVarH2 = h(this.f21970b.f21603P[3]);
                        if (fVarH2 != null) {
                            b(this.f21977i, fVarH2, -this.f21970b.f21603P[3].f());
                        }
                        this.f21976h.f21919b = true;
                        this.f21977i.f21919b = true;
                    }
                    if (this.f21970b.W()) {
                        b(this.f21951k, this.f21976h, this.f21970b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f21976h, fVarH3, this.f21970b.f21603P[2].f());
                        b(this.f21977i, this.f21976h, this.f21973e.f21924g);
                        if (this.f21970b.W()) {
                            b(this.f21951k, this.f21976h, this.f21970b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                l0.d dVar3 = dVarArr[3];
                if (dVar3.f21570f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f21977i, fVarH4, -this.f21970b.f21603P[3].f());
                        b(this.f21976h, this.f21977i, -this.f21973e.f21924g);
                    }
                    if (this.f21970b.W()) {
                        b(this.f21951k, this.f21976h, this.f21970b.p());
                        return;
                    }
                    return;
                }
                l0.d dVar4 = dVarArr[4];
                if (dVar4.f21570f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f21951k, fVarH5, 0);
                        b(this.f21976h, this.f21951k, -this.f21970b.p());
                        b(this.f21977i, this.f21976h, this.f21973e.f21924g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof l0.i) || eVar2.K() == null || this.f21970b.o(d.b.CENTER).f21570f != null) {
                    return;
                }
                b(this.f21976h, this.f21970b.K().f21624f.f21976h, this.f21970b.V());
                b(this.f21977i, this.f21976h, this.f21973e.f21924g);
                if (this.f21970b.W()) {
                    b(this.f21951k, this.f21976h, this.f21970b.p());
                    return;
                }
                return;
            }
        }
        if (z7 || this.f21972d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            l0.e eVar3 = this.f21970b;
            int i7 = eVar3.f21646q;
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
            } else if (i7 == 3 && !eVar3.d0()) {
                l0.e eVar4 = this.f21970b;
                if (eVar4.f21644p != 3) {
                    g gVar4 = eVar4.f21622e.f21973e;
                    this.f21973e.f21929l.add(gVar4);
                    gVar4.f21928k.add(this.f21973e);
                    g gVar5 = this.f21973e;
                    gVar5.f21919b = true;
                    gVar5.f21928k.add(this.f21976h);
                    this.f21973e.f21928k.add(this.f21977i);
                }
            }
        }
        l0.e eVar5 = this.f21970b;
        l0.d[] dVarArr2 = eVar5.f21603P;
        l0.d dVar5 = dVarArr2[2];
        l0.d dVar6 = dVar5.f21570f;
        if (dVar6 != null && dVarArr2[3].f21570f != null) {
            if (eVar5.d0()) {
                this.f21976h.f21923f = this.f21970b.f21603P[2].f();
                this.f21977i.f21923f = -this.f21970b.f21603P[3].f();
            } else {
                f fVarH6 = h(this.f21970b.f21603P[2]);
                f fVarH7 = h(this.f21970b.f21603P[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f21978j = p.b.CENTER;
            }
            if (this.f21970b.W()) {
                c(this.f21951k, this.f21976h, 1, this.f21952l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f21976h, fVarH8, this.f21970b.f21603P[2].f());
                c(this.f21977i, this.f21976h, 1, this.f21973e);
                if (this.f21970b.W()) {
                    c(this.f21951k, this.f21976h, 1, this.f21952l);
                }
                e.b bVar2 = this.f21972d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f21970b.v() > 0.0f) {
                    l lVar = this.f21970b.f21622e;
                    if (lVar.f21972d == bVar3) {
                        lVar.f21973e.f21928k.add(this.f21973e);
                        this.f21973e.f21929l.add(this.f21970b.f21622e.f21973e);
                        this.f21973e.f21918a = this;
                    }
                }
            }
        } else {
            l0.d dVar7 = dVarArr2[3];
            if (dVar7.f21570f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f21977i, fVarH9, -this.f21970b.f21603P[3].f());
                    c(this.f21976h, this.f21977i, -1, this.f21973e);
                    if (this.f21970b.W()) {
                        c(this.f21951k, this.f21976h, 1, this.f21952l);
                    }
                }
            } else {
                l0.d dVar8 = dVarArr2[4];
                if (dVar8.f21570f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f21951k, fVarH10, 0);
                        c(this.f21976h, this.f21951k, -1, this.f21952l);
                        c(this.f21977i, this.f21976h, 1, this.f21973e);
                    }
                } else if (!(eVar5 instanceof l0.i) && eVar5.K() != null) {
                    b(this.f21976h, this.f21970b.K().f21624f.f21976h, this.f21970b.V());
                    c(this.f21977i, this.f21976h, 1, this.f21973e);
                    if (this.f21970b.W()) {
                        c(this.f21951k, this.f21976h, 1, this.f21952l);
                    }
                    e.b bVar4 = this.f21972d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f21970b.v() > 0.0f) {
                        l lVar2 = this.f21970b.f21622e;
                        if (lVar2.f21972d == bVar5) {
                            lVar2.f21973e.f21928k.add(this.f21973e);
                            this.f21973e.f21929l.add(this.f21970b.f21622e.f21973e);
                            this.f21973e.f21918a = this;
                        }
                    }
                }
            }
        }
        if (this.f21973e.f21929l.size() == 0) {
            this.f21973e.f21920c = true;
        }
    }

    @Override
    public void e() {
        f fVar = this.f21976h;
        if (fVar.f21927j) {
            this.f21970b.Z0(fVar.f21924g);
        }
    }

    @Override
    void f() {
        this.f21971c = null;
        this.f21976h.c();
        this.f21977i.c();
        this.f21951k.c();
        this.f21973e.c();
        this.f21975g = false;
    }

    @Override
    boolean m() {
        return this.f21972d != e.b.MATCH_CONSTRAINT || this.f21970b.f21646q == 0;
    }

    void q() {
        this.f21975g = false;
        this.f21976h.c();
        this.f21976h.f21927j = false;
        this.f21977i.c();
        this.f21977i.f21927j = false;
        this.f21951k.c();
        this.f21951k.f21927j = false;
        this.f21973e.f21927j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f21970b.t();
    }
}
