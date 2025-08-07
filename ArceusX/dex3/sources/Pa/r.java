package Pa;

import java.util.List;

public class r extends Ua.a {
    private final Sa.t a = new Sa.t();
    private o b = new o();

    @Override
    public void a(Ta.a aVar) {
        CharSequence charSequenceD = this.b.d();
        if (charSequenceD.length() > 0) {
            aVar.a(charSequenceD.toString(), this.a);
        }
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        return !hVar.f() ? Ua.c.b(hVar.e()) : Ua.c.d();
    }

    @Override
    public void e() {
        if (this.b.d().length() == 0) {
            this.a.l();
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public Sa.a g() {
        return this.a;
    }

    @Override
    public void h(CharSequence charSequence) {
        this.b.f(charSequence);
    }

    public CharSequence i() {
        return this.b.d();
    }

    public List<Sa.o> j() {
        return this.b.c();
    }
}
