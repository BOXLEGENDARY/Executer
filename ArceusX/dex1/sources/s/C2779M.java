package s;

import C.AbstractC0315a;
import C.AbstractC0324e0;
import C.C0355u0;
import C.F;
import C.J;
import C.Q;
import C.V;
import C.X0;
import C.n1;
import C.p1;
import S5.Cg.XjqcfAbdbc;
import Za.qhkq.dHkZSUxHu;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s.E1;
import s.P1;
import t.C2888a;
import t.C2894g;
import u.C2926g;
import z.AbstractC3062q;
import z.C3043d0;

final class C2779M implements C.J {

    private final C2852u f23028A;

    private final j f23029B;

    final C2785T f23030C;

    CameraDevice f23031D;

    int f23032E;

    InterfaceC2800c1 f23033F;

    final AtomicInteger f23034G;

    c.a<Void> f23035H;

    final Map<InterfaceC2800c1, com.google.common.util.concurrent.p<Void>> f23036I;

    private int f23037J;

    final e f23038K;

    final f f23039L;

    final A.a f23040M;

    final C.Q f23041N;

    private final boolean f23042O;

    private final boolean f23043P;

    private boolean f23044Q;

    private boolean f23045R;

    private boolean f23046S;

    private E1 f23047T;

    private final C2809f1 f23048U;

    private final P1.b f23049V;

    private final Set<String> f23050W;

    private C.B f23051X;

    final Object f23052Y;

    private C.Z0 f23053Z;

    boolean f23054a0;

    private final C2815h1 f23055b0;

    private final t.B f23056c0;

    private final C.n1 f23057d;

    private final C2926g f23058d0;

    private final t.O f23059e;

    private final O1 f23060e0;

    private final h f23061f0;

    private final Executor f23062i;

    private final ScheduledExecutorService f23063v;

    volatile i f23064w = i.INITIALIZED;

    private final C.B0<J.a> f23065y;

    private final Q0 f23066z;

    class a implements InterfaceC2807f {
        a() {
        }

        @Override
        public CamcorderProfile a(int i7, int i8) {
            return CamcorderProfile.get(i7, i8);
        }

        @Override
        public boolean b(int i7, int i8) {
            return CamcorderProfile.hasProfile(i7, i8);
        }
    }

    class b extends CameraDevice.StateCallback {

        final c.a f23068a;

        b(c.a aVar) {
            this.f23068a = aVar;
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            C2779M.this.U("openCameraConfigAndClose camera closed");
            this.f23068a.c(null);
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            C2779M.this.U("openCameraConfigAndClose camera disconnected");
            this.f23068a.c(null);
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i7) {
            C2779M.this.U("openCameraConfigAndClose camera error " + i7);
            this.f23068a.c(null);
        }

        @Override
        public void onOpened(final CameraDevice cameraDevice) {
            C2779M.this.U("openCameraConfigAndClose camera opened");
            com.google.common.util.concurrent.p pVarR = C2779M.this.R(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            pVarR.c(new Runnable() {
                @Override
                public final void run() {
                    cameraDevice.close();
                }
            }, C2779M.this.f23062i);
        }
    }

    class c implements G.c<Void> {

        final InterfaceC2800c1 f23070a;

        c(InterfaceC2800c1 interfaceC2800c1) {
            this.f23070a = interfaceC2800c1;
        }

        @Override
        public void onSuccess(Void r22) {
            C2779M.this.f23036I.remove(this.f23070a);
            int iOrdinal = C2779M.this.f23064w.ordinal();
            if (iOrdinal != 1 && iOrdinal != 4) {
                if (iOrdinal != 5 && (iOrdinal != 6 || C2779M.this.f23032E == 0)) {
                    return;
                } else {
                    C2779M.this.U("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (C2779M.this.e0()) {
                C2779M c2779m = C2779M.this;
                if (c2779m.f23031D != null) {
                    c2779m.U("closing camera");
                    C2888a.a(C2779M.this.f23031D);
                    C2779M.this.f23031D = null;
                }
            }
        }

        @Override
        public void onFailure(Throwable th) {
        }
    }

    class d implements G.c<Void> {

        final InterfaceC2800c1 f23072a;

        d(InterfaceC2800c1 interfaceC2800c1) {
            this.f23072a = interfaceC2800c1;
        }

        @Override
        public void onSuccess(Void r22) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (C2779M.this.f23040M.b() == 2 && C2779M.this.f23064w == i.OPENED) {
                C2779M.this.H0(i.CONFIGURED);
            }
        }

        @Override
        public void onFailure(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (th instanceof AbstractC0324e0.a) {
                C.X0 x0W = C2779M.this.W(((AbstractC0324e0.a) th).a());
                if (x0W != null) {
                    C2779M.this.C0(x0W);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                C2779M.this.U("Unable to configure camera cancelled");
                return;
            }
            i iVar = C2779M.this.f23064w;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                C2779M.this.I0(iVar2, AbstractC3062q.a.b(4, th));
            }
            C3043d0.d("Camera2CameraImpl", "Unable to configure camera " + C2779M.this, th);
            C2779M c2779m = C2779M.this;
            if (c2779m.f23033F == this.f23072a) {
                c2779m.F0(false);
            }
        }
    }

