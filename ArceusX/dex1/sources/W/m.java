package w;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import z.C3043d0;

public class m {

    private final String f24206a;

    private final ExtraSupportedOutputSizeQuirk f24207b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    private final C2960e f24208c;

    public m(String str) {
        this.f24206a = str;
        this.f24208c = new C2960e(str);
    }

    private void a(List<Size> list, int i7) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f24207b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrF = extraSupportedOutputSizeQuirk.f(i7);
        if (sizeArrF.length > 0) {
            list.addAll(Arrays.asList(sizeArrF));
        }
    }

    private void c(List<Size> list, int i7) {
        List<Size> listA = this.f24208c.a(i7);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }

    public Size[] b(Size[] sizeArr, int i7) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i7);
        c(arrayList, i7);
        if (arrayList.isEmpty()) {
            C3043d0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
