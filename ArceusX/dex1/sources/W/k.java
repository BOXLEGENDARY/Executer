package w;

import C.e1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;

public class k {

    private final ExtraCroppingQuirk f24204a;

    public k() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size sizeF;
        ExtraCroppingQuirk extraCroppingQuirk = this.f24204a;
        return (extraCroppingQuirk == null || (sizeF = extraCroppingQuirk.f(e1.b.PRIV)) == null || sizeF.getWidth() * sizeF.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeF;
    }

    k(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f24204a = extraCroppingQuirk;
    }
}
