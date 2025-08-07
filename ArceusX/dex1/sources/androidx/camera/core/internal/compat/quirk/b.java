package androidx.camera.core.internal.compat.quirk;

import C.N0;
import C.O0;
import java.util.ArrayList;
import java.util.List;

public class b {
    static List<N0> a(O0 o02) {
        ArrayList arrayList = new ArrayList();
        if (o02.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.k())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (o02.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.f())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (o02.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.g())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (o02.a(LowMemoryQuirk.class, LowMemoryQuirk.f())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (o02.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.i())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (o02.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.j())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
