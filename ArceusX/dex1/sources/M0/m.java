package m0;

import java.util.ArrayList;

class m {

    public static int f21943h;

    p f21946c;

    p f21947d;

    int f21949f;

    int f21950g;

    public int f21944a = 0;

    public boolean f21945b = false;

    ArrayList<p> f21948e = new ArrayList<>();

    public m(p pVar, int i7) {
        this.f21946c = null;
        this.f21947d = null;
        int i8 = f21943h;
        this.f21949f = i8;
        f21943h = i8 + 1;
        this.f21946c = pVar;
        this.f21947d = pVar;
        this.f21950g = i7;
    }

    private long c(f fVar, long j7) {
        p pVar = fVar.f21921d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f21928k.size();
        long jMin = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = fVar.f21928k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21921d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f21923f + j7));
                }
            }
        }
        if (fVar != pVar.f21977i) {
            return jMin;
        }
        long j8 = j7 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f21976h, j8)), j8 - pVar.f21976h.f21923f);
    }

    private long d(f fVar, long j7) {
        p pVar = fVar.f21921d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f21928k.size();
        long jMax = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = fVar.f21928k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21921d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f21923f + j7));
                }
            }
        }
        if (fVar != pVar.f21976h) {
            return jMax;
        }
        long j8 = j7 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f21977i, j8)), j8 - pVar.f21977i.f21923f);
    }

    public void a(p pVar) {
        this.f21948e.add(pVar);
        this.f21947d = pVar;
    }

    public long b(l0.f fVar, int i7) {
        long j7;
        int i8;
        p pVar = this.f21946c;
        if (pVar instanceof C2559c) {
            if (((C2559c) pVar).f21974f != i7) {
                return 0L;
            }
        } else if (i7 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i7 == 0 ? fVar.f21622e : fVar.f21624f).f21976h;
        f fVar3 = (i7 == 0 ? fVar.f21622e : fVar.f21624f).f21977i;
        boolean zContains = pVar.f21976h.f21929l.contains(fVar2);
        boolean zContains2 = this.f21946c.f21977i.f21929l.contains(fVar3);
        long j8 = this.f21946c.j();
        if (zContains && zContains2) {
            long jD = d(this.f21946c.f21976h, 0L);
            long jC = c(this.f21946c.f21977i, 0L);
            long j9 = jD - j8;
            p pVar2 = this.f21946c;
            int i9 = pVar2.f21977i.f21923f;
            if (j9 >= (-i9)) {
                j9 += i9;
            }
            int i10 = pVar2.f21976h.f21923f;
            long j10 = ((-jC) - j8) - i10;
            if (j10 >= i10) {
                j10 -= i10;
            }
            float fQ = pVar2.f21970b.q(i7);
            float f7 = fQ > 0.0f ? (long) ((j10 / fQ) + (j9 / (1.0f - fQ))) : 0L;
            long j11 = ((long) ((f7 * fQ) + 0.5f)) + j8 + ((long) ((f7 * (1.0f - fQ)) + 0.5f));
            j7 = r12.f21976h.f21923f + j11;
            i8 = this.f21946c.f21977i.f21923f;
        } else {
            if (zContains) {
                return Math.max(d(this.f21946c.f21976h, r12.f21923f), this.f21946c.f21976h.f21923f + j8);
            }
            if (zContains2) {
                return Math.max(-c(this.f21946c.f21977i, r12.f21923f), (-this.f21946c.f21977i.f21923f) + j8);
            }
            j7 = r12.f21976h.f21923f + this.f21946c.j();
            i8 = this.f21946c.f21977i.f21923f;
        }
        return j7 - i8;
    }
}
