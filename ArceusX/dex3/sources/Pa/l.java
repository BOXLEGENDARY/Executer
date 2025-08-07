package Pa;

import java.util.ArrayList;
import java.util.List;

public class l extends Ua.a {
    private final Sa.m a = new Sa.m();
    private final List<CharSequence> b = new ArrayList();

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            return (hVar.g() < Ra.d.a || hVar.f() || (hVar.j().g() instanceof Sa.t)) ? Ua.f.c() : Ua.f.d(new l()).a(hVar.k() + Ra.d.a);
        }
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        return hVar.g() >= Ra.d.a ? Ua.c.a(hVar.k() + Ra.d.a) : hVar.f() ? Ua.c.b(hVar.i()) : Ua.c.d();
    }

    @Override
    public void e() {
        int size = this.b.size() - 1;
        while (size >= 0 && Ra.d.f(this.b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append(this.b.get(i));
            sb.append('\n');
        }
        this.a.o(sb.toString());
    }

    @Override
    public Sa.a g() {
        return this.a;
    }

    @Override
    public void h(CharSequence charSequence) {
        this.b.add(charSequence);
    }
}
