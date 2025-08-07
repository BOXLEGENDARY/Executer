package C;

import C.X;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import z.C3036a;

public interface InterfaceC0351s0 extends S0 {

    public static final X.a<Integer> f716j = X.a.a("camerax.core.imageOutput.targetAspectRatio", C3036a.class);

    public static final X.a<Integer> f717k;

    public static final X.a<Integer> f718l;

    public static final X.a<Integer> f719m;

    public static final X.a<Size> f720n;

    public static final X.a<Size> f721o;

    public static final X.a<Size> f722p;

    public static final X.a<List<Pair<Integer, Size[]>>> f723q;

    public static final X.a<P.c> f724r;

    public static final X.a<List<Size>> f725s;

    public interface a<B> {
        B a(P.c cVar);

        B b(Size size);

        B e(int i7);
    }

    static {
        Class cls = Integer.TYPE;
        f717k = X.a.a("camerax.core.imageOutput.targetRotation", cls);
        f718l = X.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f719m = X.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f720n = X.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f721o = X.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f722p = X.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f723q = X.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f724r = X.a.a("camerax.core.imageOutput.resolutionSelector", P.c.class);
        f725s = X.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void Y(InterfaceC0351s0 interfaceC0351s0) {
        boolean zJ = interfaceC0351s0.J();
        boolean z7 = interfaceC0351s0.B(null) != null;
        if (zJ && z7) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC0351s0.U(null) != null) {
            if (zJ || z7) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size B(Size size) {
        return (Size) a(f720n, size);
    }

    default int C(int i7) {
        return ((Integer) a(f718l, Integer.valueOf(i7))).intValue();
    }

    default boolean J() {
        return b(f716j);
    }

    default int L() {
        return ((Integer) f(f716j)).intValue();
    }

    default P.c U(P.c cVar) {
        return (P.c) a(f724r, cVar);
    }

    default int W(int i7) {
        return ((Integer) a(f717k, Integer.valueOf(i7))).intValue();
    }

    default int X(int i7) {
        return ((Integer) a(f719m, Integer.valueOf(i7))).intValue();
    }

    default Size j(Size size) {
        return (Size) a(f722p, size);
    }

    default List<Pair<Integer, Size[]>> p(List<Pair<Integer, Size[]>> list) {
        return (List) a(f723q, list);
    }

    default P.c q() {
        return (P.c) f(f724r);
    }

    default List<Size> s(List<Size> list) {
        List list2 = (List) a(f725s, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size v(Size size) {
        return (Size) a(f721o, size);
    }
}
