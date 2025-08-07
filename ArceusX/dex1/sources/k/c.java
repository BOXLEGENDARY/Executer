package K;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

public class c {

    private final LargeJpegImageQuirk f1730a = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.b(LargeJpegImageQuirk.class);

    public static int a(byte[] bArr) {
        byte b2;
        int i7 = 2;
        while (i7 + 4 <= bArr.length && (b2 = bArr[i7]) == -1) {
            int i8 = i7 + 2;
            int i9 = ((bArr[i8] & 255) << 8) | (bArr[i7 + 3] & 255);
            if (b2 == -1 && bArr[i7 + 1] == -38) {
                while (true) {
                    int i10 = i8 + 2;
                    if (i10 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i8] == -1 && bArr[i8 + 1] == -39) {
                        return i10;
                    }
                    i8++;
                }
            } else {
                i7 += i9 + 2;
            }
        }
        return -1;
    }

    public int b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f1730a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.j(bArr)) {
            return bArr.length;
        }
        int iA = a(bArr);
        return iA != -1 ? iA : bArr.length;
    }
}
