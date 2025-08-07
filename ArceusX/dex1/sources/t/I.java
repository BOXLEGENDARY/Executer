package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import t.C2895h;
import t.K;

class I extends H {
    I(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static I e(CameraDevice cameraDevice, Handler handler) {
        return new I(cameraDevice, new K.a(handler));
    }

    @Override
    public void a(u.q qVar) throws CameraAccessException, C2894g {
        K.c(this.f23709a, qVar);
        C2895h.c cVar = new C2895h.c(qVar.a(), qVar.e());
        List<u.k> listC = qVar.c();
        Handler handler = ((K.a) x0.g.g((K.a) this.f23710b)).f23711a;
        u.j jVarB = qVar.b();
        try {
            if (jVarB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) jVarB.a();
                x0.g.g(inputConfiguration);
                this.f23709a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, u.q.h(listC), cVar, handler);
            } else if (qVar.d() == 1) {
                this.f23709a.createConstrainedHighSpeedCaptureSession(K.d(listC), cVar, handler);
            } else {
                this.f23709a.createCaptureSessionByOutputConfigurations(u.q.h(listC), cVar, handler);
            }
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }
}
