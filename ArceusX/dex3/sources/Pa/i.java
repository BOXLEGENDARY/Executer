package Pa;

public class i extends Ua.a {
    private final Sa.g a;
    private String b;
    private StringBuilder c;

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            int iG = hVar.g();
            if (iG >= Ra.d.a) {
                return Ua.f.c();
            }
            int i = hVar.i();
            i iVarK = i.k(hVar.h(), i, iG);
            return iVarK != null ? Ua.f.d(iVarK).b(i + iVarK.a.p()) : Ua.f.c();
        }
    }

    public i(char c, int i, int i2) {
        Sa.g gVar = new Sa.g();
        this.a = gVar;
        this.c = new StringBuilder();
        gVar.s(c);
        gVar.u(i);
        gVar.t(i2);
    }

    public static i k(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (Ra.d.b('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new i('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new i('~', i4, i2);
    }

    private boolean l(CharSequence charSequence, int i) {
        char cN = this.a.n();
        int iP = this.a.p();
        int iK = Ra.d.k(cN, charSequence, i, charSequence.length()) - i;
        return iK >= iP && Ra.d.m(charSequence, i + iK, charSequence.length()) == charSequence.length();
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        int i = hVar.i();
        int iE = hVar.e();
        CharSequence charSequenceH = hVar.h();
        if (hVar.g() < Ra.d.a && l(charSequenceH, i)) {
            return Ua.c.c();
        }
        int length = charSequenceH.length();
        for (int iO = this.a.o(); iO > 0 && iE < length && charSequenceH.charAt(iE) == ' '; iO--) {
            iE++;
        }
        return Ua.c.b(iE);
    }

    @Override
    public void e() {
        this.a.v(Ra.a.e(this.b.trim()));
        this.a.w(this.c.toString());
    }

    @Override
    public Sa.a g() {
        return this.a;
    }

    @Override
    public void h(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
        } else {
            this.c.append(charSequence);
            this.c.append('\n');
        }
    }
}
