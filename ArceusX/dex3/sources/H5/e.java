package H5;

final class e {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(D5.a aVar, G5.a aVar2, G5.c cVar, int i, b bVar) throws C5.c {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i, bVar);
        s(cVar, bVar);
        f(aVar, i, bVar);
    }

    static int b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i2);
        int iN2 = i << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i2 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(G5.c cVar, b bVar) throws C5.c {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws C5.c {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new C5.c();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    static void f(D5.a aVar, int i, b bVar) throws C5.c {
        boolean zG;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iE - i4;
                    if (o(bVar.b(i5, iD))) {
                        if (i2 < aVar.h()) {
                            zG = aVar.g(i2);
                            i2++;
                        } else {
                            zG = false;
                        }
                        if (i != -1 && d.f(i, i5, iD)) {
                            zG = !zG;
                        }
                        bVar.g(i5, iD, zG);
                    }
                }
                iD += i3;
            }
            i3 = -i3;
            iD += i3;
            iE -= 2;
        }
        if (i2 == aVar.h()) {
            return;
        }
        throw new C5.c("Not all bits consumed: " + i2 + '/' + aVar.h());
    }

    private static void g(int i, int i2, b bVar) throws C5.c {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!o(bVar.b(i4, i2))) {
                throw new C5.c();
            }
            bVar.f(i4, i2, 0);
        }
    }

    private static void h(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void i(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void j(b bVar) throws C5.c {
        int length = a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i = 8;
        while (i < bVar.e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (o(bVar.b(i, 6))) {
                bVar.f(i, 6, i3);
            }
            if (o(bVar.b(6, i))) {
                bVar.f(6, i, i3);
            }
            i = i2;
        }
    }

    static void l(G5.a aVar, int i, b bVar) throws C5.c {
        int iD;
        D5.a aVar2 = new D5.a();
        p(aVar, i, aVar2);
        for (int i2 = 0; i2 < aVar2.h(); i2++) {
            boolean zG = aVar2.g((aVar2.h() - 1) - i2);
            int[] iArr = d[i2];
            bVar.g(iArr[0], iArr[1], zG);
            int iE = 8;
            if (i2 < 8) {
                iD = 8;
                iE = (bVar.e() - i2) - 1;
            } else {
                iD = (bVar.d() - 7) + (i2 - 8);
            }
            bVar.g(iE, iD, zG);
        }
    }

    private static void m(int i, int i2, b bVar) throws C5.c {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!o(bVar.b(i, i4))) {
                throw new C5.c();
            }
            bVar.f(i, i4, 0);
        }
    }

    static int n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static boolean o(int i) {
        return i == -1;
    }

    static void p(G5.a aVar, int i, D5.a aVar2) throws C5.c {
        if (!g.b(i)) {
            throw new C5.c("Invalid mask pattern");
        }
        int iC = (aVar.c() << 3) | i;
        aVar2.c(iC, 5);
        aVar2.c(b(iC, 1335), 10);
        D5.a aVar3 = new D5.a();
        aVar3.c(21522, 15);
        aVar2.l(aVar3);
        if (aVar2.h() == 15) {
            return;
        }
        throw new C5.c("should not happen but we got: " + aVar2.h());
    }

    static void q(G5.c cVar, D5.a aVar) throws C5.c {
        aVar.c(cVar.f(), 6);
        aVar.c(b(cVar.f(), 7973), 12);
        if (aVar.h() == 18) {
            return;
        }
        throw new C5.c("should not happen but we got: " + aVar.h());
    }

    private static void r(G5.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = c[cVar.f() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && o(bVar.b(i2, i))) {
                        h(i2 - 2, i - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(G5.c cVar, b bVar) throws C5.c {
        if (cVar.f() < 7) {
            return;
        }
        D5.a aVar = new D5.a();
        q(cVar, aVar);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zG = aVar.g(i);
                i--;
                bVar.g(i2, (bVar.d() - 11) + i3, zG);
                bVar.g((bVar.d() - 11) + i3, i2, zG);
            }
        }
    }
}
