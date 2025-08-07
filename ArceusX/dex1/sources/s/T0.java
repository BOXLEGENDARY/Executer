package s;

import C.AbstractC0345p;
import android.hardware.camera2.CameraCaptureSession;

final class T0 extends AbstractC0345p {

    private final CameraCaptureSession.CaptureCallback f23172a;

    private T0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f23172a = captureCallback;
    }

    static T0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new T0(captureCallback);
    }

    CameraCaptureSession.CaptureCallback f() {
        return this.f23172a;
    }
}
