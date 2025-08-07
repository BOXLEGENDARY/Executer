package C;

import C.X;
import Q6.QtA.QXojhh;
import java.util.concurrent.Executor;
import z.T;

public final class C0348q0 implements o1<z.T>, InterfaceC0351s0, H.h {

    public static final X.a<Integer> f689J;

    public static final X.a<Integer> f690K;

    public static final X.a<U> f691L;

    public static final X.a<Integer> f692M;

    public static final X.a<Integer> f693N;

    public static final X.a<Integer> f694O;

    public static final X.a<z.Z> f695P;

    public static final X.a<Boolean> f696Q;

    public static final X.a<Integer> f697R;

    public static final X.a<Integer> f698S;

    public static final X.a<T.i> f699T;

    public static final X.a<P.c> f700U;

    public static final X.a<Boolean> f701V;

    private final J0 f702I;

    static {
        Class cls = Integer.TYPE;
        f689J = X.a.a("camerax.core.imageCapture.captureMode", cls);
        f690K = X.a.a("camerax.core.imageCapture.flashMode", cls);
        f691L = X.a.a("camerax.core.imageCapture.captureBundle", U.class);
        f692M = X.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f693N = X.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f694O = X.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f695P = X.a.a(QXojhh.MIJyt, z.Z.class);
        f696Q = X.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f697R = X.a.a("camerax.core.imageCapture.flashType", cls);
        f698S = X.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f699T = X.a.a("camerax.core.imageCapture.screenFlash", T.i.class);
        f700U = X.a.a("camerax.core.useCase.postviewResolutionSelector", P.c.class);
        f701V = X.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public C0348q0(J0 j02) {
        this.f702I = j02;
    }

    public U Z(U u7) {
        return (U) a(f691L, u7);
    }

    public int a0() {
        return ((Integer) f(f689J)).intValue();
    }

    public int b0(int i7) {
        return ((Integer) a(f690K, Integer.valueOf(i7))).intValue();
    }

    public int c0(int i7) {
        return ((Integer) a(f697R, Integer.valueOf(i7))).intValue();
    }

    public z.Z d0() {
        return (z.Z) a(f695P, null);
    }

    @Override
    public X e() {
        return this.f702I;
    }

    public Executor e0(Executor executor) {
        return (Executor) a(H.h.f1507E, executor);
    }

    public int f0() {
        return ((Integer) f(f698S)).intValue();
    }

    public T.i g0() {
        return (T.i) a(f699T, null);
    }

    public boolean h0() {
        return b(f689J);
    }

    @Override
    public int t() {
        return ((Integer) f(InterfaceC0349r0.f706h)).intValue();
    }
}
