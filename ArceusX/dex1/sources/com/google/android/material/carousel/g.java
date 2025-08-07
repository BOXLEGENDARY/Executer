package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import d4.C2388a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s0.C2870a;

class g {

    private final f f17594a;

    private final List<f> f17595b;

    private final List<f> f17596c;

    private final float[] f17597d;

    private final float[] f17598e;

    private final float f17599f;

    private final float f17600g;

    private g(f fVar, List<f> list, List<f> list2) {
        this.f17594a = fVar;
        this.f17595b = Collections.unmodifiableList(list);
        this.f17596c = Collections.unmodifiableList(list2);
        float f7 = list.get(list.size() - 1).c().f17586a - fVar.c().f17586a;
        this.f17599f = f7;
        float f8 = fVar.j().f17586a - list2.get(list2.size() - 1).j().f17586a;
        this.f17600g = f8;
        this.f17597d = m(f7, list, true);
        this.f17598e = m(f8, list2, false);
    }

    private f a(List<f> list, float f7, float[] fArr) {
        float[] fArrO = o(list, f7, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    private static int b(f fVar, float f7) {
        for (int i7 = fVar.i(); i7 < fVar.g().size(); i7++) {
            if (f7 == fVar.g().get(i7).f17588c) {
                return i7;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i7 = 0; i7 < fVar.g().size(); i7++) {
            if (!fVar.g().get(i7).f17590e) {
                return i7;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f7) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f7 == fVar.g().get(iB).f17588c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!fVar.g().get(size).f17590e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f7, float f8, float f9) {
        return new g(fVar, p(bVar, fVar, f7, f8), n(bVar, fVar, f7, f9));
    }

    private static float[] m(float f7, List<f> list, boolean z7) {
        int size = list.size();
        float[] fArr = new float[size];
        int i7 = 1;
        while (i7 < size) {
            int i8 = i7 - 1;
            f fVar = list.get(i8);
            f fVar2 = list.get(i7);
            fArr[i7] = i7 == size + (-1) ? 1.0f : fArr[i8] + ((z7 ? fVar2.c().f17586a - fVar.c().f17586a : fVar.j().f17586a - fVar2.j().f17586a) / f7);
            i7++;
        }
        return fArr;
    }

    private static List<f> n(b bVar, f fVar, float f7, float f8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        if (r(bVar, fVar) || iE == -1) {
            if (f8 > 0.0f) {
                arrayList.add(u(fVar, f8, fA, false, f7));
            }
            return arrayList;
        }
        int i7 = iE - fVar.i();
        float f9 = fVar.c().f17587b - (fVar.c().f17589d / 2.0f);
        if (i7 <= 0 && fVar.h().f17591f > 0.0f) {
            arrayList.add(v(fVar, f9 - fVar.h().f17591f, fA));
            return arrayList;
        }
        float f10 = 0.0f;
        int i8 = 0;
        while (i8 < i7) {
            f fVar2 = (f) arrayList.get(arrayList.size() - 1);
            int i9 = iE - i8;
            float f11 = f10 + fVar.g().get(i9).f17591f;
            int i10 = i9 + 1;
            int i11 = i8;
            f fVarT = t(fVar2, iE, i10 < fVar.g().size() ? d(fVar2, fVar.g().get(i10).f17588c) + 1 : 0, f9 - f11, fVar.b() + i8 + 1, fVar.i() + i8 + 1, fA);
            if (i11 == i7 - 1 && f8 > 0.0f) {
                fVarT = u(fVarT, f8, fA, false, f7);
            }
            arrayList.add(fVarT);
            i8 = i11 + 1;
            f10 = f11;
        }
        return arrayList;
    }

    private static float[] o(List<f> list, float f7, float[] fArr) {
        int size = list.size();
        float f8 = fArr[0];
        int i7 = 1;
        while (i7 < size) {
            float f9 = fArr[i7];
            if (f7 <= f9) {
                return new float[]{C2388a.b(0.0f, 1.0f, f8, f9, f7), i7 - 1, i7};
            }
            i7++;
            f8 = f9;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<f> p(b bVar, f fVar, float f7, float f8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        int i7 = 1;
        if (q(fVar) || iC == -1) {
            if (f8 > 0.0f) {
                arrayList.add(u(fVar, f8, fA, true, f7));
            }
            return arrayList;
        }
        int iB = fVar.b() - iC;
        float f9 = fVar.c().f17587b - (fVar.c().f17589d / 2.0f);
        if (iB <= 0 && fVar.a().f17591f > 0.0f) {
            arrayList.add(v(fVar, f9 + fVar.a().f17591f, fA));
            return arrayList;
        }
        int i8 = 0;
        float f10 = 0.0f;
        while (i8 < iB) {
            f fVar2 = (f) arrayList.get(arrayList.size() - i7);
            int i9 = iC + i8;
            int size = fVar.g().size() - i7;
            float f11 = f10 + fVar.g().get(i9).f17591f;
            int i10 = i9 - i7;
            int iB2 = i10 >= 0 ? b(fVar2, fVar.g().get(i10).f17588c) - i7 : size;
            int i11 = i8;
            f fVarT = t(fVar2, iC, iB2, f9 + f11, (fVar.b() - i8) - 1, (fVar.i() - i8) - 1, fA);
            if (i11 == iB - 1 && f8 > 0.0f) {
                fVarT = u(fVarT, f8, fA, true, f7);
            }
            arrayList.add(fVarT);
            i8 = i11 + 1;
            f10 = f11;
            i7 = 1;
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f17587b - (fVar.a().f17589d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int iB = bVar.b();
        if (bVar.f()) {
            iB = bVar.a();
        }
        return fVar.h().f17587b + (fVar.h().f17589d / 2.0f) <= ((float) iB) && fVar.h() == fVar.k();
    }

    private static f s(List<f> list, float f7, float[] fArr) {
        float[] fArrO = o(list, f7, fArr);
        return f.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    private static f t(f fVar, int i7, int i8, float f7, int i9, int i10, float f8) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i8, (f.c) arrayList.remove(i7));
        f.b bVar = new f.b(fVar.f(), f8);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i11);
            float f9 = cVar.f17589d;
            bVar.e(f7 + (f9 / 2.0f), cVar.f17588c, f9, i11 >= i9 && i11 <= i10, cVar.f17590e, cVar.f17591f);
            f7 += cVar.f17589d;
            i11++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f7, float f8, boolean z7, float f9) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f8);
        float fL = f7 / fVar.l();
        float f10 = z7 ? f7 : 0.0f;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i7);
            if (cVar.f17590e) {
                bVar.e(cVar.f17587b, cVar.f17588c, cVar.f17589d, false, true, cVar.f17591f);
            } else {
                boolean z8 = i7 >= fVar.b() && i7 <= fVar.i();
                float f11 = cVar.f17589d - fL;
                float fB = d.b(f11, fVar.f(), f9);
                float f12 = (f11 / 2.0f) + f10;
                float f13 = f12 - cVar.f17587b;
                bVar.f(f12, fB, f11, z8, false, cVar.f17591f, z7 ? f13 : 0.0f, z7 ? 0.0f : f13);
                f10 += f11;
            }
            i7++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f7, float f8) {
        return t(fVar, 0, 0, f7, fVar.b(), fVar.i(), f8);
    }

    f g() {
        return this.f17594a;
    }

    f h() {
        return this.f17596c.get(r0.size() - 1);
    }

    Map<Integer, f> i(int i7, int i8, int i9, boolean z7) {
        float f7 = this.f17594a.f();
        HashMap map = new HashMap();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            int i12 = z7 ? (i7 - i10) - 1 : i10;
            if (i12 * f7 * (z7 ? -1 : 1) > i9 - this.f17600g || i10 >= i7 - this.f17596c.size()) {
                Integer numValueOf = Integer.valueOf(i12);
                List<f> list = this.f17596c;
                map.put(numValueOf, list.get(C2870a.c(i11, 0, list.size() - 1)));
                i11++;
            }
            i10++;
        }
        int i13 = 0;
        for (int i14 = i7 - 1; i14 >= 0; i14--) {
            int i15 = z7 ? (i7 - i14) - 1 : i14;
            if (i15 * f7 * (z7 ? -1 : 1) < i8 + this.f17599f || i14 < this.f17595b.size()) {
                Integer numValueOf2 = Integer.valueOf(i15);
                List<f> list2 = this.f17595b;
                map.put(numValueOf2, list2.get(C2870a.c(i13, 0, list2.size() - 1)));
                i13++;
            }
        }
        return map;
    }

    public f j(float f7, float f8, float f9) {
        return k(f7, f8, f9, false);
    }

    f k(float f7, float f8, float f9, boolean z7) {
        float fB;
        List<f> list;
        float[] fArr;
        float f10 = this.f17599f + f8;
        float f11 = f9 - this.f17600g;
        float f12 = l().a().f17592g;
        float f13 = h().h().f17593h;
        if (this.f17599f == f12) {
            f10 += f12;
        }
        if (this.f17600g == f13) {
            f11 -= f13;
        }
        if (f7 < f10) {
            fB = C2388a.b(1.0f, 0.0f, f8, f10, f7);
            list = this.f17595b;
            fArr = this.f17597d;
        } else {
            if (f7 <= f11) {
                return this.f17594a;
            }
            fB = C2388a.b(0.0f, 1.0f, f11, f9, f7);
            list = this.f17596c;
            fArr = this.f17598e;
        }
        return z7 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        return this.f17595b.get(r0.size() - 1);
    }
}
