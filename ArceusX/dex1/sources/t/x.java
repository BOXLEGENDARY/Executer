package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import t.C2895h;

class x implements C2895h.a {

    final CameraCaptureSession f23786a;

    final Object f23787b;

    private static class a {

        final Handler f23788a;

        a(Handler handler) {
            this.f23788a = handler;
        }
    }

    x(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f23786a = (CameraCaptureSession) x0.g.g(cameraCaptureSession);
        this.f23787b = obj;
    }

    static C2895h.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new x(cameraCaptureSession, new a(handler));
    }

    @Override
    public CameraCaptureSession a() {
        return this.f23786a;
    }

    @Override
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f23786a.setRepeatingRequest(captureRequest, new C2895h.b(executor, captureCallback), ((a) this.f23787b).f23788a);
    }

    @Override
    public int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f23786a.captureBurst(list, new C2895h.b(executor, captureCallback), ((a) this.f23787b).f23788a);
    }
}
