package O3;

import java.io.UnsupportedEncodingException;
import n3.C2651i;

public final class B9 implements InterfaceC0708n9 {

    private final O6 f2731a;

    private J8 f2732b = new J8();

    private final int f2733c;

    private B9(O6 o62, int i7) {
        this.f2731a = o62;
        L9.a();
        this.f2733c = i7;
    }

    public static InterfaceC0708n9 e(O6 o62) {
        return new B9(o62, 0);
    }

    public static InterfaceC0708n9 f(O6 o62, int i7) {
        return new B9(o62, 1);
    }

    @Override
    public final byte[] a(int i7, boolean z7) {
        this.f2732b.f(Boolean.valueOf(1 == (i7 ^ 1)));
        this.f2732b.e(Boolean.FALSE);
        this.f2731a.i(this.f2732b.m());
        try {
            L9.a();
            if (i7 == 0) {
                return new W4.d().j(I5.f2893a).k(true).i().b(this.f2731a.j()).getBytes("utf-8");
            }
            Q6 q6J = this.f2731a.j();
            S0 s02 = new S0();
            I5.f2893a.a(s02);
            return s02.b().a(q6J);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }

    @Override
    public final InterfaceC0708n9 b(N6 n62) {
        this.f2731a.f(n62);
        return this;
    }

    @Override
    public final InterfaceC0708n9 c(J8 j8) {
        this.f2732b = j8;
        return this;
    }

    @Override
    public final String d() {
        L8 l8G = this.f2731a.j().g();
        return (l8G == null || C0763t.b(l8G.k())) ? "NA" : (String) C2651i.l(l8G.k());
    }

    @Override
    public final int zza() {
        return this.f2733c;
    }
}
