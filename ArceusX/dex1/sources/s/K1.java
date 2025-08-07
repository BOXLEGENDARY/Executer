package s;

import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.C0330h0;
import C.InterfaceC0364z;
import C.X;
import C.X0;
import C.Z0;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n.InterfaceC2621a;
import r.C2739a;
import s.P1;
import u.C2926g;
import y.j;
import z.C3043d0;

final class K1 implements InterfaceC2800c1 {

    private static List<AbstractC0324e0> f22997p = new ArrayList();

    private static int f22998q = 0;

    private final C.Z0 f22999a;

    private final C2785T f23000b;

    final Executor f23001c;

    private final ScheduledExecutorService f23002d;

    private final C2797b1 f23003e;

    private C.X0 f23005g;

    private C2775I0 f23006h;

    private C.X0 f23007i;

    private c f23008j;

    private final d f23010l;

    private int f23013o;

    private List<AbstractC0324e0> f23004f = new ArrayList();

    private volatile List<C.V> f23009k = null;

    private y.j f23011m = new j.a().b();

    private y.j f23012n = new j.a().b();

    class a implements G.c<Void> {
        a() {
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            C3043d0.d("ProcessingCaptureSession", "open session failed ", th);
            K1.this.close();
            K1.this.d(false);
        }
    }

    private static class b implements Z0.a {

        private List<AbstractC0345p> f23015a;

        private final int f23016b;

        private InterfaceC0364z f23017c;

        b(int i7, List list, a aVar) {
            this(i7, list);
        }

        private b(int i7, List<AbstractC0345p> list) {
            this.f23017c = null;
            this.f23016b = i7;
            this.f23015a = list;
        }
    }

    private enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        f23020i,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    private static class d implements Z0.a {
        d() {
        }
    }

    K1(C.Z0 z02, C2785T c2785t, C2926g c2926g, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f23013o = 0;
        this.f23003e = new C2797b1(c2926g, androidx.camera.camera2.internal.compat.quirk.b.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f22999a = z02;
        this.f23000b = c2785t;
        this.f23001c = executor;
        this.f23002d = scheduledExecutorService;
        this.f23008j = c.UNINITIALIZED;
        this.f23010l = new d();
        int i7 = f22998q;
        f22998q = i7 + 1;
        this.f23013o = i7;
        C3043d0.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f23013o + ")");
    }

