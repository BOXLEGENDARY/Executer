package t;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import t.U;
import z.C3043d0;

class W implements U.a {

    final StreamConfigurationMap f23732a;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i7) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i7);
        }
    }

    W(StreamConfigurationMap streamConfigurationMap) {
        this.f23732a = streamConfigurationMap;
    }

    @Override
    public StreamConfigurationMap a() {
        return this.f23732a;
    }

    @Override
    public Size[] b(int i7) {
        return a.a(this.f23732a, i7);
    }

    @Override
    public int[] d() {
        try {
            return this.f23732a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e7) {
            C3043d0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e7);
            return null;
        }
    }
}
