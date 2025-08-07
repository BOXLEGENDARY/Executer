package w;

import C.e1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.List;

public class t {

    private final ExtraCroppingQuirk f24220a;

    public t() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public List<Size> a(e1.b bVar, List<Size> list) {
        Size sizeF;
        ExtraCroppingQuirk extraCroppingQuirk = this.f24220a;
        if (extraCroppingQuirk == null || (sizeF = extraCroppingQuirk.f(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeF);
        for (Size size : list) {
            if (!size.equals(sizeF)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f24220a = extraCroppingQuirk;
    }
}
