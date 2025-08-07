package t;

import android.hardware.camera2.CameraCaptureSession;

public class C2891d {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
