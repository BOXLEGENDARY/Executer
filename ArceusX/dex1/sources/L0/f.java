package l0;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k0.C2510d;
import k0.C2511e;
import l0.e;
import m0.C2558b;

public class f extends m {

    int f21678J0;

    int f21679K0;

    int f21680L0;

    int f21681M0;

    C2558b f21673E0 = new C2558b(this);

    public m0.e f21674F0 = new m0.e(this);

    protected C2558b.InterfaceC0209b f21675G0 = null;

    private boolean f21676H0 = false;

    protected C2510d f21677I0 = new C2510d();

    public int f21682N0 = 0;

    public int f21683O0 = 0;

    c[] f21684P0 = new c[4];

    c[] f21685Q0 = new c[4];

    public boolean f21686R0 = false;

    public boolean f21687S0 = false;
    public boolean T0 = false;
    public int U0 = 0;
    public int V0 = 0;

    private int f21688W0 = 257;

    public boolean f21689X0 = false;

    private boolean f21690Y0 = false;

    private boolean f21691Z0 = false;

    int f21692a1 = 0;

    private WeakReference<d> f21693b1 = null;

    private WeakReference<d> f21694c1 = null;

    private WeakReference<d> f21695d1 = null;

    private WeakReference<d> f21696e1 = null;

    public C2558b.a f21697f1 = new C2558b.a();