    final class e extends CameraManager.AvailabilityCallback implements Q.c {

        private final String f23074a;

        private boolean f23075b = true;

        e(String str) {
            this.f23074a = str;
        }

        @Override
        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (C2779M.this.f23064w == i.PENDING_OPEN) {
                C2779M.this.Q0(false);
            }
        }

        boolean b() {
            return this.f23075b;
        }

        @Override
        public void onCameraAvailable(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f23074a.equals(str)) {
                this.f23075b = true;
                if (C2779M.this.f23064w == i.PENDING_OPEN) {
                    C2779M.this.Q0(false);
                }
            }
        }

        @Override
        public void onCameraUnavailable(String str) {
            if (this.f23074a.equals(str)) {
                this.f23075b = false;
            }
        }
    }

    final class f implements Q.b {
        f() {
        }

        @Override
        public void a() {
            if (C2779M.this.f23064w == i.OPENED) {
                C2779M.this.A0();
            }
        }
    }

    final class g implements F.d {
        g() {
        }

        @Override
        public void a() {
            C2779M.this.R0();
        }

        @Override
        public void b(List<C.V> list) {
            C2779M.this.K0((List) x0.g.g(list));
        }
    }

    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    final class j extends CameraDevice.StateCallback {

        private final Executor f23095a;

        private final ScheduledExecutorService f23096b;

        private b f23097c;

        ScheduledFuture<?> f23098d;

        private final a f23099e;

        class a {

            private final long f23101a;

            private long f23102b = -1;

            a(long j7) {
                this.f23101a = j7;
            }

            boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f23102b == -1) {
                    this.f23102b = jUptimeMillis;
                }
                return jUptimeMillis - this.f23102b;
            }

            int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            int d() {
                if (j.this.f()) {
                    long j7 = this.f23101a;
                    if (j7 > 0) {
                        return Math.min((int) j7, 1800000);
                    }
                    return 1800000;
                }
                long j8 = this.f23101a;
                if (j8 > 0) {
                    return Math.min((int) j8, 10000);
                }
                return 10000;
            }

