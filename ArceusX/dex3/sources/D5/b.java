package D5;

import java.util.Arrays;

public final class b implements Cloneable {
    private int d;
    private int e;
    private int i;
    private int[] v;

    public b(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.d = i;
        this.e = i2;
        int i3 = (i + 31) / 32;
        this.i = i3;
        this.v = new int[i3 * i2];
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.e * (this.d + 1));
        for (int i = 0; i < this.e; i++) {
            for (int i2 = 0; i2 < this.d; i2++) {
                sb.append(c(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public b clone() {
        return new b(this.d, this.e, this.i, (int[]) this.v.clone());
    }

    public boolean c(int i, int i2) {
        return ((this.v[(i2 * this.i) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.e || i5 > this.d) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.i * i2;
            for (int i10 = i; i10 < i5; i10++) {
                int[] iArr = this.v;
                int i11 = (i10 / 32) + i7;
                iArr[i11] = iArr[i11] | (1 << (i10 & 31));
            }
            i2++;
        }
    }

    public String e(String str, String str2) {
        return a(str, str2, "\n");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.e == bVar.e && this.i == bVar.i && Arrays.equals(this.v, bVar.v);
    }

    public int hashCode() {
        int i = this.d;
        return (((((((i * 31) + i) * 31) + this.e) * 31) + this.i) * 31) + Arrays.hashCode(this.v);
    }

    public String toString() {
        return e("X ", "  ");
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.d = i;
        this.e = i2;
        this.i = i3;
        this.v = iArr;
    }
}
