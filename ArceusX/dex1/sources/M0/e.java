package m0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l0.e;
import m0.C2558b;

public class e {

    private l0.f f21909a;

    private l0.f f21912d;

    private boolean f21910b = true;

    private boolean f21911c = true;

    private ArrayList<p> f21913e = new ArrayList<>();

    private ArrayList<m> f21914f = new ArrayList<>();

    private C2558b.InterfaceC0209b f21915g = null;

    private C2558b.a f21916h = new C2558b.a();

    ArrayList<m> f21917i = new ArrayList<>();

    public e(l0.f fVar) {
        this.f21909a = fVar;
        this.f21912d = fVar;
    }

    private void a(f fVar, int i7, int i8, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f21921d;
        if (pVar.f21971c == null) {
            l0.f fVar3 = this.f21909a;
            if (pVar == fVar3.f21622e || pVar == fVar3.f21624f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i8);
                arrayList.add(mVar);
            }
            pVar.f21971c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f21976h.f21928k) {
                if (dVar instanceof f) {
                    a((f) dVar, i7, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f21977i.f21928k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i7, 1, fVar2, arrayList, mVar);
                }
            }
            if (i7 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f21951k.f21928k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i7, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f21976h.f21929l) {
                if (fVar4 == fVar2) {
                    mVar.f21945b = true;
                }
                a(fVar4, i7, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f21977i.f21929l) {
                if (fVar5 == fVar2) {
                    mVar.f21945b = true;
                }
                a(fVar5, i7, 1, fVar2, arrayList, mVar);
            }
            if (i7 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f21951k.f21929l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i7, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(l0.f fVar) {
        int iT;
        e.b bVar;
        int iX;
        e.b bVar2;
        e.b[] bVarArr;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        e.b bVar6;
        Iterator<l0.e> it = fVar.f21755D0.iterator();
        while (it.hasNext()) {
            l0.e next = it.next();
            e.b[] bVarArr2 = next.f21606S;
            e.b bVar7 = bVarArr2[0];
            e.b bVar8 = bVarArr2[1];
            if (next.S() == 8) {
                next.f21614a = true;
            } else {
                if (next.f21654u < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    next.f21644p = 2;
                }
                if (next.f21660x < 1.0f && bVar8 == e.b.MATCH_CONSTRAINT) {
                    next.f21646q = 2;
                }
                if (next.v() > 0.0f) {
                    e.b bVar9 = e.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == e.b.WRAP_CONTENT || bVar8 == e.b.FIXED)) {
                        next.f21644p = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        next.f21646q = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (next.f21644p == 0) {
                            next.f21644p = 3;
                        }
                        if (next.f21646q == 0) {
                            next.f21646q = 3;
                        }
                    }
                }
                e.b bVar10 = e.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && next.f21644p == 1 && (next.f21595H.f21570f == null || next.f21597J.f21570f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                if (bVar8 == bVar10 && next.f21646q == 1 && (next.f21596I.f21570f == null || next.f21598K.f21570f == null)) {
                    bVar8 = e.b.WRAP_CONTENT;
                }
                e.b bVar12 = bVar8;
                l lVar = next.f21622e;
                lVar.f21972d = bVar11;
                int i7 = next.f21644p;
                lVar.f21969a = i7;
                n nVar = next.f21624f;
                nVar.f21972d = bVar12;
                int i8 = next.f21646q;
                nVar.f21969a = i8;
                e.b bVar13 = e.b.f21671v;
                if ((bVar11 == bVar13 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT) && (bVar12 == bVar13 || bVar12 == e.b.FIXED || bVar12 == e.b.WRAP_CONTENT)) {
                    int iT2 = next.T();
                    if (bVar11 == bVar13) {
                        iT = (fVar.T() - next.f21595H.f21571g) - next.f21597J.f21571g;
                        bVar = e.b.FIXED;
                    } else {
                        iT = iT2;
                        bVar = bVar11;
                    }
                    int iX2 = next.x();
                    if (bVar12 == bVar13) {
                        iX = (fVar.x() - next.f21596I.f21571g) - next.f21598K.f21571g;
                        bVar2 = e.b.FIXED;
                    } else {
                        iX = iX2;
                        bVar2 = bVar12;
                    }
                    l(next, bVar, iT, bVar2, iX);
                    next.f21622e.f21973e.d(next.T());
                    next.f21624f.f21973e.d(next.x());
                    next.f21614a = true;
                } else {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = e.b.WRAP_CONTENT) || bVar12 == e.b.FIXED)) {
                        if (i7 == 3) {
                            if (bVar12 == bVar6) {
                                l(next, bVar6, 0, bVar6, 0);
                            }
                            int iX3 = next.x();
                            int i9 = (int) ((iX3 * next.f21610W) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            l(next, bVar14, i9, bVar14, iX3);
                            next.f21622e.f21973e.d(next.T());
                            next.f21624f.f21973e.d(next.x());
                            next.f21614a = true;
                        } else if (i7 == 1) {
                            l(next, bVar6, 0, bVar12, 0);
                            next.f21622e.f21973e.f21939m = next.T();
                        } else if (i7 == 2) {
                            e.b bVar15 = fVar.f21606S[0];
                            e.b bVar16 = e.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                l(next, bVar16, (int) ((next.f21654u * fVar.T()) + 0.5f), bVar12, next.x());
                                next.f21622e.f21973e.d(next.T());
                                next.f21624f.f21973e.d(next.x());
                                next.f21614a = true;
                            }
                        } else {
                            l0.d[] dVarArr = next.f21603P;
                            if (dVarArr[0].f21570f == null || dVarArr[1].f21570f == null) {
                                l(next, bVar6, 0, bVar12, 0);
                                next.f21622e.f21973e.d(next.T());
                                next.f21624f.f21973e.d(next.x());
                                next.f21614a = true;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i8 == 3) {
                            if (bVar11 == bVar5) {
                                l(next, bVar5, 0, bVar5, 0);
                            }
                            int iT3 = next.T();
                            float f7 = next.f21610W;
                            if (next.w() == -1) {
                                f7 = 1.0f / f7;
                            }
                            e.b bVar17 = e.b.FIXED;
                            l(next, bVar17, iT3, bVar17, (int) ((iT3 * f7) + 0.5f));
                            next.f21622e.f21973e.d(next.T());
                            next.f21624f.f21973e.d(next.x());
                            next.f21614a = true;
                        } else if (i8 == 1) {
                            l(next, bVar11, 0, bVar5, 0);
                            next.f21624f.f21973e.f21939m = next.x();
                        } else if (i8 == 2) {
                            e.b bVar18 = fVar.f21606S[1];
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                l(next, bVar11, next.T(), bVar19, (int) ((next.f21660x * fVar.x()) + 0.5f));
                                next.f21622e.f21973e.d(next.T());
                                next.f21624f.f21973e.d(next.x());
                                next.f21614a = true;
                            }
                        } else {
                            l0.d[] dVarArr2 = next.f21603P;
                            if (dVarArr2[2].f21570f == null || dVarArr2[3].f21570f == null) {
                                l(next, bVar5, 0, bVar12, 0);
                                next.f21622e.f21973e.d(next.T());
                                next.f21624f.f21973e.d(next.x());
                                next.f21614a = true;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i7 == 1 || i8 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            l(next, bVar20, 0, bVar20, 0);
                            next.f21622e.f21973e.f21939m = next.T();
                            next.f21624f.f21973e.f21939m = next.x();
                        } else if (i8 == 2 && i7 == 2 && ((bVar3 = (bVarArr = fVar.f21606S)[0]) == (bVar4 = e.b.FIXED) || bVar3 == bVar4)) {
                            e.b bVar21 = bVarArr[1];
                            if (bVar21 == bVar4 || bVar21 == bVar4) {
                                l(next, bVar4, (int) ((next.f21654u * fVar.T()) + 0.5f), bVar4, (int) ((next.f21660x * fVar.x()) + 0.5f));
                                next.f21622e.f21973e.d(next.T());
                                next.f21624f.f21973e.d(next.x());
                                next.f21614a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(l0.f fVar, int i7) {
        int size = this.f21917i.size();
        long jMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            jMax = Math.max(jMax, this.f21917i.get(i8).b(fVar, i7));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i7, ArrayList<m> arrayList) {
        for (d dVar : pVar.f21976h.f21928k) {
            if (dVar instanceof f) {
                a((f) dVar, i7, 0, pVar.f21977i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f21976h, i7, 0, pVar.f21977i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f21977i.f21928k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i7, 1, pVar.f21976h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f21977i, i7, 1, pVar.f21976h, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (d dVar3 : ((n) pVar).f21951k.f21928k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i7, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(l0.e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        C2558b.a aVar = this.f21916h;
        aVar.f21897a = bVar;
        aVar.f21898b = bVar2;
        aVar.f21899c = i7;
        aVar.f21900d = i8;
        this.f21915g.b(eVar, aVar);
        eVar.X0(this.f21916h.f21901e);
        eVar.y0(this.f21916h.f21902f);
        eVar.x0(this.f21916h.f21904h);
        eVar.n0(this.f21916h.f21903g);
    }

    public void c() {
        d(this.f21913e);
        this.f21917i.clear();
        m.f21943h = 0;
        i(this.f21909a.f21622e, 0, this.f21917i);
        i(this.f21909a.f21624f, 1, this.f21917i);
        this.f21910b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f21912d.f21622e.f();
        this.f21912d.f21624f.f();
        arrayList.add(this.f21912d.f21622e);
        arrayList.add(this.f21912d.f21624f);
        Iterator<l0.e> it = this.f21912d.f21755D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            l0.e next = it.next();
            if (next instanceof l0.h) {
                arrayList.add(new j(next));
            } else {
                if (next.b0()) {
                    if (next.f21618c == null) {
                        next.f21618c = new C2559c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f21618c);
                } else {
                    arrayList.add(next.f21622e);
                }
                if (next.d0()) {
                    if (next.f21620d == null) {
                        next.f21620d = new C2559c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f21620d);
                } else {
                    arrayList.add(next.f21624f);
                }
                if (next instanceof l0.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f21970b != this.f21912d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z7) {
        boolean z8;
        boolean z9 = false;
        if (this.f21910b || this.f21911c) {
            Iterator<l0.e> it = this.f21909a.f21755D0.iterator();
            while (it.hasNext()) {
                l0.e next = it.next();
                next.n();
                next.f21614a = false;
                next.f21622e.r();
                next.f21624f.q();
            }
            this.f21909a.n();
            l0.f fVar = this.f21909a;
            fVar.f21614a = false;
            fVar.f21622e.r();
            this.f21909a.f21624f.q();
            this.f21911c = false;
        }
        if (b(this.f21912d)) {
            return false;
        }
        this.f21909a.Y0(0);
        this.f21909a.Z0(0);
        e.b bVarU = this.f21909a.u(0);
        e.b bVarU2 = this.f21909a.u(1);
        if (this.f21910b) {
            c();
        }
        int iU = this.f21909a.U();
        int iV = this.f21909a.V();
        this.f21909a.f21622e.f21976h.d(iU);
        this.f21909a.f21624f.f21976h.d(iV);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z7) {
                Iterator<p> it2 = this.f21913e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z7 = false;
                        break;
                    }
                }
            }
            if (z7 && bVarU == e.b.WRAP_CONTENT) {
                this.f21909a.C0(e.b.FIXED);
                l0.f fVar2 = this.f21909a;
                fVar2.X0(e(fVar2, 0));
                l0.f fVar3 = this.f21909a;
                fVar3.f21622e.f21973e.d(fVar3.T());
            }
            if (z7 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f21909a.T0(e.b.FIXED);
                l0.f fVar4 = this.f21909a;
                fVar4.y0(e(fVar4, 1));
                l0.f fVar5 = this.f21909a;
                fVar5.f21624f.f21973e.d(fVar5.x());
            }
        }
        l0.f fVar6 = this.f21909a;
        e.b bVar2 = fVar6.f21606S[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.f21671v) {
            int iT = fVar6.T() + iU;
            this.f21909a.f21622e.f21977i.d(iT);
            this.f21909a.f21622e.f21973e.d(iT - iU);
            m();
            l0.f fVar7 = this.f21909a;
            e.b bVar4 = fVar7.f21606S[1];
            if (bVar4 == bVar3 || bVar4 == e.b.f21671v) {
                int iX = fVar7.x() + iV;
                this.f21909a.f21624f.f21977i.d(iX);
                this.f21909a.f21624f.f21973e.d(iX - iV);
            }
            m();
            z8 = true;
        } else {
            z8 = false;
        }
        Iterator<p> it3 = this.f21913e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f21970b != this.f21909a || next2.f21975g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f21913e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z9 = true;
                break;
            }
            p next3 = it4.next();
            if (z8 || next3.f21970b != this.f21909a) {
                if (!next3.f21976h.f21927j || ((!next3.f21977i.f21927j && !(next3 instanceof j)) || (!next3.f21973e.f21927j && !(next3 instanceof C2559c) && !(next3 instanceof j)))) {
                    break;
                }
            }
        }
        this.f21909a.C0(bVarU);
        this.f21909a.T0(bVarU2);
        return z9;
    }

    public boolean g(boolean z7) {
        if (this.f21910b) {
            Iterator<l0.e> it = this.f21909a.f21755D0.iterator();
            while (it.hasNext()) {
                l0.e next = it.next();
                next.n();
                next.f21614a = false;
                l lVar = next.f21622e;
                lVar.f21973e.f21927j = false;
                lVar.f21975g = false;
                lVar.r();
                n nVar = next.f21624f;
                nVar.f21973e.f21927j = false;
                nVar.f21975g = false;
                nVar.q();
            }
            this.f21909a.n();
            l0.f fVar = this.f21909a;
            fVar.f21614a = false;
            l lVar2 = fVar.f21622e;
            lVar2.f21973e.f21927j = false;
            lVar2.f21975g = false;
            lVar2.r();
            n nVar2 = this.f21909a.f21624f;
            nVar2.f21973e.f21927j = false;
            nVar2.f21975g = false;
            nVar2.q();
            c();
        }
        if (b(this.f21912d)) {
            return false;
        }
        this.f21909a.Y0(0);
        this.f21909a.Z0(0);
        this.f21909a.f21622e.f21976h.d(0);
        this.f21909a.f21624f.f21976h.d(0);
        return true;
    }

    public boolean h(boolean z7, int i7) {
        boolean z8;
        e.b bVar;
        boolean z9 = false;
        e.b bVarU = this.f21909a.u(0);
        e.b bVarU2 = this.f21909a.u(1);
        int iU = this.f21909a.U();
        int iV = this.f21909a.V();
        if (z7 && (bVarU == (bVar = e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator<p> it = this.f21913e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f21974f == i7 && !next.m()) {
                    z7 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z7 && bVarU == e.b.WRAP_CONTENT) {
                    this.f21909a.C0(e.b.FIXED);
                    l0.f fVar = this.f21909a;
                    fVar.X0(e(fVar, 0));
                    l0.f fVar2 = this.f21909a;
                    fVar2.f21622e.f21973e.d(fVar2.T());
                }
            } else if (z7 && bVarU2 == e.b.WRAP_CONTENT) {
                this.f21909a.T0(e.b.FIXED);
                l0.f fVar3 = this.f21909a;
                fVar3.y0(e(fVar3, 1));
                l0.f fVar4 = this.f21909a;
                fVar4.f21624f.f21973e.d(fVar4.x());
            }
        }
        if (i7 == 0) {
            l0.f fVar5 = this.f21909a;
            e.b bVar2 = fVar5.f21606S[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.f21671v) {
                int iT = fVar5.T() + iU;
                this.f21909a.f21622e.f21977i.d(iT);
                this.f21909a.f21622e.f21973e.d(iT - iU);
                z8 = true;
            }
            z8 = false;
        } else {
            l0.f fVar6 = this.f21909a;
            e.b bVar3 = fVar6.f21606S[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.f21671v) {
                int iX = fVar6.x() + iV;
                this.f21909a.f21624f.f21977i.d(iX);
                this.f21909a.f21624f.f21973e.d(iX - iV);
                z8 = true;
            }
            z8 = false;
        }
        m();
        Iterator<p> it2 = this.f21913e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f21974f == i7 && (next2.f21970b != this.f21909a || next2.f21975g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f21913e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f21974f == i7 && (z8 || next3.f21970b != this.f21909a)) {
                if (!next3.f21976h.f21927j || !next3.f21977i.f21927j || (!(next3 instanceof C2559c) && !next3.f21973e.f21927j)) {
                    break;
                }
            }
        }
        this.f21909a.C0(bVarU);
        this.f21909a.T0(bVarU2);
        return z9;
    }

    public void j() {
        this.f21910b = true;
    }

    public void k() {
        this.f21911c = true;
    }

    public void m() {
        g gVar;
        Iterator<l0.e> it = this.f21909a.f21755D0.iterator();
        while (it.hasNext()) {
            l0.e next = it.next();
            if (!next.f21614a) {
                e.b[] bVarArr = next.f21606S;
                boolean z7 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i7 = next.f21644p;
                int i8 = next.f21646q;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z8 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i7 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i8 == 1)) {
                    z7 = true;
                }
                g gVar2 = next.f21622e.f21973e;
                boolean z9 = gVar2.f21927j;
                g gVar3 = next.f21624f.f21973e;
                boolean z10 = gVar3.f21927j;
                if (z9 && z10) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f21924g, bVar4, gVar3.f21924g);
                    next.f21614a = true;
                } else if (z9 && z7) {
                    l(next, e.b.FIXED, gVar2.f21924g, bVar3, gVar3.f21924g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f21624f.f21973e.f21939m = next.x();
                    } else {
                        next.f21624f.f21973e.d(next.x());
                        next.f21614a = true;
                    }
                } else if (z10 && z8) {
                    l(next, bVar3, gVar2.f21924g, e.b.FIXED, gVar3.f21924g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f21622e.f21973e.f21939m = next.T();
                    } else {
                        next.f21622e.f21973e.d(next.T());
                        next.f21614a = true;
                    }
                }
                if (next.f21614a && (gVar = next.f21624f.f21952l) != null) {
                    gVar.d(next.p());
                }
            }
        }
    }

    public void n(C2558b.InterfaceC0209b interfaceC0209b) {
        this.f21915g = interfaceC0209b;
    }
}
