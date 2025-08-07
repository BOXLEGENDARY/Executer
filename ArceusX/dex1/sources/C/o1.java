package C;

import C.V;
import C.X;
import C.X0;
import C.p1;
import android.util.Range;
import z.G0;
import z.InterfaceC3031A;

public interface o1<T extends z.G0> extends H.m<T>, InterfaceC0349r0 {

    public static final X.a<Boolean> f662A;

    public static final X.a<p1.b> f663B;

    public static final X.a<Integer> f664C;

    public static final X.a<Integer> f665D;

    public static final X.a<X0> f666t = X.a.a("camerax.core.useCase.defaultSessionConfig", X0.class);

    public static final X.a<V> f667u = X.a.a("camerax.core.useCase.defaultCaptureConfig", V.class);

    public static final X.a<X0.e> f668v = X.a.a("camerax.core.useCase.sessionConfigUnpacker", X0.e.class);

    public static final X.a<V.b> f669w = X.a.a("camerax.core.useCase.captureConfigUnpacker", V.b.class);

    public static final X.a<Integer> f670x;

    public static final X.a<Range<Integer>> f671y;

    public static final X.a<Boolean> f672z;

    public interface a<T extends z.G0, C extends o1<T>, B> extends InterfaceC3031A<T> {
        C d();
    }

    static {
        Class cls = Integer.TYPE;
        f670x = X.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f671y = X.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        f672z = X.a.a("camerax.core.useCase.zslDisabled", cls2);
        f662A = X.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f663B = X.a.a("camerax.core.useCase.captureType", p1.b.class);
        f664C = X.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f665D = X.a.a("camerax.core.useCase.videoStabilizationMode", cls);
    }

    default p1.b F() {
        return (p1.b) f(f663B);
    }

    default int G() {
        return ((Integer) a(f665D, 0)).intValue();
    }

    default Range<Integer> H(Range<Integer> range) {
        return (Range) a(f671y, range);
    }

    default int K(int i7) {
        return ((Integer) a(f670x, Integer.valueOf(i7))).intValue();
    }

    default int M() {
        return ((Integer) a(f664C, 0)).intValue();
    }

    default boolean R(boolean z7) {
        return ((Boolean) a(f662A, Boolean.valueOf(z7))).booleanValue();
    }

    default V S(V v7) {
        return (V) a(f667u, v7);
    }

    default X0 n(X0 x02) {
        return (X0) a(f666t, x02);
    }

    default V.b r(V.b bVar) {
        return (V.b) a(f669w, bVar);
    }

    default X0.e w(X0.e eVar) {
        return (X0.e) a(f668v, eVar);
    }

    default X0 x() {
        return (X0) f(f666t);
    }

    default boolean y(boolean z7) {
        return ((Boolean) a(f672z, Boolean.valueOf(z7))).booleanValue();
    }
}
