package Q3;

import java.io.UnsupportedEncodingException;
import n3.C2651i;

public final class y5 implements InterfaceC0951p5 {

    private final G3 f4826a;

    private K4 f4827b = new K4();

    private y5(G3 g32, int i7) {
        this.f4826a = g32;
        K5.a();
    }

    public static InterfaceC0951p5 e(G3 g32) {
        return new y5(g32, 0);
    }

    @Override
    public final String a() {
        N4 n4C = this.f4826a.f().c();
        return (n4C == null || C0892h2.b(n4C.k())) ? "NA" : (String) C2651i.l(n4C.k());
    }

    @Override
    public final InterfaceC0951p5 b(K4 k42) {
        this.f4827b = k42;
        return this;
    }

    @Override
    public final InterfaceC0951p5 c(F3 f32) {
        this.f4826a.c(f32);
        return this;
    }

    @Override
    public final byte[] d(int i7, boolean z7) {
        this.f4827b.f(Boolean.valueOf(1 == (i7 ^ 1)));
        this.f4827b.e(Boolean.FALSE);
        this.f4826a.e(this.f4827b.m());
        try {
            K5.a();
            if (i7 == 0) {
                return new W4.d().j(N2.f4137a).k(true).i().b(this.f4826a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f4826a.f();
            C0931n c0931n = new C0931n();
            N2.f4137a.a(c0931n);
            return c0931n.b().a(i3F);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
