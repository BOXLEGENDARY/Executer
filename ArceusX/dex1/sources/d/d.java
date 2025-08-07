package D;

import C.InterfaceC0336k0;
import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;

class d {
    public static InterfaceC0336k0 a(CamcorderProfile camcorderProfile) {
        return InterfaceC0336k0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    private static List<InterfaceC0336k0.a> b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i7 = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC0336k0.a.a(i7, InterfaceC0336k0.e(i7), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC0336k0.f(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List<InterfaceC0336k0.c> c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i7 = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC0336k0.c.a(i7, InterfaceC0336k0.g(i7), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
