package t;

import android.hardware.camera2.CameraCharacteristics;
import t.B;

class z implements B.a {

    protected final CameraCharacteristics f23789a;

    z(CameraCharacteristics cameraCharacteristics) {
        this.f23789a = cameraCharacteristics;
    }

    @Override
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.f23789a.get(key);
    }
}
