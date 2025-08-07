package K3;

import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

class C0501y0 extends AbstractC0499x0 {

    protected final byte[] f1904w;

    C0501y0(byte[] bArr) {
        bArr.getClass();
        this.f1904w = bArr;
    }

    @Override
    public byte d(int i7) {
        return this.f1904w[i7];
    }

    @Override
    byte e(int i7) {
        return this.f1904w[i7];
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0) || g() != ((B0) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof C0501y0)) {
            return obj.equals(this);
        }
        C0501y0 c0501y0 = (C0501y0) obj;
        int iP = p();
        int iP2 = c0501y0.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iG = g();
        if (iG > c0501y0.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > c0501y0.g()) {
            throw new IllegalArgumentException(wtzgsqRsIZB.RUQdcDWdFzjFFaI + iG + ", " + c0501y0.g());
        }
        byte[] bArr = this.f1904w;
        byte[] bArr2 = c0501y0.f1904w;
        int iS = s() + iG;
        int iS2 = s();
        int iS3 = c0501y0.s();
        while (iS2 < iS) {
            if (bArr[iS2] != bArr2[iS3]) {
                return false;
            }
            iS2++;
            iS3++;
        }
        return true;
    }

    @Override
    public int g() {
        return this.f1904w.length;
    }

    @Override
    protected void j(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f1904w, 0, bArr, 0, i9);
    }

    @Override
    protected final int k(int i7, int i8, int i9) {
        byte[] bArr = this.f1904w;
        int iS = s();
        byte[] bArr2 = G0.f1782d;
        for (int i10 = iS; i10 < iS + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    @Override
    public final B0 l(int i7, int i8) {
        int iO = B0.o(i7, i8, g());
        return iO == 0 ? B0.f1765e : new C0495v0(this.f1904w, s() + i7, iO);
    }

    @Override
    public final InputStream m() {
        return new ByteArrayInputStream(this.f1904w, s(), g());
    }

    @Override
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.f1904w, s(), g()).asReadOnlyBuffer();
    }

    protected int s() {
        return 0;
    }
}
