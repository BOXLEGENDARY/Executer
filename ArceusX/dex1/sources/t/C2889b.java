package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

public class C2889b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
