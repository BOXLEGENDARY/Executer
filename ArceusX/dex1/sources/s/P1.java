package s;

import C.AbstractC0324e0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.C2895h;

public interface P1 {

    public interface a {
        Executor a();

        com.google.common.util.concurrent.p<Void> e(CameraDevice cameraDevice, u.q qVar, List<AbstractC0324e0> list);

        u.q g(int i7, List<u.k> list, c cVar);

        com.google.common.util.concurrent.p<List<Surface>> m(List<AbstractC0324e0> list, long j7);

        boolean stop();
    }

    public static class b {

        private final Executor f23140a;

        private final ScheduledExecutorService f23141b;

        private final Handler f23142c;

        private final C2809f1 f23143d;

        private final C.R0 f23144e;

        private final C.R0 f23145f;

        b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C2809f1 c2809f1, C.R0 r02, C.R0 r03) {
            this.f23140a = executor;
            this.f23141b = scheduledExecutorService;
            this.f23142c = handler;
            this.f23143d = c2809f1;
            this.f23144e = r02;
            this.f23145f = r03;
        }

        a a() {
            return new Z1(this.f23144e, this.f23145f, this.f23143d, this.f23140a, this.f23141b, this.f23142c);
        }
    }

    public static abstract class c {
        void o(P1 p1) {
        }

        void p(P1 p1) {
        }

        public void q(P1 p1) {
        }

        public void r(P1 p1) {
        }

        void s(P1 p1) {
        }

        void t(P1 p1) {
        }

        void u(P1 p1) {
        }

        void v(P1 p1, Surface surface) {
        }
    }

    void b() throws CameraAccessException;

    c c();

    void close();

    void d();

    int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    C2895h h();

    void i(int i7);

    void j() throws CameraAccessException;

    CameraDevice k();

    int l(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    com.google.common.util.concurrent.p<Void> n();
}
