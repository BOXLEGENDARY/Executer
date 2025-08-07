package D5;

import java.util.Arrays;

public final class a implements Cloneable {
    private static final int[] i = new int[0];
    private int[] d;
    private int e;

    public a() {
        this.e = 0;
        this.d = i;
    }

    private void e(int i2) {
        if (i2 > this.d.length * 32) {
            int[] iArrJ = j((int) Math.ceil(i2 / 0.75f));
            int[] iArr = this.d;
            System.arraycopy(iArr, 0, iArrJ, 0, iArr.length);
            this.d = iArrJ;
        }
    }

    private static int[] j(int i2) {
        return new int[(i2 + 31) / 32];
    }

    public void a(boolean z) {
        e(this.e + 1);
        if (z) {
            int[] iArr = this.d;
            int i2 = this.e;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.e++;
    }

    public void b(a aVar) {
        int i2 = aVar.e;
        e(this.e + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            a(aVar.g(i3));
        }
    }

    public void c(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i4 = this.e;
        e(i4 + i3);
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            if (((1 << i5) & i2) != 0) {
                int[] iArr = this.d;
                int i6 = i4 / 32;
                iArr[i6] = iArr[i6] | (1 << (i4 & 31));
            }
            i4++;
        }
        this.e = i4;
    }

    public a clone() {
        return new a((int[]) this.d.clone(), this.e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.e == aVar.e && Arrays.equals(this.d, aVar.d);
    }

    public boolean g(int i2) {
        return ((1 << (i2 & 31)) & this.d[i2 / 32]) != 0;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (this.e * 31) + Arrays.hashCode(this.d);
    }

    public int i() {
        return (this.e + 7) / 8;
    }

    public void k(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (g(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    public void l(a aVar) {
        if (this.e != aVar.e) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.d;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] ^ aVar.d[i2];
            i2++;
        }
    }

    public String toString() {
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.e; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(g(i3) ? 'X' : '.');
        }
        return sb.toString();
    }

    a(int[] iArr, int i2) {
        this.d = iArr;
        this.e = i2;
    }
}
