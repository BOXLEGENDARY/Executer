package D4;

import E4.s0;
import a4.C1574k;
import android.os.RemoteException;

final class C0390v extends s0 {

    final int f986e;

    final C1574k f987i;

    final C f988v;

    C0390v(C c2, C1574k c1574k, int i7, C1574k c1574k2) {
        super(c1574k);
        this.f988v = c2;
        this.f986e = i7;
        this.f987i = c1574k2;
    }

    @Override
    protected final void c() {
        try {
            this.f988v.f896b.e().s4(this.f988v.f895a, this.f986e, C.k(), new BinderC0391w(this.f988v, this.f987i));
        } catch (RemoteException e7) {
            C.f893c.c(e7, "cancelInstall(%d)", Integer.valueOf(this.f986e));
            this.f987i.d(new RuntimeException(e7));
        }
    }
}
