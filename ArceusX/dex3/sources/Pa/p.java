package Pa;

public class p extends Ua.a {
    private final Sa.p a;
    private boolean b;
    private int c;

    public static class a extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            Ua.d dVarA = gVar.a();
            if (hVar.g() >= Ra.d.a) {
                return Ua.f.c();
            }
            b bVarN = p.n(hVar.h(), hVar.i(), hVar.k() + hVar.g(), gVar.b() != null);
            if (bVarN == null) {
                return Ua.f.c();
            }
            int i = bVarN.b;
            q qVar = new q(i - hVar.k());
            if ((dVarA instanceof p) && p.m((Sa.p) dVarA.g(), bVarN.a)) {
                return Ua.f.d(qVar).a(i);
            }
            p pVar = new p(bVarN.a);
            bVarN.a.o(true);
            return Ua.f.d(pVar, qVar).a(i);
        }
    }

    private static class b {
        final Sa.p a;
        final int b;

        b(Sa.p pVar, int i) {
            this.a = pVar;
            this.b = i;
        }
    }

    private static class c {
        final Sa.p a;
        final int b;

        c(Sa.p pVar, int i) {
            this.a = pVar;
            this.b = i;
        }
    }

    public p(Sa.p pVar) {
        this.a = pVar;
    }

    private static boolean k(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean l(CharSequence charSequence, int i) {
        char cCharAt;
        return i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\t' || cCharAt == ' ';
    }

    public static boolean m(Sa.p pVar, Sa.p pVar2) {
        if ((pVar instanceof Sa.c) && (pVar2 instanceof Sa.c)) {
            return k(Character.valueOf(((Sa.c) pVar).p()), Character.valueOf(((Sa.c) pVar2).p()));
        }
        if ((pVar instanceof Sa.s) && (pVar2 instanceof Sa.s)) {
            return k(Character.valueOf(((Sa.s) pVar).p()), Character.valueOf(((Sa.s) pVar2).p()));
        }
        return false;
    }

    public static b n(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        c cVarO = o(charSequence, i);
        if (cVarO == null) {
            return null;
        }
        Sa.p pVar = cVarO.a;
        int i3 = cVarO.b;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int iA = i4;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z2 = true;
                    break;
                }
                iA++;
            } else {
                iA += Ra.d.a(iA);
            }
            i3++;
        }
        if (z && (((pVar instanceof Sa.s) && ((Sa.s) pVar).q() != 1) || !z2)) {
            return null;
        }
        if (!z2 || iA - i4 > Ra.d.a) {
            iA = i4 + 1;
        }
        return new b(pVar, iA);
    }

    private static c o(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return p(charSequence, i);
        }
        int i2 = i + 1;
        if (!l(charSequence, i2)) {
            return null;
        }
        Sa.c cVar = new Sa.c();
        cVar.q(cCharAt);
        return new c(cVar, i2);
    }

    private static Pa.p.c p(java.lang.CharSequence r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: Pa.p.p(java.lang.CharSequence, int):Pa.p$c");
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        if (hVar.f()) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return Ua.c.b(hVar.e());
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d(Sa.a aVar) {
        if (!(aVar instanceof Sa.q)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.o(false);
            this.b = false;
        }
        return true;
    }

    @Override
    public Sa.a g() {
        return this.a;
    }
}
