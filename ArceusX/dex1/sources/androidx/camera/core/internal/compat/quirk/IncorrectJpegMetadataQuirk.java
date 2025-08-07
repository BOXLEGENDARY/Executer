package androidx.camera.core.internal.compat.quirk;

import C.N0;
import android.os.Build;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class IncorrectJpegMetadataQuirk implements N0 {

    private static final Set<String> f9479a = new HashSet(Arrays.asList("A24"));

    private boolean f(byte[] bArr) {
        byte b2;
        int i7 = 2;
        while (i7 + 4 <= bArr.length && (b2 = bArr[i7]) == -1) {
            if (b2 == -1 && bArr[i7 + 1] == -38) {
                return true;
            }
            i7 += (((bArr[i7 + 2] & 255) << 8) | (bArr[i7 + 3] & 255)) + 2;
        }
        return false;
    }

    private int g(byte[] bArr) {
        int i7 = 2;
        while (true) {
            int i8 = i7 + 1;
            if (i8 > bArr.length) {
                return -1;
            }
            if (bArr[i7] == -1 && bArr[i8] == -40) {
                return i7;
            }
            i7 = i8;
        }
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f9479a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean j() {
        return h();
    }

    public byte[] i(n nVar) {
        int iG = 0;
        ByteBuffer byteBufferC = nVar.s()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return (f(bArr) || (iG = g(bArr)) != -1) ? Arrays.copyOfRange(bArr, iG, byteBufferC.limit()) : bArr;
    }
}
