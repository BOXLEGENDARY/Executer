package s;

import B.InterfaceC0275k;
import C.AbstractC0345p;
import C.F;
import C.InterfaceC0364z;
import C.V;
import C.X;
import C.X0;
import K0.wJ.BtcVLuo;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import r.C2739a;
import w.C2956a;
import w.C2957b;
import y.j;
import z.C3032B;
import z.C3033C;
import z.C3043d0;
import z.InterfaceC3054j;
import z.T;

public class C2852u implements C.F {

    final b f23464b;

    final Executor f23465c;

    private final Object f23466d = new Object();

    private final t.B f23467e;

    private final F.d f23468f;

    private final X0.b f23469g;

    private final C2866y1 f23470h;

    private final o2 f23471i;

    private final f2 f23472j;

    private final C2821j1 f23473k;

    q2 f23474l;

    private final y.g f23475m;

    private final C2793a0 f23476n;

    private final j2 f23477o;

    private int f23478p;

    private T.i f23479q;

    private volatile boolean f23480r;

    private volatile int f23481s;

    private final C2956a f23482t;

    private final C2957b f23483u;

    private final AtomicLong f23484v;

    private volatile com.google.common.util.concurrent.p<Void> f23485w;

    private int f23486x;

    private long f23487y;

    private final a f23488z;

    static final class a extends AbstractC0345p {

        Set<AbstractC0345p> f23489a = new HashSet();

        Map<AbstractC0345p, Executor> f23490b = new ArrayMap();

        a() {
        }

        @Override
        public void a(final int i7) {
            for (final AbstractC0345p abstractC0345p : this.f23489a) {
                try {
                    this.f23490b.get(abstractC0345p).execute(new Runnable() {
                        @Override
                        public final void run() {
                            abstractC0345p.a(i7);
                        }
                    });
                } catch (RejectedExecutionException e7) {
                    C3043d0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e7);
                }
            }
        }

