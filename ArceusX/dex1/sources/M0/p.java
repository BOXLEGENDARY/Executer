package m0;

import l0.d;
import l0.e;

public abstract class p implements d {

    public int f21969a;

    l0.e f21970b;

    m f21971c;

    protected e.b f21972d;

    g f21973e = new g(this);

    public int f21974f = 0;

    boolean f21975g = false;

    public f f21976h = new f(this);

    public f f21977i = new f(this);

    protected b f21978j = b.NONE;

    static class a {

        static final int[] f21979a;

        static {
            int[] iArr = new int[d.b.values().length];
            f21979a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21979a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21979a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21979a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21979a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(l0.e eVar) {
        this.f21970b = eVar;
    }

    private void l(int i7, int i8) {
        int i9 = this.f21969a;
        if (i9 == 0) {
            this.f21973e.d(g(i8, i7));
            return;
        }
        if (i9 == 1) {
            this.f21973e.d(Math.min(g(this.f21973e.f21939m, i7), i8));
            return;
        }
        if (i9 == 2) {
            l0.e eVarK = this.f21970b.K();
            if (eVarK != null) {
                if ((i7 == 0 ? eVarK.f21622e : eVarK.f21624f).f21973e.f21927j) {
                    l0.e eVar = this.f21970b;
                    this.f21973e.d(g((int) ((r9.f21924g * (i7 == 0 ? eVar.f21654u : eVar.f21660x)) + 0.5f), i7));
                    return;
                }
                return;
            }
            return;
        }
        if (i9 != 3) {
            return;
        }
        l0.e eVar2 = this.f21970b;
        p pVar = eVar2.f21622e;
        e.b bVar = pVar.f21972d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f21969a == 3) {
            n nVar = eVar2.f21624f;
            if (nVar.f21972d == bVar2 && nVar.f21969a == 3) {
                return;
            }
        }
        if (i7 == 0) {
            pVar = eVar2.f21624f;
        }
        if (pVar.f21973e.f21927j) {
            float fV = eVar2.v();
            this.f21973e.d(i7 == 1 ? (int) ((pVar.f21973e.f21924g / fV) + 0.5f) : (int) ((fV * pVar.f21973e.f21924g) + 0.5f));
        }
    }

    @Override
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i7) {
        fVar.f21929l.add(fVar2);
        fVar.f21923f = i7;
        fVar2.f21928k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f21929l.add(fVar2);
        fVar.f21929l.add(this.f21973e);
        fVar.f21925h = i7;
        fVar.f21926i = gVar;
        fVar2.f21928k.add(fVar);
        gVar.f21928k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i7, int i8) {
        int iMax;
        if (i8 == 0) {
            l0.e eVar = this.f21970b;
            int i9 = eVar.f21652t;
            iMax = Math.max(eVar.f21650s, i7);
            if (i9 > 0) {
                iMax = Math.min(i9, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        } else {
            l0.e eVar2 = this.f21970b;
            int i10 = eVar2.f21658w;
            iMax = Math.max(eVar2.f21656v, i7);
            if (i10 > 0) {
                iMax = Math.min(i10, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        }
        return iMax;
    }

    protected final f h(l0.d dVar) {
        l0.d dVar2 = dVar.f21570f;
        if (dVar2 == null) {
            return null;
        }
        l0.e eVar = dVar2.f21568d;
        int i7 = a.f21979a[dVar2.f21569e.ordinal()];
        if (i7 == 1) {
            return eVar.f21622e.f21976h;
        }
        if (i7 == 2) {
            return eVar.f21622e.f21977i;
        }
        if (i7 == 3) {
            return eVar.f21624f.f21976h;
        }
        if (i7 == 4) {
            return eVar.f21624f.f21951k;
        }
        if (i7 != 5) {
            return null;
        }
        return eVar.f21624f.f21977i;
    }

    protected final f i(l0.d dVar, int i7) {
        l0.d dVar2 = dVar.f21570f;
        if (dVar2 == null) {
            return null;
        }
        l0.e eVar = dVar2.f21568d;
        p pVar = i7 == 0 ? eVar.f21622e : eVar.f21624f;
        int i8 = a.f21979a[dVar2.f21569e.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f21977i;
        }
        return pVar.f21976h;
    }

    public long j() {
        if (this.f21973e.f21927j) {
            return r0.f21924g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f21975g;
    }

    abstract boolean m();

    protected void n(d dVar, l0.d dVar2, l0.d dVar3, int i7) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f21927j && fVarH2.f21927j) {
            int iF = fVarH.f21924g + dVar2.f();
            int iF2 = fVarH2.f21924g - dVar3.f();
            int i8 = iF2 - iF;
            if (!this.f21973e.f21927j && this.f21972d == e.b.MATCH_CONSTRAINT) {
                l(i7, i8);
            }
            g gVar = this.f21973e;
            if (gVar.f21927j) {
                if (gVar.f21924g == i8) {
                    this.f21976h.d(iF);
                    this.f21977i.d(iF2);
                    return;
                }
                l0.e eVar = this.f21970b;
                float fY = i7 == 0 ? eVar.y() : eVar.O();
                if (fVarH == fVarH2) {
                    iF = fVarH.f21924g;
                    iF2 = fVarH2.f21924g;
                    fY = 0.5f;
                }
                this.f21976h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f21973e.f21924g) * fY)));
                this.f21977i.d(this.f21976h.f21924g + this.f21973e.f21924g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
