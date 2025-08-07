package C;

import z.C3032B;
import z.C3033C;

public class U0 extends C0340m0 {

    private final F f439c;

    private final Z0 f440d;

    public U0(F f7, Z0 z02) {
        super(f7);
        this.f439c = f7;
        this.f440d = z02;
    }

    @Override
    public com.google.common.util.concurrent.p<Void> a(boolean z7) {
        return !E.o.b(this.f440d, 6) ? G.n.n(new IllegalStateException("Torch is not supported")) : this.f439c.a(z7);
    }

    @Override
    public com.google.common.util.concurrent.p<Void> e(float f7) {
        return !E.o.b(this.f440d, 0) ? G.n.n(new IllegalStateException("Zoom is not supported")) : this.f439c.e(f7);
    }

    @Override
    public com.google.common.util.concurrent.p<Void> g(float f7) {
        return !E.o.b(this.f440d, 0) ? G.n.n(new IllegalStateException("Zoom is not supported")) : this.f439c.g(f7);
    }

    @Override
    public com.google.common.util.concurrent.p<C3033C> l(C3032B c3032b) {
        C3032B c3032bA = E.o.a(this.f440d, c3032b);
        return c3032bA == null ? G.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f439c.l(c3032bA);
    }
}
