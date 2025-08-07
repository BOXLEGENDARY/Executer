package E4;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class g0 {
    public static long a(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 16);
    }

    public static long b(ByteBuffer byteBuffer) {
        g(byteBuffer);
        return e(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairF = f(randomAccessFile, 0);
        return pairF != null ? pairF : f(randomAccessFile, 65535);
    }

    public static void d(ByteBuffer byteBuffer, long j7) {
        g(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j7 >= 0 && j7 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j7);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j7);
    }

    private static long e(ByteBuffer byteBuffer, int i7) {
        return byteBuffer.getInt(i7) & 4294967295L;
    }

    private static Pair f(RandomAccessFile randomAccessFile, int i7) throws IOException {
        int i8;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i7, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        g(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i8 = -1;
        } else {
            int i9 = iCapacity - 22;
            int iMin = Math.min(i9, 65535);
            for (int i10 = 0; i10 < iMin; i10++) {
                i8 = i9 - i10;
                if (byteBufferAllocate.getInt(i8) == 101010256 && ((char) byteBufferAllocate.getShort(i8 + 20)) == i10) {
                    break;
                }
            }
            i8 = -1;
        }
        if (i8 == -1) {
            return null;
        }
        byteBufferAllocate.position(i8);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i8));
    }

    private static void g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
