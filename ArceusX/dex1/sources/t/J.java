package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

class J extends I {
    J(CameraDevice cameraDevice) {
        super((CameraDevice) x0.g.g(cameraDevice), null);
    }

    @Override
    public void a(u.q qVar) throws CameraAccessException, C2894g {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) qVar.j();
        x0.g.g(sessionConfiguration);
        try {
            this.f23709a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }
}
