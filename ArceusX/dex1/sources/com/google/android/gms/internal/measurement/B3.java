package com.google.android.gms.internal.measurement;

import S9.Gvmm.CAqKeu;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class B3 extends C1901j3 {

    private static final Logger f14655b = Logger.getLogger(B3.class.getName());

    private static final boolean f14656c = C1895i5.C();

    C3 f14657a;

    private B3() {
    }

    public static int A(C1870f4 c1870f4) {
        int iA = c1870f4.a();
        return a(iA) + iA;
    }

    static int B(InterfaceC2021y4 interfaceC2021y4, J4 j42) {
        AbstractC1853d3 abstractC1853d3 = (AbstractC1853d3) interfaceC2021y4;
        int iF = abstractC1853d3.f();
        if (iF == -1) {
            iF = j42.a(abstractC1853d3);
            abstractC1853d3.i(iF);
        }
        return a(iF) + iF;
    }

    public static int C(String str) {
        int length;
        try {
            length = C1935n5.c(str);
        } catch (C1927m5 unused) {
            length = str.getBytes(C1838b4.f15100b).length;
        }
        return a(length) + length;
    }

    public static int D(int i7) {
        return a(i7 << 3);
    }

    public static int a(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static B3 c(byte[] bArr) {
        return new C2028z3(bArr, 0, bArr.length);
    }

    public static int x(AbstractC1980t3 abstractC1980t3) {
        int iG = abstractC1980t3.g();
        return a(iG) + iG;
    }

    @Deprecated
    static int y(int i7, InterfaceC2021y4 interfaceC2021y4, J4 j42) {
        int iA = a(i7 << 3);
        int i8 = iA + iA;
        AbstractC1853d3 abstractC1853d3 = (AbstractC1853d3) interfaceC2021y4;
        int iF = abstractC1853d3.f();
        if (iF == -1) {
            iF = j42.a(abstractC1853d3);
            abstractC1853d3.i(iF);
        }
        return i8 + iF;
    }

    public static int z(int i7) {
        if (i7 >= 0) {
            return a(i7);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void e(String str, C1927m5 c1927m5) throws IOException {
        f14655b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", CAqKeu.VSrOMnVwmWc, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1927m5);
        byte[] bytes = str.getBytes(C1838b4.f15100b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (A3 e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new A3(e8);
        }
    }

    public abstract int g();

    public abstract void h(byte b2) throws IOException;

    public abstract void i(int i7, boolean z7) throws IOException;

    public abstract void j(int i7, AbstractC1980t3 abstractC1980t3) throws IOException;

    public abstract void k(int i7, int i8) throws IOException;

    public abstract void l(int i7) throws IOException;

    public abstract void m(int i7, long j7) throws IOException;

    public abstract void n(long j7) throws IOException;

    public abstract void o(int i7, int i8) throws IOException;

    public abstract void p(int i7) throws IOException;

    public abstract void q(byte[] bArr, int i7, int i8) throws IOException;

    public abstract void r(int i7, String str) throws IOException;

    public abstract void s(int i7, int i8) throws IOException;

    public abstract void t(int i7, int i8) throws IOException;

    public abstract void u(int i7) throws IOException;

    public abstract void v(int i7, long j7) throws IOException;

    public abstract void w(long j7) throws IOException;

    B3(C2020y3 c2020y3) {
    }
}
