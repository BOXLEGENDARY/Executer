package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractC2172x2 extends C2083i2 {

    private static final Logger f16165b = Logger.getLogger(AbstractC2172x2.class.getName());

    private static final boolean f16166c = Z3.C();

    C2178y2 f16167a;

    private AbstractC2172x2() {
        throw null;
    }

    public static int A(String str) {
        int length;
        try {
            length = C2049c4.c(str);
        } catch (C2043b4 unused) {
            length = str.getBytes(W2.f15950a).length;
        }
        return B(length) + length;
    }

    public static int B(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int a(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    @Deprecated
    static int y(int i7, InterfaceC2155u3 interfaceC2155u3, F3 f32) {
        int iB = B(i7 << 3);
        return iB + iB + ((AbstractC2035a2) interfaceC2155u3).b(f32);
    }

    static int z(InterfaceC2155u3 interfaceC2155u3, F3 f32) {
        int iB = ((AbstractC2035a2) interfaceC2155u3).b(f32);
        return B(iB) + iB;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(String str, C2043b4 c2043b4) throws IOException {
        f16165b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2043b4);
        byte[] bytes = str.getBytes(W2.f15950a);
        try {
            int length = bytes.length;
            v(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new C2160v2(e7);
        }
    }

    public abstract int e();

    public abstract void f(byte b2) throws IOException;

    public abstract void g(int i7, boolean z7) throws IOException;

    public abstract void h(int i7, AbstractC2131q2 abstractC2131q2) throws IOException;

    public abstract void i(int i7, int i8) throws IOException;

    public abstract void j(int i7) throws IOException;

    public abstract void k(int i7, long j7) throws IOException;

    public abstract void l(long j7) throws IOException;

    public abstract void m(int i7, int i8) throws IOException;

    public abstract void n(int i7) throws IOException;

    public abstract void o(byte[] bArr, int i7, int i8) throws IOException;

    abstract void p(int i7, InterfaceC2155u3 interfaceC2155u3, F3 f32) throws IOException;

    public abstract void q(int i7, InterfaceC2155u3 interfaceC2155u3) throws IOException;

    public abstract void r(int i7, AbstractC2131q2 abstractC2131q2) throws IOException;

    public abstract void s(int i7, String str) throws IOException;

    public abstract void t(int i7, int i8) throws IOException;

    public abstract void u(int i7, int i8) throws IOException;

    public abstract void v(int i7) throws IOException;

    public abstract void w(int i7, long j7) throws IOException;

    public abstract void x(long j7) throws IOException;

    AbstractC2172x2(C2166w2 c2166w2) {
    }
}
