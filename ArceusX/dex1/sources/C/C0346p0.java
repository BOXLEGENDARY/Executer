package C;

import C.X;
import S5.Cg.XjqcfAbdbc;
import androidx.camera.core.f;

public final class C0346p0 implements o1<androidx.camera.core.f>, InterfaceC0351s0, H.n {

    public static final X.a<Integer> f673J = X.a.a("camerax.core.imageAnalysis.backpressureStrategy", f.b.class);

    public static final X.a<Integer> f674K = X.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    public static final X.a<z.Z> f675L = X.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", z.Z.class);

    public static final X.a<Integer> f676M = X.a.a(XjqcfAbdbc.TJU, f.e.class);

    public static final X.a<Boolean> f677N = X.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    public static final X.a<Boolean> f678O = X.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    private final J0 f679I;

    public C0346p0(J0 j02) {
        this.f679I = j02;
    }

    public int Z(int i7) {
        return ((Integer) a(f673J, Integer.valueOf(i7))).intValue();
    }

    public int a0(int i7) {
        return ((Integer) a(f674K, Integer.valueOf(i7))).intValue();
    }

    public z.Z b0() {
        return (z.Z) a(f675L, null);
    }

    public Boolean c0(Boolean bool) {
        return (Boolean) a(f677N, bool);
    }

    public int d0(int i7) {
        return ((Integer) a(f676M, Integer.valueOf(i7))).intValue();
    }

    @Override
    public X e() {
        return this.f679I;
    }

    public Boolean e0(Boolean bool) {
        return (Boolean) a(f678O, bool);
    }

    @Override
    public int t() {
        return 35;
    }
}
