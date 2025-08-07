package Pa;

import Sa.x;

public class t extends Ua.a {
    private final x a = new x();

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            if (hVar.g() >= 4) {
                return Ua.f.c();
            }
            int i = hVar.i();
            CharSequence charSequenceH = hVar.h();
            return t.j(charSequenceH, i) ? Ua.f.d(new t()).b(charSequenceH.length()) : Ua.f.c();
        }
    }

    public static boolean j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i4++;
                } else if (cCharAt == '-') {
                    i2++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
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
