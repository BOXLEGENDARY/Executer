package K3;

import java.io.IOException;

final class C0466g0 extends C0470i0 {

    final char[] f1871i;

    private C0466g0(C0464f0 c0464f0) {
        super(c0464f0, null);
        this.f1871i = new char[512];
        C0485q.c(c0464f0.f1864b.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.f1871i[i7] = c0464f0.a(i7 >>> 4);
            this.f1871i[i7 | 256] = c0464f0.a(i7 & 15);
        }
    }

    @Override
    final void a(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        C0485q.e(0, i8, bArr.length);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i9] & 255;
            appendable.append(this.f1871i[i10]);
            appendable.append(this.f1871i[i10 | 256]);
        }
    }

    @Override
    final AbstractC0472j0 f(C0464f0 c0464f0, Character ch) {
        return new C0466g0(c0464f0);
    }

    C0466g0(String str, String str2) {
        this(new C0464f0("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
