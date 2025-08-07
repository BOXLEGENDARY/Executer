package L0;

import K0.wJ.BtcVLuo;
import Q6.QtA.QXojhh;
import S5.Cg.XjqcfAbdbc;
import U.Gw.oeVkjmfPcLbWm;
import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import e2.vb.oyfFwvPUKctyaG;
import f6.ck.ZJZXBWla;
import j0.tkB.pkcpMQSgx;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import k0.BAKp.xAQOwX;
import z3.AdxZ.bpTQi;

public class a {

    private static SimpleDateFormat f1964U;

    private static SimpleDateFormat f1965V;

    private static final e[] f1969Z;

    private static final e[] f1970a0;

    private static final e[] f1971b0;

    private static final e[] f1972c0;

    private static final e[] f1973d0;

    private static final e f1974e0;

    private static final e[] f1975f0;

    private static final e[] f1976g0;

    private static final e[] f1977h0;

    private static final e[] f1978i0;

    static final e[][] f1979j0;

    private static final e[] f1980k0;

    private static final e f1981l0;

    private static final e f1982m0;

    private static final HashMap<Integer, e>[] f1983n0;

    private static final HashMap<String, e>[] f1984o0;

    private static final HashSet<String> f1985p0;

    private static final HashMap<Integer, Integer> f1986q0;

    static final Charset f1987r0;

    static final byte[] f1988s0;

    private static final byte[] f1989t0;

    private static final Pattern f1990u0;

    private static final Pattern f1992v0;

    private static final Pattern f1994w0;

    private static final Pattern f1996x0;

    private String f1999a;

    private FileDescriptor f2000b;

    private AssetManager.AssetInputStream f2001c;

    private int f2002d;

    private boolean f2003e;

    private final HashMap<String, d>[] f2004f;

    private Set<Integer> f2005g;

    private ByteOrder f2006h;

    private boolean f2007i;

    private boolean f2008j;

    private boolean f2009k;

    private int f2010l;

    private int f2011m;

    private byte[] f2012n;

    private int f2013o;

    private int f2014p;

    private int f2015q;

    private int f2016r;

    private int f2017s;

    private boolean f2018t;

    private boolean f2019u;

    private static final boolean f1991v = Log.isLoggable("ExifInterface", 3);

    private static final List<Integer> f1993w = Arrays.asList(1, 6, 3, 8);

    private static final List<Integer> f1995x = Arrays.asList(2, 7, 4, 5);

    public static final int[] f1997y = {8, 8, 8};

    public static final int[] f1998z = {4};

    public static final int[] f1944A = {8};

    static final byte[] f1945B = {-1, -40, -1};

    private static final byte[] f1946C = {102, 116, 121, 112};

    private static final byte[] f1947D = {109, 105, 102, 49};

    private static final byte[] f1948E = {104, 101, 105, 99};

    private static final byte[] f1949F = {79, 76, 89, 77, 80, 0};

    private static final byte[] f1950G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    private static final byte[] f1951H = {-119, 80, 78, 71, 13, 10, 26, 10};

    private static final byte[] f1952I = {101, 88, 73, 102};

    private static final byte[] f1953J = {73, 72, 68, 82};

    private static final byte[] f1954K = {73, 69, 78, 68};

    private static final byte[] f1955L = {82, 73, 70, 70};

    private static final byte[] f1956M = {87, 69, 66, 80};

    private static final byte[] f1957N = {69, 88, 73, 70};

    private static final byte[] f1958O = {-99, 1, 42};

    private static final byte[] f1959P = "VP8X".getBytes(Charset.defaultCharset());

    private static final byte[] f1960Q = "VP8L".getBytes(Charset.defaultCharset());

    private static final byte[] f1961R = "VP8 ".getBytes(Charset.defaultCharset());

    private static final byte[] f1962S = "ANIM".getBytes(Charset.defaultCharset());

    private static final byte[] f1963T = "ANMF".getBytes(Charset.defaultCharset());

    static final String[] f1966W = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", oyfFwvPUKctyaG.f0try, "DOUBLE", "IFD"};

    static final int[] f1967X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    static final byte[] f1968Y = {65, 83, 67, 73, 73, 0, 0, 0};

    class C0030a extends MediaDataSource {

        long f2020d;

        final b f2021e;

