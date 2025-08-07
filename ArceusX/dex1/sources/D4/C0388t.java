package D4;

import E4.s0;
import a4.C1574k;
import android.os.RemoteException;
import java.util.List;

final class C0388t extends s0 {

    final List f980e;

    final C1574k f981i;

    final C f982v;

    C0388t(C c2, C1574k c1574k, List list, C1574k c1574k2) {
        super(c1574k);
        this.f982v = c2;
        this.f980e = list;
        this.f981i = c1574k2;
    }

    @Override
    protected final void c() {
        try {
            this.f982v.f896b.e().l4(this.f982v.f895a, C.j(this.f980e), C.k(), new BinderC0393y(this.f982v, this.f981i));
        } catch (RemoteException e7) {
            C.f893c.c(e7, "deferredUninstall(%s)", this.f980e);
            this.f981i.d(new RuntimeException(e7));
        }
    }
}
