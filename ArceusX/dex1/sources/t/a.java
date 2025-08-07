package T;

import C.InterfaceC0351s0;
import C.J0;
import C.X;
import C.o1;
import H.n;
import S.W;
import S.h0;
import X.i0;
import X.k0;
import java.util.Objects;
import n.InterfaceC2621a;
import x0.g;

public final class a<T extends h0> implements o1<W<T>>, InterfaceC0351s0, n {

    public static final X.a<h0> f7445J = X.a.a("camerax.video.VideoCapture.videoOutput", h0.class);

    public static final X.a<InterfaceC2621a<i0, k0>> f7446K = X.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", InterfaceC2621a.class);

    public static final X.a<Boolean> f7447L = X.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);

    private final J0 f7448I;

    public a(J0 j02) {
        g.a(j02.b(f7445J));
        this.f7448I = j02;
    }

    public InterfaceC2621a<i0, k0> Z() {
        InterfaceC2621a<i0, k0> interfaceC2621a = (InterfaceC2621a) f(f7446K);
        Objects.requireNonNull(interfaceC2621a);
        return interfaceC2621a;
    }

    public T a0() {
        h0 h0Var = (h0) f(f7445J);
        Objects.requireNonNull(h0Var);
        return (T) h0Var;
    }

    public boolean b0() {
        Boolean bool = (Boolean) a(f7447L, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override
    public X e() {
        return this.f7448I;
    }

    @Override
    public int t() {
        return 34;
    }
}
