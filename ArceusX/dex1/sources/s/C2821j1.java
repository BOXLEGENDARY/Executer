package s;

import C.X;
import android.hardware.camera2.CaptureRequest;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import r.C2739a;
import s.C2852u;
import z.InterfaceC3054j;

public class C2821j1 {

    private final C2852u f23381a;

    private final C2824k1 f23382b;

    private final Executor f23383c;

    private boolean f23384d = false;

    private c.a<Integer> f23385e;

    private C2852u.c f23386f;

    C2821j1(C2852u c2852u, t.B b2, Executor executor) {
        this.f23381a = c2852u;
        this.f23382b = new C2824k1(b2, 0);
        this.f23383c = executor;
    }

    private void a() {
        c.a<Integer> aVar = this.f23385e;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a("Cancelled by another setExposureCompensationIndex()"));
            this.f23385e = null;
        }
        C2852u.c cVar = this.f23386f;
        if (cVar != null) {
            this.f23381a.k0(cVar);
            this.f23386f = null;
        }
    }

    void b(boolean z7) {
        if (z7 == this.f23384d) {
            return;
        }
        this.f23384d = z7;
        if (z7) {
            return;
        }
        this.f23382b.b(0);
        a();
    }

    void c(C2739a.C0218a c0218a) {
        c0218a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f23382b.a()), X.c.REQUIRED);
    }
}
