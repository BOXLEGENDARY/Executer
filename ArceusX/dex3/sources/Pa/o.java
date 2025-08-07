package Pa;

import java.util.ArrayList;
import java.util.List;

public class o {
    private StringBuilder d;
    private String e;
    private String f;
    private char g;
    private StringBuilder h;
    private b a = b.START_DEFINITION;
    private final StringBuilder b = new StringBuilder();
    private final List<Sa.o> c = new ArrayList();
    private boolean i = false;

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int a(CharSequence charSequence, int i) {
        int iM = Ra.d.m(charSequence, i, charSequence.length());
        int iA = Ra.c.a(charSequence, iM);
        if (iA == -1) {
            return -1;
        }
        this.f = charSequence.charAt(iM) == '<' ? charSequence.subSequence(iM + 1, iA - 1).toString() : charSequence.subSequence(iM, iA).toString();
        int iM2 = Ra.d.m(charSequence, iA, charSequence.length());
        if (iM2 >= charSequence.length()) {
            this.i = true;
            this.b.setLength(0);
        } else if (iM2 == iA) {
            return -1;
        }
        this.a = b.START_TITLE;
        return iM2;
    }

    private void b() {
        if (this.i) {
            String strE = Ra.a.e(this.f);
            StringBuilder sb = this.h;
            this.c.add(new Sa.o(this.e, strE, sb != null ? Ra.a.e(sb.toString()) : null));
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }

    private int e(CharSequence charSequence, int i) {
        int i2;
        int iC = Ra.c.c(charSequence, i);
        if (iC == -1) {
            return -1;
        }
        this.d.append(charSequence, i, iC);
        if (iC >= charSequence.length()) {
            this.d.append('\n');
            return iC;
        }
        if (charSequence.charAt(iC) != ']' || (i2 = iC + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.d.length() > 999) {
            return -1;
        }
        String strB = Ra.a.b(this.d.toString());
        if (strB.isEmpty()) {
            return -1;
        }
        this.e = strB;
        this.a = b.DESTINATION;
        return Ra.d.m(charSequence, iC + 2, charSequence.length());
    }

    private int g(CharSequence charSequence, int i) {
        int iM = Ra.d.m(charSequence, i, charSequence.length());
        if (iM >= charSequence.length() || charSequence.charAt(iM) != '[') {
            return -1;
        }
        this.a = b.LABEL;
        this.d = new StringBuilder();
        int i2 = iM + 1;
        if (i2 >= charSequence.length()) {
            this.d.append('\n');
        }
        return i2;
    }

    private int h(CharSequence charSequence, int i) {
        int iM = Ra.d.m(charSequence, i, charSequence.length());
        if (iM >= charSequence.length()) {
            this.a = b.START_DEFINITION;
            return iM;
        }
        this.g = (char) 0;
        char cCharAt = charSequence.charAt(iM);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.g = cCharAt;
        } else if (cCharAt == '(') {
            this.g = ')';
        }
        if (this.g != 0) {
            this.a = b.TITLE;
            this.h = new StringBuilder();
            iM++;
            if (iM == charSequence.length()) {
                this.h.append('\n');
            }
        } else {
            b();
            this.a = b.START_DEFINITION;
        }
        return iM;
    }

    private int i(CharSequence charSequence, int i) {
        int iE = Ra.c.e(charSequence, i, this.g);
        if (iE == -1) {
            return -1;
        }
        this.h.append(charSequence.subSequence(i, iE));
        if (iE >= charSequence.length()) {
            this.h.append('\n');
            return iE;
        }
        int iM = Ra.d.m(charSequence, iE + 1, charSequence.length());
        if (iM != charSequence.length()) {
            return -1;
        }
        this.i = true;
        b();
        this.b.setLength(0);
        this.a = b.START_DEFINITION;
        return iM;
    }

    List<Sa.o> c() {
        b();
        return this.c;
    }

    CharSequence d() {
        return this.b;
    }

    public void f(java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: Pa.o.f(java.lang.CharSequence):void");
    }
}
