package R3;

import java.io.UnsupportedEncodingException;
import n3.C2651i;

public final class C1154q6 implements InterfaceC1034b6 {

    private final C4 f5808a;

    private D5 f5809b = new D5();

    private final int f5810c;

    private C1154q6(C4 c42, int i7) {
        this.f5808a = c42;
        z6.a();
        this.f5810c = i7;
    }

    public static InterfaceC1034b6 e(C4 c42) {
        return new C1154q6(c42, 0);
    }

    public static InterfaceC1034b6 f(C4 c42, int i7) {
        return new C1154q6(c42, 1);
    }

    @Override
    public final byte[] a(int i7, boolean z7) {
        this.f5809b.f(Boolean.valueOf(1 == (i7 ^ 1)));
        this.f5809b.e(Boolean.FALSE);
        this.f5808a.i(this.f5809b.m());
        try {
            z6.a();
            if (i7 == 0) {
                return new W4.d().j(D3.f5166a).k(true).i().b(this.f5808a.j()).getBytes("utf-8");
            }
            E4 e4J = this.f5808a.j();
            B0 b02 = new B0();
            D3.f5166a.a(b02);
            return b02.b().a(e4J);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }

    @Override
    public final InterfaceC1034b6 b(B4 b42) {
        this.f5808a.f(b42);
        return this;
    }

    @Override
    public final InterfaceC1034b6 c(D5 d52) {
        this.f5809b = d52;
        return this;
    }

    @Override
    public final String d() {
        F5 f5F = this.f5808a.j().f();
        return (f5F == null || C1043d.b(f5F.k())) ? "NA" : (String) C2651i.l(f5F.k());
    }

    @Override
    public final int zza() {
        return this.f5810c;
    }
}
