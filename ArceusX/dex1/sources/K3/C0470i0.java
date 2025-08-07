package K3;

import java.io.IOException;
import java.math.RoundingMode;

class C0470i0 extends AbstractC0472j0 {

    final C0464f0 f1873f;

    final Character f1874g;

    private volatile AbstractC0472j0 f1875h;

    C0470i0(C0464f0 c0464f0, Character ch) {
        this.f1873f = c0464f0;
        if (ch != null && c0464f0.c('=')) {
            throw new IllegalArgumentException(r.a("Padding character %s was already in alphabet", ch));
        }
        this.f1874g = ch;
    }

    @Override
    void a(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        C0485q.e(0, i8, bArr.length);
        while (i9 < i8) {
            g(appendable, bArr, i9, Math.min(this.f1873f.f1868f, i8 - i9));
            i9 += this.f1873f.f1868f;
        }
    }

    @Override
    final int b(int i7) {
        C0464f0 c0464f0 = this.f1873f;
        return c0464f0.f1867e * C0476l0.a(i7, c0464f0.f1868f, RoundingMode.CEILING);
    }

    @Override
    public final AbstractC0472j0 c() {
        AbstractC0472j0 abstractC0472j0F = this.f1875h;
        if (abstractC0472j0F == null) {
            C0464f0 c0464f0B = this.f1873f.b();
            abstractC0472j0F = c0464f0B == this.f1873f ? this : f(c0464f0B, this.f1874g);
            this.f1875h = abstractC0472j0F;
        }
        return abstractC0472j0F;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0470i0) {
            C0470i0 c0470i0 = (C0470i0) obj;
            if (this.f1873f.equals(c0470i0.f1873f)) {
                Character ch = this.f1874g;
                Character ch2 = c0470i0.f1874g;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    AbstractC0472j0 f(C0464f0 c0464f0, Character ch) {
        return new C0470i0(c0464f0, ch);
    }

    final void g(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        C0485q.e(i7, i7 + i8, bArr.length);
        int i9 = 0;
        C0485q.c(i8 <= this.f1873f.f1868f);
        long j7 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j7 = (j7 | (bArr[i7 + i10] & 255)) << 8;
        }
        int i11 = ((i8 + 1) * 8) - this.f1873f.f1866d;
        while (i9 < i8 * 8) {
            C0464f0 c0464f0 = this.f1873f;
            appendable.append(c0464f0.a(c0464f0.f1865c & ((int) (j7 >>> (i11 - i9)))));
            i9 += this.f1873f.f1866d;
        }
        if (this.f1874g != null) {
            while (i9 < this.f1873f.f1868f * 8) {
                this.f1874g.charValue();
                appendable.append('=');
                i9 += this.f1873f.f1866d;
            }
        }
    }

    public final int hashCode() {
        int iHashCode = this.f1873f.hashCode();
        Character ch = this.f1874g;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.f1873f);
        if (8 % this.f1873f.f1866d != 0) {
            if (this.f1874g == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.f1874g);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    C0470i0(String str, String str2, Character ch) {
        this(new C0464f0(str, str2.toCharArray()), ch);
    }
}
