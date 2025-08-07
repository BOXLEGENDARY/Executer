package H5;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class f {
    private final String a;
    private final boolean b;
    private final D5.d c;
    private final G5.a d;

    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] iArr = new int[G5.b.values().length];
            b = iArr;
            try {
                iArr[G5.b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[G5.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[G5.b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[G5.b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[G5.b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private final class b {
        private final G5.b a;
        private final int b;
        private final int c;
        private final int d;
        private final b e;
        private final int f;

        b(f fVar, G5.b bVar, int i, int i2, int i3, b bVar2, G5.c cVar, a aVar) {
            this(bVar, i, i2, i3, bVar2, cVar);
        }

        private b(G5.b bVar, int i, int i2, int i3, b bVar2, G5.c cVar) {
            this.a = bVar;
            this.b = i;
            G5.b bVar3 = G5.b.BYTE;
            int i4 = (bVar == bVar3 || bVar2 == null) ? i2 : bVar2.c;
            this.c = i4;
            this.d = i3;
            this.e = bVar2;
            boolean z = false;
            int iE = bVar2 != null ? bVar2.f : 0;
            if ((bVar == bVar3 && bVar2 == null && i4 != 0) || (bVar2 != null && i4 != bVar2.c)) {
                z = true;
            }
            iE = (bVar2 == null || bVar != bVar2.a || z) ? iE + bVar.e(cVar) + 4 : iE;
            int i5 = a.b[bVar.ordinal()];
            if (i5 == 1) {
                iE += 13;
            } else if (i5 == 2) {
                iE += i3 == 1 ? 6 : 11;
            } else if (i5 == 3) {
                iE += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i5 == 4) {
                iE += f.this.c.b(f.this.a.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    iE += 12;
                }
            }
            this.f = iE;
        }
    }

    final class c {
        private final List<a> a = new ArrayList();
        private final G5.c b;

        final class a {
            private final G5.b a;
            private final int b;
            private final int c;
            private final int d;

            a(G5.b bVar, int i, int i2, int i3) {
                this.a = bVar;
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            public void d(D5.a aVar) throws C5.c {
                aVar.c(this.a.c(), 4);
                if (this.d > 0) {
                    aVar.c(e(), this.a.e(c.this.b));
                }
                if (this.a == G5.b.ECI) {
                    aVar.c(f.this.c.d(this.c), 8);
                } else if (this.d > 0) {
                    String str = f.this.a;
                    int i = this.b;
                    H5.c.c(str.substring(i, this.d + i), this.a, aVar, f.this.c.c(this.c));
                }
            }

            private int e() {
                if (this.a != G5.b.BYTE) {
                    return this.d;
                }
                D5.d dVar = f.this.c;
                String str = f.this.a;
                int i = this.b;
                return dVar.b(str.substring(i, this.d + i), this.c).length;
            }

            public int f(G5.c cVar) {
                int iE;
                int i;
                int iE2 = this.a.e(cVar);
                int i2 = iE2 + 4;
                int i3 = a.b[this.a.ordinal()];
                if (i3 != 1) {
                    int i4 = 0;
                    if (i3 == 2) {
                        int i5 = this.d;
                        i = i2 + ((i5 / 2) * 11);
                        if (i5 % 2 == 1) {
                            i4 = 6;
                        }
                    } else if (i3 == 3) {
                        int i6 = this.d;
                        i = i2 + ((i6 / 3) * 10);
                        int i7 = i6 % 3;
                        if (i7 == 1) {
                            i4 = 4;
                        } else if (i7 == 2) {
                            i4 = 7;
                        }
                    } else {
                        if (i3 != 4) {
                            return i3 != 5 ? i2 : iE2 + 12;
                        }
                        iE = e() * 8;
                    }
                    return i + i4;
                }
                iE = this.d * 13;
                return i2 + iE;
            }

            private String g(String str) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < ' ' || str.charAt(i) > '~') {
                        sb.append('.');
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
                return sb.toString();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append('(');
                if (this.a == G5.b.ECI) {
                    sb.append(f.this.c.c(this.c).displayName());
                } else {
                    String str = f.this.a;
                    int i = this.b;
                    sb.append(g(str.substring(i, this.d + i)));
                }
                sb.append(')');
                return sb.toString();
            }
        }

        c(G5.c cVar, b bVar) {
            int i;
            int i2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                i = 1;
                if (bVar == null) {
                    break;
                }
                int i4 = i3 + bVar.d;
                b bVar2 = bVar.e;
                boolean z2 = (bVar.a == G5.b.BYTE && bVar2 == null && bVar.c != 0) || !(bVar2 == null || bVar.c == bVar2.c);
                z = z2 ? true : z;
                if (bVar2 == null || bVar2.a != bVar.a || z2) {
                    this.a.add(0, new a(bVar.a, bVar.b, bVar.c, i4));
                    i4 = 0;
                }
                if (z2) {
                    this.a.add(0, new a(G5.b.ECI, bVar.b, bVar.c, 0));
                }
                bVar = bVar2;
                i3 = i4;
            }
            if (f.this.b) {
                a aVar = this.a.get(0);
                if (aVar != null) {
                    G5.b bVar3 = aVar.a;
                    G5.b bVar4 = G5.b.ECI;
                    if (bVar3 != bVar4 && z) {
                        this.a.add(0, new a(bVar4, 0, 0, 0));
                    }
                }
                this.a.add(this.a.get(0).a == G5.b.ECI ? 1 : 0, new a(G5.b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iF = cVar.f();
            int i5 = a.a[f.m(cVar).ordinal()];
            if (i5 == 1) {
                i2 = 9;
            } else if (i5 != 2) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int iD = d(cVar);
            while (iF < i2 && !H5.c.v(iD, G5.c.e(iF), f.this.d)) {
                iF++;
            }
            while (iF > i && H5.c.v(iD, G5.c.e(iF - 1), f.this.d)) {
                iF--;
            }
            this.b = G5.c.e(iF);
        }

        private int d(G5.c cVar) {
            Iterator<a> it = this.a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(cVar);
            }
            return iF;
        }

        void b(D5.a aVar) throws C5.c {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.b);
        }

        G5.c e() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.a) {
                if (aVar != null) {
                    sb.append(",");
                }
                sb.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb.toString();
        }
    }

    private enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        private final String d;

        d(String str) {
            this.d = str;
        }

        @Override
        public String toString() {
            return this.d;
        }
    }

    f(String str, Charset charset, boolean z, G5.a aVar) {
        this.a = str;
        this.b = z;
        this.c = new D5.d(str, charset, -1);
        this.d = aVar;
    }

    static c i(String str, G5.c cVar, Charset charset, boolean z, G5.a aVar) throws C5.c {
        return new f(str, charset, z, aVar).h(cVar);
    }

    static int k(G5.b bVar) {
        int i;
        if (bVar == null || (i = a.b[bVar.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + bVar);
    }

    static G5.c l(d dVar) {
        int i = a.a[dVar.ordinal()];
        return i != 1 ? i != 2 ? G5.c.e(40) : G5.c.e(26) : G5.c.e(9);
    }

    static d m(G5.c cVar) {
        return cVar.f() <= 9 ? d.SMALL : cVar.f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    static boolean n(char c3) {
        return H5.c.p(c3) != -1;
    }

    static boolean o(char c3) {
        return H5.c.s(String.valueOf(c3));
    }

    static boolean p(char c3) {
        return c3 >= '0' && c3 <= '9';
    }

    void e(b[][][] bVarArr, int i, b bVar) {
        b[] bVarArr2 = bVarArr[i + bVar.d][bVar.c];
        int iK = k(bVar.a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 == null || bVar2.f > bVar.f) {
            bVarArr2[iK] = bVar;
        }
    }

    void f(G5.c cVar, b[][][] bVarArr, int i, b bVar) {
        int i2;
        int iF = this.c.f();
        int iE = this.c.e();
        if (iE < 0 || !this.c.a(this.a.charAt(i), iE)) {
            iE = 0;
        } else {
            iF = iE + 1;
        }
        int i3 = iF;
        for (int i4 = iE; i4 < i3; i4++) {
            if (this.c.a(this.a.charAt(i), i4)) {
                e(bVarArr, i, new b(this, G5.b.BYTE, i, i4, 1, bVar, cVar, null));
            }
        }
        G5.b bVar2 = G5.b.KANJI;
        if (g(bVar2, this.a.charAt(i))) {
            e(bVarArr, i, new b(this, bVar2, i, 0, 1, bVar, cVar, null));
        }
        int length = this.a.length();
        G5.b bVar3 = G5.b.ALPHANUMERIC;
        if (g(bVar3, this.a.charAt(i))) {
            int i5 = i + 1;
            e(bVarArr, i, new b(this, bVar3, i, 0, (i5 >= length || !g(bVar3, this.a.charAt(i5))) ? 1 : 2, bVar, cVar, null));
        }
        G5.b bVar4 = G5.b.NUMERIC;
        if (g(bVar4, this.a.charAt(i))) {
            int i6 = i + 1;
            if (i6 >= length || !g(bVar4, this.a.charAt(i6))) {
                i2 = 1;
            } else {
                int i7 = i + 2;
                i2 = (i7 >= length || !g(bVar4, this.a.charAt(i7))) ? 2 : 3;
            }
            e(bVarArr, i, new b(this, bVar4, i, 0, i2, bVar, cVar, null));
        }
    }

    boolean g(G5.b bVar, char c3) {
        int i = a.b[bVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 : p(c3) : n(c3) : o(c3);
    }

    c h(G5.c cVar) throws C5.c {
        if (cVar != null) {
            c cVarJ = j(cVar);
            if (H5.c.v(cVarJ.c(), l(m(cVarJ.e())), this.d)) {
                return cVarJ;
            }
            throw new C5.c("Data too big for version" + cVar);
        }
        G5.c[] cVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr2 = {j(cVarArr[0]), j(cVarArr[1]), j(cVarArr[2])};
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 3; i3++) {
            int iC = cVarArr2[i3].c();
            if (H5.c.v(iC, cVarArr[i3], this.d) && iC < i) {
                i2 = i3;
                i = iC;
            }
        }
        if (i2 >= 0) {
            return cVarArr2[i2];
        }
        throw new C5.c("Data too big for any version");
    }

    c j(G5.c cVar) throws C5.c {
        int length = this.a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.c.f(), 4);
        f(cVar, bVarArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.c.f(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    b bVar = bVarArr[i][i2][i3];
                    if (bVar != null && i < length) {
                        f(cVar, bVarArr, i, bVar);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.c.f(); i7++) {
            for (int i10 = 0; i10 < 4; i10++) {
                b bVar2 = bVarArr[length][i7][i10];
                if (bVar2 != null && bVar2.f < i5) {
                    i5 = bVar2.f;
                    i4 = i7;
                    i6 = i10;
                }
            }
        }
        if (i4 >= 0) {
            return new c(cVar, bVarArr[length][i4][i6]);
        }
        throw new C5.c("Internal error: failed to encode \"" + this.a + "\"");
    }
}
