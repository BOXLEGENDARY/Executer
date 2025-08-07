package s;

import C.AbstractC0324e0;
import C.C0330h0;
import S5.Cg.XjqcfAbdbc;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s.P1;
import t.C2895h;
import z.C3043d0;

class V1 extends P1.c implements P1, P1.a {

    final C2809f1 f23181b;

    final Handler f23182c;

    final Executor f23183d;

    private final ScheduledExecutorService f23184e;

    P1.c f23185f;

    C2895h f23186g;

    com.google.common.util.concurrent.p<Void> f23187h;

    c.a<Void> f23188i;

    private com.google.common.util.concurrent.p<List<Surface>> f23189j;

    final Object f23180a = new Object();

    private List<AbstractC0324e0> f23190k = null;

    private boolean f23191l = false;

    private boolean f23192m = false;

    private boolean f23193n = false;

    class a implements G.c<Void> {
        a() {
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            V1.this.d();
            V1 v1 = V1.this;
            v1.f23181b.i(v1);
        }
    }

    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v1 = V1.this;
            v1.o(v1);
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v1 = V1.this;
            v1.p(v1);
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v1 = V1.this;
            v1.q(v1);
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                V1.this.B(cameraCaptureSession);
                V1 v1 = V1.this;
                v1.r(v1);
                synchronized (V1.this.f23180a) {
                    x0.g.h(V1.this.f23188i, "OpenCaptureSession completer should not null");
                    V1 v12 = V1.this;
                    aVar = v12.f23188i;
                    v12.f23188i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th) {
                synchronized (V1.this.f23180a) {
                    x0.g.h(V1.this.f23188i, "OpenCaptureSession completer should not null");
                    V1 v13 = V1.this;
                    c.a<Void> aVar2 = v13.f23188i;
                    v13.f23188i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th;
                }
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                V1.this.B(cameraCaptureSession);
                V1 v1 = V1.this;
                v1.s(v1);
                synchronized (V1.this.f23180a) {
                    x0.g.h(V1.this.f23188i, "OpenCaptureSession completer should not null");
                    V1 v12 = V1.this;
                    aVar = v12.f23188i;
                    v12.f23188i = null;
                }
                aVar.c(null);
            } catch (Throwable th) {
                synchronized (V1.this.f23180a) {
                    x0.g.h(V1.this.f23188i, "OpenCaptureSession completer should not null");
                    V1 v13 = V1.this;
                    c.a<Void> aVar2 = v13.f23188i;
                    v13.f23188i = null;
                    aVar2.c(null);
                    throw th;
                }
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            V1.this.B(cameraCaptureSession);
            V1 v1 = V1.this;
            v1.t(v1);
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            V1.this.B(cameraCaptureSession);
            V1 v1 = V1.this;
            v1.v(v1, surface);
        }
    }

    V1(C2809f1 c2809f1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f23181b = c2809f1;
        this.f23182c = handler;
        this.f23183d = executor;
        this.f23184e = scheduledExecutorService;
    }

    public void E() {
        u(this);
    }

    public void F(P1 p1) {
        this.f23181b.g(this);
        u(p1);
        if (this.f23186g != null) {
            Objects.requireNonNull(this.f23185f);
            this.f23185f.q(p1);
            return;
        }
        C3043d0.l("SyncCaptureSessionBase", "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public void G(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        this.f23185f.u(p1);
    }

    public Object H(List list, t.C c2, u.q qVar, c.a aVar) throws Exception {
        String str;
        synchronized (this.f23180a) {
            C(list);
            x0.g.j(this.f23188i == null, "The openCaptureSessionCompleter can only set once!");
            this.f23188i = aVar;
            c2.a(qVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public com.google.common.util.concurrent.p I(List list, List list2) throws Exception {
        C3043d0.a("SyncCaptureSessionBase", XjqcfAbdbc.ivEosaFvjt + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? G.n.n(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? G.n.n(new AbstractC0324e0.a("Surface closed", (AbstractC0324e0) list.get(list2.indexOf(null)))) : G.n.p(list2);
    }

    void B(CameraCaptureSession cameraCaptureSession) {
        if (this.f23186g == null) {
            this.f23186g = C2895h.d(cameraCaptureSession, this.f23182c);
        }
    }

    void C(List<AbstractC0324e0> list) throws AbstractC0324e0.a {
        synchronized (this.f23180a) {
            J();
            C0330h0.d(list);
            this.f23190k = list;
        }
    }

    boolean D() {
        boolean z7;
        synchronized (this.f23180a) {
            z7 = this.f23187h != null;
        }
        return z7;
    }

    void J() {
        synchronized (this.f23180a) {
            try {
                List<AbstractC0324e0> list = this.f23190k;
                if (list != null) {
                    C0330h0.c(list);
                    this.f23190k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Executor a() {
        return this.f23183d;
    }

    @Override
    public void b() throws CameraAccessException {
        x0.g.h(this.f23186g, "Need to call openCaptureSession before using this API.");
        this.f23186g.c().stopRepeating();
    }

    @Override
    public P1.c c() {
        return this;
    }

    @Override
    public void close() {
        x0.g.h(this.f23186g, "Need to call openCaptureSession before using this API.");
        this.f23181b.h(this);
        this.f23186g.c().close();
        a().execute(new Runnable() {
            @Override
            public final void run() {
                this.f23173d.E();
            }
        });
    }

    @Override
    public void d() {
        J();
    }

    @Override
    public com.google.common.util.concurrent.p<Void> e(CameraDevice cameraDevice, final u.q qVar, final List<AbstractC0324e0> list) {
        synchronized (this.f23180a) {
            try {
                if (this.f23192m) {
                    return G.n.n(new CancellationException("Opener is disabled"));
                }
                this.f23181b.k(this);
                final t.C cB = t.C.b(cameraDevice, this.f23182c);
                com.google.common.util.concurrent.p<Void> pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                    @Override
                    public final Object a(c.a aVar) {
                        return this.f23175a.H(list, cB, qVar, aVar);
                    }
                });
                this.f23187h = pVarA;
                G.n.j(pVarA, new a(), F.a.a());
                return G.n.B(this.f23187h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        x0.g.h(this.f23186g, "Need to call openCaptureSession before using this API.");
        return this.f23186g.a(list, a(), captureCallback);
    }

    @Override
    public u.q g(int i7, List<u.k> list, P1.c cVar) {
        this.f23185f = cVar;
        return new u.q(i7, list, a(), new b());
    }

    @Override
    public C2895h h() {
        x0.g.g(this.f23186g);
        return this.f23186g;
    }

    @Override
    public void i(int i7) {
    }

    @Override
    public void j() throws CameraAccessException {
        x0.g.h(this.f23186g, "Need to call openCaptureSession before using this API.");
        this.f23186g.c().abortCaptures();
    }

    @Override
    public CameraDevice k() {
        x0.g.g(this.f23186g);
        return this.f23186g.c().getDevice();
    }

    @Override
    public int l(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        x0.g.h(this.f23186g, "Need to call openCaptureSession before using this API.");
        return this.f23186g.b(captureRequest, a(), captureCallback);
    }

    @Override
    public com.google.common.util.concurrent.p<List<Surface>> m(final List<AbstractC0324e0> list, long j7) {
        synchronized (this.f23180a) {
            try {
                if (this.f23192m) {
                    return G.n.n(new CancellationException("Opener is disabled"));
                }
                G.d dVarG = G.d.a(C0330h0.g(list, false, j7, a(), this.f23184e)).g(new G.a() {
                    @Override
                    public final com.google.common.util.concurrent.p apply(Object obj) {
                        return this.f23152a.I(list, (List) obj);
                    }
                }, a());
                this.f23189j = dVarG;
                return G.n.B(dVarG);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void o(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        this.f23185f.o(p1);
    }

    @Override
    public void p(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        this.f23185f.p(p1);
    }

    @Override
    public void q(final P1 p1) {
        com.google.common.util.concurrent.p<Void> pVar;
        synchronized (this.f23180a) {
            try {
                if (this.f23191l) {
                    pVar = null;
                } else {
                    this.f23191l = true;
                    x0.g.h(this.f23187h, "Need to call openCaptureSession before using this API.");
                    pVar = this.f23187h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        if (pVar != null) {
            pVar.c(new Runnable() {
                @Override
                public final void run() {
                    this.f23150d.F(p1);
                }
            }, F.a.a());
        }
    }

    @Override
    public void r(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        d();
        this.f23181b.i(this);
        this.f23185f.r(p1);
    }

    @Override
    public void s(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        this.f23181b.j(this);
        this.f23185f.s(p1);
    }

    @Override
    public boolean stop() {
        boolean z7;
        try {
            synchronized (this.f23180a) {
                try {
                    if (!this.f23192m) {
                        com.google.common.util.concurrent.p<List<Surface>> pVar = this.f23189j;
                        pVar = pVar != null ? pVar : null;
                        this.f23192m = true;
                    }
                    z7 = !D();
                } finally {
                }
            }
            return z7;
        } finally {
            if (pVar != null) {
                pVar.cancel(true);
            }
        }
    }

    @Override
    public void t(P1 p1) {
        Objects.requireNonNull(this.f23185f);
        this.f23185f.t(p1);
    }

    @Override
    void u(final P1 p1) {
        com.google.common.util.concurrent.p<Void> pVar;
        synchronized (this.f23180a) {
            try {
                if (this.f23193n) {
                    pVar = null;
                } else {
                    this.f23193n = true;
                    x0.g.h(this.f23187h, "Need to call openCaptureSession before using this API.");
                    pVar = this.f23187h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.c(new Runnable() {
                @Override
                public final void run() {
                    this.f23156d.G(p1);
                }
            }, F.a.a());
        }
    }

    @Override
    public void v(P1 p1, Surface surface) {
        Objects.requireNonNull(this.f23185f);
        this.f23185f.v(p1, surface);
    }
}
