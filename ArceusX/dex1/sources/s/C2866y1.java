package s;

import C.AbstractC0345p;
import C.F;
import C.InterfaceC0364z;
import C.V;
import C.X;
import Q6.QtA.QXojhh;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r.C2739a;
import s.C2852u;
import z.C3032B;
import z.C3033C;
import z.C3043d0;
import z.C3049g0;
import z.InterfaceC3054j;

class C2866y1 {

    private static final MeteringRectangle[] f23537x = new MeteringRectangle[0];

    private final C2852u f23538a;

    final Executor f23539b;

    private final ScheduledExecutorService f23540c;

    private final w.l f23543f;

    private ScheduledFuture<?> f23546i;

    private ScheduledFuture<?> f23547j;

    private MeteringRectangle[] f23554q;

    private MeteringRectangle[] f23555r;

    private MeteringRectangle[] f23556s;

    c.a<C3033C> f23557t;

    c.a<Void> f23558u;

    private boolean f23559v;

    private C2852u.c f23560w;

    private volatile boolean f23541d = false;

    private volatile Rational f23542e = null;

    private boolean f23544g = false;

    Integer f23545h = 0;

    long f23548k = 0;

    boolean f23549l = false;

    boolean f23550m = false;

    private int f23551n = 1;

    private C2852u.c f23552o = null;

    private C2852u.c f23553p = null;

    class a extends AbstractC0345p {

        final c.a f23561a;

        a(c.a aVar) {
            this.f23561a = aVar;
        }

        @Override
        public void a(int i7) {
            c.a aVar = this.f23561a;
            if (aVar != null) {
                aVar.f(new InterfaceC3054j.a("Camera is closed"));
            }
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            c.a aVar = this.f23561a;
            if (aVar != null) {
                aVar.c(interfaceC0364z);
            }
        }

        @Override
        public void c(int i7, C.r rVar) {
            c.a aVar = this.f23561a;
            if (aVar != null) {
                aVar.f(new F.c(rVar));
            }
        }
    }

    class b extends AbstractC0345p {

        final c.a f23563a;

        b(c.a aVar) {
            this.f23563a = aVar;
        }

        @Override
        public void a(int i7) {
            c.a aVar = this.f23563a;
            if (aVar != null) {
                aVar.f(new InterfaceC3054j.a("Camera is closed"));
            }
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            if (this.f23563a != null) {
                C3043d0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f23563a.c(null);
            }
        }

        @Override
        public void c(int i7, C.r rVar) {
            c.a aVar = this.f23563a;
            if (aVar != null) {
                aVar.f(new F.c(rVar));
            }
        }
    }

    C2866y1(C2852u c2852u, ScheduledExecutorService scheduledExecutorService, Executor executor, C.R0 r02) {
        MeteringRectangle[] meteringRectangleArr = f23537x;
        this.f23554q = meteringRectangleArr;
        this.f23555r = meteringRectangleArr;
        this.f23556s = meteringRectangleArr;
        this.f23557t = null;
        this.f23558u = null;
        this.f23559v = false;
        this.f23560w = null;
        this.f23538a = c2852u;
        this.f23539b = executor;
        this.f23540c = scheduledExecutorService;
        this.f23543f = new w.l(r02);
    }

    private Rational B() {
        if (this.f23542e != null) {
            return this.f23542e;
        }
        Rect rectD = this.f23538a.D();
        return new Rational(rectD.width(), rectD.height());
    }

