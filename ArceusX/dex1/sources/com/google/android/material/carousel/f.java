package com.google.android.material.carousel;

import d4.C2388a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class f {

    private final float f17573a;

    private final List<c> f17574b;

    private final int f17575c;

    private final int f17576d;

    static final class b {

        private final float f17577a;

        private final float f17578b;

        private c f17580d;

        private c f17581e;

        private final List<c> f17579c = new ArrayList();

        private int f17582f = -1;

        private int f17583g = -1;

        private float f17584h = 0.0f;

        private int f17585i = -1;

        b(float f7, float f8) {
            this.f17577a = f7;
            this.f17578b = f8;
        }

        private static float j(float f7, float f8, int i7, int i8) {
            return (f7 - (i7 * f8)) + (i8 * f8);
        }

        b a(float f7, float f8, float f9) {
            return d(f7, f8, f9, false, true);
        }

        b b(float f7, float f8, float f9) {
            return c(f7, f8, f9, false);
        }

        b c(float f7, float f8, float f9, boolean z7) {
            return d(f7, f8, f9, z7, false);
        }

        b d(float f7, float f8, float f9, boolean z7, boolean z8) {
            float fAbs;
            float f10 = f9 / 2.0f;
            float f11 = f7 - f10;
            float f12 = f10 + f7;
            float f13 = this.f17578b;
            if (f12 > f13) {
                fAbs = Math.abs(f12 - Math.max(f12 - f9, f13));
            } else {
                fAbs = 0.0f;
                if (f11 < 0.0f) {
                    fAbs = Math.abs(f11 - Math.min(f11 + f9, 0.0f));
                }
            }
            return e(f7, f8, f9, z7, z8, fAbs);
        }

        b e(float f7, float f8, float f9, boolean z7, boolean z8, float f10) {
            return f(f7, f8, f9, z7, z8, f10, 0.0f, 0.0f);
        }

        b f(float f7, float f8, float f9, boolean z7, boolean z8, float f10, float f11, float f12) {
            if (f9 <= 0.0f) {
                return this;
            }
            if (z8) {
                if (z7) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i7 = this.f17585i;
                if (i7 != -1 && i7 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f17585i = this.f17579c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f7, f8, f9, z8, f10, f11, f12);
            if (z7) {
                if (this.f17580d == null) {
                    this.f17580d = cVar;
                    this.f17582f = this.f17579c.size();
                }
                if (this.f17583g != -1 && this.f17579c.size() - this.f17583g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f9 != this.f17580d.f17589d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f17581e = cVar;
                this.f17583g = this.f17579c.size();
            } else {
                if (this.f17580d == null && cVar.f17589d < this.f17584h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f17581e != null && cVar.f17589d > this.f17584h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f17584h = cVar.f17589d;
            this.f17579c.add(cVar);
            return this;
        }

        b g(float f7, float f8, float f9, int i7) {
            return h(f7, f8, f9, i7, false);
        }

        b h(float f7, float f8, float f9, int i7, boolean z7) {
            if (i7 > 0 && f9 > 0.0f) {
                for (int i8 = 0; i8 < i7; i8++) {
                    c((i8 * f9) + f7, f8, f9, z7);
                }
            }
            return this;
        }

        f i() {
            if (this.f17580d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < this.f17579c.size(); i7++) {
                c cVar = this.f17579c.get(i7);
                arrayList.add(new c(j(this.f17580d.f17587b, this.f17577a, this.f17582f, i7), cVar.f17587b, cVar.f17588c, cVar.f17589d, cVar.f17590e, cVar.f17591f, cVar.f17592g, cVar.f17593h));
            }
            return new f(this.f17577a, arrayList, this.f17582f, this.f17583g);
        }
    }

    static final class c {

        final float f17586a;

        final float f17587b;

        final float f17588c;

        final float f17589d;

        final boolean f17590e;

        final float f17591f;

        final float f17592g;

        final float f17593h;

        c(float f7, float f8, float f9, float f10) {
            this(f7, f8, f9, f10, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f7) {
            return new c(C2388a.a(cVar.f17586a, cVar2.f17586a, f7), C2388a.a(cVar.f17587b, cVar2.f17587b, f7), C2388a.a(cVar.f17588c, cVar2.f17588c, f7), C2388a.a(cVar.f17589d, cVar2.f17589d, f7));
        }

        c(float f7, float f8, float f9, float f10, boolean z7, float f11, float f12, float f13) {
            this.f17586a = f7;
            this.f17587b = f8;
            this.f17588c = f9;
            this.f17589d = f10;
            this.f17590e = z7;
            this.f17591f = f11;
            this.f17592g = f12;
            this.f17593h = f13;
        }
    }

    static f m(f fVar, f fVar2, float f7) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = fVar.g();
        List<c> listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < fVar.g().size(); i7++) {
            arrayList.add(c.a(listG.get(i7), listG2.get(i7), f7));
        }
        return new f(fVar.f(), arrayList, C2388a.c(fVar.b(), fVar2.b(), f7), C2388a.c(fVar.i(), fVar2.i(), f7));
    }

    static f n(f fVar, float f7) {
        b bVar = new b(fVar.f(), f7);
        float f8 = (f7 - fVar.j().f17587b) - (fVar.j().f17589d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d(f8 + (cVar.f17589d / 2.0f), cVar.f17588c, cVar.f17589d, size >= fVar.b() && size <= fVar.i(), cVar.f17590e);
            f8 += cVar.f17589d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f17574b.get(this.f17575c);
    }

    int b() {
        return this.f17575c;
    }

    c c() {
        return this.f17574b.get(0);
    }

    c d() {
        for (int i7 = 0; i7 < this.f17574b.size(); i7++) {
            c cVar = this.f17574b.get(i7);
            if (!cVar.f17590e) {
                return cVar;
            }
        }
        return null;
    }

    List<c> e() {
        return this.f17574b.subList(this.f17575c, this.f17576d + 1);
    }

    float f() {
        return this.f17573a;
    }

    List<c> g() {
        return this.f17574b;
    }

    c h() {
        return this.f17574b.get(this.f17576d);
    }

    int i() {
        return this.f17576d;
    }

    c j() {
        return this.f17574b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f17574b.size() - 1; size >= 0; size--) {
            c cVar = this.f17574b.get(size);
            if (!cVar.f17590e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f17574b.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (it.next().f17590e) {
                i7++;
            }
        }
        return this.f17574b.size() - i7;
    }

    private f(float f7, List<c> list, int i7, int i8) {
        this.f17573a = f7;
        this.f17574b = Collections.unmodifiableList(list);
        this.f17575c = i7;
        this.f17576d = i8;
    }
}
