package y;

import C.D0;
import C.E0;
import C.J0;
import C.S0;
import C.X;
import android.hardware.camera2.CaptureRequest;
import r.C2739a;
import y.j;
import z.InterfaceC3031A;

public class j implements S0 {

    private final X f24354I;

    public static final class a implements InterfaceC3031A<j> {

        private final E0 f24355a = E0.d0();

        public static a e(final X x7) {
            final a aVar = new a();
            x7.i("camera2.captureRequest.option.", new X.b() {
                @Override
                public final boolean a(X.a aVar2) {
                    return j.a.f(this.f24352a, x7, aVar2);
                }
            });
            return aVar;
        }

        public static boolean f(a aVar, X x7, X.a aVar2) {
            aVar.c().T(aVar2, x7.g(aVar2), x7.f(aVar2));
            return true;
        }

        public j b() {
            return new j(J0.b0(this.f24355a));
        }

        @Override
        public D0 c() {
            return this.f24355a;
        }

        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f24355a.l(C2739a.Z(key), valuet);
            return this;
        }
    }

    public j(X x7) {
        this.f24354I = x7;
    }

    @Override
    public X e() {
        return this.f24354I;
    }
}
