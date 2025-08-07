package Pa;

public class c extends Ua.a {
    private final Sa.b a = new Sa.b();

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            int i = hVar.i();
            if (!c.k(hVar, i)) {
                return Ua.f.c();
            }
            int iK = hVar.k() + hVar.g();
            int i2 = iK + 1;
            if (Ra.d.i(hVar.h(), i + 1)) {
                i2 = iK + 2;
            }
            return Ua.f.d(new c()).a(i2);
        }
    }

    public static boolean k(Ua.h hVar, int i) {
        CharSequence charSequenceH = hVar.h();
        return hVar.g() < Ra.d.a && i < charSequenceH.length() && charSequenceH.charAt(i) == '>';
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        int i = hVar.i();
        if (!k(hVar, i)) {
            return Ua.c.d();
        }
        int iK = hVar.k() + hVar.g();
        int i2 = iK + 1;
        if (Ra.d.i(hVar.h(), i + 1)) {
            i2 = iK + 2;
        }
        return Ua.c.a(i2);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d(Sa.a aVar) {
        return true;
    }

    @Override
    public Sa.b g() {
        return this.a;
    }
}
