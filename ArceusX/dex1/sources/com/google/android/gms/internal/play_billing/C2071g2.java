package com.google.android.gms.internal.play_billing;

import java.io.IOException;

final class C2071g2 {

    private static volatile int f16057a = 100;

    public static final int f16058b = 0;

    static int a(byte[] bArr, int i7, C2059e2 c2059e2) throws Y2 {
        int iH = h(bArr, i7, c2059e2);
        int i8 = c2059e2.f16030a;
        if (i8 < 0) {
            throw new Y2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - iH) {
            throw new Y2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            c2059e2.f16032c = AbstractC2131q2.f16138e;
            return iH;
        }
        c2059e2.f16032c = AbstractC2131q2.o(bArr, iH, i8);
        return iH + i8;
    }

    static int b(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int c(F3 f32, byte[] bArr, int i7, int i8, int i9, C2059e2 c2059e2) throws IOException {
        Object objB = f32.b();
        int iL = l(objB, f32, bArr, i7, i8, i9, c2059e2);
        f32.d(objB);
        c2059e2.f16032c = objB;
        return iL;
    }

    static int d(F3 f32, byte[] bArr, int i7, int i8, C2059e2 c2059e2) throws IOException {
        Object objB = f32.b();
        int iM = m(objB, f32, bArr, i7, i8, c2059e2);
        f32.d(objB);
        c2059e2.f16032c = objB;
        return iM;
    }

    static int e(F3 f32, int i7, byte[] bArr, int i8, int i9, V2 v22, C2059e2 c2059e2) throws IOException {
        int iD = d(f32, bArr, i8, i9, c2059e2);
        v22.add(c2059e2.f16032c);
        while (iD < i9) {
            int iH = h(bArr, iD, c2059e2);
            if (i7 != c2059e2.f16030a) {
                break;
            }
            iD = d(f32, bArr, iH, i9, c2059e2);
            v22.add(c2059e2.f16032c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i7, V2 v22, C2059e2 c2059e2) throws IOException {
        S2 s22 = (S2) v22;
        int iH = h(bArr, i7, c2059e2);
        int i8 = c2059e2.f16030a + iH;
        while (iH < i8) {
            iH = h(bArr, iH, c2059e2);
            s22.j(c2059e2.f16030a);
        }
        if (iH == i8) {
            return iH;
        }
        throw new Y2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i7, byte[] bArr, int i8, int i9, T3 t32, C2059e2 c2059e2) throws Y2 {
        if ((i7 >>> 3) == 0) {
            throw new Y2("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iK = k(bArr, i8, c2059e2);
            t32.j(i7, Long.valueOf(c2059e2.f16031b));
            return iK;
        }
        if (i10 == 1) {
            t32.j(i7, Long.valueOf(n(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iH = h(bArr, i8, c2059e2);
            int i11 = c2059e2.f16030a;
            if (i11 < 0) {
                throw new Y2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iH) {
                throw new Y2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                t32.j(i7, AbstractC2131q2.f16138e);
            } else {
                t32.j(i7, AbstractC2131q2.o(bArr, iH, i11));
            }
            return iH + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new Y2("Protocol message contained an invalid tag (zero).");
            }
            t32.j(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        T3 t3F = T3.f();
        int i13 = c2059e2.f16034e + 1;
        c2059e2.f16034e = i13;
        o(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int iH2 = h(bArr, i8, c2059e2);
            i14 = c2059e2.f16030a;
            if (i14 == i12) {
                i8 = iH2;
                break;
            }
            i8 = g(i14, bArr, iH2, i9, t3F, c2059e2);
        }
        c2059e2.f16034e--;
        if (i8 > i9 || i14 != i12) {
            throw new Y2("Failed to parse the message.");
        }
        t32.j(i7, t3F);
        return i8;
    }

    static int h(byte[] bArr, int i7, C2059e2 c2059e2) {
        int i8 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return i(b2, bArr, i8, c2059e2);
        }
        c2059e2.f16030a = b2;
        return i8;
    }

    static int i(int i7, byte[] bArr, int i8, C2059e2 c2059e2) {
        byte b2 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b2 >= 0) {
            c2059e2.f16030a = i10 | (b2 << 7);
            return i9;
        }
        int i11 = i10 | ((b2 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b3 = bArr[i9];
        if (b3 >= 0) {
            c2059e2.f16030a = i11 | (b3 << 14);
            return i12;
        }
        int i13 = i11 | ((b3 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            c2059e2.f16030a = i13 | (b8 << 21);
            return i14;
        }
        int i15 = i13 | ((b8 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            c2059e2.f16030a = i15 | (b9 << 28);
            return i16;
        }
        int i17 = i15 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c2059e2.f16030a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int j(int i7, byte[] bArr, int i8, int i9, V2 v22, C2059e2 c2059e2) {
        S2 s22 = (S2) v22;
        int iH = h(bArr, i8, c2059e2);
        s22.j(c2059e2.f16030a);
        while (iH < i9) {
            int iH2 = h(bArr, iH, c2059e2);
            if (i7 != c2059e2.f16030a) {
                break;
            }
            iH = h(bArr, iH2, c2059e2);
            s22.j(c2059e2.f16030a);
        }
        return iH;
    }

    static int k(byte[] bArr, int i7, C2059e2 c2059e2) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            c2059e2.f16031b = j7;
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
        c2059e2.f16031b = j8;
        return i9;
    }

    static int l(Object obj, F3 f32, byte[] bArr, int i7, int i8, int i9, C2059e2 c2059e2) throws IOException {
        C2173x3 c2173x3 = (C2173x3) f32;
        int i10 = c2059e2.f16034e + 1;
        c2059e2.f16034e = i10;
        o(i10);
        int iY = c2173x3.y(obj, bArr, i7, i8, i9, c2059e2);
        c2059e2.f16034e--;
        c2059e2.f16032c = obj;
        return iY;
    }

    static int m(Object obj, F3 f32, byte[] bArr, int i7, int i8, C2059e2 c2059e2) throws IOException {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = i(i10, bArr, i9, c2059e2);
            i10 = c2059e2.f16030a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new Y2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = c2059e2.f16034e + 1;
        c2059e2.f16034e = i12;
        o(i12);
        int i13 = i10 + i11;
        f32.f(obj, bArr, i11, i13, c2059e2);
        c2059e2.f16034e--;
        c2059e2.f16032c = obj;
        return i13;
    }

    static long n(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void o(int i7) throws Y2 {
        if (i7 >= f16057a) {
            throw new Y2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
