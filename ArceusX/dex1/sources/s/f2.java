package s;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.C1709w;
import android.view.LiveData;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import s.C2852u;
import z.C3043d0;
import z.InterfaceC3054j;

final class f2 {

    private final C2852u f23339a;

    private final C1709w<Integer> f23340b;

    private final boolean f23341c;

    private final Executor f23342d;

    private boolean f23343e;

    c.a<Void> f23344f;

    boolean f23345g;

    f2(C2852u c2852u, t.B b2, Executor executor) {
        this.f23339a = c2852u;
        this.f23342d = executor;
        Objects.requireNonNull(b2);
        this.f23341c = w.g.a(new C2789X(b2));
        this.f23340b = new C1709w<>(0);
        c2852u.z(new C2852u.c() {
            @Override
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return this.f23318a.i(totalCaptureResult);
            }
        });
    }

    public Object h(final boolean z7, final c.a aVar) throws Exception {
        this.f23342d.execute(new Runnable() {
            @Override
            public final void run() {
                this.f23328d.g(aVar, z7);
            }
        });
        return "enableTorch: " + z7;
    }

    public boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f23344f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f23345g) {
                this.f23344f.c(null);
                this.f23344f = null;
            }
        }
        return false;
    }

    private <T> void k(C1709w<T> c1709w, T t7) {
        if (E.p.c()) {
            c1709w.o(t7);
        } else {
            c1709w.m(t7);
        }
    }

    com.google.common.util.concurrent.p<Void> d(final boolean z7) {
        if (this.f23341c) {
            k(this.f23340b, Integer.valueOf(z7 ? 1 : 0));
            return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f23308a.h(z7, aVar);
                }
            });
        }
        C3043d0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return G.n.n(new IllegalStateException("No flash unit"));
    }

    public void g(c.a<Void> aVar, boolean z7) {
        if (!this.f23341c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f23343e) {
                k(this.f23340b, 0);
                if (aVar != null) {
                    aVar.f(new InterfaceC3054j.a("Camera is not active."));
                    return;
                }
                return;
            }
            this.f23345g = z7;
            this.f23339a.C(z7);
            k(this.f23340b, Integer.valueOf(z7 ? 1 : 0));
            c.a<Void> aVar2 = this.f23344f;
            if (aVar2 != null) {
                aVar2.f(new InterfaceC3054j.a("There is a new enableTorch being set"));
            }
            this.f23344f = aVar;
        }
    }

    LiveData<Integer> f() {
        return this.f23340b;
    }

    void j(boolean z7) {
        if (this.f23343e == z7) {
            return;
        }
        this.f23343e = z7;
        if (z7) {
            return;
        }
        if (this.f23345g) {
            this.f23345g = false;
            this.f23339a.C(false);
            k(this.f23340b, 0);
        }
        c.a<Void> aVar = this.f23344f;
        if (aVar != null) {
            aVar.f(new InterfaceC3054j.a("Camera is not active."));
            this.f23344f = null;
        }
    }
}