        C0030a(b bVar) {
            this.f2021e = bVar;
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public long getSize() throws IOException {
            return -1L;
        }

        @Override
        public int readAt(long j7, byte[] bArr, int i7, int i8) throws IOException {
            if (i8 == 0) {
                return 0;
            }
            if (j7 < 0) {
                return -1;
            }
            try {
                long j8 = this.f2020d;
                if (j8 != j7) {
                    if (j8 >= 0 && j7 >= j8 + this.f2021e.available()) {
                        return -1;
                    }
                    this.f2021e.j(j7);
                    this.f2020d = j7;
                }
                if (i8 > this.f2021e.available()) {
                    i8 = this.f2021e.available();
                }
                int i9 = this.f2021e.read(bArr, i7, i8);
                if (i9 >= 0) {
                    this.f2020d += i9;
                    return i9;
                }
            } catch (IOException unused) {
            }
            this.f2020d = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        private static final ByteOrder f2023w = ByteOrder.LITTLE_ENDIAN;

        private static final ByteOrder f2024y = ByteOrder.BIG_ENDIAN;

        private DataInputStream f2025d;

        private ByteOrder f2026e;

        final int f2027i;

        int f2028v;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override
        public int available() throws IOException {
            return this.f2025d.available();
        }

        public int b() {
            return this.f2027i;
        }

        public int e() {
            return this.f2028v;
        }

        public long f() throws IOException {
            return readInt() & 4294967295L;
        }

        public void j(long j7) throws IOException {
            int i7 = this.f2028v;
            if (i7 > j7) {
                this.f2028v = 0;
                this.f2025d.reset();
                this.f2025d.mark(this.f2027i);
            } else {
                j7 -= i7;
            }
            int i8 = (int) j7;
            if (skipBytes(i8) != i8) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void m(ByteOrder byteOrder) {
            this.f2026e = byteOrder;
        }

        @Override
        public synchronized void mark(int i7) {
            this.f2025d.mark(i7);
        }

        @Override
        public int read() throws IOException {
            this.f2028v++;
            return this.f2025d.read();
        }

        @Override
        public boolean readBoolean() throws IOException {
            this.f2028v++;
            return this.f2025d.readBoolean();
        }

        @Override
        public byte readByte() throws IOException {
            int i7 = this.f2028v + 1;
            this.f2028v = i7;
            if (i7 > this.f2027i) {
                throw new EOFException();
            }
            int i8 = this.f2025d.read();
            if (i8 >= 0) {
                return (byte) i8;
            }
            throw new EOFException();
        }

        @Override
        public char readChar() throws IOException {
            this.f2028v += 2;
            return this.f2025d.readChar();
        }

        @Override
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override
        public void readFully(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f2028v + i8;
            this.f2028v = i9;
            if (i9 > this.f2027i) {
                throw new EOFException();
            }
            if (this.f2025d.read(bArr, i7, i8) != i8) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override
        public int readInt() throws IOException {
            int i7 = this.f2028v + 4;
            this.f2028v = i7;
            if (i7 > this.f2027i) {
                throw new EOFException();
            }
            int i8 = this.f2025d.read();
            int i9 = this.f2025d.read();
            int i10 = this.f2025d.read();
            int i11 = this.f2025d.read();
            if ((i8 | i9 | i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2026e;
            if (byteOrder == f2023w) {
                return (i11 << 24) + (i10 << 16) + (i9 << 8) + i8;
            }
            if (byteOrder == f2024y) {
                return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f2026e);
        }

        @Override
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override
        public long readLong() throws IOException {
            int i7 = this.f2028v + 8;
            this.f2028v = i7;
            if (i7 > this.f2027i) {
                throw new EOFException();
            }
            int i8 = this.f2025d.read();
            int i9 = this.f2025d.read();
            int i10 = this.f2025d.read();
            int i11 = this.f2025d.read();
            int i12 = this.f2025d.read();
            int i13 = this.f2025d.read();
            int i14 = this.f2025d.read();
            int i15 = this.f2025d.read();
            if ((i8 | i9 | i10 | i11 | i12 | i13 | i14 | i15) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2026e;
            if (byteOrder == f2023w) {
                return (i15 << 56) + (i14 << 48) + (i13 << 40) + (i12 << 32) + (i11 << 24) + (i10 << 16) + (i9 << 8) + i8;
            }
            if (byteOrder == f2024y) {
                return (i8 << 56) + (i9 << 48) + (i10 << 40) + (i11 << 32) + (i12 << 24) + (i13 << 16) + (i14 << 8) + i15;
            }
            throw new IOException("Invalid byte order: " + this.f2026e);
        }

        @Override
        public short readShort() throws IOException {
            int i7 = this.f2028v + 2;
            this.f2028v = i7;
            if (i7 > this.f2027i) {
                throw new EOFException();
            }
            int i8 = this.f2025d.read();
            int i9 = this.f2025d.read();
            if ((i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2026e;
            if (byteOrder == f2023w) {
                return (short) ((i9 << 8) + i8);
            }
            if (byteOrder == f2024y) {
                return (short) ((i8 << 8) + i9);
            }
            throw new IOException("Invalid byte order: " + this.f2026e);
        }

        @Override
        public String readUTF() throws IOException {
            this.f2028v += 2;
            return this.f2025d.readUTF();
        }

        @Override
        public int readUnsignedByte() throws IOException {
            this.f2028v++;
            return this.f2025d.readUnsignedByte();
        }

        @Override
        public int readUnsignedShort() throws IOException {
            int i7 = this.f2028v + 2;
            this.f2028v = i7;
            if (i7 > this.f2027i) {
                throw new EOFException();
            }
            int i8 = this.f2025d.read();
            int i9 = this.f2025d.read();
            if ((i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2026e;
            if (byteOrder == f2023w) {
                return (i9 << 8) + i8;
            }
            if (byteOrder == f2024y) {
                return (i8 << 8) + i9;
            }
            throw new IOException("Invalid byte order: " + this.f2026e);
        }

        @Override
        public int skipBytes(int i7) throws IOException {
            int iMin = Math.min(i7, this.f2027i - this.f2028v);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.f2025d.skipBytes(iMin - iSkipBytes);
            }
            this.f2028v += iSkipBytes;
            return iSkipBytes;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f2026e = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2025d = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f2027i = iAvailable;
            this.f2028v = 0;
            this.f2025d.mark(iAvailable);
            this.f2026e = byteOrder;
        }

        @Override
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f2025d.read(bArr, i7, i8);
            this.f2028v += i9;
            return i9;
        }

        @Override
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f2028v + bArr.length;
            this.f2028v = length;
            if (length <= this.f2027i) {
                if (this.f2025d.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    private static class c extends FilterOutputStream {

        final OutputStream f2029d;

        private ByteOrder f2030e;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f2029d = outputStream;
            this.f2030e = byteOrder;
        }

        public void b(ByteOrder byteOrder) {
            this.f2030e = byteOrder;
        }

        public void e(int i7) throws IOException {
            this.f2029d.write(i7);
        }

        public void f(int i7) throws IOException {
            ByteOrder byteOrder = this.f2030e;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2029d.write(i7 & 255);
                this.f2029d.write((i7 >>> 8) & 255);
                this.f2029d.write((i7 >>> 16) & 255);
                this.f2029d.write((i7 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f2029d.write((i7 >>> 24) & 255);
                this.f2029d.write((i7 >>> 16) & 255);
                this.f2029d.write((i7 >>> 8) & 255);
                this.f2029d.write(i7 & 255);
            }
        }

        public void j(short s7) throws IOException {
            ByteOrder byteOrder = this.f2030e;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2029d.write(s7 & 255);
                this.f2029d.write((s7 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f2029d.write((s7 >>> 8) & 255);
                this.f2029d.write(s7 & 255);
            }
        }

        public void m(long j7) throws IOException {
            f((int) j7);
        }

        public void u(int i7) throws IOException {
            j((short) i7);
        }

        @Override
        public void write(byte[] bArr) throws IOException {
            this.f2029d.write(bArr);
        }

        @Override
        public void write(byte[] bArr, int i7, int i8) throws IOException {
            this.f2029d.write(bArr, i7, i8);
        }
    }

    private static class d {

        public final int f2031a;

        public final int f2032b;

        public final long f2033c;

        public final byte[] f2034d;

        d(int i7, int i8, byte[] bArr) {
            this(i7, i8, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f1987r0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d7 : dArr) {
                byteBufferWrap.putDouble(d7);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i7 : iArr) {
                byteBufferWrap.putInt(i7);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f2039a);
                byteBufferWrap.putInt((int) fVar.f2040b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f1987r0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j7, ByteOrder byteOrder) {
            return g(new long[]{j7}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j7 : jArr) {
                byteBufferWrap.putInt((int) j7);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f2039a);
                byteBufferWrap.putInt((int) fVar.f2040b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i7, ByteOrder byteOrder) {
            return k(new int[]{i7}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f1967X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i7 : iArr) {
                byteBufferWrap.putShort((short) i7);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i7 < jArr.length) {
                    sb.append(jArr[i7]);
                    i7++;
                    if (i7 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i7 < iArr.length) {
                    sb.append(iArr[i7]);
                    i7++;
                    if (i7 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i7 < dArr.length) {
                    sb.append(dArr[i7]);
                    i7++;
                    if (i7 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i7 < fVarArr.length) {
                sb.append(fVarArr[i7].f2039a);
                sb.append('/');
                sb.append(fVarArr[i7].f2040b);
                i7++;
                if (i7 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        java.lang.Object o(java.nio.ByteOrder r12) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: L0.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.f1967X[this.f2031a] * this.f2032b;
        }

        public String toString() {
            return "(" + a.f1966W[this.f2031a] + ", data length:" + this.f2034d.length + ")";
        }

        d(int i7, int i8, long j7, byte[] bArr) {
            this.f2031a = i7;
            this.f2032b = i8;
            this.f2033c = j7;
            this.f2034d = bArr;
        }
    }

    private static class f {

        public final long f2039a;

        public final long f2040b;

        f(double d7) {
            this((long) (d7 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f2039a / this.f2040b;
        }

        public String toString() {
            return this.f2039a + "/" + this.f2040b;
        }

        f(long j7, long j8) {
            if (j8 == 0) {
                this.f2039a = 0L;
                this.f2040b = 1L;
            } else {
                this.f2039a = j7;
                this.f2040b = j8;
            }
        }
    }

    static {
        e[] eVarArr = {new e(XjqcfAbdbc.FqVzsoAZy, 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e(tAjeAKSIqDqzNP.DbZoEfKQXwtG, 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e(KwdswzaUHE.ZOpvniLq, 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f1969Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f1970a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e(bpTQi.ArnIoaQBOqsLk, 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f1971b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f1972c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e(BtcVLuo.cvJhw, 50720, 3, 4)};
        f1973d0 = eVarArr5;
        f1974e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f1975f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f1976g0 = eVarArr7;
        e[] eVarArr8 = {new e(pkcpMQSgx.XrpD, 4371, 3)};
        f1977h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f1978i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f1979j0 = eVarArr10;
        f1980k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f1981l0 = new e("JPEGInterchangeFormat", 513, 4);
        f1982m0 = new e("JPEGInterchangeFormatLength", 514, 4);
        f1983n0 = new HashMap[eVarArr10.length];
        f1984o0 = new HashMap[eVarArr10.length];
        f1985p0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1986q0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f1987r0 = charsetForName;
        f1988s0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f1989t0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f1964U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f1965V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            e[][] eVarArr11 = f1979j0;
            if (i7 >= eVarArr11.length) {
                HashMap<Integer, Integer> map = f1986q0;
                e[] eVarArr12 = f1980k0;
                map.put(Integer.valueOf(eVarArr12[0].f2035a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f2035a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f2035a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f2035a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f2035a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f2035a), 8);
                f1990u0 = Pattern.compile(".*[1-9].*");
                f1992v0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f1994w0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f1996x0 = Pattern.compile(xAQOwX.seMGmsxPkNyu);
                return;
            }
            f1983n0[i7] = new HashMap<>();
            f1984o0[i7] = new HashMap<>();
            for (e eVar : eVarArr11[i7]) {
                f1983n0[i7].put(Integer.valueOf(eVar.f2035a), eVar);
                f1984o0[i7].put(eVar.f2036b, eVar);
            }
            i7++;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f1979j0;
        this.f2004f = new HashMap[eVarArr.length];
        this.f2005g = new HashSet(eVarArr.length);
        this.f2006h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        H(str);
    }

    private void A(b bVar) throws IOException {
        byte[] bArr = f1988s0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f2014p = bArr.length;
        Z(bArr2, 0);
    }

    private void D(b bVar) throws Throwable {
        if (f1991v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.m(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f1955L.length);
        int i7 = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(f1956M.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i8 = bVar.readInt();
                int i9 = iSkipBytes + 8;
                if (Arrays.equals(f1957N, bArr)) {
                    byte[] bArr2 = new byte[i8];
                    if (bVar.read(bArr2) == i8) {
                        this.f2014p = i9;
                        Z(bArr2, 0);
                        l0(new b(bArr2));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i8 % 2 == 1) {
                    i8++;
                }
                int i10 = i9 + i8;
                if (i10 == i7) {
                    return;
                }
                if (i10 > i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i8);
                if (iSkipBytes2 != i8) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i9 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> E(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairE = E(strArrSplit[0]);
            if (((Integer) pairE.first).intValue() == 2) {
                return pairE;
            }
            for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                Pair<Integer, Integer> pairE2 = E(strArrSplit[i7]);
                int iIntValue = (((Integer) pairE2.first).equals(pairE.first) || ((Integer) pairE2.second).equals(pairE.first)) ? ((Integer) pairE.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairE.second).intValue() == -1 || !(((Integer) pairE2.first).equals(pairE.second) || ((Integer) pairE2.second).equals(pairE.second))) ? -1 : ((Integer) pairE.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairE = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairE = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairE;
        }
        String str2 = ZJZXBWla.liTTkVuXnR;
        if (!str.contains(str2)) {
            try {
                try {
                    long j7 = Long.parseLong(str);
                    return (j7 < 0 || j7 > 65535) ? j7 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] strArrSplit2 = str.split(str2, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j8 = (long) Double.parseDouble(strArrSplit2[0]);
                long j9 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j8 >= 0 && j9 >= 0) {
                    if (j8 <= 2147483647L && j9 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void F(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f2006h);
        int iM2 = dVar2.m(this.f2006h);
        if (this.f2002d == 7) {
            iM += this.f2015q;
        }
        int iMin = Math.min(iM2, bVar.b() - iM);
        if (iM > 0 && iMin > 0) {
            this.f2007i = true;
            if (this.f1999a == null && this.f2001c == null && this.f2000b == null) {
                byte[] bArr = new byte[iMin];
                bVar.skip(iM);
                bVar.read(bArr);
                this.f2012n = bArr;
            }
            this.f2010l = iM;
            this.f2011m = iMin;
        }
        if (f1991v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iMin);
        }
    }

    private void G(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrG = g(dVar.o(this.f2006h));
        long[] jArrG2 = g(dVar2.o(this.f2006h));
        if (jArrG == null || jArrG.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrG2 == null || jArrG2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrG.length != jArrG2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j7 = 0;
        for (long j8 : jArrG2) {
            j7 += j8;
        }
        int i7 = (int) j7;
        byte[] bArr = new byte[i7];
        this.f2009k = true;
        this.f2008j = true;
        this.f2007i = true;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < jArrG.length; i10++) {
            int i11 = (int) jArrG[i10];
            int i12 = (int) jArrG2[i10];
            if (i10 < jArrG.length - 1 && i11 + i12 != jArrG[i10 + 1]) {
                this.f2009k = false;
            }
            int i13 = i11 - i8;
            if (i13 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j9 = i13;
            if (bVar.skip(j9) != j9) {
                Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                return;
            }
            int i14 = i8 + i13;
            byte[] bArr2 = new byte[i12];
            if (bVar.read(bArr2) != i12) {
                Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                return;
            }
            i8 = i14 + i12;
            System.arraycopy(bArr2, 0, bArr, i9, i12);
            i9 += i12;
        }
        this.f2012n = bArr;
        if (this.f2009k) {
            this.f2010l = (int) jArrG[0];
            this.f2011m = i7;
        }
    }

    private void H(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f2001c = null;
        this.f1999a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Q(fileInputStream.getFD())) {
                this.f2000b = fileInputStream.getFD();
            } else {
                this.f2000b = null;
            }
            V(fileInputStream);
            d(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            d(fileInputStream2);
            throw th;
        }
    }

    private static boolean I(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f1988s0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = f1988s0;
            if (i7 >= bArr3.length) {
                return true;
            }
            if (bArr2[i7] != bArr3[i7]) {
                return false;
            }
            i7++;
        }
    }

    private boolean K(byte[] bArr) throws Throwable {
        b bVar;
        long length;
        byte[] bArr2;
        long j7;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            length = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e8) {
            e = e8;
            bVar2 = bVar;
            if (f1991v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f1946C)) {
            bVar.close();
            return false;
        }
        if (length == 1) {
            length = bVar.readLong();
            j7 = 16;
            if (length < 16) {
                bVar.close();
                return false;
            }
        } else {
            j7 = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j8 = length - j7;
        if (j8 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z7 = false;
        boolean z8 = false;
        for (long j9 = 0; j9 < j8 / 4; j9++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j9 != 1) {
                if (Arrays.equals(bArr3, f1947D)) {
                    z7 = true;
                } else if (Arrays.equals(bArr3, f1948E)) {
                    z8 = true;
                }
                if (z7 && z8) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean L(byte[] bArr) throws IOException {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f1945B;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    private boolean M(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderY = Y(bVar2);
                this.f2006h = byteOrderY;
                bVar2.m(byteOrderY);
                short s7 = bVar2.readShort();
                boolean z7 = s7 == 20306 || s7 == 21330;
                bVar2.close();
                return z7;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean N(byte[] bArr) throws IOException {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f1951H;
            if (i7 >= bArr2.length) {
                return true;
            }
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
            i7++;
        }
    }

    private boolean O(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i7 = 0; i7 < bytes.length; i7++) {
            if (bArr[i7] != bytes[i7]) {
                return false;
            }
        }
        return true;
    }

    private boolean P(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderY = Y(bVar2);
                this.f2006h = byteOrderY;
                bVar2.m(byteOrderY);
                boolean z7 = bVar2.readShort() == 85;
                bVar2.close();
                return z7;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean Q(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f1991v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean R(HashMap map) throws IOException {
        d dVar;
        int iM;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f2006h);
            int[] iArr2 = f1997y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f2002d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f2006h)) == 1 && Arrays.equals(iArr, f1944A)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f1991v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean S() {
        int i7 = this.f2002d;
        return i7 == 4 || i7 == 13 || i7 == 14;
    }

    private boolean T(HashMap map) throws IOException {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f2006h) <= 512 && dVar2.m(this.f2006h) <= 512;
    }

    private boolean U(byte[] bArr) throws IOException {
        int i7 = 0;
        while (true) {
            byte[] bArr2 = f1955L;
            if (i7 >= bArr2.length) {
                int i8 = 0;
                while (true) {
                    byte[] bArr3 = f1956M;
                    if (i8 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f1955L.length + i8 + 4] != bArr3[i8]) {
                        return false;
                    }
                    i8++;
                }
            } else {
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
    }

    private void V(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i7 = 0; i7 < f1979j0.length; i7++) {
            try {
                try {
                    this.f2004f[i7] = new HashMap<>();
                } catch (IOException e7) {
                    boolean z7 = f1991v;
                    if (z7) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e7);
                    }
                    a();
                    if (!z7) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (f1991v) {
                    X();
                }
                throw th;
            }
        }
        if (!this.f2003e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f2002d = t(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (this.f2003e) {
            A(bVar);
        } else {
            switch (this.f2002d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    x(bVar);
                    break;
                case 4:
                    r(bVar, 0, 0);
                    a();
                    if (f1991v) {
                        X();
                        return;
                    }
                    return;
                case 7:
                    u(bVar);
                    break;
                case 9:
                    w(bVar);
                    a();
                    if (f1991v) {
                        X();
                        return;
                    }
                    return;
                case 10:
                    z(bVar);
                    a();
                    if (f1991v) {
                        X();
                        return;
                    }
                    return;
                case 12:
                    q(bVar);
                    break;
                case 13:
                    v(bVar);
                    a();
                    if (f1991v) {
                        X();
                        return;
                    }
                    return;
                case 14:
                    D(bVar);
                    a();
                    if (f1991v) {
                        X();
                        return;
                    }
                    return;
            }
        }
        bVar.j(this.f2014p);
        l0(bVar);
        a();
        if (!f1991v) {
            return;
        }
        X();
    }

    private void W(b bVar, int i7) throws IOException {
        ByteOrder byteOrderY = Y(bVar);
        this.f2006h = byteOrderY;
        bVar.m(byteOrderY);
        int unsignedShort = bVar.readUnsignedShort();
        int i8 = this.f2002d;
        if (i8 != 7 && i8 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i9 = bVar.readInt();
        if (i9 < 8 || i9 >= i7) {
            throw new IOException("Invalid first Ifd offset: " + i9);
        }
        int i10 = i9 - 8;
        if (i10 <= 0 || bVar.skipBytes(i10) == i10) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i10);
    }

    private void X() {
        for (int i7 = 0; i7 < this.f2004f.length; i7++) {
            Log.d("ExifInterface", XjqcfAbdbc.KissGK + i7 + "]: " + this.f2004f[i7].size());
            for (Map.Entry<String, d> entry : this.f2004f[i7].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f2006h) + "'");
            }
        }
    }

    private ByteOrder Y(b bVar) throws IOException {
        short s7 = bVar.readShort();
        if (s7 == 18761) {
            if (f1991v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s7 == 19789) {
            if (f1991v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(QXojhh.OVvnln + Integer.toHexString(s7));
    }

    private void Z(byte[] bArr, int i7) throws IOException {
        b bVar = new b(bArr);
        W(bVar, bArr.length);
        a0(bVar, i7);
    }

    private void a() {
        String strM = m("DateTimeOriginal");
        if (strM != null && m("DateTime") == null) {
            this.f2004f[0].put("DateTime", d.e(strM));
        }
        if (m("ImageWidth") == null) {
            this.f2004f[0].put("ImageWidth", d.f(0L, this.f2006h));
        }
        if (m("ImageLength") == null) {
            this.f2004f[0].put("ImageLength", d.f(0L, this.f2006h));
        }
        if (m("Orientation") == null) {
            this.f2004f[0].put("Orientation", d.f(0L, this.f2006h));
        }
        if (m("LightSource") == null) {
            this.f2004f[1].put("LightSource", d.f(0L, this.f2006h));
        }
    }

    private void a0(L0.a.b r27, int r28) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: L0.a.a0(L0.a$b, int):void");
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    private void b0(String str) {
        for (int i7 = 0; i7 < f1979j0.length; i7++) {
            this.f2004f[i7].remove(str);
        }
    }

    private static void c(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterface", "Error closing fd.");
        }
    }

    private void c0(b bVar, int i7) throws Throwable {
        d dVar = this.f2004f[i7].get("ImageLength");
        d dVar2 = this.f2004f[i7].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f2004f[i7].get("JPEGInterchangeFormat");
            d dVar4 = this.f2004f[i7].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f2006h);
            int iM2 = dVar3.m(this.f2006h);
            bVar.j(iM);
            byte[] bArr = new byte[iM2];
            bVar.read(bArr);
            r(new b(bArr), iM, i7);
        }
    }

    private static void d(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    private String e(double d7) {
        long j7 = (long) d7;
        double d8 = d7 - j7;
        long j8 = (long) (d8 * 60.0d);
        return j7 + "/1," + j8 + "/1," + Math.round((d8 - (j8 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private void e0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f1991v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.e(-40);
        d dVarRemove = (m("Xmp") == null || !this.f2019u) ? null : this.f2004f[0].remove("Xmp");
        cVar.e(-1);
        cVar.e(-31);
        q0(cVar);
        if (dVarRemove != null) {
            this.f2004f[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte b2 = dataInputStream.readByte();
            if (b2 == -39 || b2 == -38) {
                cVar.e(-1);
                cVar.e(b2);
                h(dataInputStream, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.e(-1);
                cVar.e(b2);
                int unsignedShort = dataInputStream.readUnsignedShort();
                cVar.u(unsignedShort);
                int i7 = unsignedShort - 2;
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i7 > 0) {
                    int i8 = dataInputStream.read(bArr, 0, Math.min(i7, 4096));
                    if (i8 >= 0) {
                        cVar.write(bArr, 0, i8);
                        i7 -= i8;
                    }
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i9 = unsignedShort2 - 2;
                if (i9 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i9 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f1988s0)) {
                        int i10 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i10) != i10) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                cVar.e(-1);
                cVar.e(b2);
                cVar.u(unsignedShort2);
                if (i9 >= 6) {
                    i9 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i9 > 0) {
                    int i11 = dataInputStream.read(bArr, 0, Math.min(i9, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr, 0, i11);
                        i9 -= i11;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private static double f(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d7 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d8 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d9 = d7 + (d8 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d9;
            }
            return -d9;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void f0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f1991v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        i(dataInputStream, cVar, f1951H.length);
        if (this.f2014p == 0) {
            int i7 = dataInputStream.readInt();
            cVar.f(i7);
            i(dataInputStream, cVar, i7 + 8);
        } else {
            i(dataInputStream, cVar, (r2 - r7.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            q0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f2029d).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.f((int) crc32.getValue());
            d(byteArrayOutputStream);
            h(dataInputStream, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    private static long[] g(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    private void g0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        int i8;
        int i9;
        int i10;
        if (f1991v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f1955L;
        i(bVar, cVar, bArr.length);
        byte[] bArr2 = f1956M;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i11 = this.f2014p;
            if (i11 != 0) {
                i(bVar, cVar2, (i11 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.skipBytes(4);
                bVar.skipBytes(bVar.readInt());
                q0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = f1959P;
                if (Arrays.equals(bArr3, bArr4)) {
                    int i12 = bVar.readInt();
                    byte[] bArr5 = new byte[i12 % 2 == 1 ? i12 + 1 : i12];
                    bVar.read(bArr5);
                    byte b2 = (byte) (8 | bArr5[0]);
                    bArr5[0] = b2;
                    boolean z7 = ((b2 >> 1) & 1) == 1;
                    cVar2.write(bArr4);
                    cVar2.f(i12);
                    cVar2.write(bArr5);
                    if (z7) {
                        j(bVar, cVar2, f1962S, null);
                        while (true) {
                            byte[] bArr6 = new byte[4];
                            inputStream.read(bArr6);
                            if (!Arrays.equals(bArr6, f1963T)) {
                                break;
                            } else {
                                k(bVar, cVar2, bArr6);
                            }
                        }
                        q0(cVar2);
                    } else {
                        j(bVar, cVar2, f1961R, f1960Q);
                        q0(cVar2);
                    }
                } else {
                    byte[] bArr7 = f1961R;
                    if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f1960Q)) {
                        int i13 = bVar.readInt();
                        int i14 = i13 % 2 == 1 ? i13 + 1 : i13;
                        byte[] bArr8 = new byte[3];
                        if (Arrays.equals(bArr3, bArr7)) {
                            bVar.read(bArr8);
                            byte[] bArr9 = new byte[3];
                            if (bVar.read(bArr9) != 3 || !Arrays.equals(f1958O, bArr9)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i7 = bVar.readInt();
                            i8 = (i7 << 18) >> 18;
                            i9 = (i7 << 2) >> 18;
                            i14 -= 10;
                            i10 = 0;
                        } else if (!Arrays.equals(bArr3, f1960Q)) {
                            i7 = 0;
                            i8 = 0;
                            i9 = 0;
                            i10 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i7 = bVar.readInt();
                            i10 = i7 & 8;
                            i14 -= 5;
                            i9 = ((i7 << 4) >> 18) + 1;
                            i8 = ((i7 << 18) >> 18) + 1;
                        }
                        cVar2.write(bArr4);
                        cVar2.f(10);
                        byte[] bArr10 = new byte[10];
                        byte b3 = (byte) (bArr10[0] | 8);
                        bArr10[0] = b3;
                        bArr10[0] = (byte) (b3 | (i10 << 4));
                        int i15 = i8 - 1;
                        int i16 = i9 - 1;
                        bArr10[4] = (byte) i15;
                        bArr10[5] = (byte) (i15 >> 8);
                        bArr10[6] = (byte) (i15 >> 16);
                        bArr10[7] = (byte) i16;
                        bArr10[8] = (byte) (i16 >> 8);
                        bArr10[9] = (byte) (i16 >> 16);
                        cVar2.write(bArr10);
                        cVar2.write(bArr3);
                        cVar2.f(i13);
                        if (Arrays.equals(bArr3, bArr7)) {
                            cVar2.write(bArr8);
                            cVar2.write(f1958O);
                            cVar2.f(i7);
                        } else if (Arrays.equals(bArr3, f1960Q)) {
                            cVar2.write(47);
                            cVar2.f(i7);
                        }
                        i(bVar, cVar2, i14);
                        q0(cVar2);
                    }
                }
            }
            h(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f1956M;
            cVar.f(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            d(byteArrayOutputStream);
        } catch (Exception e8) {
            e = e8;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i7 = 0;
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 == -1) {
                return i7;
            }
            i7 += i8;
            outputStream.write(bArr, 0, i8);
        }
    }

    private static void i(InputStream inputStream, OutputStream outputStream, int i7) throws IOException {
        byte[] bArr = new byte[8192];
        while (i7 > 0) {
            int iMin = Math.min(i7, 8192);
            int i8 = inputStream.read(bArr, 0, iMin);
            if (i8 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i7 -= i8;
            outputStream.write(bArr, 0, i8);
        }
    }

    private void j(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f1987r0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void k(b bVar, c cVar, byte[] bArr) throws IOException {
        int i7 = bVar.readInt();
        cVar.write(bArr);
        cVar.f(i7);
        if (i7 % 2 == 1) {
            i7++;
        }
        i(bVar, cVar, i7);
    }

    private void l0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f2004f[4];
        d dVar = map.get("Compression");
        if (dVar == null) {
            this.f2013o = 6;
            F(bVar, map);
            return;
        }
        int iM = dVar.m(this.f2006h);
        this.f2013o = iM;
        if (iM != 1) {
            if (iM == 6) {
                F(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (R(map)) {
            G(bVar, map);
        }
    }

    private static boolean m0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr2.length; i7++) {
            if (bArr[i7] != bArr2[i7]) {
                return false;
            }
        }
        return true;
    }

    private void n0(int i7, int i8) throws Throwable {
        if (this.f2004f[i7].isEmpty() || this.f2004f[i8].isEmpty()) {
            if (f1991v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f2004f[i7].get("ImageLength");
        d dVar2 = this.f2004f[i7].get("ImageWidth");
        d dVar3 = this.f2004f[i8].get("ImageLength");
        d dVar4 = this.f2004f[i8].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (f1991v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f1991v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = dVar.m(this.f2006h);
        int iM2 = dVar2.m(this.f2006h);
        int iM3 = dVar3.m(this.f2006h);
        int iM4 = dVar4.m(this.f2006h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f2004f;
        HashMap<String, d> map = mapArr[i7];
        mapArr[i7] = mapArr[i8];
        mapArr[i8] = map;
    }

    private void o0(b bVar, int i7) throws Throwable {
        d dVarJ;
        d dVarJ2;
        d dVar = this.f2004f[i7].get("DefaultCropSize");
        d dVar2 = this.f2004f[i7].get("SensorTopBorder");
        d dVar3 = this.f2004f[i7].get("SensorLeftBorder");
        d dVar4 = this.f2004f[i7].get("SensorBottomBorder");
        d dVar5 = this.f2004f[i7].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                c0(bVar, i7);
                return;
            }
            int iM = dVar2.m(this.f2006h);
            int iM2 = dVar4.m(this.f2006h);
            int iM3 = dVar5.m(this.f2006h);
            int iM4 = dVar3.m(this.f2006h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f2006h);
            d dVarJ4 = d.j(iM3 - iM4, this.f2006h);
            this.f2004f[i7].put("ImageLength", dVarJ3);
            this.f2004f[i7].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f2031a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f2006h);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            dVarJ = d.h(fVarArr[0], this.f2006h);
            dVarJ2 = d.h(fVarArr[1], this.f2006h);
        } else {
            int[] iArr = (int[]) dVar.o(this.f2006h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarJ = d.j(iArr[0], this.f2006h);
            dVarJ2 = d.j(iArr[1], this.f2006h);
        }
        this.f2004f[i7].put("ImageWidth", dVarJ);
        this.f2004f[i7].put("ImageLength", dVarJ2);
    }

    private d p(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f1991v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < f1979j0.length; i7++) {
            d dVar = this.f2004f[i7].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void p0() throws Throwable {
        n0(0, 5);
        n0(0, 4);
        n0(5, 4);
        d dVar = this.f2004f[1].get("PixelXDimension");
        d dVar2 = this.f2004f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f2004f[0].put("ImageWidth", dVar);
            this.f2004f[0].put("ImageLength", dVar2);
        }
        if (this.f2004f[4].isEmpty() && T(this.f2004f[5])) {
            HashMap<String, d>[] mapArr = this.f2004f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (T(this.f2004f[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void q(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0030a(bVar));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            if (strExtractMetadata != null) {
                this.f2004f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f2006h));
            }
            if (strExtractMetadata2 != null) {
                this.f2004f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata2), this.f2006h));
            }
            if (strExtractMetadata3 != null) {
                int i7 = Integer.parseInt(strExtractMetadata3);
                this.f2004f[0].put("Orientation", d.j(i7 != 90 ? i7 != 180 ? i7 != 270 ? 1 : 8 : 3 : 6, this.f2006h));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i8 = Integer.parseInt(strExtractMetadata4);
                int i9 = Integer.parseInt(strExtractMetadata5);
                if (i9 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.j(i8);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i10 = i8 + 6;
                int i11 = i9 - 6;
                if (!Arrays.equals(bArr, f1988s0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i11];
                if (bVar.read(bArr2) != i11) {
                    throw new IOException("Can't read exif");
                }
                this.f2014p = i10;
                Z(bArr2, 0);
            }
            if (f1991v) {
                Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    private int q0(c cVar) throws IOException {
        e[][] eVarArr = f1979j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f1980k0) {
            b0(eVar.f2036b);
        }
        b0(f1981l0.f2036b);
        b0(f1982m0.f2036b);
        for (int i7 = 0; i7 < f1979j0.length; i7++) {
            for (Object obj : this.f2004f[i7].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f2004f[i7].remove(entry.getKey());
                }
            }
        }
        if (!this.f2004f[1].isEmpty()) {
            this.f2004f[0].put(f1980k0[1].f2036b, d.f(0L, this.f2006h));
        }
        if (!this.f2004f[2].isEmpty()) {
            this.f2004f[0].put(f1980k0[2].f2036b, d.f(0L, this.f2006h));
        }
        if (!this.f2004f[3].isEmpty()) {
            this.f2004f[1].put(f1980k0[3].f2036b, d.f(0L, this.f2006h));
        }
        if (this.f2007i) {
            this.f2004f[4].put(f1981l0.f2036b, d.f(0L, this.f2006h));
            this.f2004f[4].put(f1982m0.f2036b, d.f(this.f2011m, this.f2006h));
        }
        for (int i8 = 0; i8 < f1979j0.length; i8++) {
            Iterator<Map.Entry<String, d>> it = this.f2004f[i8].entrySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                int iP = it.next().getValue().p();
                if (iP > 4) {
                    i9 += iP;
                }
            }
            iArr2[i8] = iArr2[i8] + i9;
        }
        int size = 8;
        for (int i10 = 0; i10 < f1979j0.length; i10++) {
            if (!this.f2004f[i10].isEmpty()) {
                iArr[i10] = size;
                size += (this.f2004f[i10].size() * 12) + 6 + iArr2[i10];
            }
        }
        if (this.f2007i) {
            this.f2004f[4].put(f1981l0.f2036b, d.f(size, this.f2006h));
            this.f2010l = size;
            size += this.f2011m;
        }
        if (this.f2002d == 4) {
            size += 8;
        }
        if (f1991v) {
            for (int i11 = 0; i11 < f1979j0.length; i11++) {
                Log.d(BtcVLuo.wUEqHy, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(this.f2004f[i11].size()), Integer.valueOf(iArr2[i11]), Integer.valueOf(size)));
            }
        }
        if (!this.f2004f[1].isEmpty()) {
            this.f2004f[0].put(f1980k0[1].f2036b, d.f(iArr[1], this.f2006h));
        }
        if (!this.f2004f[2].isEmpty()) {
            this.f2004f[0].put(f1980k0[2].f2036b, d.f(iArr[2], this.f2006h));
        }
        if (!this.f2004f[3].isEmpty()) {
            this.f2004f[1].put(f1980k0[3].f2036b, d.f(iArr[3], this.f2006h));
        }
        int i12 = this.f2002d;
        if (i12 == 4) {
            cVar.u(size);
            cVar.write(f1988s0);
        } else if (i12 == 13) {
            cVar.f(size);
            cVar.write(f1952I);
        } else if (i12 == 14) {
            cVar.write(f1957N);
            cVar.f(size);
        }
        cVar.j(this.f2006h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.b(this.f2006h);
        cVar.u(42);
        cVar.m(8L);
        for (int i13 = 0; i13 < f1979j0.length; i13++) {
            if (!this.f2004f[i13].isEmpty()) {
                cVar.u(this.f2004f[i13].size());
                int size2 = iArr[i13] + 2 + (this.f2004f[i13].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f2004f[i13].entrySet()) {
                    int i14 = f1984o0[i13].get(entry2.getKey()).f2035a;
                    d value = entry2.getValue();
                    int iP2 = value.p();
                    cVar.u(i14);
                    cVar.u(value.f2031a);
                    cVar.f(value.f2032b);
                    if (iP2 > 4) {
                        cVar.m(size2);
                        size2 += iP2;
                    } else {
                        cVar.write(value.f2034d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.e(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i13 != 0 || this.f2004f[4].isEmpty()) {
                    cVar.m(0L);
                } else {
                    cVar.m(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f2004f[i13].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f2034d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f2007i) {
            cVar.write(C());
        }
        if (this.f2002d == 14 && size % 2 == 1) {
            cVar.e(0);
        }
        cVar.b(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private void r(L0.a.b r21, int r22, int r23) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: L0.a.r(L0.a$b, int, int):void");
    }

    private int t(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (L(bArr)) {
            return 4;
        }
        if (O(bArr)) {
            return 9;
        }
        if (K(bArr)) {
            return 12;
        }
        if (M(bArr)) {
            return 7;
        }
        if (P(bArr)) {
            return 10;
        }
        if (N(bArr)) {
            return 13;
        }
        return U(bArr) ? 14 : 0;
    }

    private void u(b bVar) throws Throwable {
        int i7;
        int i8;
        x(bVar);
        d dVar = this.f2004f[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.f2034d);
            bVar2.m(this.f2006h);
            byte[] bArr = f1949F;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.j(0L);
            byte[] bArr3 = f1950G;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.j(12L);
            }
            a0(bVar2, 6);
            d dVar2 = this.f2004f[7].get("PreviewImageStart");
            d dVar3 = this.f2004f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f2004f[5].put("JPEGInterchangeFormat", dVar2);
                this.f2004f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f2004f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f2006h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i7 = iArr[3]) <= (i8 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i7 - i8) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                d dVarJ = d.j(i11, this.f2006h);
                d dVarJ2 = d.j(i12, this.f2006h);
                this.f2004f[0].put("ImageWidth", dVarJ);
                this.f2004f[0].put("ImageLength", dVarJ2);
            }
        }
    }

    private void v(b bVar) throws Throwable {
        if (f1991v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.m(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f1951H;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i7 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i8 = length + 8;
                if (i8 == 16 && !Arrays.equals(bArr2, f1953J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f1954K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f1952I)) {
                    byte[] bArr3 = new byte[i7];
                    if (bVar.read(bArr3) != i7) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i9 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i9) {
                        this.f2014p = i8;
                        Z(bArr3, 0);
                        p0();
                        l0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i9 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = i7 + 4;
                bVar.skipBytes(i10);
                length = i8 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void w(b bVar) throws Throwable {
        boolean z7 = f1991v;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        bVar.j(i7);
        bVar.read(bArr4);
        r(new b(bArr4), i7, 5);
        bVar.j(i9);
        bVar.m(ByteOrder.BIG_ENDIAN);
        int i10 = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f1974e0.f2035a) {
                short s7 = bVar.readShort();
                short s8 = bVar.readShort();
                d dVarJ = d.j(s7, this.f2006h);
                d dVarJ2 = d.j(s8, this.f2006h);
                this.f2004f[0].put("ImageLength", dVarJ);
                this.f2004f[0].put("ImageWidth", dVarJ2);
                if (f1991v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s7) + ", width: " + ((int) s8));
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    private void x(b bVar) throws Throwable {
        d dVar;
        W(bVar, bVar.available());
        a0(bVar, 0);
        o0(bVar, 0);
        o0(bVar, 5);
        o0(bVar, 4);
        p0();
        if (this.f2002d != 8 || (dVar = this.f2004f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(dVar.f2034d);
        bVar2.m(this.f2006h);
        bVar2.j(6L);
        a0(bVar2, 9);
        d dVar2 = this.f2004f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f2004f[1].put("ColorSpace", dVar2);
        }
    }

    private void z(b bVar) throws Throwable {
        if (f1991v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        x(bVar);
        d dVar = this.f2004f[0].get("JpgFromRaw");
        if (dVar != null) {
            r(new b(dVar.f2034d), (int) dVar.f2033c, 5);
        }
        d dVar2 = this.f2004f[0].get("ISO");
        d dVar3 = this.f2004f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f2004f[1].put("PhotographicSensitivity", dVar2);
    }

    public byte[] B() {
        int i7 = this.f2013o;
        if (i7 == 6 || i7 == 7) {
            return C();
        }
        return null;
    }

    public byte[] C() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: L0.a.C():byte[]");
    }

    public boolean J() {
        int iO = o("Orientation", 1);
        return iO == 2 || iO == 7 || iO == 4 || iO == 5;
    }

    public void d0() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: L0.a.d0():void");
    }

    public void h0(double d7) throws NumberFormatException {
        String str = d7 >= 0.0d ? "0" : tAjeAKSIqDqzNP.hoAQClGEer;
        i0("GPSAltitude", new f(Math.abs(d7)).toString());
        i0("GPSAltitudeRef", str);
    }

    public void i0(String str, String str2) throws NumberFormatException {
        e eVar;
        int i7;
        int i8;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f1994w0.matcher(strReplaceAll).find();
            boolean zFind2 = f1996x0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f1991v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i9 = 2;
        int i10 = 1;
        if (strReplaceAll != null && f1985p0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f1992v0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.parseInt(matcher.group(1)));
                String str4 = HguUe.XPdvLDOWhJf;
                sb.append(str4);
                sb.append(Integer.parseInt(matcher.group(2)));
                sb.append(str4);
                sb.append(Integer.parseInt(matcher.group(3)));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < f1979j0.length) {
            if ((i12 != 4 || this.f2007i) && (eVar = f1984o0[i12].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairE = E(strReplaceAll);
                    int i13 = -1;
                    if (eVar.f2037c == ((Integer) pairE.first).intValue() || eVar.f2037c == ((Integer) pairE.second).intValue()) {
                        i7 = eVar.f2037c;
                    } else {
                        int i14 = eVar.f2038d;
                        if (i14 == -1 || !(i14 == ((Integer) pairE.first).intValue() || eVar.f2038d == ((Integer) pairE.second).intValue())) {
                            int i15 = eVar.f2037c;
                            if (i15 == i10 || i15 == 7 || i15 == i9) {
                                i7 = i15;
                            } else if (f1991v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f1966W;
                                sb2.append(strArr[eVar.f2037c]);
                                int i16 = eVar.f2038d;
                                String str5 = oeVkjmfPcLbWm.VvkGRwgnmjkBJ;
                                String str6 = BuildConfig.FLAVOR;
                                sb2.append(i16 == -1 ? BuildConfig.FLAVOR : str5 + strArr[eVar.f2038d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairE.first).intValue()]);
                                if (((Integer) pairE.second).intValue() != -1) {
                                    str6 = str5 + strArr[((Integer) pairE.second).intValue()];
                                }
                                sb2.append(str6);
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i7 = eVar.f2038d;
                        }
                    }
                    switch (i7) {
                        case 1:
                            i8 = i10;
                            this.f2004f[i12].put(str3, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i8 = i10;
                            this.f2004f[i12].put(str3, d.e(strReplaceAll));
                            break;
                        case 3:
                            i8 = i10;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i17 = 0; i17 < strArrSplit.length; i17++) {
                                iArr[i17] = Integer.parseInt(strArrSplit[i17]);
                            }
                            this.f2004f[i12].put(str3, d.k(iArr, this.f2006h));
                            break;
                        case 4:
                            i8 = i10;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i18 = 0; i18 < strArrSplit2.length; i18++) {
                                jArr[i18] = Long.parseLong(strArrSplit2[i18]);
                            }
                            this.f2004f[i12].put(str3, d.g(jArr, this.f2006h));
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            f[] fVarArr = new f[strArrSplit3.length];
                            int i19 = 0;
                            while (i19 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i19].split("/", i13);
                                fVarArr[i19] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                i19++;
                                i13 = -1;
                            }
                            i8 = 1;
                            this.f2004f[i12].put(str3, d.i(fVarArr, this.f2006h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f1991v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i7);
                                break;
                            }
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i20 = 0; i20 < strArrSplit5.length; i20++) {
                                iArr2[i20] = Integer.parseInt(strArrSplit5[i20]);
                            }
                            this.f2004f[i12].put(str3, d.c(iArr2, this.f2006h));
                            i8 = 1;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            f[] fVarArr2 = new f[strArrSplit6.length];
                            int i21 = i11;
                            while (i21 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i21].split("/", -1);
                                fVarArr2[i21] = new f((long) Double.parseDouble(strArrSplit7[i11]), (long) Double.parseDouble(strArrSplit7[i10]));
                                i21++;
                                strArrSplit6 = strArrSplit6;
                                i11 = 0;
                                i10 = 1;
                            }
                            this.f2004f[i12].put(str3, d.d(fVarArr2, this.f2006h));
                            i8 = 1;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i22 = i11; i22 < strArrSplit8.length; i22++) {
                                dArr[i22] = Double.parseDouble(strArrSplit8[i22]);
                            }
                            this.f2004f[i12].put(str3, d.b(dArr, this.f2006h));
                            break;
                    }
                } else {
                    this.f2004f[i12].remove(str3);
                }
                i8 = i10;
            } else {
                i8 = i10;
            }
            i12++;
            i10 = i8;
            i9 = 2;
            i11 = 0;
        }
    }

    public void j0(Location location) throws NumberFormatException {
        if (location == null) {
            return;
        }
        i0("GPSProcessingMethod", location.getProvider());
        k0(location.getLatitude(), location.getLongitude());
        h0(location.getAltitude());
        i0("GPSSpeedRef", "K");
        i0("GPSSpeed", new f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f1964U.format(new Date(location.getTime())).split("\\s+", -1);
        i0("GPSDateStamp", strArrSplit[0]);
        i0("GPSTimeStamp", strArrSplit[1]);
    }

    public void k0(double d7, double d8) throws NumberFormatException {
        if (d7 < -90.0d || d7 > 90.0d || Double.isNaN(d7)) {
            throw new IllegalArgumentException("Latitude value " + d7 + " is not valid.");
        }
        if (d8 < -180.0d || d8 > 180.0d || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Longitude value " + d8 + " is not valid.");
        }
        i0("GPSLatitudeRef", d7 >= 0.0d ? "N" : "S");
        i0("GPSLatitude", e(Math.abs(d7)));
        i0("GPSLongitudeRef", d8 >= 0.0d ? "E" : "W");
        i0("GPSLongitude", e(Math.abs(d8)));
    }

    public double l(double d7) {
        double dN = n("GPSAltitude", -1.0d);
        int iO = o("GPSAltitudeRef", -1);
        if (dN < 0.0d || iO < 0) {
            return d7;
        }
        return dN * (iO != 1 ? 1 : -1);
    }

    public String m(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarP = p(str);
        if (dVarP != null) {
            if (!f1985p0.contains(str)) {
                return dVarP.n(this.f2006h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = dVarP.f2031a;
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + dVarP.f2031a);
                    return null;
                }
                f[] fVarArr = (f[]) dVarP.o(this.f2006h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f2039a / fVar.f2040b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f2039a / fVar2.f2040b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f2039a / fVar3.f2040b)));
            }
            try {
                return Double.toString(dVarP.l(this.f2006h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double n(String str, double d7) {
        if (str == null) {
            throw new NullPointerException(oyfFwvPUKctyaG.wLJQGBmUWZW);
        }
        d dVarP = p(str);
        if (dVarP == null) {
            return d7;
        }
        try {
            return dVarP.l(this.f2006h);
        } catch (NumberFormatException unused) {
            return d7;
        }
    }

    public int o(String str, int i7) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarP = p(str);
        if (dVarP == null) {
            return i7;
        }
        try {
            return dVarP.m(this.f2006h);
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public double[] s() {
        String strM = m("GPSLatitude");
        String strM2 = m("GPSLatitudeRef");
        String strM3 = m("GPSLongitude");
        String strM4 = m("GPSLongitudeRef");
        if (strM == null || strM2 == null || strM3 == null || strM4 == null) {
            return null;
        }
        try {
            return new double[]{f(strM, strM2), f(strM3, strM4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strM, strM2, strM3, strM4));
            return null;
        }
    }

    public int y() {
        switch (o("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    static class e {

        public final int f2035a;

        public final String f2036b;

        public final int f2037c;

        public final int f2038d;

        e(String str, int i7, int i8) {
            this.f2036b = str;
            this.f2035a = i7;
            this.f2037c = i8;
            this.f2038d = -1;
        }

        boolean a(int i7) {
            int i8;
            int i9 = this.f2037c;
            if (i9 == 7 || i7 == 7 || i9 == i7 || (i8 = this.f2038d) == i7) {
                return true;
            }
            if ((i9 == 4 || i8 == 4) && i7 == 3) {
                return true;
            }
            if ((i9 == 9 || i8 == 9) && i7 == 8) {
                return true;
            }
            return (i9 == 12 || i8 == 12) && i7 == 11;
        }

        e(String str, int i7, int i8, int i9) {
            this.f2036b = str;
            this.f2035a = i7;
            this.f2037c = i8;
            this.f2038d = i9;
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public a(java.io.InputStream r4, int r5) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: L0.a.<init>(java.io.InputStream, int):void");
    }
}
