package H5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset b = StandardCharsets.ISO_8859_1;

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[G5.b.values().length];
            a = iArr;
            try {
                iArr[G5.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[G5.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[G5.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[G5.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, D5.a aVar, Charset charset) {
        for (byte b3 : str.getBytes(charset)) {
            aVar.c(b3, 8);
        }
    }

    static void b(CharSequence charSequence, D5.a aVar) throws C5.c {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iP = p(charSequence.charAt(i));
            if (iP == -1) {
                throw new C5.c();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iP2 = p(charSequence.charAt(i2));
                if (iP2 == -1) {
                    throw new C5.c();
                }
                aVar.c((iP * 45) + iP2, 11);
                i += 2;
            } else {
                aVar.c(iP, 6);
                i = i2;
            }
        }
    }

    static void c(String str, G5.b bVar, D5.a aVar, Charset charset) throws C5.c {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            h(str, aVar);
            return;
        }
        if (i == 2) {
            b(str, aVar);
            return;
        }
        if (i == 3) {
            a(str, aVar, charset);
        } else {
            if (i == 4) {
                e(str, aVar);
                return;
            }
            throw new C5.c("Invalid mode: " + bVar);
        }
    }

    private static void d(D5.c cVar, D5.a aVar) {
        aVar.c(G5.b.ECI.c(), 4);
        aVar.c(cVar.f(), 8);
    }

    static void e(String str, D5.a aVar) throws C5.c {
        int i;
        Charset charset = D5.e.b;
        if (charset == null) {
            throw new C5.c("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new C5.c("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
            int i4 = 33088;
            if (i3 >= 33088 && i3 <= 40956) {
                i = i3 - i4;
            } else if (i3 < 57408 || i3 > 60351) {
                i = -1;
            } else {
                i4 = 49472;
                i = i3 - i4;
            }
            if (i == -1) {
                throw new C5.c("Invalid byte sequence");
            }
            aVar.c(((i >> 8) * 192) + (i & 255), 13);
        }
    }

    static void f(int i, G5.c cVar, G5.b bVar, D5.a aVar) throws C5.c {
        int iE = bVar.e(cVar);
        int i2 = 1 << iE;
        if (i < i2) {
            aVar.c(i, iE);
            return;
        }
        throw new C5.c(i + " is bigger than " + (i2 - 1));
    }

    static void g(G5.b bVar, D5.a aVar) {
        aVar.c(bVar.c(), 4);
    }

    static void h(CharSequence charSequence, D5.a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    private static int i(G5.b bVar, D5.a aVar, D5.a aVar2, G5.c cVar) {
        return aVar.h() + bVar.e(cVar) + aVar2.h();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(D5.a aVar, G5.a aVar2, G5.c cVar, b bVar) throws C5.c {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            e.a(aVar, aVar2, cVar, i3, bVar);
            int iJ = j(bVar);
            if (iJ < i) {
                i2 = i3;
                i = iJ;
            }
        }
        return i2;
    }

    private static G5.b l(String str, Charset charset) {
        Charset charset2 = D5.e.b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return G5.b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return G5.b.BYTE;
                }
                z = true;
            }
        }
        return z ? G5.b.ALPHANUMERIC : z2 ? G5.b.NUMERIC : G5.b.BYTE;
    }

    private static G5.c m(int i, G5.a aVar) throws C5.c {
        for (int i2 = 1; i2 <= 40; i2++) {
            G5.c cVarE = G5.c.e(i2);
            if (v(i, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new C5.c("Data too big");
    }

    public static H5.g n(java.lang.String r6, G5.a r7, java.util.Map<C5.b, ?> r8) throws C5.c, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: H5.c.n(java.lang.String, G5.a, java.util.Map):H5.g");
    }

    static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new E5.c(E5.a.l).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static int p(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws C5.c {
        if (i4 >= i3) {
            throw new C5.c("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i10 = i7 + 1;
        int i11 = i2 / i3;
        int i12 = i11 + 1;
        int i13 = i7 - i11;
        int i14 = i10 - i12;
        if (i13 != i14) {
            throw new C5.c("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new C5.c("RS blocks mismatch");
        }
        if (i != ((i11 + i13) * i6) + ((i12 + i14) * i5)) {
            throw new C5.c("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i11;
            iArr2[0] = i13;
        } else {
            iArr[0] = i12;
            iArr2[0] = i14;
        }
    }

    static D5.a r(D5.a aVar, int i, int i2, int i3) throws C5.c {
        if (aVar.i() != i2) {
            throw new C5.c("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i, i2, i3, i5, iArr, iArr2);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            aVar.k(i4 * 8, bArr, 0, i6);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new H5.a(bArr, bArrO));
            iMax = Math.max(iMax, i6);
            iMax2 = Math.max(iMax2, bArrO.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new C5.c("Data bytes does not match offset");
        }
        D5.a aVar2 = new D5.a();
        for (int i7 = 0; i7 < iMax; i7++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((H5.a) it.next()).a();
                if (i7 < bArrA.length) {
                    aVar2.c(bArrA[i7], 8);
                }
            }
        }
        for (int i10 = 0; i10 < iMax2; i10++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((H5.a) it2.next()).b();
                if (i10 < bArrB.length) {
                    aVar2.c(bArrB[i10], 8);
                }
            }
        }
        if (i == aVar2.i()) {
            return aVar2;
        }
        throw new C5.c("Interleaving error: " + i + " and " + aVar2.i() + " differ.");
    }

    static boolean s(String str) {
        byte[] bytes = str.getBytes(D5.e.b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static G5.c t(G5.a aVar, G5.b bVar, D5.a aVar2, D5.a aVar3) throws C5.c {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, G5.c.e(1)), aVar)), aVar);
    }

    static void u(int i, D5.a aVar) throws C5.c {
        int i2 = i * 8;
        if (aVar.h() > i2) {
            throw new C5.c("data bits cannot fit in the QR Code" + aVar.h() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && aVar.h() < i2; i3++) {
            aVar.a(false);
        }
        int iH = aVar.h() & 7;
        if (iH > 0) {
            while (iH < 8) {
                aVar.a(false);
                iH++;
            }
        }
        int i4 = i - aVar.i();
        for (int i5 = 0; i5 < i4; i5++) {
            aVar.c((i5 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.h() != i2) {
            throw new C5.c("Bits size does not equal capacity");
        }
    }

    static boolean v(int i, G5.c cVar, G5.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i + 7) / 8;
    }
}
