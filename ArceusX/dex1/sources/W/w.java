package w;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

public class w {

    private static final Size f24223b = new Size(320, 240);

    private static final Comparator<Size> f24224c = new E.d();

    private final RepeatingStreamConstraintForVideoRecordingQuirk f24225a = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f24225a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.f()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f24224c.compare(size, f24223b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