    private static PointF C(C3049g0 c3049g0, Rational rational, Rational rational2, int i7, w.l lVar) {
        if (c3049g0.b() != null) {
            rational2 = c3049g0.b();
        }
        PointF pointFA = lVar.a(c3049g0, i7);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFA.y = (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointFA.y) * (1.0f / fDoubleValue);
            } else {
                float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                pointFA.x = (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointFA.x) * (1.0f / fDoubleValue2);
            }
        }
        return pointFA;
    }

    private static MeteringRectangle D(C3049g0 c3049g0, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iA = ((int) (c3049g0.a() * rect.width())) / 2;
        int iA2 = ((int) (c3049g0.a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iA, iHeight - iA2, iWidth + iA, iHeight + iA2);
        rect2.left = V(rect2.left, rect.right, rect.left);
        rect2.right = V(rect2.right, rect.right, rect.left);
        rect2.top = V(rect2.top, rect.bottom, rect.top);
        rect2.bottom = V(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private List<MeteringRectangle> E(List<C3049g0> list, int i7, Rational rational, Rect rect, int i8) {
        if (list.isEmpty() || i7 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C3049g0 c3049g0 : list) {
            if (arrayList.size() == i7) {
                break;
            }
            if (H(c3049g0)) {
                MeteringRectangle meteringRectangleD = D(c3049g0, C(c3049g0, rational2, rational, i8, this.f23543f), rect);
                if (meteringRectangleD.getWidth() != 0 && meteringRectangleD.getHeight() != 0) {
                    arrayList.add(meteringRectangleD);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean F() {
        return this.f23538a.O(1) == 1;
    }

    private static boolean H(C3049g0 c3049g0) {
        return c3049g0.c() >= 0.0f && c3049g0.c() <= 1.0f && c3049g0.d() >= 0.0f && c3049g0.d() <= 1.0f;
    }

    public boolean I(int i7, long j7, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i7 || !C2852u.Y(totalCaptureResult, j7)) {
            return false;
        }
        t();
        return true;
    }

    public void J(boolean z7, c.a aVar) {
        this.f23538a.k0(this.f23560w);
        this.f23559v = z7;
        w(aVar);
    }

    public Object K(final boolean z7, final c.a aVar) throws Exception {
        this.f23539b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23453d.J(z7, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public boolean L(long j7, c.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z7 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        String str = QXojhh.PgELQ;
        C3043d0.a(str, "enableExternalFlashAeMode: isAeModeExternalFlash = " + z7);
        if (z7 != this.f23559v || !C2852u.Y(totalCaptureResult, j7)) {
            return false;
        }
        C3043d0.a(str, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z7);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public void M(long j7) {
        if (j7 == this.f23548k) {
            q();
        }
    }

    public void N(final long j7) {
        this.f23539b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23398d.M(j7);
            }
        });
    }

    public boolean O(boolean z7, long j7, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (Z()) {
            if (!z7 || num == null) {
                this.f23550m = true;
                this.f23549l = true;
            } else if (this.f23545h.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.f23550m = true;
                    this.f23549l = true;
                } else if (num.intValue() == 5) {
                    this.f23550m = false;
                    this.f23549l = true;
                }
            }
        }
        if (this.f23549l && C2852u.Y(totalCaptureResult, j7)) {
            s(this.f23550m);
            return true;
        }
        if (!this.f23545h.equals(num) && num != null) {
            this.f23545h = num;
        }
        return false;
    }

    public void P(long j7) {
        if (j7 == this.f23548k) {
            this.f23550m = false;
            s(false);
        }
    }

    public void Q(final long j7) {
        this.f23539b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23442d.P(j7);
            }
        });
    }

    public Object S(final C3032B c3032b, final long j7, final c.a aVar) throws Exception {
        this.f23539b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23523d.R(aVar, c3032b, j7);
            }
        });
        return "startFocusAndMetering";
    }

    public Object U(final c.a aVar) throws Exception {
        this.f23539b.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23461d.T(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    private static int V(int i7, int i8, int i9) {
        return Math.min(Math.max(i7, i9), i8);
    }

    private boolean Z() {
        return this.f23554q.length > 0;
    }

    private void r() {
        ScheduledFuture<?> scheduledFuture = this.f23547j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f23547j = null;
        }
    }

    private void t() {
        c.a<Void> aVar = this.f23558u;
        if (aVar != null) {
            aVar.c(null);
            this.f23558u = null;
        }
    }

    private void u() {
        ScheduledFuture<?> scheduledFuture = this.f23546i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f23546i = null;
        }
    }

    private void w(final c.a<Void> aVar) {
        if (!this.f23541d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3054j.a("Camera is not active."));
            }
        } else {
            final long jT0 = this.f23538a.t0();
            C2852u.c cVar = new C2852u.c() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return this.f23494a.L(jT0, aVar, totalCaptureResult);
                }
            };
            this.f23560w = cVar;
            this.f23538a.z(cVar);
        }
    }

    private void x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C3032B c3032b, long j7) {
        final long jT0;
        this.f23538a.k0(this.f23552o);
        u();
        r();
        this.f23554q = meteringRectangleArr;
        this.f23555r = meteringRectangleArr2;
        this.f23556s = meteringRectangleArr3;
        if (Z()) {
            this.f23544g = true;
            this.f23549l = false;
            this.f23550m = false;
            jT0 = this.f23538a.t0();
            f0(null, true);
        } else {
            this.f23544g = false;
            this.f23549l = true;
            this.f23550m = false;
            jT0 = this.f23538a.t0();
        }
        this.f23545h = 0;
        final boolean zF = F();
        C2852u.c cVar = new C2852u.c() {
            @Override
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return this.f23403a.O(zF, jT0, totalCaptureResult);
            }
        };
        this.f23552o = cVar;
        this.f23538a.z(cVar);
        final long j8 = this.f23548k + 1;
        this.f23548k = j8;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f23410d.Q(j8);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f23540c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f23547j = scheduledExecutorService.schedule(runnable, j7, timeUnit);
        if (c3032b.e()) {
            this.f23546i = this.f23540c.schedule(new Runnable() {
                @Override
                public final void run() {
                    this.f23417d.N(j8);
                }
            }, c3032b.a(), timeUnit);
        }
    }

    private void y(String str) {
        this.f23538a.k0(this.f23552o);
        c.a<C3033C> aVar = this.f23557t;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a(str));
            this.f23557t = null;
        }
    }

    private void z(String str) {
        this.f23538a.k0(this.f23553p);
        c.a<Void> aVar = this.f23558u;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a(str));
            this.f23558u = null;
        }
    }

    int A() {
        return this.f23551n != 3 ? 4 : 3;
    }

    boolean G() {
        return this.f23559v;
    }

    void W(boolean z7) {
        if (z7 == this.f23541d) {
            return;
        }
        this.f23541d = z7;
        if (this.f23541d) {
            return;
        }
        q();
    }

    public void X(Rational rational) {
        this.f23542e = rational;
    }

    void Y(int i7) {
        this.f23551n = i7;
    }

    com.google.common.util.concurrent.p<C3033C> a0(C3032B c3032b) {
        return b0(c3032b, 5000L);
    }

    com.google.common.util.concurrent.p<C3033C> b0(final C3032B c3032b, final long j7) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23511a.S(c3032b, j7, aVar);
            }
        });
    }

    public void R(c.a<C3033C> aVar, C3032B c3032b, long j7) {
        if (!this.f23541d) {
            aVar.f(new InterfaceC3054j.a("Camera is not active."));
            return;
        }
        Rect rectD = this.f23538a.D();
        Rational rationalB = B();
        List<MeteringRectangle> listE = E(c3032b.c(), this.f23538a.H(), rationalB, rectD, 1);
        List<MeteringRectangle> listE2 = E(c3032b.b(), this.f23538a.G(), rationalB, rectD, 2);
        List<MeteringRectangle> listE3 = E(c3032b.d(), this.f23538a.I(), rationalB, rectD, 4);
        if (listE.isEmpty() && listE2.isEmpty() && listE3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        y("Cancelled by another startFocusAndMetering()");
        z("Cancelled by another startFocusAndMetering()");
        u();
        this.f23557t = aVar;
        MeteringRectangle[] meteringRectangleArr = f23537x;
        x((MeteringRectangle[]) listE.toArray(meteringRectangleArr), (MeteringRectangle[]) listE2.toArray(meteringRectangleArr), (MeteringRectangle[]) listE3.toArray(meteringRectangleArr), c3032b, j7);
    }

    com.google.common.util.concurrent.p<Void> d0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23448a.U(aVar);
            }
        });
    }

    public void T(c.a<Void> aVar) {
        C3043d0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f23541d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3054j.a("Camera is not active."));
                return;
            }
            return;
        }
        V.a aVar2 = new V.a();
        aVar2.v(this.f23551n);
        aVar2.w(true);
        C2739a.C0218a c0218a = new C2739a.C0218a();
        c0218a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0218a.a());
        aVar2.c(new b(aVar));
        this.f23538a.r0(Collections.singletonList(aVar2.h()));
    }

    void f0(c.a<InterfaceC0364z> aVar, boolean z7) {
        if (!this.f23541d) {
            if (aVar != null) {
                aVar.f(new InterfaceC3054j.a("Camera is not active."));
                return;
            }
            return;
        }
        V.a aVar2 = new V.a();
        aVar2.v(this.f23551n);
        aVar2.w(true);
        C2739a.C0218a c0218a = new C2739a.C0218a();
        c0218a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z7) {
            c0218a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f23538a.M(1)), X.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0218a.a());
        aVar2.c(new a(aVar));
        this.f23538a.r0(Collections.singletonList(aVar2.h()));
    }

    void n(C2739a.C0218a c0218a) {
        int iA = this.f23544g ? 1 : A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f23538a.O(iA));
        X.c cVar = X.c.REQUIRED;
        c0218a.g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f23554q;
        if (meteringRectangleArr.length != 0) {
            c0218a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f23555r;
        if (meteringRectangleArr2.length != 0) {
            c0218a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f23556s;
        if (meteringRectangleArr3.length != 0) {
            c0218a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    void o(boolean z7, boolean z8) {
        if (this.f23541d) {
            V.a aVar = new V.a();
            aVar.w(true);
            aVar.v(this.f23551n);
            C2739a.C0218a c0218a = new C2739a.C0218a();
            if (z7) {
                c0218a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z8) {
                c0218a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0218a.a());
            this.f23538a.r0(Collections.singletonList(aVar.h()));
        }
    }

    void p(c.a<Void> aVar) {
        z("Cancelled by another cancelFocusAndMetering()");
        y("Cancelled by cancelFocusAndMetering()");
        this.f23558u = aVar;
        u();
        r();
        if (Z()) {
            o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f23537x;
        this.f23554q = meteringRectangleArr;
        this.f23555r = meteringRectangleArr;
        this.f23556s = meteringRectangleArr;
        this.f23544g = false;
        final long jT0 = this.f23538a.t0();
        if (this.f23558u != null) {
            final int iO = this.f23538a.O(A());
            C2852u.c cVar = new C2852u.c() {
                @Override
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return this.f23529a.I(iO, jT0, totalCaptureResult);
                }
            };
            this.f23553p = cVar;
            this.f23538a.z(cVar);
        }
    }

    void q() {
        p(null);
    }

    void s(boolean z7) {
        r();
        c.a<C3033C> aVar = this.f23557t;
        if (aVar != null) {
            aVar.c(C3033C.a(z7));
            this.f23557t = null;
        }
    }

    com.google.common.util.concurrent.p<Void> v(final boolean z7) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i7);
            return G.n.p(null);
        }
        if (this.f23538a.M(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return G.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f23432a.K(z7, aVar);
            }
        });
    }
}
