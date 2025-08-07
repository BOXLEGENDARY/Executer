package m0;

class j extends p {
    public j(l0.e eVar) {
        super(eVar);
        eVar.f21622e.f();
        eVar.f21624f.f();
        this.f21974f = ((l0.h) eVar).e1();
    }

    private void q(f fVar) {
        this.f21976h.f21928k.add(fVar);
        fVar.f21929l.add(this.f21976h);
    }

    @Override
    public void a(d dVar) {
        f fVar = this.f21976h;
        if (fVar.f21920c && !fVar.f21927j) {
            this.f21976h.d((int) ((fVar.f21929l.get(0).f21924g * ((l0.h) this.f21970b).h1()) + 0.5f));
        }
    }

    @Override
    void d() {
        l0.h hVar = (l0.h) this.f21970b;
        int iF1 = hVar.f1();
        int iG1 = hVar.g1();
        hVar.h1();
        if (hVar.e1() == 1) {
            if (iF1 != -1) {
                this.f21976h.f21929l.add(this.f21970b.f21607T.f21622e.f21976h);
                this.f21970b.f21607T.f21622e.f21976h.f21928k.add(this.f21976h);
                this.f21976h.f21923f = iF1;
            } else if (iG1 != -1) {
                this.f21976h.f21929l.add(this.f21970b.f21607T.f21622e.f21977i);
                this.f21970b.f21607T.f21622e.f21977i.f21928k.add(this.f21976h);
                this.f21976h.f21923f = -iG1;
            } else {
                f fVar = this.f21976h;
                fVar.f21919b = true;
                fVar.f21929l.add(this.f21970b.f21607T.f21622e.f21977i);
                this.f21970b.f21607T.f21622e.f21977i.f21928k.add(this.f21976h);
            }
            q(this.f21970b.f21622e.f21976h);
            q(this.f21970b.f21622e.f21977i);
            return;
        }
        if (iF1 != -1) {
            this.f21976h.f21929l.add(this.f21970b.f21607T.f21624f.f21976h);
            this.f21970b.f21607T.f21624f.f21976h.f21928k.add(this.f21976h);
            this.f21976h.f21923f = iF1;
        } else if (iG1 != -1) {
            this.f21976h.f21929l.add(this.f21970b.f21607T.f21624f.f21977i);
            this.f21970b.f21607T.f21624f.f21977i.f21928k.add(this.f21976h);
            this.f21976h.f21923f = -iG1;
        } else {
            f fVar2 = this.f21976h;
            fVar2.f21919b = true;
            fVar2.f21929l.add(this.f21970b.f21607T.f21624f.f21977i);
            this.f21970b.f21607T.f21624f.f21977i.f21928k.add(this.f21976h);
        }
        q(this.f21970b.f21624f.f21976h);
        q(this.f21970b.f21624f.f21977i);
    }

    @Override
    public void e() {
        if (((l0.h) this.f21970b).e1() == 1) {
            this.f21970b.Y0(this.f21976h.f21924g);
        } else {
            this.f21970b.Z0(this.f21976h.f21924g);
        }
    }

    @Override
    void f() {
        this.f21976h.c();
    }

    @Override
    boolean m() {
        return false;
    }
}