    public com.google.common.util.concurrent.p A(C.X0 x02, CameraDevice cameraDevice, P1.a aVar, List list) throws Exception {
        C.K0 k0A;
        C3043d0.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f23013o + ")");
        if (this.f23008j == c.DE_INITIALIZED) {
            return G.n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final AbstractC0324e0 abstractC0324e0F = null;
        if (list.contains(null)) {
            return G.n.n(new AbstractC0324e0.a("Surface closed", x02.o().get(list.indexOf(null))));
        }
        C.K0 k0A2 = null;
        C.K0 k0A3 = null;
        C.K0 k0A4 = null;
        for (int i7 = 0; i7 < x02.o().size(); i7++) {
            AbstractC0324e0 abstractC0324e0 = x02.o().get(i7);
            if (t(abstractC0324e0) || u(abstractC0324e0)) {
                k0A2 = C.K0.a(abstractC0324e0.j().get(), abstractC0324e0.h(), abstractC0324e0.i());
            } else if (s(abstractC0324e0)) {
                k0A3 = C.K0.a(abstractC0324e0.j().get(), abstractC0324e0.h(), abstractC0324e0.i());
            } else if (r(abstractC0324e0)) {
                k0A4 = C.K0.a(abstractC0324e0.j().get(), abstractC0324e0.h(), abstractC0324e0.i());
            }
        }
        if (x02.i() != null) {
            abstractC0324e0F = x02.i().f();
            k0A = C.K0.a(abstractC0324e0F.j().get(), abstractC0324e0F.h(), abstractC0324e0F.i());
        } else {
            k0A = null;
        }
        this.f23008j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(this.f23004f);
            if (abstractC0324e0F != null) {
                arrayList.add(abstractC0324e0F);
            }
            C0330h0.d(arrayList);
            C3043d0.l("ProcessingCaptureSession", "== initSession (id=" + this.f23013o + ")");
            try {
                C.X0 x0G = this.f22999a.g(this.f23000b, C.L0.a(k0A2, k0A3, k0A4, k0A));
                this.f23007i = x0G;
                x0G.o().get(0).k().c(new Runnable() {
                    @Override
                    public final void run() {
                        this.f22984d.y(abstractC0324e0F);
                    }
                }, F.a.a());
                for (final AbstractC0324e0 abstractC0324e02 : this.f23007i.o()) {
                    f22997p.add(abstractC0324e02);
                    abstractC0324e02.k().c(new Runnable() {
                        @Override
                        public final void run() {
                            K1.z(abstractC0324e02);
                        }
                    }, this.f23001c);
                }
                X0.h hVar = new X0.h();
                hVar.b(x02);
                hVar.d();
                hVar.b(this.f23007i);
                x0.g.b(hVar.f(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.p<Void> pVarA = this.f23003e.a(hVar.c(), (CameraDevice) x0.g.g(cameraDevice), aVar);
                G.n.j(pVarA, new a(), this.f23001c);
                return pVarA;
            } catch (Throwable th) {
                C3043d0.d("ProcessingCaptureSession", "initSession failed", th);
                C0330h0.c(this.f23004f);
                if (abstractC0324e0F != null) {
                    abstractC0324e0F.e();
                }
                throw th;
            }
        } catch (AbstractC0324e0.a e7) {
            return G.n.n(e7);
        }
    }

    public Void B(Void r1) {
        D(this.f23003e);
        return null;
    }

    public void C() {
        C3043d0.a("ProcessingCaptureSession", "== deInitSession (id=" + this.f23013o + ")");
        this.f22999a.f();
    }

    private void E(y.j jVar, y.j jVar2) {
        C2739a.C0218a c0218a = new C2739a.C0218a();
        c0218a.b(jVar);
        c0218a.b(jVar2);
        this.f22999a.k(c0218a.a());
    }

    private static void o(List<C.V> list) {
        for (C.V v7 : list) {
            Iterator<AbstractC0345p> it = v7.c().iterator();
            while (it.hasNext()) {
                it.next().a(v7.f());
            }
        }
    }

    private static List<C.a1> p(List<AbstractC0324e0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0324e0 abstractC0324e0 : list) {
            x0.g.b(abstractC0324e0 instanceof C.a1, "Surface must be SessionProcessorSurface");
            arrayList.add((C.a1) abstractC0324e0);
        }
        return arrayList;
    }

