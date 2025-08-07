package w;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

public class C2960e {

    private final String f24198a;

    public C2960e(String str) {
        this.f24198a = str;
    }

    public List<Size> a(int i7) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.f(this.f24198a, i7);
    }
}
