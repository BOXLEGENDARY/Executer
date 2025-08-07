package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

public class C2890c {
    public static void a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j7);
    }
}
