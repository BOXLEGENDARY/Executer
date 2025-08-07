package K3;

import K0.wJ.BtcVLuo;
import java.math.RoundingMode;
import java.util.Arrays;

final class C0464f0 {

    private final String f1863a;

    private final char[] f1864b;

    final int f1865c;

    final int f1866d;

    final int f1867e;

    final int f1868f;

    private final byte[] f1869g;

    private final boolean f1870h;

    C0464f0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c2 = cArr[i7];
            boolean z7 = true;
            C0485q.d(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z7 = false;
            }
            C0485q.d(z7, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i7;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i7) {
        return this.f1864b[i7];
    }

    final C0464f0 b() {
        int i7;
        boolean z7;
        int i8 = 0;
        for (char c2 : this.f1864b) {
            if (C0461e.a(c2)) {
                char[] cArr = this.f1864b;
                int length = cArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        z7 = false;
                        break;
                    }
                    char c3 = cArr[i9];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        z7 = true;
                        break;
                    }
                    i9++;
                }
                if (z7) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.f1864b.length];
                while (true) {
                    char[] cArr3 = this.f1864b;
                    if (i8 >= cArr3.length) {
                        break;
                    }
                    char c7 = cArr3[i8];
                    if (C0461e.a(c7)) {
                        c7 ^= 32;
                    }
                    cArr2[i8] = (char) c7;
                    i8++;
                }
                C0464f0 c0464f0 = new C0464f0(this.f1863a.concat(".upperCase()"), cArr2);
                if (!this.f1870h || c0464f0.f1870h) {
                    return c0464f0;
                }
                byte[] bArr = c0464f0.f1869g;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i7 = 65; i7 <= 90; i7++) {
                    int i10 = i7 | 32;
                    byte[] bArr2 = c0464f0.f1869g;
                    byte b2 = bArr2[i7];
                    byte b3 = bArr2[i10];
                    if (b2 == -1) {
                        bArrCopyOf[i7] = b3;
                    } else {
                        char c8 = (char) i7;
                        char c9 = (char) i10;
                        if (b3 != -1) {
                            throw new IllegalStateException(r.a(BtcVLuo.DXqDVb, Character.valueOf(c8), Character.valueOf(c9)));
                        }
                        bArrCopyOf[i10] = b2;
                    }
                }
                return new C0464f0(c0464f0.f1863a.concat(".ignoreCase()"), c0464f0.f1864b, bArrCopyOf, true);
            }
        }
        return this;
    }

    public final boolean c(char c2) {
        byte[] bArr = this.f1869g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0464f0) {
            C0464f0 c0464f0 = (C0464f0) obj;
            if (this.f1870h == c0464f0.f1870h && Arrays.equals(this.f1864b, c0464f0.f1864b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1864b) + (true != this.f1870h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f1863a;
    }

    private C0464f0(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.f1863a = str;
        cArr.getClass();
        this.f1864b = cArr;
        try {
            int length = cArr.length;
            int iB = C0476l0.b(length, RoundingMode.UNNECESSARY);
            this.f1866d = iB;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
            int i7 = 1 << (3 - iNumberOfTrailingZeros);
            this.f1867e = i7;
            this.f1868f = iB >> iNumberOfTrailingZeros;
            this.f1865c = length - 1;
            this.f1869g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.f1868f; i8++) {
                zArr[C0476l0.a(i8 * 8, this.f1866d, RoundingMode.CEILING)] = true;
            }
            this.f1870h = z7;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
        }
    }
}
