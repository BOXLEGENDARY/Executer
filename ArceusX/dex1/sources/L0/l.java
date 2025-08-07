package l0;

import l0.e;
import m0.C2558b;

public class l extends j {

    private int f21742F0 = 0;

    private int f21743G0 = 0;

    private int f21744H0 = 0;

    private int f21745I0 = 0;

    private int f21746J0 = 0;

    private int f21747K0 = 0;

    private int f21748L0 = 0;

    private int f21749M0 = 0;

    private boolean f21750N0 = false;

    private int f21751O0 = 0;

    private int f21752P0 = 0;

    protected C2558b.a f21753Q0 = new C2558b.a();

    C2558b.InterfaceC0209b f21754R0 = null;

    @Override
    public void c(f fVar) {
        g1();
    }

    public void f1(boolean z7) {
        int i7 = this.f21746J0;
        if (i7 > 0 || this.f21747K0 > 0) {
            if (z7) {
                this.f21748L0 = this.f21747K0;
                this.f21749M0 = i7;
            } else {
                this.f21748L0 = i7;
                this.f21749M0 = this.f21747K0;
            }
        }
    }

    public void g1() {
        for (int i7 = 0; i7 < this.f21740E0; i7++) {
            e eVar = this.f21739D0[i7];
            if (eVar != null) {
                eVar.H0(true);
            }
        }
    }

    public int h1() {
        return this.f21752P0;
    }

    public int i1() {
        return this.f21751O0;
    }

    public int j1() {
        return this.f21743G0;
    }

    public int k1() {
        return this.f21748L0;
    }

    public int l1() {
        return this.f21749M0;
    }

    public int m1() {
        return this.f21742F0;
    }

    public void n1(int i7, int i8, int i9, int i10) {
    }

    protected void o1(e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        while (this.f21754R0 == null && K() != null) {
            this.f21754R0 = ((f) K()).v1();
        }
        C2558b.a aVar = this.f21753Q0;
        aVar.f21897a = bVar;
        aVar.f21898b = bVar2;
        aVar.f21899c = i7;
        aVar.f21900d = i8;
        this.f21754R0.b(eVar, aVar);
        eVar.X0(this.f21753Q0.f21901e);
        eVar.y0(this.f21753Q0.f21902f);
        eVar.x0(this.f21753Q0.f21904h);
        eVar.n0(this.f21753Q0.f21903g);
    }

    protected boolean p1() {
        e eVar = this.f21607T;
        C2558b.InterfaceC0209b interfaceC0209bV1 = eVar != null ? ((f) eVar).v1() : null;
        if (interfaceC0209bV1 == null) {
            return false;
        }
        for (int i7 = 0; i7 < this.f21740E0; i7++) {
            e eVar2 = this.f21739D0[i7];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarU = eVar2.u(0);
                e.b bVarU2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || eVar2.f21644p == 1 || bVarU2 != bVar || eVar2.f21646q == 1) {
                    if (bVarU == bVar) {
                        bVarU = e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = e.b.WRAP_CONTENT;
                    }
                    C2558b.a aVar = this.f21753Q0;
                    aVar.f21897a = bVarU;
                    aVar.f21898b = bVarU2;
                    aVar.f21899c = eVar2.T();
                    this.f21753Q0.f21900d = eVar2.x();
                    interfaceC0209bV1.b(eVar2, this.f21753Q0);
                    eVar2.X0(this.f21753Q0.f21901e);
                    eVar2.y0(this.f21753Q0.f21902f);
                    eVar2.n0(this.f21753Q0.f21903g);
                }
            }
        }
        return true;
    }

    public boolean q1() {
        return this.f21750N0;
    }

    protected void r1(boolean z7) {
        this.f21750N0 = z7;
    }

    public void s1(int i7, int i8) {
        this.f21751O0 = i7;
        this.f21752P0 = i8;
    }

    public void t1(int i7) {
        this.f21744H0 = i7;
        this.f21742F0 = i7;
        this.f21745I0 = i7;
        this.f21743G0 = i7;
        this.f21746J0 = i7;
        this.f21747K0 = i7;
    }

    public void u1(int i7) {
        this.f21743G0 = i7;
    }

    public void v1(int i7) {
        this.f21747K0 = i7;
    }

    public void w1(int i7) {
        this.f21744H0 = i7;
        this.f21748L0 = i7;
    }

    public void x1(int i7) {
        this.f21745I0 = i7;
        this.f21749M0 = i7;
    }

    public void y1(int i7) {
        this.f21746J0 = i7;
        this.f21748L0 = i7;
        this.f21749M0 = i7;
    }

    public void z1(int i7) {
        this.f21742F0 = i7;
    }
}
