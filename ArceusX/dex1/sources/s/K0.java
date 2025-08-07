package s;

import C.InterfaceC0351s0;
import C.V;
import C.X0;
import C.p1;
import android.content.Context;

public final class K0 implements C.p1 {

    final C2815h1 f22996b;

    public K0(Context context) {
        this.f22996b = C2815h1.c(context);
    }

    @Override
    public C.X a(p1.b bVar, int i7) {
        C.E0 e0D0 = C.E0.d0();
        X0.b bVar2 = new X0.b();
        bVar2.z(b2.b(bVar, i7));
        e0D0.l(C.o1.f666t, bVar2.o());
        e0D0.l(C.o1.f668v, J0.f22988a);
        V.a aVar = new V.a();
        aVar.v(b2.a(bVar, i7));
        e0D0.l(C.o1.f667u, aVar.h());
        e0D0.l(C.o1.f669w, bVar == p1.b.IMAGE_CAPTURE ? A1.f22931c : C2787V.f23179a);
        if (bVar == p1.b.PREVIEW) {
            e0D0.l(InterfaceC0351s0.f722p, this.f22996b.f());
        }
        e0D0.l(InterfaceC0351s0.f717k, Integer.valueOf(this.f22996b.d(true).getRotation()));
        if (bVar == p1.b.VIDEO_CAPTURE || bVar == p1.b.STREAM_SHARING) {
            e0D0.l(C.o1.f672z, Boolean.TRUE);
        }
        return C.J0.b0(e0D0);
    }
}
