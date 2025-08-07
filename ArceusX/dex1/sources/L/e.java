package L;

import C.InterfaceC0351s0;
import C.o1;
import android.util.Size;

public final class e {
    public static void a(o1.a<?, ?, ?> aVar, int i7) {
        Size sizeB;
        InterfaceC0351s0 interfaceC0351s0 = (InterfaceC0351s0) aVar.d();
        int iW = interfaceC0351s0.W(-1);
        if (iW == -1 || iW != i7) {
            ((InterfaceC0351s0.a) aVar).e(i7);
        }
        if (iW == -1 || i7 == -1 || iW == i7) {
            return;
        }
        if (Math.abs(E.c.b(i7) - E.c.b(iW)) % 180 != 90 || (sizeB = interfaceC0351s0.B(null)) == null) {
            return;
        }
        ((InterfaceC0351s0.a) aVar).b(new Size(sizeB.getHeight(), sizeB.getWidth()));
    }
}
