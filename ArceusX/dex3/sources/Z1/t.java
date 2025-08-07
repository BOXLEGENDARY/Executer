package Z1;

import a2.c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.roblox.client.personasdk.R;
import java.io.IOException;
import java.lang.ref.WeakReference;

class t {
    private static g0.l<WeakReference<Interpolator>> b;
    private static final Interpolator a = new LinearInterpolator();
    static c.a c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    static c.a d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().d(i);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = b2.g.c(pointF.x, -1.0f, 1.0f);
        pointF.y = b2.g.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = b2.g.c(pointF2.x, -1.0f, 1.0f);
        float fC = b2.g.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fC;
        int i = b2.h.i(pointF.x, pointF.y, pointF2.x, fC);
        WeakReference<Interpolator> weakReferenceA = a(i);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorA = z0.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorA = "The Path cannot loop back on itself.".equals(e.getMessage()) ? z0.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorA;
            try {
                h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    static <T> c2.a<T> c(a2.c cVar, P1.d dVar, float f, M<T> m, boolean z, boolean z2) throws IOException {
        return (z && z2) ? e(dVar, cVar, f, m) : z ? d(dVar, cVar, f, m) : f(cVar, f, m);
    }

    private static <T> c2.a<T> d(P1.d dVar, a2.c cVar, float f, M<T> m) throws IOException {
        Interpolator interpolatorB;
        T t;
        cVar.f();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fA = 0.0f;
        boolean z = false;
        PointF pointFE4 = null;
        while (cVar.u()) {
            switch (cVar.n0(c)) {
                case 0:
                    fA = (float) cVar.A();
                    break;
                case 1:
                    tA2 = m.a(cVar, f);
                    break;
                case 2:
                    tA = m.a(cVar, f);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.K() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    pointFE2 = s.e(cVar, f);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    pointFE3 = s.e(cVar, f);
                    break;
                default:
                    cVar.H0();
                    break;
            }
        }
        cVar.m();
        if (z) {
            interpolatorB = a;
            t = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? a : b(pointFE, pointFE4);
            t = tA;
        }
        c2.a<T> aVar = new c2.a<>(dVar, tA2, t, interpolatorB, fA, null);
        aVar.o = pointFE2;
        aVar.p = pointFE3;
        return aVar;
    }

    private static <T> c2.a<T> e(P1.d r21, a2.c r22, float r23, Z1.M<T> r24) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: Z1.t.e(P1.d, a2.c, float, Z1.M):c2.a");
    }

    private static <T> c2.a<T> f(a2.c cVar, float f, M<T> m) throws IOException {
        return new c2.a<>(m.a(cVar, f));
    }

    private static g0.l<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new g0.l<>();
        }
        return b;
    }

    private static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            b.h(i, weakReference);
        }
    }
}
