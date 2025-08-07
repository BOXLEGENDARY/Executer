package Pa;

public class j extends Ua.a {
    private final Sa.i a;
    private final String b;

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            CharSequence charSequenceB;
            if (hVar.g() >= Ra.d.a) {
                return Ua.f.c();
            }
            CharSequence charSequenceH = hVar.h();
            int i = hVar.i();
            j jVarK = j.k(charSequenceH, i);
            if (jVarK != null) {
                return Ua.f.d(jVarK).b(charSequenceH.length());
            }
            int iL = j.l(charSequenceH, i);
            return (iL <= 0 || (charSequenceB = gVar.b()) == null) ? Ua.f.c() : Ua.f.d(new j(iL, charSequenceB.toString())).b(charSequenceH.length()).e();
        }
    }

    public j(int i, String str) {
        Sa.i iVar = new Sa.i();
        this.a = iVar;
        iVar.o(i);
        this.b = str;
    }

    public static j k(CharSequence charSequence, int i) {
        int iK = Ra.d.k('#', charSequence, i, charSequence.length()) - i;
        if (iK == 0 || iK > 6) {
            return null;
        }
        int i2 = i + iK;
        if (i2 >= charSequence.length()) {
            return new j(iK, "");
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iN = Ra.d.n(charSequence, charSequence.length() - 1, i2);
        int iL = Ra.d.l('#', charSequence, iN, i2);
        int iN2 = Ra.d.n(charSequence, iL, i2);
        return iN2 != iL ? new j(iK, charSequence.subSequence(i2, iN2 + 1).toString()) : new j(iK, charSequence.subSequence(i2, iN + 1).toString());
    }

    public static int l(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (m(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return m(charSequence, i + 1, '-') ? 2 : 0;
    }

    private static boolean m(CharSequence charSequence, int i, char c) {
        return Ra.d.m(charSequence, Ra.d.k(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override
    public void a(Ta.a aVar) {
        aVar.a(this.b, this.a);
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        return Ua.c.d();
    }

    @Override
    public Sa.a g() {
        return this.a;
    }
}