            void e() {
                this.f23102b = -1L;
            }
        }

        class b implements Runnable {

            private Executor f23104d;

            private boolean f23105e = false;

            b(Executor executor) {
                this.f23104d = executor;
            }

            public void c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (this.f23105e) {
                    return;
                }
                x0.g.i(C2779M.this.f23064w == i.REOPENING || C2779M.this.f23064w == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    C2779M.this.P0(true);
                } else {
                    C2779M.this.Q0(true);
                }
            }

            void b() {
                this.f23105e = true;
            }

            @Override
            public void run() {
                this.f23104d.execute(new Runnable() {
                    @Override
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        this.f23146d.c();
                    }
                });
            }
        }

        j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j7) {
            this.f23095a = executor;
            this.f23096b = scheduledExecutorService;
            this.f23099e = new a(j7);
        }

        private void b(CameraDevice cameraDevice, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            x0.g.j(C2779M.this.f23064w == i.OPENING || C2779M.this.f23064w == i.OPENED || C2779M.this.f23064w == i.CONFIGURED || C2779M.this.f23064w == i.REOPENING || C2779M.this.f23064w == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + C2779M.this.f23064w);
            if (i7 == 1 || i7 == 2 || i7 == 4) {
                C3043d0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C2779M.a0(i7)));
                c(i7);
                return;
            }
            C3043d0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C2779M.a0(i7) + " closing camera.");
            C2779M.this.I0(i.CLOSING, AbstractC3062q.a.a(i7 == 3 ? 5 : 6));
            C2779M.this.P(false);
        }

        private void c(int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int i8 = 1;
            x0.g.j(C2779M.this.f23032E != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i7 == 1) {
                i8 = 2;
            } else if (i7 != 2) {
                i8 = 3;
            }
            C2779M.this.I0(i.REOPENING, AbstractC3062q.a.a(i8));
            C2779M.this.P(false);
        }

        boolean a() {
            if (this.f23098d == null) {
                return false;
            }
            C2779M.this.U("Cancelling scheduled re-open: " + this.f23097c);
            this.f23097c.b();
            this.f23097c = null;
            this.f23098d.cancel(false);
            this.f23098d = null;
            return true;
        }

        void d() {
            this.f23099e.e();
        }

        void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            x0.g.i(this.f23097c == null);
            x0.g.i(this.f23098d == null);
            if (!this.f23099e.a()) {
                C3043d0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f23099e.d() + XjqcfAbdbc.yFfPzm);
                C2779M.this.J0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f23097c = new b(this.f23095a);
            C2779M.this.U("Attempting camera re-open in " + this.f23099e.c() + "ms: " + this.f23097c + " activeResuming = " + C2779M.this.f23054a0);
            this.f23098d = this.f23096b.schedule(this.f23097c, (long) this.f23099e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            int i7;
            C2779M c2779m = C2779M.this;
            return c2779m.f23054a0 && ((i7 = c2779m.f23032E) == 1 || i7 == 2);
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C2779M.this.U("CameraDevice.onClosed()");
            x0.g.j(C2779M.this.f23031D == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = C2779M.this.f23064w.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                x0.g.i(C2779M.this.e0());
                C2779M.this.S();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + C2779M.this.f23064w);
            }
            C2779M c2779m = C2779M.this;
            if (c2779m.f23032E == 0) {
                c2779m.Q0(false);
                return;
            }
            c2779m.U("Camera closed due to error: " + C2779M.a0(C2779M.this.f23032E));
            e();
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C2779M.this.U("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C2779M c2779m = C2779M.this;
            c2779m.f23031D = cameraDevice;
            c2779m.f23032E = i7;
            c2779m.f23061f0.b();
            int iOrdinal = C2779M.this.f23064w.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        C3043d0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C2779M.a0(i7), C2779M.this.f23064w.name()));
                        b(cameraDevice, i7);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + C2779M.this.f23064w);
                }
            }
            C3043d0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C2779M.a0(i7), C2779M.this.f23064w.name()));
            C2779M.this.P(false);
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C2779M.this.U("CameraDevice.onOpened()");
            C2779M c2779m = C2779M.this;
            c2779m.f23031D = cameraDevice;
            c2779m.f23032E = 0;
            d();
            int iOrdinal = C2779M.this.f23064w.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                x0.g.i(C2779M.this.e0());
                C2779M.this.f23031D.close();
                C2779M.this.f23031D = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C2779M.this.f23064w);
                }
                C2779M.this.H0(i.OPENED);
                C.Q q7 = C2779M.this.f23041N;
                String id = cameraDevice.getId();
                C2779M c2779m2 = C2779M.this;
                if (q7.j(id, c2779m2.f23040M.c(c2779m2.f23031D.getId()))) {
                    C2779M.this.A0();
                }
            }
        }
    }

    static abstract class k {
        k() {
        }

        static k a(String str, Class<?> cls, C.X0 x02, C.o1<?> o1Var, Size size, C.c1 c1Var, List<p1.b> list) {
            return new C2801d(str, cls, x02, o1Var, size, c1Var, list);
        }

        static k b(z.G0 g02, boolean z7) {
            return a(C2779M.c0(g02), g02.getClass(), z7 ? g02.w() : g02.u(), g02.j(), g02.f(), g02.e(), C2779M.Z(g02));
        }

        abstract List<p1.b> c();

        abstract C.X0 d();

        abstract C.c1 e();

        abstract Size f();

        abstract C.o1<?> g();

        abstract String h();

        abstract Class<?> i();
    }

    C2779M(Context context, t.O o2, String str, C2785T c2785t, A.a aVar, C.Q q7, Executor executor, Handler handler, C2815h1 c2815h1, long j7) throws z.r {
        C.B0<J.a> b02 = new C.B0<>();
        this.f23065y = b02;
        this.f23032E = 0;
        this.f23034G = new AtomicInteger(0);
        this.f23036I = new LinkedHashMap();
        this.f23037J = 0;
        this.f23044Q = false;
        this.f23045R = false;
        this.f23046S = true;
        this.f23050W = new HashSet();
        this.f23051X = C.E.a();
        this.f23052Y = new Object();
        this.f23054a0 = false;
        this.f23061f0 = new h(this, null);
        this.f23059e = o2;
        this.f23040M = aVar;
        this.f23041N = q7;
        ScheduledExecutorService scheduledExecutorServiceE = F.a.e(handler);
        this.f23063v = scheduledExecutorServiceE;
        Executor executorF = F.a.f(executor);
        this.f23062i = executorF;
        this.f23029B = new j(executorF, scheduledExecutorServiceE, j7);
        this.f23057d = new C.n1(str);
        b02.l(J.a.CLOSED);
        Q0 q02 = new Q0(q7);
        this.f23066z = q02;
        C2809f1 c2809f1 = new C2809f1(executorF);
        this.f23048U = c2809f1;
        this.f23055b0 = c2815h1;
        try {
            t.B bC = o2.c(str);
            this.f23056c0 = bC;
            C2852u c2852u = new C2852u(bC, scheduledExecutorServiceE, executorF, new g(), c2785t.o());
            this.f23028A = c2852u;
            this.f23030C = c2785t;
            c2785t.v(c2852u);
            c2785t.y(q02.a());
            this.f23058d0 = C2926g.a(bC);
            this.f23033F = v0();
            this.f23049V = new P1.b(executorF, scheduledExecutorServiceE, handler, c2809f1, c2785t.o(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f23042O = c2785t.o().a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f23043P = c2785t.o().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f23038K = eVar;
            f fVar = new f();
            this.f23039L = fVar;
            q7.g(this, executorF, fVar, eVar);
            o2.g(executorF, eVar);
            this.f23060e0 = new O1(context, str, o2, new a());
        } catch (C2894g e7) {
            throw R0.a(e7);
        }
    }

    private void B0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iOrdinal = this.f23064w.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            P0(false);
            return;
        }
        if (iOrdinal != 4) {
            U("open() ignored due to being in state: " + this.f23064w);
            return;
        }
        H0(i.REOPENING);
        if (e0() || this.f23045R || this.f23032E != 0) {
            return;
        }
        x0.g.j(this.f23031D != null, "Camera Device should be open if session close is not complete");
        H0(i.OPENED);
        A0();
    }

    private void E0() {
        if (this.f23047T != null) {
            this.f23057d.w(this.f23047T.f() + this.f23047T.hashCode());
            this.f23057d.x(this.f23047T.f() + this.f23047T.hashCode());
            this.f23047T.c();
            this.f23047T = null;
        }
    }

    private void G0(final String str, final C.X0 x02, final C.o1<?> o1Var, final C.c1 c1Var, final List<p1.b> list) {
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f23565d.t0(str, x02, o1Var, c1Var, list);
            }
        });
    }

    private Collection<k> L0(Collection<z.G0> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<z.G0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b(it.next(), this.f23046S));
        }
        return arrayList;
    }

    private void M() {
        E1 e12 = this.f23047T;
        if (e12 != null) {
            String strB0 = b0(e12);
            C.n1 n1Var = this.f23057d;
            C.X0 x0H = this.f23047T.h();
            C.o1<?> o1VarI = this.f23047T.i();
            p1.b bVar = p1.b.METERING_REPEATING;
            n1Var.v(strB0, x0H, o1VarI, null, Collections.singletonList(bVar));
            this.f23057d.u(strB0, this.f23047T.h(), this.f23047T.i(), null, Collections.singletonList(bVar));
        }
    }

    private void N() {
        C.X0 x0C = this.f23057d.g().c();
        C.V vK = x0C.k();
        int size = vK.i().size();
        int size2 = x0C.o().size();
        if (x0C.o().isEmpty()) {
            return;
        }
        if (vK.i().isEmpty()) {
            if (this.f23047T == null) {
                this.f23047T = new E1(this.f23030C.s(), this.f23055b0, new E1.c() {
                    @Override
                    public final void a() {
                        this.f22935a.g0();
                    }
                });
            }
            if (f0()) {
                M();
                return;
            } else {
                C3043d0.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            E0();
            return;
        }
        if (size >= 2) {
            E0();
            return;
        }
        if (this.f23047T != null && !f0()) {
            E0();
            return;
        }
        C3043d0.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    private void N0(Collection<k> collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Size sizeF;
        boolean zIsEmpty = this.f23057d.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f23057d.o(kVar.h())) {
                this.f23057d.v(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == z.o0.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        U("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f23028A.n0(true);
            this.f23028A.U();
        }
        N();
        S0();
        R0();
        F0(false);
        if (this.f23064w == i.OPENED) {
            A0();
        } else {
            B0();
        }
        if (rational != null) {
            this.f23028A.o0(rational);
        }
    }

    private boolean O(V.a aVar) {
        if (!aVar.m().isEmpty()) {
            C3043d0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<C.X0> it = this.f23057d.f().iterator();
        while (it.hasNext()) {
            C.V vK = it.next().k();
            List<AbstractC0324e0> listI = vK.i();
            if (!listI.isEmpty()) {
                if (vK.h() != 0) {
                    aVar.u(vK.h());
                }
                if (vK.l() != 0) {
                    aVar.x(vK.l());
                }
                Iterator<AbstractC0324e0> it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        C3043d0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void l0(Collection<k> collection) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (k kVar : collection) {
            if (this.f23057d.o(kVar.h())) {
                this.f23057d.t(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == z.o0.class) {
                    z7 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        U("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z7) {
            this.f23028A.o0(null);
        }
        N();
        if (this.f23057d.i().isEmpty()) {
            this.f23028A.q0(false);
        } else {
            S0();
        }
        if (this.f23057d.h().isEmpty()) {
            this.f23028A.B();
            F0(false);
            this.f23028A.n0(false);
            this.f23033F = v0();
            Q();
            return;
        }
        R0();
        F0(false);
        if (this.f23064w == i.OPENED) {
            A0();
        }
    }

    private void Q() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        U("Closing camera.");
        switch (this.f23064w.ordinal()) {
            case 3:
                x0.g.i(this.f23031D == null);
                H0(i.INITIALIZED);
                break;
            case 4:
            default:
                U("close() ignored due to being in state: " + this.f23064w);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.f23029B.a() && !this.f23061f0.c()) {
                    z = false;
                }
                this.f23061f0.a();
                H0(i.CLOSING);
                if (z) {
                    x0.g.i(e0());
                    S();
                    break;
                }
                break;
            case 8:
            case 9:
                H0(i.CLOSING);
                P(false);
                break;
        }
    }

    public com.google.common.util.concurrent.p<Void> R(CameraDevice cameraDevice) {
        final C2797b1 c2797b1 = new C2797b1(this.f23058d0);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final C0355u0 c0355u0 = new C0355u0(surface);
        c0355u0.k().c(new Runnable() {
            @Override
            public final void run() {
                C2779M.i0(surface, surfaceTexture);
            }
        }, F.a.a());
        X0.b bVar = new X0.b();
        bVar.h(c0355u0);
        bVar.z(1);
        U("Start configAndClose.");
        return G.d.a(G.n.I(c2797b1.a(bVar.o(), cameraDevice, this.f23049V.a()))).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return C2779M.j0(c2797b1, c0355u0, (Void) obj);
            }
        }, this.f23062i);
    }

    public void S() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x0.g.i(this.f23064w == i.RELEASING || this.f23064w == i.CLOSING);
        x0.g.i(this.f23036I.isEmpty());
        if (!this.f23044Q) {
            X();
            return;
        }
        if (this.f23045R) {
            U("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f23038K.b()) {
            this.f23044Q = false;
            X();
            U("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            U("Open camera to configAndClose");
            com.google.common.util.concurrent.p<Void> pVarY0 = y0();
            this.f23045R = true;
            pVarY0.c(new Runnable() {
                @Override
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    this.f22957d.k0();
                }
            }, this.f23062i);
        }
    }

    private void S0() {
        Iterator<C.o1<?>> it = this.f23057d.i().iterator();
        boolean zY = false;
        while (it.hasNext()) {
            zY |= it.next().y(false);
        }
        this.f23028A.q0(zY);
    }

    private CameraDevice.StateCallback T() {
        ArrayList arrayList = new ArrayList(this.f23057d.g().c().c());
        arrayList.add(this.f23048U.c());
        arrayList.add(this.f23029B);
        return N0.a(arrayList);
    }

    private void V(String str, Throwable th) {
        C3043d0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    private int Y() {
        synchronized (this.f23052Y) {
            try {
                return this.f23040M.b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static List<p1.b> Z(z.G0 g02) {
        if (g02.g() == null) {
            return null;
        }
        return Q.h.i0(g02);
    }

    static String a0(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : dHkZSUxHu.TCboHmFoaVLJkm : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String b0(E1 e12) {
        return e12.f() + e12.hashCode();
    }

    static String c0(z.G0 g02) {
        return g02.o() + g02.hashCode();
    }

    private boolean f0() {
        ArrayList arrayList = new ArrayList();
        int iY = Y();
        for (n1.b bVar : this.f23057d.j()) {
            if (bVar.c() == null || bVar.c().get(0) != p1.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    C3043d0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                C.X0 x0D = bVar.d();
                C.o1<?> o1VarF = bVar.f();
                for (AbstractC0324e0 abstractC0324e0 : x0D.o()) {
                    arrayList.add(AbstractC0315a.a(this.f23060e0.M(iY, o1VarF.t(), abstractC0324e0.h()), o1VarF.t(), abstractC0324e0.h(), bVar.e().b(), bVar.c(), bVar.e().d(), o1VarF.H(null)));
                }
            }
        }
        x0.g.g(this.f23047T);
        HashMap map = new HashMap();
        map.put(this.f23047T.i(), Collections.singletonList(this.f23047T.e()));
        try {
            this.f23060e0.A(iY, arrayList, map, false, false);
            U("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e7) {
            V("Surface combination with metering repeating  not supported!", e7);
            return false;
        }
    }

    public void g0() {
        if (d0()) {
            G0(b0(this.f23047T), this.f23047T.h(), this.f23047T.i(), null, Collections.singletonList(p1.b.METERING_REPEATING));
        }
    }

    public void h0(List list) {
        try {
            N0(list);
        } finally {
            this.f23028A.B();
        }
    }

    public static void i0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static com.google.common.util.concurrent.p j0(C2797b1 c2797b1, AbstractC0324e0 abstractC0324e0, Void r22) throws Exception {
        c2797b1.close();
        abstractC0324e0.d();
        return c2797b1.d(false);
    }

    public void k0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f23045R = false;
        this.f23044Q = false;
        U("OpenCameraConfigAndClose is done, state: " + this.f23064w);
        int iOrdinal = this.f23064w.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            x0.g.i(e0());
            X();
            return;
        }
        if (iOrdinal != 6) {
            U("OpenCameraConfigAndClose finished while in state: " + this.f23064w);
            return;
        }
        if (this.f23032E == 0) {
            Q0(false);
            return;
        }
        U("OpenCameraConfigAndClose in error: " + a0(this.f23032E));
        this.f23029B.e();
    }

    public void m0(c.a aVar) {
        E1 e12 = this.f23047T;
        if (e12 == null) {
            aVar.c(Boolean.FALSE);
        } else {
            aVar.c(Boolean.valueOf(this.f23057d.o(b0(e12))));
        }
    }

    public Object n0(final c.a aVar) throws Exception {
        try {
            this.f23062i.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f22952d.m0(aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public void o0(String str, C.X0 x02, C.o1 o1Var, C.c1 c1Var, List list) {
        U("Use case " + str + " ACTIVE");
        this.f23057d.u(str, x02, o1Var, c1Var, list);
        this.f23057d.y(str, x02, o1Var, c1Var, list);
        R0();
    }

    public void p0(String str) {
        U("Use case " + str + " INACTIVE");
        this.f23057d.x(str);
        R0();
    }

    public void q0(String str, C.X0 x02, C.o1 o1Var, C.c1 c1Var, List list) {
        U("Use case " + str + " UPDATED");
        this.f23057d.y(str, x02, o1Var, c1Var, list);
        R0();
    }

    public Object r0(c.a aVar) throws Exception {
        try {
            ArrayList arrayList = new ArrayList(this.f23057d.g().c().c());
            arrayList.add(this.f23048U.c());
            arrayList.add(new b(aVar));
            this.f23059e.f(this.f23030C.d(), this.f23062i, N0.a(arrayList));
            return "configAndCloseTask";
        } catch (SecurityException | C2894g e7) {
            V("Unable to open camera for configAndClose: " + e7.getMessage(), e7);
            aVar.f(e7);
            return "configAndCloseTask";
        }
    }

    public static void s0(X0.d dVar, C.X0 x02) {
        dVar.a(x02, X0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public void t0(String str, C.X0 x02, C.o1 o1Var, C.c1 c1Var, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        U("Use case " + str + " RESET");
        this.f23057d.y(str, x02, o1Var, c1Var, list);
        N();
        F0(false);
        R0();
        if (this.f23064w == i.OPENED) {
            A0();
        }
    }

    public void u0(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f23054a0 = z7;
        if (z7 && this.f23064w == i.PENDING_OPEN) {
            P0(false);
        }
    }

    private InterfaceC2800c1 v0() {
        synchronized (this.f23052Y) {
            try {
                if (this.f23053Z == null) {
                    return new C2797b1(this.f23058d0, this.f23030C.o());
                }
                return new K1(this.f23053Z, this.f23030C, this.f23058d0, this.f23062i, this.f23063v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void w0(List<z.G0> list) {
        for (z.G0 g02 : list) {
            String strC0 = c0(g02);
            if (!this.f23050W.contains(strC0)) {
                this.f23050W.add(strC0);
                g02.M();
                g02.K();
            }
        }
    }

    private void x0(List<z.G0> list) {
        for (z.G0 g02 : list) {
            String strC0 = c0(g02);
            if (this.f23050W.contains(strC0)) {
                g02.N();
                this.f23050W.remove(strC0);
            }
        }
    }

    private com.google.common.util.concurrent.p<Void> y0() {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f22933a.r0(aVar);
            }
        });
    }

    private void z0(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z7) {
            this.f23029B.d();
        }
        this.f23029B.a();
        this.f23061f0.a();
        U("Opening camera.");
        H0(i.OPENING);
        try {
            this.f23059e.f(this.f23030C.d(), this.f23062i, T());
        } catch (SecurityException e7) {
            U("Unable to open camera due to " + e7.getMessage());
            H0(i.REOPENING);
            this.f23029B.e();
        } catch (C2894g e8) {
            U("Unable to open camera due to " + e8.getMessage());
            if (e8.d() != 10001) {
                this.f23061f0.d();
            } else {
                I0(i.INITIALIZED, AbstractC3062q.a.b(7, e8));
            }
        }
    }

    void A0() {
        x0.g.i(this.f23064w == i.OPENED);
        X0.h hVarG = this.f23057d.g();
        if (!hVarG.f()) {
            U("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f23041N.j(this.f23031D.getId(), this.f23040M.c(this.f23031D.getId()))) {
            U("Unable to create capture session in camera operating mode = " + this.f23040M.b());
            return;
        }
        HashMap map = new HashMap();
        M1.m(this.f23057d.h(), this.f23057d.i(), map);
        this.f23033F.i(map);
        InterfaceC2800c1 interfaceC2800c1 = this.f23033F;
        G.n.j(interfaceC2800c1.a(hVarG.c(), (CameraDevice) x0.g.g(this.f23031D), this.f23049V.a()), new d(interfaceC2800c1), this.f23062i);
    }

    void C0(final C.X0 x02) {
        ScheduledExecutorService scheduledExecutorServiceD = F.a.d();
        final X0.d dVarD = x02.d();
        if (dVarD != null) {
            V("Posting surface closed", new Throwable());
            scheduledExecutorServiceD.execute(new Runnable() {
                @Override
                public final void run() {
                    C2779M.s0(dVarD, x02);
                }
            });
        }
    }

    com.google.common.util.concurrent.p<Void> D0(InterfaceC2800c1 interfaceC2800c1, boolean z7) {
        interfaceC2800c1.close();
        com.google.common.util.concurrent.p<Void> pVarD = interfaceC2800c1.d(z7);
        U("Releasing session in state " + this.f23064w.name());
        this.f23036I.put(interfaceC2800c1, pVarD);
        G.n.j(pVarD, new c(interfaceC2800c1), F.a.a());
        return pVarD;
    }

    void F0(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x0.g.i(this.f23033F != null);
        U("Resetting Capture Session");
        InterfaceC2800c1 interfaceC2800c1 = this.f23033F;
        C.X0 x0G = interfaceC2800c1.g();
        List<C.V> listE = interfaceC2800c1.e();
        InterfaceC2800c1 interfaceC2800c1V0 = v0();
        this.f23033F = interfaceC2800c1V0;
        interfaceC2800c1V0.b(x0G);
        this.f23033F.f(listE);
        if (this.f23064w.ordinal() != 8) {
            U("Skipping Capture Session state check due to current camera state: " + this.f23064w + " and previous session status: " + interfaceC2800c1.h());
        } else if (this.f23042O && interfaceC2800c1.h()) {
            U("Close camera before creating new session");
            H0(i.REOPENING_QUIRK);
        }
        if (this.f23043P && interfaceC2800c1.h()) {
            U("ConfigAndClose is required when close the camera.");
            this.f23044Q = true;
        }
        D0(interfaceC2800c1, z7);
    }

    void H0(i iVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        I0(iVar, null);
    }

    void I0(i iVar, AbstractC3062q.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        J0(iVar, aVar, true);
    }

    void J0(i iVar, AbstractC3062q.a aVar, boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        J.a aVar2;
        U("Transitioning camera internal state: " + this.f23064w + " --> " + iVar);
        M0(iVar, aVar);
        this.f23064w = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = J.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = J.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = J.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = J.a.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = J.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = J.a.OPENING;
                break;
            case OPENED:
                aVar2 = J.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = J.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f23041N.e(this, aVar2, z7);
        this.f23065y.l(aVar2);
        this.f23066z.c(aVar2, aVar);
    }

    void K0(List<C.V> list) {
        ArrayList arrayList = new ArrayList();
        for (C.V v7 : list) {
            V.a aVarK = V.a.k(v7);
            if (v7.k() == 5 && v7.d() != null) {
                aVarK.p(v7.d());
            }
            if (!v7.i().isEmpty() || !v7.n() || O(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        U("Issue capture request");
        this.f23033F.f(arrayList);
    }

    void M0(i iVar, AbstractC3062q.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (h1.a.d()) {
            h1.a.f("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f23037J++;
            }
            if (this.f23037J > 0) {
                h1.a.f("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    void P(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x0.g.j(this.f23064w == i.CLOSING || this.f23064w == i.RELEASING || (this.f23064w == i.REOPENING && this.f23032E != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f23064w + " (error: " + a0(this.f23032E) + ")");
        F0(z7);
        this.f23033F.c();
    }

    void P0(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        U("Attempting to force open the camera.");
        if (this.f23041N.i(this)) {
            z0(z7);
        } else {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
        }
    }

    void Q0(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        U("Attempting to open the camera.");
        if (this.f23038K.b() && this.f23041N.i(this)) {
            z0(z7);
        } else {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
        }
    }

    void R0() {
        X0.h hVarE = this.f23057d.e();
        if (!hVarE.f()) {
            this.f23028A.m0();
            this.f23033F.b(this.f23028A.K());
            return;
        }
        this.f23028A.p0(hVarE.c().p());
        hVarE.b(this.f23028A.K());
        this.f23033F.b(hVarE.c());
    }

    void U(String str) {
        V(str, null);
    }

    C.X0 W(AbstractC0324e0 abstractC0324e0) {
        for (C.X0 x02 : this.f23057d.h()) {
            if (x02.o().contains(abstractC0324e0)) {
                return x02;
            }
        }
        return null;
    }

    void X() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x0.g.i(this.f23064w == i.RELEASING || this.f23064w == i.CLOSING);
        x0.g.i(this.f23036I.isEmpty());
        this.f23031D = null;
        if (this.f23064w == i.CLOSING) {
            H0(i.INITIALIZED);
            return;
        }
        this.f23059e.h(this.f23038K);
        H0(i.RELEASED);
        c.a<Void> aVar = this.f23035H;
        if (aVar != null) {
            aVar.c(null);
            this.f23035H = null;
        }
    }

    @Override
    public C.H0<J.a> b() {
        return this.f23065y;
    }

    @Override
    public void d(z.G0 g02) {
        x0.g.g(g02);
        final String strC0 = c0(g02);
        final C.X0 x0W = this.f23046S ? g02.w() : g02.u();
        final C.o1<?> o1VarJ = g02.j();
        final C.c1 c1VarE = g02.e();
        final List<p1.b> listZ = Z(g02);
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() {
                this.f22973d.q0(strC0, x0W, o1VarJ, c1VarE, listZ);
            }
        });
    }

    boolean d0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23527a.n0(aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e7);
        }
    }

    @Override
    public void e(z.G0 g02) {
        x0.g.g(g02);
        final String strC0 = c0(g02);
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() {
                this.f22986d.p0(strC0);
            }
        });
    }

    boolean e0() {
        return this.f23036I.isEmpty();
    }

    @Override
    public void f(C.B b2) {
        if (b2 == null) {
            b2 = C.E.a();
        }
        C.Z0 z0P = b2.P(null);
        this.f23051X = b2;
        synchronized (this.f23052Y) {
            this.f23053Z = z0P;
        }
    }

    @Override
    public C.F h() {
        return this.f23028A;
    }

    @Override
    public C.B i() {
        return this.f23051X;
    }

    @Override
    public void j(z.G0 g02) {
        x0.g.g(g02);
        final String strC0 = c0(g02);
        final C.X0 x0W = this.f23046S ? g02.w() : g02.u();
        final C.o1<?> o1VarJ = g02.j();
        final C.c1 c1VarE = g02.e();
        final List<p1.b> listZ = Z(g02);
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() {
                this.f22990d.o0(strC0, x0W, o1VarJ, c1VarE, listZ);
            }
        });
    }

    @Override
    public void k(final boolean z7) {
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f22928d.u0(z7);
            }
        });
    }

    @Override
    public void l(Collection<z.G0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f23028A.U();
        w0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(L0(arrayList));
        try {
            this.f23062i.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f22967d.h0(arrayList2);
                }
            });
        } catch (RejectedExecutionException e7) {
            V("Unable to attach use cases.", e7);
            this.f23028A.B();
        }
    }

    @Override
    public void m(z.G0 g02) {
        x0.g.g(g02);
        G0(c0(g02), this.f23046S ? g02.w() : g02.u(), g02.j(), g02.e(), Z(g02));
    }

    @Override
    public void n(Collection<z.G0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(L0(arrayList));
        x0(new ArrayList(arrayList));
        this.f23062i.execute(new Runnable() {
            @Override
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                this.f23532d.l0(arrayList2);
            }
        });
    }

    @Override
    public void p(boolean z7) {
        this.f23046S = z7;
    }

    @Override
    public C.I q() {
        return this.f23030C;
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f23030C.d());
    }

    class h {

        private a f23079a;

        class a {

            private final ScheduledFuture<?> f23081a;

            private final AtomicBoolean f23082b = new AtomicBoolean(false);

            a() {
                this.f23081a = C2779M.this.f23063v.schedule(new Runnable() {
                    @Override
                    public final void run() {
                        this.f23113d.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public void d() {
                if (this.f23082b.getAndSet(true)) {
                    return;
                }
                C2779M.this.f23062i.execute(new Runnable() {
                    @Override
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        this.f23139d.e();
                    }
                });
            }

            public void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                if (C2779M.this.f23064w == i.OPENING) {
                    C2779M.this.U("Camera onError timeout, reopen it.");
                    C2779M.this.H0(i.REOPENING);
                    C2779M.this.f23029B.e();
                } else {
                    C2779M.this.U("Camera skip reopen at state: " + C2779M.this.f23064w);
                }
            }

            public void c() {
                this.f23082b.set(true);
                this.f23081a.cancel(true);
            }

            public boolean f() {
                return this.f23082b.get();
            }
        }

        private h() {
            this.f23079a = null;
        }

        public void a() {
            a aVar = this.f23079a;
            if (aVar != null) {
                aVar.c();
            }
            this.f23079a = null;
        }

        public void b() {
            C2779M.this.U("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f23079a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (C2779M.this.f23064w != i.OPENING) {
                C2779M.this.U("Don't need the onError timeout handler.");
                return;
            }
            C2779M.this.U("Camera waiting for onError.");
            a();
            this.f23079a = new a();
        }

        h(C2779M c2779m, a aVar) {
            this();
        }
    }
}
