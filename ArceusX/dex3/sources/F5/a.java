package F5;

import C5.c;
import D5.b;
import H5.g;
import java.util.Map;

public final class a {
    private static b b(g gVar, int i, int i2, int i3) {
        H5.b bVarA = gVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i4 = i3 * 2;
        int i5 = iE + i4;
        int i6 = i4 + iD;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iE * iMin)) / 2;
        int i10 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i11 = 0;
        while (i11 < iD) {
            int i12 = 0;
            int i13 = i7;
            while (i12 < iE) {
                if (bVarA.b(i12, i11) == 1) {
                    bVar.d(i13, i10, iMin, iMin);
                }
                i12++;
                i13 += iMin;
            }
            i11++;
            i10 += iMin;
        }
        return bVar;
    }

    public b a(String str, C5.a aVar, int i, int i2, Map<C5.b, ?> map) throws c, NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != C5.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        G5.a aVarValueOf = G5.a.L;
        int i3 = 4;
        if (map != null) {
            C5.b bVar = C5.b.ERROR_CORRECTION;
            if (map.containsKey(bVar)) {
                aVarValueOf = G5.a.valueOf(map.get(bVar).toString());
            }
            C5.b bVar2 = C5.b.MARGIN;
            if (map.containsKey(bVar2)) {
                i3 = Integer.parseInt(map.get(bVar2).toString());
            }
        }
        return b(H5.c.n(str, aVarValueOf, map), i, i2, i3);
    }
}
