package E;

import com.github.luben.zstd.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

final class g {

    static final Charset f1018e = StandardCharsets.US_ASCII;

    static final String[] f1019f = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    static final int[] f1020g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    static final byte[] f1021h = {65, 83, 67, 73, 73, 0, 0, 0};

    public final int f1022a;

    public final int f1023b;

    public final long f1024c;

    public final byte[] f1025d;

    g(int i7, int i8, byte[] bArr) {
        this(i7, i8, -1L, bArr);
    }

    public static g a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f1018e);
        return new g(1, bytes.length, bytes);
    }

    public static g b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d7 : dArr) {
            byteBufferWrap.putDouble(d7);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i7 : iArr) {
            byteBufferWrap.putInt(i7);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g d(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[10] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(10, kVarArr.length, byteBufferWrap.array());
    }

    public static g e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f1018e);
        return new g(2, bytes.length, bytes);
    }

    public static g f(long j7, ByteOrder byteOrder) {
        return g(new long[]{j7}, byteOrder);
    }

    public static g g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j7 : jArr) {
            byteBufferWrap.putInt((int) j7);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g h(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[5] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(5, kVarArr.length, byteBufferWrap.array());
    }

    public static g i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1020g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i7 : iArr) {
            byteBufferWrap.putShort((short) i7);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f1020g[this.f1022a] * this.f1023b;
    }

    public String toString() {
        return "(" + f1019f[this.f1022a] + ", data length:" + this.f1025d.length + ")";
    }

    g(int i7, int i8, long j7, byte[] bArr) {
        this.f1022a = i7;
        this.f1023b = i8;
        this.f1024c = j7;
        this.f1025d = bArr;
    }
}
