package S3;

import java.io.UnsupportedEncodingException;
import n3.C2651i;

public final class C1473u9 implements InterfaceC1309f9 {

    private final H6 f7154a;

    private E8 f7155b = new E8();

    private final int f7156c;

    private C1473u9(H6 h62, int i7) {
        this.f7154a = h62;
        D9.a();
        this.f7156c = i7;
    }

    public static InterfaceC1309f9 e(H6 h62) {
        return new C1473u9(h62, 0);
    }

    public static InterfaceC1309f9 f(H6 h62, int i7) {
        return new C1473u9(h62, 1);
    }

    @Override
    public final byte[] a(int i7, boolean z7) {
        this.f7155b.f(Boolean.valueOf(1 == (i7 ^ 1)));
        this.f7155b.e(Boolean.FALSE);
        this.f7154a.i(this.f7155b.m());
        try {
            D9.a();
            if (i7 == 0) {
                return new W4.d().j(A5.f6399a).k(true).i().b(this.f7154a.j()).getBytes("utf-8");
            }
            J6 j6J = this.f7154a.j();
            E0 e02 = new E0();
            A5.f6399a.a(e02);
            return e02.b().a(j6J);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }

    @Override
    public final InterfaceC1309f9 b(E8 e8) {
        this.f7155b = e8;
        return this;
    }

    @Override
    public final InterfaceC1309f9 c(G6 g62) {
        this.f7154a.f(g62);
        return this;
    }

    @Override
    public final String d() {
        G8 g8F = this.f7154a.j().f();
        return (g8F == null || V9.b(g8F.k())) ? "NA" : (String) C2651i.l(g8F.k());
    }

    @Override
    public final int zza() {
        return this.f7156c;
    }
}
