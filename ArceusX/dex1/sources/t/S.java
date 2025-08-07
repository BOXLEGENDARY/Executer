package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

class S extends Q {
    S(Context context) {
        super(context);
    }

    @Override
    public Set<Set<String>> e() throws C2894g {
        try {
            return this.f23723a.getConcurrentCameraIds();
        } catch (CameraAccessException e7) {
            throw C2894g.e(e7);
        }
    }
}
