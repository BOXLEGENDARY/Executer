package w;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

public class C2959d {

    private final SmallDisplaySizeQuirk f24197a = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(SmallDisplaySizeQuirk.class);

    public Size a() {
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.f24197a;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.f();
        }
        return null;
    }
}
