package t;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

class V extends W {
    V(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override
    public Size[] c(int i7) {
        return this.f23732a.getOutputSizes(i7);
    }
}
