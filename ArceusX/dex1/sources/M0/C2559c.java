package m0;

import java.util.ArrayList;
import java.util.Iterator;

public class C2559c extends p {

    ArrayList<p> f21907k;

    private int f21908l;

    public C2559c(l0.e eVar, int i7) {
        super(eVar);
        this.f21907k = new ArrayList<>();
        this.f21974f = i7;
        q();
    }

    private void q() {
        l0.e eVar;
        l0.e eVar2 = this.f21970b;
        l0.e eVarL = eVar2.L(this.f21974f);
        while (true) {
            l0.e eVar3 = eVarL;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarL = eVar2.L(this.f21974f);
            }
        }
        this.f21970b = eVar;
        this.f21907k.add(eVar.N(this.f21974f));
        l0.e eVarJ = eVar.J(this.f21974f);
        while (eVarJ != null) {
            this.f21907k.add(eVarJ.N(this.f21974f));
            eVarJ = eVarJ.J(this.f21974f);
        }
        Iterator<p> it = this.f21907k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i7 = this.f21974f;
            if (i7 == 0) {
                next.f21970b.f21618c = this;
            } else if (i7 == 1) {
                next.f21970b.f21620d = this;
            }
        }
        if (this.f21974f == 0 && ((l0.f) this.f21970b.K()).C1() && this.f21907k.size() > 1) {
            ArrayList<p> arrayList = this.f21907k;
            this.f21970b = arrayList.get(arrayList.size() - 1).f21970b;
        }
        this.f21908l = this.f21974f == 0 ? this.f21970b.z() : this.f21970b.P();
    }

    private l0.e r() {
        for (int i7 = 0; i7 < this.f21907k.size(); i7++) {
            p pVar = this.f21907k.get(i7);
            if (pVar.f21970b.S() != 8) {
                return pVar.f21970b;
            }
        }
        return null;
    }

    private l0.e s() {
        for (int size = this.f21907k.size() - 1; size >= 0; size--) {
            p pVar = this.f21907k.get(size);
            if (pVar.f21970b.S() != 8) {
                return pVar.f21970b;
            }
        }
        return null;
    }

    @Override
    public void a(m0.d r26) {
        throw new UnsupportedOperationException("Method not decompiled: m0.C2559c.a(m0.d):void");
    }

    @Override
    void d() {
        Iterator<p> it = this.f21907k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f21907k.size();
        if (size < 1) {
            return;
        }
        l0.e eVar = this.f21907k.get(0).f21970b;
        l0.e eVar2 = this.f21907k.get(size - 1).f21970b;
        if (this.f21974f == 0) {
            l0.d dVar = eVar.f21595H;
            l0.d dVar2 = eVar2.f21597J;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            l0.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.f21595H.f();
            }
            if (fVarI != null) {
                b(this.f21976h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            l0.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.f21597J.f();
            }
            if (fVarI2 != null) {
                b(this.f21977i, fVarI2, -iF2);
            }
        } else {
            l0.d dVar3 = eVar.f21596I;
            l0.d dVar4 = eVar2.f21598K;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            l0.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.f21596I.f();
            }
            if (fVarI3 != null) {
                b(this.f21976h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            l0.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.f21598K.f();
            }
            if (fVarI4 != null) {
                b(this.f21977i, fVarI4, -iF4);
            }
        }
        this.f21976h.f21918a = this;
        this.f21977i.f21918a = this;
    }

    @Override
    public void e() {
        for (int i7 = 0; i7 < this.f21907k.size(); i7++) {
            this.f21907k.get(i7).e();
        }
    }

    @Override
    void f() {
        this.f21971c = null;
        Iterator<p> it = this.f21907k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override
    public long j() {
        int size = this.f21907k.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j7 = j7 + r4.f21976h.f21923f + this.f21907k.get(i7).j() + r4.f21977i.f21923f;
        }
        return j7;
    }

    @Override
    boolean m() {
        int size = this.f21907k.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!this.f21907k.get(i7).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f21974f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<p> it = this.f21907k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
