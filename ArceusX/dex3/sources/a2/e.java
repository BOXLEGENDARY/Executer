package a2;

import a2.c;
import com.roblox.client.personasdk.R;
import java.io.EOFException;
import java.io.IOException;
import okio.g;
import okio.h;

final class e extends c {
    private static final h G = h.h("'\\");
    private static final h H = h.h("\"\\");
    private static final h I = h.h("{}[]:, \n\t\r\f/\\;#=");
    private static final h J = h.h("\n\r");
    private static final h K = h.h("*/");
    private final g A;
    private final okio.e B;
    private int C = 0;
    private long D;
    private int E;
    private String F;

    e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.A = gVar;
        this.B = gVar.w();
        k0(6);
    }

    private void L0() throws IOException {
        if (!this.w) {
            throw J0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int M0() throws IOException {
        int[] iArr = this.e;
        int i = this.d;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iS0 = S0(true);
            this.B.readByte();
            if (iS0 != 44) {
                if (iS0 != 59) {
                    if (iS0 != 93) {
                        throw J0("Unterminated array");
                    }
                    this.C = 4;
                    return 4;
                }
                L0();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iS02 = S0(true);
                    this.B.readByte();
                    if (iS02 != 44) {
                        if (iS02 != 59) {
                            if (iS02 != 125) {
                                throw J0("Unterminated object");
                            }
                            this.C = 2;
                            return 2;
                        }
                        L0();
                    }
                }
                int iS03 = S0(true);
                if (iS03 == 34) {
                    this.B.readByte();
                    this.C = 13;
                    return 13;
                }
                if (iS03 == 39) {
                    this.B.readByte();
                    L0();
                    this.C = 12;
                    return 12;
                }
                if (iS03 != 125) {
                    L0();
                    if (!Q0((char) iS03)) {
                        throw J0("Expected name");
                    }
                    this.C = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw J0("Expected name");
                }
                this.B.readByte();
                this.C = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iS04 = S0(true);
                this.B.readByte();
                if (iS04 != 58) {
                    if (iS04 != 61) {
                        throw J0("Expected ':'");
                    }
                    L0();
                    if (this.A.G0(1L) && this.B.n0(0L) == 62) {
                        this.B.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (S0(false) == -1) {
                    this.C = 18;
                    return 18;
                }
                L0();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iS05 = S0(true);
        if (iS05 == 34) {
            this.B.readByte();
            this.C = 9;
            return 9;
        }
        if (iS05 == 39) {
            L0();
            this.B.readByte();
            this.C = 8;
            return 8;
        }
        if (iS05 != 44 && iS05 != 59) {
            if (iS05 == 91) {
                this.B.readByte();
                this.C = 3;
                return 3;
            }
            if (iS05 != 93) {
                if (iS05 == 123) {
                    this.B.readByte();
                    this.C = 1;
                    return 1;
                }
                int iF1 = f1();
                if (iF1 != 0) {
                    return iF1;
                }
                int iI1 = i1();
                if (iI1 != 0) {
                    return iI1;
                }
                if (!Q0(this.B.n0(0L))) {
                    throw J0("Expected value");
                }
                L0();
                this.C = 10;
                return 10;
            }
            if (i2 == 1) {
                this.B.readByte();
                this.C = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw J0("Unexpected value");
        }
        L0();
        this.C = 7;
        return 7;
    }

    private int P0(String str, c.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.C = 0;
                this.i[this.d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean Q0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        L0();
        return false;
    }

    private int S0(boolean r7) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: a2.e.S0(boolean):int");
    }

    private String Z0(h hVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jW = this.A.W(hVar);
            if (jW == -1) {
                throw J0("Unterminated string");
            }
            if (this.B.n0(jW) != 92) {
                if (sb == null) {
                    String strR = this.B.r(jW);
                    this.B.readByte();
                    return strR;
                }
                sb.append(this.B.r(jW));
                this.B.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.B.r(jW));
            this.B.readByte();
            sb.append(k1());
        }
    }

    private String b1() throws IOException {
        long jW = this.A.W(I);
        return jW != -1 ? this.B.r(jW) : this.B.W0();
    }

    private int f1() throws IOException {
        String str;
        String str2;
        int i;
        byte bN0 = this.B.n0(0L);
        if (bN0 == 116 || bN0 == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (bN0 == 102 || bN0 == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bN0 != 110 && bN0 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.A.G0(i3)) {
                return 0;
            }
            char cN0 = this.B.n0(i2);
            if (cN0 != str.charAt(i2) && cN0 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.A.G0(length + 1) && Q0(this.B.n0(length))) {
            return 0;
        }
        this.B.E0(length);
        this.C = i;
        return i;
    }

    private int i1() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: a2.e.i1():int");
    }

    private char k1() throws IOException {
        int i;
        if (!this.A.G0(1L)) {
            throw J0("Unterminated escape sequence");
        }
        byte b = this.B.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.w) {
                return (char) b;
            }
            throw J0("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.A.G0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bN0 = this.B.n0(i2);
            char c3 = (char) (c << 4);
            if (bN0 >= 48 && bN0 <= 57) {
                i = bN0 - 48;
            } else if (bN0 >= 97 && bN0 <= 102) {
                i = bN0 - 87;
            } else {
                if (bN0 < 65 || bN0 > 70) {
                    throw J0("\\u" + this.B.r(4L));
                }
                i = bN0 - 55;
            }
            c = (char) (c3 + i);
        }
        this.B.E0(4L);
        return c;
    }

    private void o1(h hVar) throws IOException {
        while (true) {
            long jW = this.A.W(hVar);
            if (jW == -1) {
                throw J0("Unterminated string");
            }
            if (this.B.n0(jW) != 92) {
                this.B.E0(jW + 1);
                return;
            } else {
                this.B.E0(jW + 1);
                k1();
            }
        }
    }

    private boolean p1() throws IOException {
        long jP = this.A.P(K);
        boolean z = jP != -1;
        okio.e eVar = this.B;
        eVar.E0(z ? jP + r1.E() : eVar.size());
        return z;
    }

    private void s1() throws IOException {
        long jW = this.A.W(J);
        okio.e eVar = this.B;
        eVar.E0(jW != -1 ? jW + 1 : eVar.size());
    }

    private void y1() throws IOException {
        long jW = this.A.W(I);
        okio.e eVar = this.B;
        if (jW == -1) {
            jW = eVar.size();
        }
        eVar.E0(jW);
    }

    @Override
    public double A() throws IOException, NumberFormatException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 16) {
            this.C = 0;
            int[] iArr = this.v;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return this.D;
        }
        if (iM0 == 17) {
            this.F = this.B.r(this.E);
        } else if (iM0 == 9) {
            this.F = Z0(H);
        } else if (iM0 == 8) {
            this.F = Z0(G);
        } else if (iM0 == 10) {
            this.F = b1();
        } else if (iM0 != 11) {
            throw new a("Expected a double but was " + h0() + " at path " + getPath());
        }
        this.C = 11;
        try {
            double d = Double.parseDouble(this.F);
            if (this.w || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.F = null;
                this.C = 0;
                int[] iArr2 = this.v;
                int i2 = this.d - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new b("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.F + " at path " + getPath());
        }
    }

    @Override
    public void H0() throws IOException {
        if (this.y) {
            throw new a("Cannot skip unexpected " + h0() + " at " + getPath());
        }
        int i = 0;
        do {
            int iM0 = this.C;
            if (iM0 == 0) {
                iM0 = M0();
            }
            if (iM0 == 3) {
                k0(1);
            } else if (iM0 == 1) {
                k0(3);
            } else {
                if (iM0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + h0() + " at path " + getPath());
                    }
                    this.d--;
                } else if (iM0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + h0() + " at path " + getPath());
                    }
                    this.d--;
                } else if (iM0 == 14 || iM0 == 10) {
                    y1();
                } else if (iM0 == 9 || iM0 == 13) {
                    o1(H);
                } else if (iM0 == 8 || iM0 == 12) {
                    o1(G);
                } else if (iM0 == 17) {
                    this.B.E0(this.E);
                } else if (iM0 == 18) {
                    throw new a("Expected a value but was " + h0() + " at path " + getPath());
                }
                this.C = 0;
            }
            i++;
            this.C = 0;
        } while (i != 0);
        int[] iArr = this.v;
        int i2 = this.d;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.i[i2 - 1] = "null";
    }

    @Override
    public int K() throws IOException, NumberFormatException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 16) {
            long j = this.D;
            int i = (int) j;
            if (j == i) {
                this.C = 0;
                int[] iArr = this.v;
                int i2 = this.d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new a("Expected an int but was " + this.D + " at path " + getPath());
        }
        if (iM0 == 17) {
            this.F = this.B.r(this.E);
        } else if (iM0 == 9 || iM0 == 8) {
            String strZ0 = iM0 == 9 ? Z0(H) : Z0(G);
            this.F = strZ0;
            try {
                int i3 = Integer.parseInt(strZ0);
                this.C = 0;
                int[] iArr2 = this.v;
                int i4 = this.d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM0 != 11) {
            throw new a("Expected an int but was " + h0() + " at path " + getPath());
        }
        this.C = 11;
        try {
            double d = Double.parseDouble(this.F);
            int i5 = (int) d;
            if (i5 == d) {
                this.F = null;
                this.C = 0;
                int[] iArr3 = this.v;
                int i6 = this.d - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new a("Expected an int but was " + this.F + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.F + " at path " + getPath());
        }
    }

    @Override
    public String N() throws IOException {
        String strZ0;
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 14) {
            strZ0 = b1();
        } else if (iM0 == 13) {
            strZ0 = Z0(H);
        } else if (iM0 == 12) {
            strZ0 = Z0(G);
        } else {
            if (iM0 != 15) {
                throw new a("Expected a name but was " + h0() + " at path " + getPath());
            }
            strZ0 = this.F;
        }
        this.C = 0;
        this.i[this.d - 1] = strZ0;
        return strZ0;
    }

    @Override
    public String U() throws IOException {
        String strR;
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 10) {
            strR = b1();
        } else if (iM0 == 9) {
            strR = Z0(H);
        } else if (iM0 == 8) {
            strR = Z0(G);
        } else if (iM0 == 11) {
            strR = this.F;
            this.F = null;
        } else if (iM0 == 16) {
            strR = Long.toString(this.D);
        } else {
            if (iM0 != 17) {
                throw new a("Expected a string but was " + h0() + " at path " + getPath());
            }
            strR = this.B.r(this.E);
        }
        this.C = 0;
        int[] iArr = this.v;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return strR;
    }

    @Override
    public void close() throws IOException {
        this.C = 0;
        this.e[0] = 8;
        this.d = 1;
        this.B.b();
        this.A.close();
    }

    @Override
    public void e() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 3) {
            k0(1);
            this.v[this.d - 1] = 0;
            this.C = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + h0() + " at path " + getPath());
        }
    }

    @Override
    public void f() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 1) {
            k0(3);
            this.C = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + h0() + " at path " + getPath());
    }

    @Override
    public c.b h0() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        switch (iM0) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return c.b.BOOLEAN;
            case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                return c.b.NULL;
            case R.styleable.LottieAnimationView_lottie_loop:
            case R.styleable.LottieAnimationView_lottie_progress:
            case R.styleable.LottieAnimationView_lottie_rawRes:
            case R.styleable.LottieAnimationView_lottie_renderMode:
                return c.b.STRING;
            case R.styleable.LottieAnimationView_lottie_repeatCount:
            case R.styleable.LottieAnimationView_lottie_repeatMode:
            case R.styleable.LottieAnimationView_lottie_scale:
            case R.styleable.LottieAnimationView_lottie_speed:
                return c.b.NAME;
            case R.styleable.LottieAnimationView_lottie_url:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void j() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 != 4) {
            throw new a("Expected END_ARRAY but was " + h0() + " at path " + getPath());
        }
        int i = this.d;
        this.d = i - 1;
        int[] iArr = this.v;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.C = 0;
    }

    @Override
    public void m() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 != 2) {
            throw new a("Expected END_OBJECT but was " + h0() + " at path " + getPath());
        }
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        this.i[i2] = null;
        int[] iArr = this.v;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.C = 0;
    }

    @Override
    public int n0(c.a aVar) throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 < 12 || iM0 > 15) {
            return -1;
        }
        if (iM0 == 15) {
            return P0(this.F, aVar);
        }
        int iX1 = this.A.x1(aVar.b);
        if (iX1 != -1) {
            this.C = 0;
            this.i[this.d - 1] = aVar.a[iX1];
            return iX1;
        }
        String str = this.i[this.d - 1];
        String strN = N();
        int iP0 = P0(strN, aVar);
        if (iP0 == -1) {
            this.C = 15;
            this.F = strN;
            this.i[this.d - 1] = str;
        }
        return iP0;
    }

    @Override
    public void t0() throws IOException {
        if (this.y) {
            throw new a("Cannot skip unexpected " + h0() + " at " + getPath());
        }
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 14) {
            y1();
        } else if (iM0 == 13) {
            o1(H);
        } else if (iM0 == 12) {
            o1(G);
        } else if (iM0 != 15) {
            throw new a("Expected a name but was " + h0() + " at path " + getPath());
        }
        this.C = 0;
        this.i[this.d - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.A + ")";
    }

    @Override
    public boolean u() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        return (iM0 == 2 || iM0 == 4 || iM0 == 18) ? false : true;
    }

    @Override
    public boolean y() throws IOException {
        int iM0 = this.C;
        if (iM0 == 0) {
            iM0 = M0();
        }
        if (iM0 == 5) {
            this.C = 0;
            int[] iArr = this.v;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM0 == 6) {
            this.C = 0;
            int[] iArr2 = this.v;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + h0() + " at path " + getPath());
    }
}