    public static boolean F1(e eVar, C2558b.InterfaceC0209b interfaceC0209b, C2558b.a aVar, int i7) {
        int i8;
        int i9;
        if (interfaceC0209b == null) {
            return false;
        }
        aVar.f21897a = eVar.A();
        aVar.f21898b = eVar.Q();
        aVar.f21899c = eVar.T();
        aVar.f21900d = eVar.x();
        aVar.f21905i = false;
        aVar.f21906j = i7;
        e.b bVar = aVar.f21897a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f21898b == bVar2;
        boolean z9 = z7 && eVar.f21610W > 0.0f;
        boolean z10 = z8 && eVar.f21610W > 0.0f;
        if (z7 && eVar.X(0) && eVar.f21644p == 0 && !z9) {
            aVar.f21897a = e.b.WRAP_CONTENT;
            if (z8 && eVar.f21646q == 0) {
                aVar.f21897a = e.b.FIXED;
            }
            z7 = false;
        }
        if (z8 && eVar.X(1) && eVar.f21646q == 0 && !z10) {
            aVar.f21898b = e.b.WRAP_CONTENT;
            if (z7 && eVar.f21644p == 0) {
                aVar.f21898b = e.b.FIXED;
            }
            z8 = false;
        }
        if (eVar.g0()) {
            aVar.f21897a = e.b.FIXED;
            z7 = false;
        }
        if (eVar.h0()) {
            aVar.f21898b = e.b.FIXED;
            z8 = false;
        }
        if (z9) {
            if (eVar.f21648r[0] == 4) {
                aVar.f21897a = e.b.FIXED;
            } else if (!z8) {
                e.b bVar3 = aVar.f21898b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i9 = aVar.f21900d;
                } else {
                    aVar.f21897a = e.b.WRAP_CONTENT;
                    interfaceC0209b.b(eVar, aVar);
                    i9 = aVar.f21902f;
                }
                aVar.f21897a = bVar4;
                int i10 = eVar.f21611X;
                if (i10 == 0 || i10 == -1) {
                    aVar.f21899c = (int) (eVar.v() * i9);
                } else {
                    aVar.f21899c = (int) (eVar.v() / i9);
                }
            }
        }
        if (z10) {
            if (eVar.f21648r[1] == 4) {
                aVar.f21898b = e.b.FIXED;
            } else if (!z7) {
                e.b bVar5 = aVar.f21897a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i8 = aVar.f21899c;
                } else {
                    aVar.f21898b = e.b.WRAP_CONTENT;
                    interfaceC0209b.b(eVar, aVar);
                    i8 = aVar.f21901e;
                }
                aVar.f21898b = bVar6;
                int i11 = eVar.f21611X;
                if (i11 == 0 || i11 == -1) {
                    aVar.f21900d = (int) (i8 / eVar.v());
                } else {
                    aVar.f21900d = (int) (i8 * eVar.v());
                }
            }
        }
        interfaceC0209b.b(eVar, aVar);
        eVar.X0(aVar.f21901e);
        eVar.y0(aVar.f21902f);
        eVar.x0(aVar.f21904h);
        eVar.n0(aVar.f21903g);
        aVar.f21906j = C2558b.a.f21894k;
        return aVar.f21905i;
    }

    private void H1() {
        this.f21682N0 = 0;
        this.f21683O0 = 0;
    }

    private void j1(e eVar) {
        int i7 = this.f21682N0 + 1;
        c[] cVarArr = this.f21685Q0;
        if (i7 >= cVarArr.length) {
            this.f21685Q0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f21685Q0[this.f21682N0] = new c(eVar, 0, C1());
        this.f21682N0++;
    }

    private void m1(d dVar, k0.i iVar) {
        this.f21677I0.h(iVar, this.f21677I0.q(dVar), 0, 5);
    }

    private void n1(d dVar, k0.i iVar) {
        this.f21677I0.h(this.f21677I0.q(dVar), iVar, 0, 5);
    }

    private void o1(e eVar) {
        int i7 = this.f21683O0 + 1;
        c[] cVarArr = this.f21684P0;
        if (i7 >= cVarArr.length) {
            this.f21684P0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f21684P0[this.f21683O0] = new c(eVar, 1, C1());
        this.f21683O0++;
    }

    public void A1() {
        this.f21674F0.k();
    }

    public boolean B1() {
        return this.f21691Z0;
    }

    public boolean C1() {
        return this.f21676H0;
    }

    public boolean D1() {
        return this.f21690Y0;
    }

    public long E1(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f21678J0 = i14;
        this.f21679K0 = i15;
        return this.f21673E0.d(this, i7, i14, i15, i8, i9, i10, i11, i12, i13);
    }

    public boolean G1(int i7) {
        return (this.f21688W0 & i7) == i7;
    }

    public void I1(C2558b.InterfaceC0209b interfaceC0209b) {
        this.f21675G0 = interfaceC0209b;
        this.f21674F0.n(interfaceC0209b);
    }

    public void J1(int i7) {
        this.f21688W0 = i7;
        C2510d.f21179r = G1(512);
    }

    public void K1(boolean z7) {
        this.f21676H0 = z7;
    }

    public void L1(C2510d c2510d, boolean[] zArr) {
        zArr[2] = false;
        boolean zG1 = G1(64);
        c1(c2510d, zG1);
        int size = this.f21755D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f21755D0.get(i7).c1(c2510d, zG1);
        }
    }

    public void M1() {
        this.f21673E0.e(this);
    }

    @Override
    public void b1(boolean z7, boolean z8) {
        super.b1(z7, z8);
        int size = this.f21755D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f21755D0.get(i7).b1(z7, z8);
        }
    }

    @Override
    public void e1() {
        throw new UnsupportedOperationException("Method not decompiled: l0.f.e1():void");
    }

    void h1(e eVar, int i7) {
        if (i7 == 0) {
            j1(eVar);
        } else if (i7 == 1) {
            o1(eVar);
        }
    }

    public boolean i1(C2510d c2510d) {
        boolean zG1 = G1(64);
        g(c2510d, zG1);
        int size = this.f21755D0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = this.f21755D0.get(i7);
            eVar.F0(0, false);
            eVar.F0(1, false);
            if (eVar instanceof C2525a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar2 = this.f21755D0.get(i8);
                if (eVar2 instanceof C2525a) {
                    ((C2525a) eVar2).k1();
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar3 = this.f21755D0.get(i9);
            if (eVar3.f()) {
                eVar3.g(c2510d, zG1);
            }
        }
        if (C2510d.f21179r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar4 = this.f21755D0.get(i10);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, c2510d, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                k.a(this, c2510d, next);
                next.g(c2510d, zG1);
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar5 = this.f21755D0.get(i11);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f21606S;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.C0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.T0(e.b.FIXED);
                    }
                    eVar5.g(c2510d, zG1);
                    if (bVar == bVar3) {
                        eVar5.C0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.T0(bVar2);
                    }
                } else {
                    k.a(this, c2510d, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(c2510d, zG1);
                    }
                }
            }
        }
        if (this.f21682N0 > 0) {
            b.b(this, c2510d, null, 0);
        }
        if (this.f21683O0 > 0) {
            b.b(this, c2510d, null, 1);
        }
        return true;
    }

    @Override
    public void j0() {
        this.f21677I0.E();
        this.f21678J0 = 0;
        this.f21680L0 = 0;
        this.f21679K0 = 0;
        this.f21681M0 = 0;
        this.f21689X0 = false;
        super.j0();
    }

    public void k1(d dVar) {
        WeakReference<d> weakReference = this.f21696e1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f21696e1.get().e()) {
            this.f21696e1 = new WeakReference<>(dVar);
        }
    }

    public void l1(d dVar) {
        WeakReference<d> weakReference = this.f21694c1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f21694c1.get().e()) {
            this.f21694c1 = new WeakReference<>(dVar);
        }
    }

    void p1(d dVar) {
        WeakReference<d> weakReference = this.f21695d1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f21695d1.get().e()) {
            this.f21695d1 = new WeakReference<>(dVar);
        }
    }

    void q1(d dVar) {
        WeakReference<d> weakReference = this.f21693b1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f21693b1.get().e()) {
            this.f21693b1 = new WeakReference<>(dVar);
        }
    }

    public boolean r1(boolean z7) {
        return this.f21674F0.f(z7);
    }

    public boolean s1(boolean z7) {
        return this.f21674F0.g(z7);
    }

    public boolean t1(boolean z7, int i7) {
        return this.f21674F0.h(z7, i7);
    }

    public void u1(C2511e c2511e) {
        this.f21677I0.v(c2511e);
    }

    public C2558b.InterfaceC0209b v1() {
        return this.f21675G0;
    }

    public int w1() {
        return this.f21688W0;
    }

    public C2510d x1() {
        return this.f21677I0;
    }

    public boolean y1() {
        return false;
    }

    public void z1() {
        this.f21674F0.j();
    }
}
