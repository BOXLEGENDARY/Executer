package s;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import android.view.C1709w;
import android.view.LiveData;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import r.C2739a;
import s.C2852u;
import z.C3043d0;
import z.InterfaceC3054j;

final class o2 {

    private final C2852u f23419a;

    private final Executor f23420b;

    private final p2 f23421c;

    private final C1709w<z.J0> f23422d;

    final b f23423e;

    private boolean f23424f = false;

    private C2852u.c f23425g = new a();

    class a implements C2852u.c {
        a() {
        }

        @Override
        public boolean a(TotalCaptureResult totalCaptureResult) {
            o2.this.f23423e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(C2739a.C0218a c0218a);

        void c(float f7, c.a<Void> aVar);

        float d();

        float e();

        Rect f();

        void g();
    }

    o2(C2852u c2852u, t.B b2, Executor executor) throws IllegalArgumentException {
        this.f23419a = c2852u;
        this.f23420b = executor;
        b bVarF = f(b2);
        this.f23423e = bVarF;
        p2 p2Var = new p2(bVarF.d(), bVarF.e());
        this.f23421c = p2Var;
        p2Var.h(1.0f);
        this.f23422d = new C1709w<>(H.g.f(p2Var));
        c2852u.z(this.f23425g);
    }

    private static b f(t.B b2) {
        return k(b2) ? new C2798c(b2) : new C2812g1(b2);
    }

    static z.J0 h(t.B b2) throws IllegalArgumentException {
        b bVarF = f(b2);
        p2 p2Var = new p2(bVarF.d(), bVarF.e());
        p2Var.h(1.0f);
        return H.g.f(p2Var);
    }

    private static Range<Float> i(t.B b2) {
        try {
            return (Range) b2.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e7) {
            C3043d0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e7);
            return null;
        }
    }

    static boolean k(t.B b2) {
        return Build.VERSION.SDK_INT >= 30 && i(b2) != null;
    }

    public Object m(final z.J0 j02, final c.a aVar) throws Exception {
        this.f23420b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23412d.l(aVar, j02);
            }
        });
        return "setLinearZoom";
    }

    public Object o(final z.J0 j02, final c.a aVar) throws Exception {
        this.f23420b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23406d.n(aVar, j02);
            }
        });
        return "setZoomRatio";
    }

    public void n(c.a<Void> aVar, z.J0 j02) {
        z.J0 j0F;
        if (this.f23424f) {
            this.f23423e.c(j02.c(), aVar);
            this.f23419a.t0();
            return;
        }
        synchronized (this.f23421c) {
            this.f23421c.h(1.0f);
            j0F = H.g.f(this.f23421c);
        }
        t(j0F);
        aVar.f(new InterfaceC3054j.a("Camera is not active."));
    }

    private void t(z.J0 j02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f23422d.o(j02);
        } else {
            this.f23422d.m(j02);
        }
    }

    void e(C2739a.C0218a c0218a) {
        this.f23423e.b(c0218a);
    }

    Rect g() {
        return this.f23423e.f();
    }

    LiveData<z.J0> j() {
        return this.f23422d;
    }

    void p(boolean z7) {
        z.J0 j0F;
        if (this.f23424f == z7) {
            return;
        }
        this.f23424f = z7;
        if (z7) {
            return;
        }
        synchronized (this.f23421c) {
            this.f23421c.h(1.0f);
            j0F = H.g.f(this.f23421c);
        }
        t(j0F);
        this.f23423e.g();
        this.f23419a.t0();
    }

    com.google.common.util.concurrent.p<Void> q(float f7) {
        final z.J0 j0F;
        synchronized (this.f23421c) {
            try {
                this.f23421c.g(f7);
                j0F = H.g.f(this.f23421c);
            } catch (IllegalArgumentException e7) {
                return G.n.n(e7);
            }
        }
        t(j0F);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23400a.m(j0F, aVar);
            }
        });
    }

    com.google.common.util.concurrent.p<Void> r(float f7) {
        final z.J0 j0F;
        synchronized (this.f23421c) {
            try {
                this.f23421c.h(f7);
                j0F = H.g.f(this.f23421c);
            } catch (IllegalArgumentException e7) {
                return G.n.n(e7);
            }
        }
        t(j0F);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23393a.o(j0F, aVar);
            }
        });
    }
}
