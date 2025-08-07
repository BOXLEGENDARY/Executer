package y;

import C.I;
import android.hardware.camera2.CameraCharacteristics;
import s.C2773H0;
import s.C2785T;
import z.InterfaceC3060o;

public final class h {

    private C2785T f24350a;

    private C2773H0 f24351b;

    public h(C2785T c2785t) {
        this.f24350a = c2785t;
    }

    public static h a(InterfaceC3060o interfaceC3060o) {
        if (interfaceC3060o instanceof C2773H0) {
            return ((C2773H0) interfaceC3060o).r();
        }
        I iF = ((I) interfaceC3060o).f();
        x0.g.b(iF instanceof C2785T, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C2785T) iF).r();
    }

    public <T> T b(CameraCharacteristics.Key<T> key) {
        C2773H0 c2773h0 = this.f24351b;
        return c2773h0 != null ? (T) c2773h0.s().a(key) : (T) this.f24350a.s().a(key);
    }

    public String c() {
        C2773H0 c2773h0 = this.f24351b;
        return c2773h0 != null ? c2773h0.d() : this.f24350a.d();
    }
}