    private static boolean q(C.V v7) {
        for (AbstractC0324e0 abstractC0324e0 : v7.i()) {
            if (t(abstractC0324e0) || u(abstractC0324e0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean r(AbstractC0324e0 abstractC0324e0) {
        return Objects.equals(abstractC0324e0.g(), androidx.camera.core.f.class);
    }

    private static boolean s(AbstractC0324e0 abstractC0324e0) {
        return Objects.equals(abstractC0324e0.g(), z.T.class);
    }

    private static boolean t(AbstractC0324e0 abstractC0324e0) {
        return Objects.equals(abstractC0324e0.g(), z.o0.class);
    }

    private static boolean u(AbstractC0324e0 abstractC0324e0) {
        return Objects.equals(abstractC0324e0.g(), Q.h.class);
    }

    private boolean v(int i7) {
        return i7 == 2 || i7 == 4;
    }

    public void y(AbstractC0324e0 abstractC0324e0) {
        C0330h0.c(this.f23004f);
        if (abstractC0324e0 != null) {
            abstractC0324e0.e();
        }
    }

    public static void z(AbstractC0324e0 abstractC0324e0) {
        f22997p.remove(abstractC0324e0);
    }

    void D(C2797b1 c2797b1) {
        if (this.f23008j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f23006h = new C2775I0(c2797b1, p(this.f23007i.o()));
        C3043d0.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f23013o + ")");
        this.f22999a.e(this.f23006h);
        this.f23008j = c.f23020i;
        C.X0 x02 = this.f23005g;
        if (x02 != null) {
            b(x02);
        }
        if (this.f23009k != null) {
            f(this.f23009k);
            this.f23009k = null;
        }
    }

    @Override
    public com.google.common.util.concurrent.p<Void> a(final C.X0 x02, final CameraDevice cameraDevice, final P1.a aVar) {
        x0.g.b(this.f23008j == c.UNINITIALIZED, "Invalid state state:" + this.f23008j);
        x0.g.b(x02.o().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C3043d0.a("ProcessingCaptureSession", "open (id=" + this.f23013o + ")");
        List<AbstractC0324e0> listO = x02.o();
        this.f23004f = listO;
        return G.d.a(C0330h0.g(listO, false, 5000L, this.f23001c, this.f23002d)).g(new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return this.f22963a.A(x02, cameraDevice, aVar, (List) obj);
            }
        }, this.f23001c).e(new InterfaceC2621a() {
            @Override
            public final Object apply(Object obj) {
                return this.f22972a.B((Void) obj);
            }
        }, this.f23001c);
    }

    @Override
    public void b(C.X0 x02) {
        C3043d0.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f23013o + ")");
        this.f23005g = x02;
        if (x02 == null) {
            return;
        }
        C2775I0 c2775i0 = this.f23006h;
        if (c2775i0 != null) {
            c2775i0.b(x02);
        }
        if (this.f23008j == c.f23020i) {
            y.j jVarB = j.a.e(x02.f()).b();
            this.f23011m = jVarB;
            E(jVarB, this.f23012n);
            if (q(x02.k())) {
                this.f22999a.j(x02.k().j(), this.f23010l);
            } else {
                this.f22999a.b();
            }
        }
    }

    @Override
    public void c() {
        C3043d0.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f23013o + ")");
        if (this.f23009k != null) {
            for (C.V v7 : this.f23009k) {
                Iterator<AbstractC0345p> it = v7.c().iterator();
                while (it.hasNext()) {
                    it.next().a(v7.f());
                }
            }
            this.f23009k = null;
        }
    }

    @Override
    public void close() {
        C3043d0.a("ProcessingCaptureSession", "close (id=" + this.f23013o + ") state=" + this.f23008j);
        if (this.f23008j == c.f23020i) {
            C3043d0.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f23013o + ")");
            this.f22999a.d();
            C2775I0 c2775i0 = this.f23006h;
            if (c2775i0 != null) {
                c2775i0.a();
            }
            this.f23008j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f23003e.close();
    }

    @Override
    public com.google.common.util.concurrent.p<Void> d(boolean z7) {
        C3043d0.a("ProcessingCaptureSession", "release (id=" + this.f23013o + ") mProcessorState=" + this.f23008j);
        com.google.common.util.concurrent.p<Void> pVarD = this.f23003e.d(z7);
        int iOrdinal = this.f23008j.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            pVarD.c(new Runnable() {
                @Override
                public final void run() {
                    this.f22956d.C();
                }
            }, F.a.a());
        }
        this.f23008j = c.DE_INITIALIZED;
        return pVarD;
    }

    @Override
    public List<C.V> e() {
        return this.f23009k != null ? this.f23009k : Collections.emptyList();
    }

    @Override
    public void f(List<C.V> list) {
        if (list.isEmpty()) {
            return;
        }
        C3043d0.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f23013o + ") + state =" + this.f23008j);
        int iOrdinal = this.f23008j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f23009k == null) {
                this.f23009k = list;
                return;
            } else {
                o(list);
                C3043d0.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal == 2) {
            for (C.V v7 : list) {
                if (v(v7.k())) {
                    w(v7);
                } else {
                    x(v7);
                }
            }
            return;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            C3043d0.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f23008j);
            o(list);
        }
    }

    @Override
    public C.X0 g() {
        return this.f23005g;
    }

    @Override
    public boolean h() {
        return this.f23003e.h();
    }

    @Override
    public void i(Map<AbstractC0324e0, Long> map) {
    }

    void w(C.V v7) {
        j.a aVarE = j.a.e(v7.g());
        C.X xG = v7.g();
        X.a<Integer> aVar = C.V.f441i;
        if (xG.b(aVar)) {
            aVarE.g(CaptureRequest.JPEG_ORIENTATION, (Integer) v7.g().f(aVar));
        }
        C.X xG2 = v7.g();
        X.a<Integer> aVar2 = C.V.f442j;
        if (xG2.b(aVar2)) {
            aVarE.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) v7.g().f(aVar2)).byteValue()));
        }
        y.j jVarB = aVarE.b();
        this.f23012n = jVarB;
        E(this.f23011m, jVarB);
        this.f22999a.i(v7.m(), v7.j(), new b(v7.f(), v7.c(), null));
    }

    void x(C.V v7) {
        C3043d0.a("ProcessingCaptureSession", "issueTriggerRequest");
        y.j jVarB = j.a.e(v7.g()).b();
        Iterator<X.a<?>> it = jVarB.c().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f22999a.c(jVarB, v7.j(), new b(v7.f(), v7.c(), null));
                return;
            }
        }
        o(Arrays.asList(v7));
    }
}
