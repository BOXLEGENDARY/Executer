package D4;

import E4.k0;
import E4.s0;
import a4.C1574k;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

final class C0387s extends s0 {

    final Collection f975e;

    final Collection f976i;

    final k0 f977v;

    final C1574k f978w;

    final C f979y;

    C0387s(C c2, C1574k c1574k, Collection collection, Collection collection2, k0 k0Var, C1574k c1574k2) {
        super(c1574k);
        this.f979y = c2;
        this.f975e = collection;
        this.f976i = collection2;
        this.f977v = k0Var;
        this.f978w = c1574k2;
    }

    @Override
    protected final void c() {
        ArrayList arrayListJ = C.j(this.f975e);
        arrayListJ.addAll(C.i(this.f976i));
        try {
            this.f977v.b(2);
            this.f979y.f896b.e().e2(this.f979y.f895a, arrayListJ, C.b(this.f977v), new A(this.f979y, this.f978w));
        } catch (RemoteException e7) {
            C.f893c.c(e7, "startInstall(%s,%s)", this.f975e, this.f976i);
            this.f978w.d(new RuntimeException(e7));
        }
    }
}
