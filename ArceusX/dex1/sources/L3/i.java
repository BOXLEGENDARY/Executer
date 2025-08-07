package L3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

public final class i {

    private static final OutputStream f2045a = new h();

    public static InputStream a(InputStream inputStream, long j7) {
        return new k(inputStream, 1048577L);
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        g.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iA = 8192;
        int i7 = 0;
        while (i7 < 2147483639) {
            int iMin = Math.min(iA, 2147483639 - i7);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = inputStream.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    return c(arrayDeque, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iA = m.a(iA, 2);
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] c(Deque<byte[]> deque, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = i7;
        while (i8 > 0) {
            byte[] bArrRemoveFirst = deque.removeFirst();
            int iMin = Math.min(i8, bArrRemoveFirst.length);
            System.arraycopy(bArrRemoveFirst, 0, bArr, i7 - i8, iMin);
            i8 -= iMin;
        }
        return bArr;
    }
}
