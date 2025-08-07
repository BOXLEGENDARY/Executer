package H5;

final class d {
    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z) {
        int iD = z ? bVar.d() : bVar.e();
        int iE = z ? bVar.e() : bVar.d();
        byte[][] bArrC = bVar.c();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iE; i4++) {
                byte b3 = z ? bArrC[i2][i4] : bArrC[i4][i2];
                if (b3 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b = b3;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }

    static int c(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < iD - 1; i2++) {
            byte[] bArr = bArrC[i2];
            int i3 = 0;
            while (i3 < iE - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = bArrC[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    static int d(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            for (int i3 = 0; i3 < iE; i3++) {
                byte[] bArr = bArrC[i2];
                int i4 = i3 + 6;
                if (i4 < iE && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (g(bArr, i3 - 4, i3) || g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iD && bArrC[i2][i3] == 1 && bArrC[i2 + 1][i3] == 0 && bArrC[i2 + 2][i3] == 1 && bArrC[i2 + 3][i3] == 1 && bArrC[i2 + 4][i3] == 1 && bArrC[i2 + 5][i3] == 0 && bArrC[i5][i3] == 1 && (h(bArrC, i3, i2 - 4, i2) || h(bArrC, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    static int e(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            byte[] bArr = bArrC[i2];
            for (int i3 = 0; i3 < iE; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iD2 = bVar.d() * bVar.e();
        return ((Math.abs((i * 2) - iD2) * 10) / iD2) * 10;
    }

    static boolean f(int r1, int r2, int r3) {
        throw new UnsupportedOperationException("Method not decompiled: H5.d.f(int, int, int):boolean");
    }

    private static boolean g(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
