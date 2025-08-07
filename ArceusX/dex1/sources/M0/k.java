package m0;

import java.util.Iterator;
import l0.C2525a;
import m0.f;

class k extends p {
    public k(l0.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f21976h.f21928k.add(fVar);
        fVar.f21929l.add(this.f21976h);
    }

    @Override
    public void a(d dVar) {
        C2525a c2525a = (C2525a) this.f21970b;
        int iH1 = c2525a.h1();
        Iterator<f> it = this.f21976h.f21929l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = it.next().f21924g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (iH1 == 0 || iH1 == 2) {
            this.f21976h.d(i8 + c2525a.i1());
        } else {
            this.f21976h.d(i7 + c2525a.i1());
        }
    }

    @Override
    void d() {
        l0.e eVar = this.f21970b;
        if (eVar instanceof C2525a) {
            this.f21976h.f21919b = true;
            C2525a c2525a = (C2525a) eVar;
            int iH1 = c2525a.h1();
            boolean zG1 = c2525a.g1();
            int i7 = 0;
            if (iH1 == 0) {
                this.f21976h.f21922e = f.a.LEFT;
                while (i7 < c2525a.f21740E0) {
                    l0.e eVar2 = c2525a.f21739D0[i7];
                    if (zG1 || eVar2.S() != 8) {
                        f fVar = eVar2.f21622e.f21976h;
                        fVar.f21928k.add(this.f21976h);
                        this.f21976h.f21929l.add(fVar);
                    }
                    i7++;
                }
                q(this.f21970b.f21622e.f21976h);
                q(this.f21970b.f21622e.f21977i);
                return;
            }
            if (iH1 == 1) {
                this.f21976h.f21922e = f.a.RIGHT;
                while (i7 < c2525a.f21740E0) {
                    l0.e eVar3 = c2525a.f21739D0[i7];
                    if (zG1 || eVar3.S() != 8) {
                        f fVar2 = eVar3.f21622e.f21977i;
                        fVar2.f21928k.add(this.f21976h);
                        this.f21976h.f21929l.add(fVar2);
                    }
                    i7++;
                }
                q(this.f21970b.f21622e.f21976h);
                q(this.f21970b.f21622e.f21977i);
                return;
            }
            if (iH1 == 2) {
                this.f21976h.f21922e = f.a.TOP;
                while (i7 < c2525a.f21740E0) {
                    l0.e eVar4 = c2525a.f21739D0[i7];
                    if (zG1 || eVar4.S() != 8) {
                        f fVar3 = eVar4.f21624f.f21976h;
                        fVar3.f21928k.add(this.f21976h);
                        this.f21976h.f21929l.add(fVar3);
                    }
                    i7++;
                }
                q(this.f21970b.f21624f.f21976h);
                q(this.f21970b.f21624f.f21977i);
                return;
            }
            if (iH1 != 3) {
                return;
            }
            this.f21976h.f21922e = f.a.BOTTOM;
            while (i7 < c2525a.f21740E0) {
                l0.e eVar5 = c2525a.f21739D0[i7];
                if (zG1 || eVar5.S() != 8) {
                    f fVar4 = eVar5.f21624f.f21977i;
                    fVar4.f21928k.add(this.f21976h);
                    this.f21976h.f21929l.add(fVar4);
                }
                i7++;
            }
            q(this.f21970b.f21624f.f21976h);
            q(this.f21970b.f21624f.f21977i);
        }
    }

    @Override
    public void e() {
        l0.e eVar = this.f21970b;
        if (eVar instanceof C2525a) {
            int iH1 = ((C2525a) eVar).h1();
            if (iH1 == 0 || iH1 == 1) {
                this.f21970b.Y0(this.f21976h.f21924g);
            } else {
                this.f21970b.Z0(this.f21976h.f21924g);
            }
        }
    }

    @Override
    void f() {
        this.f21971c = null;
        this.f21976h.c();
    }

    @Override
    boolean m() {
        return false;
    }
}
