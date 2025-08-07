package K3;

import Q6.QtA.QXojhh;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public final class W0 implements Closeable {

    private final InputStream f1822d;

    private V0 f1823e;

    private final byte[] f1824i = new byte[8];

    private final X0 f1825v = X0.a();

    public W0(InputStream inputStream) {
        this.f1822d = inputStream;
    }

    private final void A(byte b2) throws IOException {
        e();
        if (this.f1823e.b() != b2) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b2 >> 5) & 7), Integer.valueOf(this.f1823e.c())));
        }
    }

    private final void K(byte[] bArr, int i7) throws IOException {
        int i8 = 0;
        while (i8 != i7) {
            int i9 = this.f1822d.read(bArr, i8, i7 - i8);
            if (i9 == -1) {
                throw new EOFException();
            }
            i8 += i9;
        }
        this.f1823e = null;
    }

    private final byte[] N() throws IOException {
        y();
        long jU = u();
        if (jU < 0 || jU > 2147483647L) {
            throw new UnsupportedOperationException(String.format(QXojhh.pJuige, Integer.MAX_VALUE));
        }
        if (this.f1822d.available() < jU) {
            throw new EOFException();
        }
        int i7 = (int) jU;
        byte[] bArr = new byte[i7];
        K(bArr, i7);
        return bArr;
    }

    private final long u() throws IOException {
        if (this.f1823e.a() < 24) {
            long jA = this.f1823e.a();
            this.f1823e = null;
            return jA;
        }
        if (this.f1823e.a() == 24) {
            int i7 = this.f1822d.read();
            if (i7 == -1) {
                throw new EOFException();
            }
            this.f1823e = null;
            return i7 & 255;
        }
        if (this.f1823e.a() == 25) {
            K(this.f1824i, 2);
            byte[] bArr = this.f1824i;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.f1823e.a() == 26) {
            K(this.f1824i, 4);
            byte[] bArr2 = this.f1824i;
            long j7 = bArr2[0];
            long j8 = bArr2[1];
            return (bArr2[3] & 255) | ((j8 & 255) << 16) | ((j7 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.f1823e.a() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.f1823e.a()), Integer.valueOf(this.f1823e.c())));
        }
        K(this.f1824i, 8);
        byte[] bArr3 = this.f1824i;
        long j9 = bArr3[0];
        long j10 = bArr3[1];
        long j11 = bArr3[2];
        return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j10 & 255) << 48) | ((j9 & 255) << 56) | ((j11 & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
    }

    private final void y() throws IOException {
        e();
        if (this.f1823e.a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.f1823e.a())));
        }
    }

    public final long a() throws IOException {
        A((byte) -96);
        y();
        long jU = u();
        if (jU < 0 || jU > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jU > 0) {
            this.f1825v.g(jU + jU);
        }
        return jU;
    }

    public final long b() throws IOException {
        A(Byte.MIN_VALUE);
        y();
        long jU = u();
        if (jU < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jU > 0) {
            this.f1825v.g(jU);
        }
        return jU;
    }

    @Override
    public final void close() throws IOException {
        this.f1822d.close();
        this.f1825v.b();
    }

    public final V0 e() throws IOException {
        if (this.f1823e == null) {
            int i7 = this.f1822d.read();
            if (i7 == -1) {
                this.f1825v.b();
                return null;
            }
            V0 v02 = new V0(i7);
            this.f1823e = v02;
            byte b2 = v02.b();
            if (b2 == Byte.MIN_VALUE || b2 == -96 || b2 == -64) {
                this.f1825v.d();
                this.f1825v.f();
            } else {
                if (b2 != -32) {
                    if (b2 != 0 && b2 != 32) {
                        if (b2 == 64) {
                            this.f1825v.e(-1L);
                        } else {
                            if (b2 != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.f1823e.c())));
                            }
                            this.f1825v.e(-2L);
                        }
                    }
                    this.f1825v.f();
                } else if (this.f1823e.a() == 31) {
                    this.f1825v.c();
                }
                this.f1825v.d();
                this.f1825v.f();
            }
        }
        return this.f1823e;
    }

    public final String f() throws IOException {
        A((byte) 96);
        return new String(N(), StandardCharsets.UTF_8);
    }

    public final boolean j() throws IOException {
        A((byte) -32);
        if (this.f1823e.a() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iU = (int) u();
        if (iU == 20) {
            return false;
        }
        if (iU == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] m() throws IOException {
        A((byte) 64);
        return N();
    }

    public final long zzb() throws IOException {
        boolean z7;
        e();
        if (this.f1823e.b() == 0) {
            z7 = true;
        } else {
            if (this.f1823e.b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.f1823e.c())));
            }
            z7 = false;
        }
        long jU = u();
        if (jU >= 0) {
            return z7 ? jU : ~jU;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }
}
