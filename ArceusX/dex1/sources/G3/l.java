package G3;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import m3.InterfaceC2573d;

final class l extends InterfaceC2573d.a {

    final C1574k f1347d;

    l(o oVar, C1574k c1574k) {
        this.f1347d = c1574k;
    }

    @Override
    public final void E2(Status status) throws RemoteException {
        m3.m.a(status, this.f1347d);
    }
}
