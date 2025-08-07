package Pa;

public class q extends Ua.a {
    private final Sa.q a = new Sa.q();
    private int b;
    private boolean c;

    public q(int i) {
        this.b = i;
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        if (!hVar.f()) {
            return hVar.g() >= this.b ? Ua.c.a(hVar.k() + this.b) : Ua.c.d();
        }
        if (this.a.c() == null) {
            return Ua.c.d();
        }
        Sa.a aVarG = hVar.j().g();
        this.c = (aVarG instanceof Sa.t) || (aVarG instanceof Sa.q);
        return Ua.c.b(hVar.i());
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d(Sa.a aVar) {
        if (!this.c) {
            return true;
        }
        Sa.a aVarF = this.a.f();
        if (!(aVarF instanceof Sa.p)) {
            return true;
        }
        ((Sa.p) aVarF).o(false);
        return true;
    }

    @Override
    public Sa.a g() {
        return this.a;
    }
}
