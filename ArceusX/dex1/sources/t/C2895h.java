package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

public final class C2895h {

    private final a f23737a;

    interface a {
        CameraCaptureSession a();

        int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    static final class b extends CameraCaptureSession.CaptureCallback {

        final CameraCaptureSession.CaptureCallback f23738a;

        private final Executor f23739b;

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f23739b = executor;
            this.f23738a = captureCallback;
        }

        public void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
            C2890c.a(this.f23738a, cameraCaptureSession, captureRequest, surface, j7);
        }

        public void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f23738a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f23738a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f23738a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public void l(CameraCaptureSession cameraCaptureSession, int i7) {
            this.f23738a.onCaptureSequenceAborted(cameraCaptureSession, i7);
        }

        public void m(CameraCaptureSession cameraCaptureSession, int i7, long j7) {
            this.f23738a.onCaptureSequenceCompleted(cameraCaptureSession, i7, j7);
        }

        public void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
            this.f23738a.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
        }

        @Override
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j7) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23763d.h(cameraCaptureSession, captureRequest, surface, j7);
                }
            });
        }

        @Override
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23747d.i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23759d.j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23751d.k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i7) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23768d.l(cameraCaptureSession, i7);
                }
            });
        }

        @Override
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i7, final long j7) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23755d.m(cameraCaptureSession, i7, j7);
                }
            });
        }

        @Override
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j7, final long j8) {
            this.f23739b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23742d.n(cameraCaptureSession, captureRequest, j7, j8);
                }
            });
        }
    }

    static final class c extends CameraCaptureSession.StateCallback {

        final CameraCaptureSession.StateCallback f23740a;

        private final Executor f23741b;

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f23741b = executor;
            this.f23740a = stateCallback;
        }

        public void h(CameraCaptureSession cameraCaptureSession) {
            this.f23740a.onActive(cameraCaptureSession);
        }

        public void i(CameraCaptureSession cameraCaptureSession) {
            C2891d.a(this.f23740a, cameraCaptureSession);
        }

        public void j(CameraCaptureSession cameraCaptureSession) {
            this.f23740a.onClosed(cameraCaptureSession);
        }

        public void k(CameraCaptureSession cameraCaptureSession) {
            this.f23740a.onConfigureFailed(cameraCaptureSession);
        }

        public void l(CameraCaptureSession cameraCaptureSession) {
            this.f23740a.onConfigured(cameraCaptureSession);
        }

        public void m(CameraCaptureSession cameraCaptureSession) {
            this.f23740a.onReady(cameraCaptureSession);
        }

        public void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C2889b.a(this.f23740a, cameraCaptureSession, surface);
        }

        @Override
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23771d.h(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23778d.i(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23773d.j(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23784d.k(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23780d.l(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23782d.m(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f23741b.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f23775d.n(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C2895h(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f23737a = new C2909w(cameraCaptureSession);
        } else {
            this.f23737a = x.d(cameraCaptureSession, handler);
        }
    }

    public static C2895h d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C2895h(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f23737a.c(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f23737a.b(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f23737a.a();
    }
}
