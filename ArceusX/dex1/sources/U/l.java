package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

class l extends p {
    l(Object obj) {
        super(obj);
    }

    @Override
    public Surface a() {
        return ((OutputConfiguration) i()).getSurface();
    }

    @Override
    public Object i() {
        throw null;
    }
}
