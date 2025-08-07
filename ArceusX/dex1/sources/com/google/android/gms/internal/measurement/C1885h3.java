package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;

final class C1885h3 {
    static int a(byte[] bArr, int i7, C1877g3 c1877g3) throws C1854d4 {
        int iJ = j(bArr, i7, c1877g3);
        int i8 = c1877g3.f15163a;
        if (i8 < 0) {
            throw C1854d4.d();
        }
        if (i8 > bArr.length - iJ) {
            throw C1854d4.f();
        }
        if (i8 == 0) {
            c1877g3.f15165c = AbstractC1980t3.f15325e;
            return iJ;
        }
        c1877g3.f15165c = AbstractC1980t3.q(bArr, iJ, i8);
        return iJ + i8;
    }

    static int b(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    static int c(J4 j42, byte[] bArr, int i7, int i8, int i9, C1877g3 c1877g3) throws IOException {
        B4 b42 = (B4) j42;
        Object objB = b42.b();
        int iD = b42.D(objB, bArr, i7, i8, i9, c1877g3);
        b42.d(objB);
        c1877g3.f15165c = objB;
        return iD;
    }

    static int d(J4 j42, byte[] bArr, int i7, int i8, C1877g3 c1877g3) throws IOException {
        int iK = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iK = k(i9, bArr, iK, c1877g3);
            i9 = c1877g3.f15163a;
        }
        int i10 = iK;
        if (i9 < 0 || i9 > i8 - i10) {
            throw C1854d4.f();
        }
        Object objB = j42.b();
        int i11 = i9 + i10;
        j42.g(objB, bArr, i10, i11, c1877g3);
        j42.d(objB);
        c1877g3.f15165c = objB;
        return i11;
    }

    static int e(J4<?> j42, int i7, byte[] bArr, int i8, int i9, InterfaceC1830a4<?> interfaceC1830a4, C1877g3 c1877g3) throws IOException {
        int iD = d(j42, bArr, i8, i9, c1877g3);
        interfaceC1830a4.add(c1877g3.f15165c);
        while (iD < i9) {
            int iJ = j(bArr, iD, c1877g3);
            if (i7 != c1877g3.f15163a) {
                break;
            }
            iD = d(j42, bArr, iJ, i9, c1877g3);
            interfaceC1830a4.add(c1877g3.f15165c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i7, InterfaceC1830a4<?> interfaceC1830a4, C1877g3 c1877g3) throws IOException {
        U3 u32 = (U3) interfaceC1830a4;
        int iJ = j(bArr, i7, c1877g3);
        int i8 = c1877g3.f15163a + iJ;
        while (iJ < i8) {
            iJ = j(bArr, iJ, c1877g3);
            u32.j(c1877g3.f15163a);
        }
        if (iJ == i8) {
            return iJ;
        }
        throw C1854d4.f();
    }

    static int g(byte[] bArr, int i7, C1877g3 c1877g3) throws C1854d4 {
        int iJ = j(bArr, i7, c1877g3);
        int i8 = c1877g3.f15163a;
        if (i8 < 0) {
            throw C1854d4.d();
        }
        if (i8 == 0) {
            c1877g3.f15165c = BuildConfig.FLAVOR;
            return iJ;
        }
        c1877g3.f15165c = new String(bArr, iJ, i8, C1838b4.f15100b);
        return iJ + i8;
    }

    static int h(byte[] bArr, int i7, C1877g3 c1877g3) throws C1854d4 {
        int iJ = j(bArr, i7, c1877g3);
        int i8 = c1877g3.f15163a;
        if (i8 < 0) {
            throw C1854d4.d();
        }
        if (i8 == 0) {
            c1877g3.f15165c = BuildConfig.FLAVOR;
            return iJ;
        }
        c1877g3.f15165c = C1935n5.d(bArr, iJ, i8);
        return iJ + i8;
    }

    static int i(int i7, byte[] bArr, int i8, int i9, Z4 z42, C1877g3 c1877g3) throws C1854d4 {
        if ((i7 >>> 3) == 0) {
            throw C1854d4.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iM = m(bArr, i8, c1877g3);
            z42.h(i7, Long.valueOf(c1877g3.f15164b));
            return iM;
        }
        if (i10 == 1) {
            z42.h(i7, Long.valueOf(n(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iJ = j(bArr, i8, c1877g3);
            int i11 = c1877g3.f15163a;
            if (i11 < 0) {
                throw C1854d4.d();
            }
            if (i11 > bArr.length - iJ) {
                throw C1854d4.f();
            }
            if (i11 == 0) {
                z42.h(i7, AbstractC1980t3.f15325e);
            } else {
                z42.h(i7, AbstractC1980t3.q(bArr, iJ, i11));
            }
            return iJ + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw C1854d4.b();
            }
            z42.h(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        Z4 z4E = Z4.e();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int iJ2 = j(bArr, i8, c1877g3);
            int i14 = c1877g3.f15163a;
            if (i14 == i12) {
                i13 = i14;
                i8 = iJ2;
                break;
            }
            i13 = i14;
            i8 = i(i14, bArr, iJ2, i9, z4E, c1877g3);
        }
        if (i8 > i9 || i13 != i12) {
            throw C1854d4.e();
        }
        z42.h(i7, z4E);
        return i8;
    }

    static int j(byte[] bArr, int i7, C1877g3 c1877g3) {
        int i8 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return k(b2, bArr, i8, c1877g3);
        }
        c1877g3.f15163a = b2;
        return i8;
    }

    static int k(int i7, byte[] bArr, int i8, C1877g3 c1877g3) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b2 = bArr[i8];
        if (b2 >= 0) {
            c1877g3.f15163a = i9 | (b2 << 7);
            return i10;
        }
        int i11 = i9 | ((b2 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b3 = bArr[i10];
        if (b3 >= 0) {
            c1877g3.f15163a = i11 | (b3 << 14);
            return i12;
        }
        int i13 = i11 | ((b3 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            c1877g3.f15163a = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            c1877g3.f15163a = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c1877g3.f15163a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int l(int i7, byte[] bArr, int i8, int i9, InterfaceC1830a4<?> interfaceC1830a4, C1877g3 c1877g3) {
        U3 u32 = (U3) interfaceC1830a4;
        int iJ = j(bArr, i8, c1877g3);
        u32.j(c1877g3.f15163a);
        while (iJ < i9) {
            int iJ2 = j(bArr, iJ, c1877g3);
            if (i7 != c1877g3.f15163a) {
                break;
            }
            iJ = j(bArr, iJ2, c1877g3);
            u32.j(c1877g3.f15163a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i7, C1877g3 c1877g3) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            c1877g3.f15164b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b2 = bArr[i8];
        long j8 = (j7 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b2 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (r10 & Byte.MAX_VALUE) << i10;
            b2 = bArr[i9];
            i9 = i11;
        }
        c1877g3.f15164b = j8;
        return i9;
    }

    static long n(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
