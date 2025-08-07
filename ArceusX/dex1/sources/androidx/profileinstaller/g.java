package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class g {

    static final byte[] f11471a = {112, 114, 111, 0};

    static final byte[] f11472b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i7, int i8, c cVar) {
        int iM = m(i7, i8, cVar.f11459g);
        int i9 = iM / 8;
        bArr[i9] = (byte) ((1 << (iM % 8)) | bArr[i9]);
    }

    private static void B(InputStream inputStream) throws IOException {
        d.h(inputStream);
        int iJ = d.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            d.j(inputStream);
            for (int iJ2 = d.j(inputStream); iJ2 > 0; iJ2--) {
                d.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f11484a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11485b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11487d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.f11486c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.f11488e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) throws IOException {
        int[] iArr = cVar.f11460h;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            d.p(outputStream, i9 - i8);
            i7++;
            i8 = i9;
        }
    }

    private static j E(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i7 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f11455c);
                d.q(byteArrayOutputStream, cVar.f11456d);
                d.q(byteArrayOutputStream, cVar.f11459g);
                String strJ = j(cVar.f11453a, cVar.f11454b, i.f11484a);
                int iK = d.k(strJ);
                d.p(byteArrayOutputStream, iK);
                i7 = i7 + 14 + iK;
                d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i7 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i7, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f11471a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) throws IOException {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f11457e);
        d.q(outputStream, cVar.f11458f);
        d.q(outputStream, cVar.f11455c);
        d.q(outputStream, cVar.f11459g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f11459g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f11461i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i7, c cVar) throws IOException {
        byte[] bArr = new byte[l(i7, cVar.f11459g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f11461i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i8 = 0;
            for (int i9 = 1; i9 <= 4; i9 <<= 1) {
                if (i9 != 1 && (i9 & i7) != 0) {
                    if ((i9 & iIntValue2) == i9) {
                        int i10 = (cVar.f11459g * i8) + iIntValue;
                        int i11 = i10 / 8;
                        bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
                    }
                    i8++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) throws IOException {
        int i7 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f11461i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, iIntValue - i7);
                d.p(outputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String strJ = j(cVar.f11453a, cVar.f11454b, i.f11488e);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f11461i.size());
            d.p(outputStream, cVar.f11460h.length);
            d.q(outputStream, cVar.f11455c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f11461i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
            }
            for (int i7 : cVar.f11460h) {
                d.p(outputStream, i7);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f11461i.size() * 4;
            String strJ = j(cVar.f11453a, cVar.f11454b, i.f11487d);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f11460h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f11455c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f11461i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
                d.p(outputStream, 0);
            }
            for (int i7 : cVar.f11460h) {
                d.p(outputStream, i7);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f11486c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, i.f11485b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) throws IOException {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = i.f11484a.length + f11471a.length + 4 + (arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            j jVar = (j) arrayList.get(i7);
            d.q(outputStream, jVar.f11491a.e());
            d.q(outputStream, length2);
            if (jVar.f11494d) {
                byte[] bArr = jVar.f11493c;
                long length3 = bArr.length;
                byte[] bArrB = d.b(bArr);
                arrayList2.add(bArrB);
                d.q(outputStream, bArrB.length);
                d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(jVar.f11493c);
                d.q(outputStream, jVar.f11493c.length);
                d.q(outputStream, 0L);
                length = jVar.f11493c.length;
            }
            length2 += length;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            outputStream.write((byte[]) arrayList2.get(i8));
        }
    }

    private static int a(c cVar) {
        Iterator<Map.Entry<Integer, Integer>> it = cVar.f11461i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int iK = 0;
        for (c cVar : cVarArr) {
            iK += d.k(j(cVar.f11453a, cVar.f11454b, bArr)) + 16 + (cVar.f11457e * 2) + cVar.f11458f + k(cVar.f11459g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, i.f11486c)) {
            int length = cVarArr.length;
            while (i7 < length) {
                c cVar2 = cVarArr[i7];
                H(byteArrayOutputStream, cVar2, j(cVar2.f11453a, cVar2.f11454b, bArr));
                G(byteArrayOutputStream, cVar2);
                i7++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f11453a, cVar3.f11454b, bArr));
            }
            int length2 = cVarArr.length;
            while (i7 < length2) {
                G(byteArrayOutputStream, cVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static j c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < cVarArr.length; i8++) {
            try {
                c cVar = cVarArr[i8];
                d.p(byteArrayOutputStream, i8);
                d.p(byteArrayOutputStream, cVar.f11457e);
                i7 = i7 + 4 + (cVar.f11457e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            j jVar = new j(e.CLASSES, i7, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < cVarArr.length; i8++) {
            try {
                c cVar = cVarArr[i8];
                int iA = a(cVar);
                byte[] bArrE = e(iA, cVar);
                byte[] bArrF = f(cVar);
                d.p(byteArrayOutputStream, i8);
                int length = bArrE.length + 2 + bArrF.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i7 = i7 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            j jVar = new j(e.METHODS, i7, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i7, c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i7, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i7 = 0; i7 < cVarArr.length; i7++) {
            if (cVarArr[i7].f11454b.equals(strH)) {
                return cVarArr[i7];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i7) {
        return z(i7 * 2) / 8;
    }

    private static int l(int i7, int i8) {
        return z(Integer.bitCount(i7 & (-2)) * i8) / 8;
    }

    private static int m(int i7, int i8, int i9) {
        if (i7 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i7 == 2) {
            return i8;
        }
        if (i7 == 4) {
            return i8 + i9;
        }
        throw d.c("Unexpected flag: " + i7);
    }

    private static int[] n(InputStream inputStream, int i7) throws IOException {
        int[] iArr = new int[i7];
        int iH = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iH += d.h(inputStream);
            iArr[i8] = iH;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i7, int i8) {
        int i9 = bitSet.get(m(2, i7, i8)) ? 2 : 0;
        return bitSet.get(m(4, i7, i8)) ? i9 | 4 : i9;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f11485b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) throws IOException {
        int iAvailable = inputStream.available() - cVar.f11458f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d.h(inputStream);
            cVar.f11461i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f11489f)) {
            if (Arrays.equals(i.f11484a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.f11490g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, i.f11489f)) {
            throw d.c("Unsupported meta version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrT = t(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrT;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] t(InputStream inputStream, int i7, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iH = d.h(inputStream);
            iArr[i8] = d.h(inputStream);
            strArr[i8] = d.f(inputStream, iH);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            c cVar = cVarArr[i9];
            if (!cVar.f11454b.equals(strArr[i9])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            cVar.f11457e = i10;
            cVar.f11460h = n(inputStream, i10);
        }
        return cVarArr;
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int iH = d.h(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrV = v(byteArrayInputStream, bArr, iH, cVarArr);
            byteArrayInputStream.close();
            return cVarArrV;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i7, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i7 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            d.h(inputStream);
            String strF = d.f(inputStream, d.h(inputStream));
            long jI = d.i(inputStream);
            int iH = d.h(inputStream);
            c cVarI = i(cVarArr, strF);
            if (cVarI == null) {
                throw d.c("Missing profile key: " + strF);
            }
            cVarI.f11456d = jI;
            int[] iArrN = n(inputStream, iH);
            if (Arrays.equals(bArr, i.f11488e)) {
                cVarI.f11457e = iH;
                cVarI.f11460h = iArrN;
            }
        }
        return cVarArr;
    }

    private static void w(InputStream inputStream, c cVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f11459g * 2)));
        int i7 = 0;
        while (true) {
            int i8 = cVar.f11459g;
            if (i7 >= i8) {
                return;
            }
            int iO = o(bitSetValueOf, i7, i8);
            if (iO != 0) {
                Integer num = cVar.f11461i.get(Integer.valueOf(i7));
                if (num == null) {
                    num = 0;
                }
                cVar.f11461i.put(Integer.valueOf(i7), Integer.valueOf(iO | num.intValue()));
            }
            i7++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, i.f11485b)) {
            throw d.c("Unsupported version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrY;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i7) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iH = d.h(inputStream);
            int iH2 = d.h(inputStream);
            cVarArr[i8] = new c(str, d.f(inputStream, iH), d.i(inputStream), 0L, iH2, (int) d.i(inputStream), (int) d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            c cVar = cVarArr[i9];
            q(inputStream, cVar);
            cVar.f11460h = n(inputStream, cVar.f11457e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int z(int i7) {
        return (i7 + 7) & (-8);
    }
}
