package D4;

import E4.s0;
import a4.C1574k;
import android.os.RemoteException;
import java.util.List;

final class C0389u extends s0 {

    final List f983e;

    final C1574k f984i;

    final C f985v;

    C0389u(C c2, C1574k c1574k, List list, C1574k c1574k2) {
        super(c1574k);
        this.f985v = c2;
        this.f983e = list;
        this.f984i = c1574k2;
    }

    @Override
    protected final void c() {
        try {
            this.f985v.f896b.e().l3(this.f985v.f895a, C.j(this.f983e), C.k(), new BinderC0392x(this.f985v, this.f984i));
        } catch (RemoteException e7) {
            C.f893c.c(e7, "deferredInstall(%s)", this.f983e);
            this.f984i.d(new RuntimeException(e7));
        }
    }
}
