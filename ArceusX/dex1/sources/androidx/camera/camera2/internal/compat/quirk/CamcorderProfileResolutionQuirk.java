package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t.B;
import t.U;
import z.C3043d0;

public class CamcorderProfileResolutionQuirk implements N0 {

    private final U f9376a;

    private List<Size> f9377b = null;

    public CamcorderProfileResolutionQuirk(B b2) {
        this.f9376a = b2.b();
    }

    static boolean g(B b2) {
        Integer num = (Integer) b2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> f() {
        if (this.f9377b == null) {
            Size[] sizeArrC = this.f9376a.c(34);
            this.f9377b = sizeArrC != null ? Arrays.asList((Size[]) sizeArrC.clone()) : Collections.emptyList();
            C3043d0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f9377b);
        }
        return new ArrayList(this.f9377b);
    }
}
