package K3;

import java.io.IOException;

final class C0468h0 extends C0470i0 {
    private C0468h0(C0464f0 c0464f0, Character ch) {
        super(c0464f0, ch);
        C0485q.c(c0464f0.f1864b.length == 64);
    }

    @Override
    final void a(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        C0485q.e(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = ((bArr[i9 + 1] & 255) << 8) | (i11 << 16) | (bArr[i9 + 2] & 255);
            appendable.append(this.f1873f.a(i12 >>> 18));
            appendable.append(this.f1873f.a((i12 >>> 12) & 63));
            appendable.append(this.f1873f.a((i12 >>> 6) & 63));
            appendable.append(this.f1873f.a(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            g(appendable, bArr, i9, i8 - i9);
        }
    }

    @Override
    final AbstractC0472j0 f(C0464f0 c0464f0, Character ch) {
        return new C0468h0(c0464f0, ch);
    }

    C0468h0(String str, String str2, Character ch) {
        this(new C0464f0(str, str2.toCharArray()), ch);
    }
}
