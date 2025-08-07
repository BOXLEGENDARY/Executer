package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

class C1964r3 extends AbstractC1957q3 {

    protected final byte[] f15296w;

    C1964r3(byte[] bArr) {
        bArr.getClass();
        this.f15296w = bArr;
    }

    @Override
    public byte d(int i7) {
        return this.f15296w[i7];
    }

    @Override
    byte e(int i7) {
        return this.f15296w[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1980t3) || g() != ((AbstractC1980t3) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof C1964r3)) {
            return obj.equals(this);
        }
        C1964r3 c1964r3 = (C1964r3) obj;
        int iP = p();
        int iP2 = c1964r3.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iG = g();
        if (iG > c1964r3.g()) {
            int iG2 = g();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iG);
            sb.append(iG2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iG > c1964r3.g()) {
            int iG3 = c1964r3.g();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iG);
            sb2.append(", ");
            sb2.append(iG3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f15296w;
        byte[] bArr2 = c1964r3.f15296w;
        c1964r3.t();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iG) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override
    public int g() {
        return this.f15296w.length;
    }

    @Override
    protected final int j(int i7, int i8, int i9) {
        return C1838b4.d(i7, this.f15296w, 0, i9);
    }

    @Override
    public final AbstractC1980t3 k(int i7, int i8) {
        int iO = AbstractC1980t3.o(0, i8, g());
        return iO == 0 ? AbstractC1980t3.f15325e : new C1941o3(this.f15296w, 0, iO);
    }

    @Override
    protected final String l(Charset charset) {
        return new String(this.f15296w, 0, g(), charset);
    }

    @Override
    final void m(C1901j3 c1901j3) throws IOException {
        ((C2028z3) c1901j3).E(this.f15296w, 0, g());
    }

    @Override
    public final boolean n() {
        return C1935n5.f(this.f15296w, 0, g());
    }

    protected int t() {
        return 0;
    }
}
