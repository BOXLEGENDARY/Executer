package j3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l3.AbstractC2532g;
import l3.C2526a;
import l3.InterfaceC2540o;

final class C2500i extends l {
    C2500i(AbstractC2532g abstractC2532g) {
        super(abstractC2532g);
    }

    @Override
    protected final InterfaceC2540o c(Status status) {
        return status;
    }

    @Override
    protected final void l(C2526a.b bVar) throws RemoteException {
        C2498g c2498g = (C2498g) bVar;
        ((s) c2498g.D()).h3(new BinderC2499h(this), c2498g.m0());
    }
}
