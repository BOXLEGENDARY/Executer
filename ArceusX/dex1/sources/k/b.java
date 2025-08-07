package K;

import C.V;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.n;

public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.j(V.f441i);
    }

    public boolean b(n nVar) {
        return a() && L.b.j(nVar.i());
    }
}
