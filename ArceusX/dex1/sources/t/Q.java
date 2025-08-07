package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

class Q extends P {
    Q(Context context) {
        super(context);
    }

    @Override
    public CameraCharacteristics c(String str) throws C2894g {
        try {
            return this.f23723a.getCameraCharacteristics(str);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }

    @Override
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C2894g {
        try {
            this.f23723a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }
}
