package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

public final class Z4 {

    private static final Z4 f15082f = new Z4(0, new int[0], new Object[0], false);

    private int f15083a;

    private int[] f15084b;

    private Object[] f15085c;

    private int f15086d;

    private boolean f15087e;

    private Z4(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f15086d = -1;
        this.f15083a = i7;
        this.f15084b = iArr;
        this.f15085c = objArr;
        this.f15087e = z7;
    }

    public static Z4 c() {
        return f15082f;
    }

    static Z4 d(Z4 z42, Z4 z43) {
        int i7 = z42.f15083a + z43.f15083a;
        int[] iArrCopyOf = Arrays.copyOf(z42.f15084b, i7);
        System.arraycopy(z43.f15084b, 0, iArrCopyOf, z42.f15083a, z43.f15083a);
        Object[] objArrCopyOf = Arrays.copyOf(z42.f15085c, i7);
        System.arraycopy(z43.f15085c, 0, objArrCopyOf, z42.f15083a, z43.f15083a);
        return new Z4(i7, iArrCopyOf, objArrCopyOf, true);
    }

    static Z4 e() {
        return new Z4(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i7 = this.f15086d;
        if (i7 != -1) {
            return i7;
        }
        int iA3 = 0;
        for (int i8 = 0; i8 < this.f15083a; i8++) {
            int i9 = this.f15084b[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.f15085c[i8]).longValue();
                    iA2 = B3.a(i10 << 3) + 8;
                } else if (i11 == 2) {
                    AbstractC1980t3 abstractC1980t3 = (AbstractC1980t3) this.f15085c[i8];
                    int iA4 = B3.a(i10 << 3);
                    int iG = abstractC1980t3.g();
                    iA3 += iA4 + B3.a(iG) + iG;
                } else if (i11 == 3) {
                    int iD = B3.D(i10);
                    iA = iD + iD;
                    iB = ((Z4) this.f15085c[i8]).a();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(C1854d4.a());
                    }
                    ((Integer) this.f15085c[i8]).intValue();
                    iA2 = B3.a(i10 << 3) + 4;
                }
                iA3 += iA2;
            } else {
                long jLongValue = ((Long) this.f15085c[i8]).longValue();
                iA = B3.a(i10 << 3);
                iB = B3.b(jLongValue);
            }
            iA2 = iA + iB;
            iA3 += iA2;
        }
        this.f15086d = iA3;
        return iA3;
    }

    public final int b() {
        int i7 = this.f15086d;
        if (i7 != -1) {
            return i7;
        }
        int iA = 0;
        for (int i8 = 0; i8 < this.f15083a; i8++) {
            int i9 = this.f15084b[i8];
            AbstractC1980t3 abstractC1980t3 = (AbstractC1980t3) this.f15085c[i8];
            int iA2 = B3.a(8);
            int iG = abstractC1980t3.g();
            iA += iA2 + iA2 + B3.a(16) + B3.a(i9 >>> 3) + B3.a(24) + B3.a(iG) + iG;
        }
        this.f15086d = iA;
        return iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z4)) {
            return false;
        }
        Z4 z42 = (Z4) obj;
        int i7 = this.f15083a;
        if (i7 == z42.f15083a) {
            int[] iArr = this.f15084b;
            int[] iArr2 = z42.f15084b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f15085c;
                    Object[] objArr2 = z42.f15085c;
                    int i9 = this.f15083a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final void f() {
        this.f15087e = false;
    }

    final void g(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f15083a; i8++) {
            A4.b(sb, i7, String.valueOf(this.f15084b[i8] >>> 3), this.f15085c[i8]);
        }
    }

    final void h(int i7, Object obj) {
        if (!this.f15087e) {
            throw new UnsupportedOperationException();
        }
        int i8 = this.f15083a;
        int[] iArr = this.f15084b;
        if (i8 == iArr.length) {
            int i9 = i8 + (i8 < 4 ? 8 : i8 >> 1);
            this.f15084b = Arrays.copyOf(iArr, i9);
            this.f15085c = Arrays.copyOf(this.f15085c, i9);
        }
        int[] iArr2 = this.f15084b;
        int i10 = this.f15083a;
        iArr2[i10] = i7;
        this.f15085c[i10] = obj;
        this.f15083a = i10 + 1;
    }

    public final int hashCode() {
        int i7 = this.f15083a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f15084b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f15085c;
        int i12 = this.f15083a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final void i(C3 c3) throws IOException {
        if (this.f15083a != 0) {
            for (int i7 = 0; i7 < this.f15083a; i7++) {
                int i8 = this.f15084b[i7];
                Object obj = this.f15085c[i7];
                int i9 = i8 >>> 3;
                int i10 = i8 & 7;
                if (i10 == 0) {
                    c3.E(i9, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    c3.x(i9, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    c3.o(i9, (AbstractC1980t3) obj);
                } else if (i10 == 3) {
                    c3.e(i9);
                    ((Z4) obj).i(c3);
                    c3.s(i9);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(C1854d4.a());
                    }
                    c3.v(i9, ((Integer) obj).intValue());
                }
            }
        }
    }

    private Z4() {
        this(0, new int[8], new Object[8], true);
    }
}