        @Override
        public void b(final int i7, final InterfaceC0364z interfaceC0364z) {
            for (final AbstractC0345p abstractC0345p : this.f23489a) {
                try {
                    this.f23490b.get(abstractC0345p).execute(new Runnable() {
                        @Override
                        public final void run() {
                            abstractC0345p.b(i7, interfaceC0364z);
                        }
                    });
                } catch (RejectedExecutionException e7) {
                    C3043d0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e7);
                }
            }
        }

        @Override
        public void c(final int i7, final C.r rVar) {
            for (final AbstractC0345p abstractC0345p : this.f23489a) {
                try {
                    this.f23490b.get(abstractC0345p).execute(new Runnable() {
                        @Override
                        public final void run() {
                            abstractC0345p.c(i7, rVar);
                        }
                    });
                } catch (RejectedExecutionException e7) {
                    C3043d0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e7);
                }
            }
        }

        void h(Executor executor, AbstractC0345p abstractC0345p) {
            this.f23489a.add(abstractC0345p);
            this.f23490b.put(abstractC0345p, executor);
        }

        void l(AbstractC0345p abstractC0345p) {
            this.f23489a.remove(abstractC0345p);
            this.f23490b.remove(abstractC0345p);
        }
    }

    static final class b extends CameraCaptureSession.CaptureCallback {

        final Set<c> f23491a = new HashSet();

        private final Executor f23492b;

        b(Executor executor) {
            this.f23492b = executor;
        }

        public void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f23491a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f23491a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f23491a.add(cVar);
        }

        void d(c cVar) {
            this.f23491a.remove(cVar);
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f23492b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23508d.c(totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    C2852u(t.B b2, ScheduledExecutorService scheduledExecutorService, Executor executor, F.d dVar, C.R0 r02) {
        X0.b bVar = new X0.b();
        this.f23469g = bVar;
        this.f23478p = 0;
        this.f23480r = false;
        this.f23481s = 2;
        this.f23484v = new AtomicLong(0L);
        this.f23485w = G.n.p(null);
        this.f23486x = 1;
        this.f23487y = 0L;
        a aVar = new a();
        this.f23488z = aVar;
        this.f23467e = b2;
        this.f23468f = dVar;
        this.f23465c = executor;
        this.f23477o = new j2(executor);
        b bVar2 = new b(executor);
        this.f23464b = bVar2;
        bVar.z(this.f23486x);
        bVar.j(T0.e(bVar2));
        bVar.j(aVar);
        this.f23473k = new C2821j1(this, b2, executor);
        this.f23470h = new C2866y1(this, scheduledExecutorService, executor, r02);
        this.f23471i = new o2(this, b2, executor);
        this.f23472j = new f2(this, b2, executor);
        this.f23474l = new u2(b2);
        this.f23482t = new C2956a(r02);
        this.f23483u = new C2957b(r02);
        this.f23475m = new y.g(this, executor);
        this.f23476n = new C2793a0(this, b2, r02, executor, scheduledExecutorService);
    }

    public static int N(t.B b2, int i7) {
        int[] iArr = (int[]) b2.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return X(i7, iArr) ? i7 : X(1, iArr) ? 1 : 0;
    }

    private int P(int i7) {
        int[] iArr = (int[]) this.f23467e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return X(i7, iArr) ? i7 : X(1, iArr) ? 1 : 0;
    }

    private boolean V() {
        return R() > 0;
    }

    private static boolean X(int i7, int[] iArr) {
        for (int i8 : iArr) {
            if (i7 == i8) {
                return true;
            }
        }
        return false;
    }

    static boolean Y(TotalCaptureResult totalCaptureResult, long j7) {
        Long l7;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C.g1) && (l7 = (Long) ((C.g1) tag).d("CameraControlSessionUpdateId")) != null && l7.longValue() >= j7;
    }

    public static void a0() {
    }

    public void b0(Executor executor, AbstractC0345p abstractC0345p) {
        this.f23488z.h(executor, abstractC0345p);
    }

    public static void c0() {
    }

    public com.google.common.util.concurrent.p d0(int i7, int i8, int i9, Void r42) throws Exception {
        return G.n.p(this.f23476n.c(i7, i8, i9));
    }

    public void e0(AbstractC0345p abstractC0345p) {
        this.f23488z.l(abstractC0345p);
    }

    public com.google.common.util.concurrent.p f0(List list, int i7, int i8, int i9, Void r52) throws Exception {
        return this.f23476n.i(list, i7, i8, i9);
    }

    public void g0(c.a aVar) {
        G.n.C(u0(t0()), aVar);
    }

    public Object h0(final c.a aVar) throws Exception {
        this.f23465c.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23415d.g0(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static boolean i0(long j7, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!Y(totalCaptureResult, j7)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public Object j0(final long j7, final c.a aVar) throws Exception {
        z(new c() {
            @Override
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C2852u.i0(j7, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j7;
    }

    private com.google.common.util.concurrent.p<Void> u0(final long j7) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23438a.j0(j7, aVar);
            }
        });
    }

    void A(final Executor executor, final AbstractC0345p abstractC0345p) {
        this.f23465c.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23378d.b0(executor, abstractC0345p);
            }
        });
    }

    void B() {
        synchronized (this.f23466d) {
            try {
                int i7 = this.f23478p;
                if (i7 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f23478p = i7 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void C(boolean z7) {
        this.f23480r = z7;
        if (!z7) {
            V.a aVar = new V.a();
            aVar.v(this.f23486x);
            aVar.w(true);
            C2739a.C0218a c0218a = new C2739a.C0218a();
            c0218a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(M(1)));
            c0218a.f(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c0218a.a());
            r0(Collections.singletonList(aVar.h()));
        }
        t0();
    }

    Rect D() {
        return this.f23471i.g();
    }

    public int E() {
        return this.f23481s;
    }

    public C2866y1 F() {
        return this.f23470h;
    }

    int G() {
        Integer num = (Integer) this.f23467e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int H() {
        Integer num = (Integer) this.f23467e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int I() {
        Integer num = (Integer) this.f23467e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public T.i J() {
        return this.f23479q;
    }

    public C.X0 K() {
        this.f23469g.z(this.f23486x);
        this.f23469g.v(L());
        this.f23469g.n("CameraControlSessionUpdateId", Long.valueOf(this.f23487y));
        return this.f23469g.o();
    }

    C.X L() {
        C2739a.C0218a c0218a = new C2739a.C0218a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        X.c cVar = X.c.REQUIRED;
        c0218a.g(key, 1, cVar);
        this.f23470h.n(c0218a);
        this.f23482t.a(c0218a);
        this.f23471i.e(c0218a);
        int iA = this.f23470h.G() ? 5 : 1;
        if (this.f23480r) {
            c0218a.g(CaptureRequest.FLASH_MODE, 2, cVar);
        } else {
            int i7 = this.f23481s;
            if (i7 == 0) {
                iA = this.f23483u.a(2);
            } else if (i7 == 1) {
                iA = 3;
            } else if (i7 == 2) {
                iA = 1;
            }
        }
        c0218a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(M(iA)), cVar);
        c0218a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(P(1)), cVar);
        this.f23473k.c(c0218a);
        this.f23475m.i(c0218a);
        return c0218a.a();
    }

    int M(int i7) {
        return N(this.f23467e, i7);
    }

    int O(int i7) {
        int[] iArr = (int[]) this.f23467e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (X(i7, iArr)) {
            return i7;
        }
        if (X(4, iArr)) {
            return 4;
        }
        return X(1, iArr) ? 1 : 0;
    }

    public f2 Q() {
        return this.f23472j;
    }

    int R() {
        int i7;
        synchronized (this.f23466d) {
            i7 = this.f23478p;
        }
        return i7;
    }

    public o2 S() {
        return this.f23471i;
    }

    public q2 T() {
        return this.f23474l;
    }

    void U() {
        synchronized (this.f23466d) {
            this.f23478p++;
        }
    }

    public boolean W() {
        int iE = this.f23477o.e();
        C3043d0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    boolean Z() {
        return this.f23480r;
    }

    @Override
    public com.google.common.util.concurrent.p<Void> a(boolean z7) {
        return !V() ? G.n.n(new InterfaceC3054j.a("Camera is not active.")) : G.n.B(this.f23472j.d(z7));
    }

    @Override
    public void b(X0.b bVar) {
        this.f23474l.b(bVar);
    }

    @Override
    public void c(C.X x7) {
        this.f23475m.g(j.a.e(x7).b()).c(new Runnable() {
            @Override
            public final void run() {
                C2852u.a0();
            }
        }, F.a.a());
    }

    @Override
    public void d() {
        this.f23477o.c();
    }

    @Override
    public com.google.common.util.concurrent.p<Void> e(float f7) {
        return !V() ? G.n.n(new InterfaceC3054j.a("Camera is not active.")) : G.n.B(this.f23471i.q(f7));
    }

    @Override
    public com.google.common.util.concurrent.p<List<Void>> f(final List<C.V> list, final int i7, final int i8) {
        if (V()) {
            final int iE = E();
            return G.d.a(G.n.B(this.f23485w)).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23368a.f0(list, i7, iE, i8, (Void) obj);
                }
            }, this.f23465c);
        }
        C3043d0.l("Camera2CameraControlImp", "Camera is not active.");
        return G.n.n(new InterfaceC3054j.a("Camera is not active."));
    }

    @Override
    public com.google.common.util.concurrent.p<Void> g(float f7) {
        return !V() ? G.n.n(new InterfaceC3054j.a(BtcVLuo.iMur)) : G.n.B(this.f23471i.r(f7));
    }

    @Override
    public Rect h() {
        Rect rect = (Rect) this.f23467e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) x0.g.g(rect);
    }

    @Override
    public void i(int i7) {
        if (!V()) {
            C3043d0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f23481s = i7;
        C3043d0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f23481s);
        q2 q2Var = this.f23474l;
        boolean z7 = true;
        if (this.f23481s != 1 && this.f23481s != 0) {
            z7 = false;
        }
        q2Var.d(z7);
        this.f23485w = s0();
    }

    @Override
    public com.google.common.util.concurrent.p<InterfaceC0275k> j(final int i7, final int i8) {
        if (V()) {
            final int iE = E();
            return G.d.a(G.n.B(this.f23485w)).g(new G.a() {
                @Override
                public final com.google.common.util.concurrent.p apply(Object obj) {
                    return this.f23427a.d0(i7, iE, i8, (Void) obj);
                }
            }, this.f23465c);
        }
        C3043d0.l("Camera2CameraControlImp", "Camera is not active.");
        return G.n.n(new InterfaceC3054j.a("Camera is not active."));
    }

    @Override
    public C.X k() {
        return this.f23475m.n();
    }

    public void k0(c cVar) {
        this.f23464b.d(cVar);
    }

    @Override
    public com.google.common.util.concurrent.p<C3033C> l(C3032B c3032b) {
        return !V() ? G.n.n(new InterfaceC3054j.a("Camera is not active.")) : G.n.B(this.f23470h.a0(c3032b));
    }

    void l0(final AbstractC0345p abstractC0345p) {
        this.f23465c.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23395d.e0(abstractC0345p);
            }
        });
    }

    @Override
    public void m() {
        this.f23475m.j().c(new Runnable() {
            @Override
            public final void run() {
                C2852u.c0();
            }
        }, F.a.a());
    }

    void m0() {
        p0(1);
    }

    @Override
    public void n(T.i iVar) {
        this.f23479q = iVar;
    }

    void n0(boolean z7) {
        C3043d0.a("Camera2CameraControlImp", "setActive: isActive = " + z7);
        this.f23470h.W(z7);
        this.f23471i.p(z7);
        this.f23472j.j(z7);
        this.f23473k.b(z7);
        this.f23475m.t(z7);
        if (z7) {
            return;
        }
        this.f23479q = null;
        this.f23477o.h();
    }

    @Override
    public void o() {
        this.f23477o.f();
    }

    public void o0(Rational rational) {
        this.f23470h.X(rational);
    }

    void p0(int i7) {
        this.f23486x = i7;
        this.f23470h.Y(i7);
        this.f23476n.h(this.f23486x);
    }

    public void q0(boolean z7) {
        this.f23474l.e(z7);
    }

    void r0(List<C.V> list) {
        this.f23468f.b(list);
    }

    public com.google.common.util.concurrent.p<Void> s0() {
        return G.n.B(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23402a.h0(aVar);
            }
        }));
    }

    long t0() {
        this.f23487y = this.f23484v.getAndIncrement();
        this.f23468f.a();
        return this.f23487y;
    }

    void z(c cVar) {
        this.f23464b.b(cVar);
    }
}
