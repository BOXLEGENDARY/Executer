package s;

import C.AbstractC0324e0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import w.h;
import z.C3043d0;

class Z1 extends V1 {

    private final ScheduledExecutorService f23211o;

    private final Object f23212p;

    private List<AbstractC0324e0> f23213q;

    com.google.common.util.concurrent.p<List<Void>> f23214r;

    private final w.i f23215s;

    private final w.h f23216t;

    private final w.s f23217u;

    private final w.u f23218v;

    private final AtomicBoolean f23219w;

    Z1(C.R0 r02, C.R0 r03, C2809f1 c2809f1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c2809f1, executor, scheduledExecutorService, handler);
        this.f23212p = new Object();
        this.f23219w = new AtomicBoolean(false);
        this.f23215s = new w.i(r02, r03);
        this.f23217u = new w.s(r02.a(CaptureSessionStuckQuirk.class) || r02.a(IncorrectCaptureStateQuirk.class));
        this.f23216t = new w.h(r03);
        this.f23218v = new w.u(r03);
        this.f23211o = scheduledExecutorService;
    }

    public void E() {
        O("Session call super.close()");
        super.close();
    }

    private void N() {
        Iterator<P1> it = this.f23181b.d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public void P(P1 p1) {
        super.s(p1);
    }

    public com.google.common.util.concurrent.p Q(CameraDevice cameraDevice, u.q qVar, List list, List list2) throws Exception {
        if (this.f23218v.a()) {
            N();
        }
        O("start openCaptureSession");
        return super.e(cameraDevice, qVar, list);
    }

    void O(String str) {
        C3043d0.a("SyncCaptureSessionImpl", KwdswzaUHE.bbNRhecOJGTHGD + this + "] " + str);
    }

    @Override
    public void close() {
        if (!this.f23219w.compareAndSet(false, true)) {
            O("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f23218v.a()) {
            try {
                O("Call abortCaptures() before closing session.");
                j();
            } catch (Exception e7) {
                O("Exception when calling abortCaptures()" + e7);
            }
        }
        O("Session call close()");
        this.f23217u.e().c(new Runnable() {
            @Override
            public final void run() {
                this.f23201d.E();
            }
        }, a());
    }

    @Override
    public void d() {
        super.d();
        this.f23217u.i();
    }

    @Override
    public com.google.common.util.concurrent.p<Void> e(final CameraDevice cameraDevice, final u.q qVar, final List<AbstractC0324e0> list) {
        com.google.common.util.concurrent.p<Void> pVarB;
        synchronized (this.f23212p) {
            try {
                List<P1> listD = this.f23181b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<P1> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().n());
                }
                com.google.common.util.concurrent.p<List<Void>> pVarF = G.n.F(arrayList);
                this.f23214r = pVarF;
                pVarB = G.n.B(G.d.a(pVarF).g(new G.a() {
                    @Override
                    public final com.google.common.util.concurrent.p apply(Object obj) {
                        return this.f23206a.Q(cameraDevice, qVar, list, (List) obj);
                    }
                }, a()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVarB;
    }

    @Override
    public int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.f(list, this.f23217u.d(captureCallback));
    }

    @Override
    public void i(int i7) {
        super.i(i7);
        if (i7 == 5) {
            synchronized (this.f23212p) {
                try {
                    if (D() && this.f23213q != null) {
                        O("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<AbstractC0324e0> it = this.f23213q.iterator();
                        while (it.hasNext()) {
                            it.next().d();
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override
    public int l(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.l(captureRequest, this.f23217u.d(captureCallback));
    }

    @Override
    public com.google.common.util.concurrent.p<List<Surface>> m(List<AbstractC0324e0> list, long j7) {
        com.google.common.util.concurrent.p<List<Surface>> pVarM;
        synchronized (this.f23212p) {
            this.f23213q = list;
            pVarM = super.m(list, j7);
        }
        return pVarM;
    }

    @Override
    public com.google.common.util.concurrent.p<Void> n() {
        return G.n.z(1500L, this.f23211o, this.f23217u.e());
    }

    @Override
    public void q(P1 p1) {
        synchronized (this.f23212p) {
            this.f23215s.a(this.f23213q);
        }
        O("onClosed()");
        super.q(p1);
    }

    @Override
    public void s(P1 p1) {
        O("Session onConfigured()");
        this.f23216t.c(p1, this.f23181b.e(), this.f23181b.d(), new h.a() {
            @Override
            public final void a(P1 p12) {
                this.f23198a.P(p12);
            }
        });
    }

    @Override
    public boolean stop() {
        boolean zStop;
        synchronized (this.f23212p) {
            try {
                if (D()) {
                    this.f23215s.a(this.f23213q);
                } else {
                    com.google.common.util.concurrent.p<List<Void>> pVar = this.f23214r;
                    if (pVar != null) {
                        pVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
