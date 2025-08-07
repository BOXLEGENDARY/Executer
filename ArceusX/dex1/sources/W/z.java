package w;

import C.AbstractC0324e0;
import C.V;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import r.C2739a;

public class z {

    private final boolean f24228a;

    public z() {
        this.f24228a = androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public V a(V v7) {
        V.a aVar = new V.a();
        aVar.v(v7.k());
        Iterator<AbstractC0324e0> it = v7.i().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(v7.g());
        C2739a.C0218a c0218a = new C2739a.C0218a();
        c0218a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0218a.a());
        return aVar.h();
    }

    public boolean b(List<CaptureRequest> list, boolean z7) {
        if (!this.f24228a || !z7) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
