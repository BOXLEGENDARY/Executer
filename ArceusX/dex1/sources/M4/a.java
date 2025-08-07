package M4;

import K4.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class a {

    private static final OutputStream f2358a = new C0033a();

    class C0033a extends OutputStream {
        C0033a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override
        public void write(int i7) {
        }

        @Override
        public void write(byte[] bArr) {
            g.g(bArr);
        }

        @Override
        public void write(byte[] bArr, int i7, int i8) {
            g.g(bArr);
            g.l(i7, i8 + i7, bArr.length);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i7) {
            return bArrRemove;
        }
        int length = i7 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i7);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        g.g(inputStream);
        return c(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] c(InputStream inputStream, Queue<byte[]> queue, int i7) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return a(queue, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = N4.a.a(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
