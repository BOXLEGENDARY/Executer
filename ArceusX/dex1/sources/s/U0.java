package s;

import C.AbstractC0345p;
import C.C0347q;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class U0 {
    static CameraCaptureSession.CaptureCallback a(AbstractC0345p abstractC0345p) {
        if (abstractC0345p == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC0345p, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : C2786U.a(arrayList);
    }

    static void b(AbstractC0345p abstractC0345p, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC0345p instanceof C0347q.a) {
            Iterator<AbstractC0345p> it = ((C0347q.a) abstractC0345p).e().iterator();
            while (it.hasNext()) {
                b(it.next(), list);
            }
        } else if (abstractC0345p instanceof T0) {
            list.add(((T0) abstractC0345p).f());
        } else {
            list.add(new S0(abstractC0345p));
        }
    }
}
