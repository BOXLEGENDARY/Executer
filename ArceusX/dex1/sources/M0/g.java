package m0;

import m0.f;

class g extends f {

    public int f21939m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f21922e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f21922e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override
    public void d(int i7) {
        if (this.f21927j) {
            return;
        }
        this.f21927j = true;
        this.f21924g = i7;
        for (d dVar : this.f21928k) {
            dVar.a(dVar);
        }
    }
}
