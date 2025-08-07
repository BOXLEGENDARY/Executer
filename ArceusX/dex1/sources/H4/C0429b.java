package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

final class C0429b extends V {

    final IBinder f1593e;

    final ServiceConnectionC0432e f1594i;

    C0429b(ServiceConnectionC0432e serviceConnectionC0432e, IBinder iBinder) {
        this.f1593e = iBinder;
        this.f1594i = serviceConnectionC0432e;
    }

    @Override
    public final void b() throws RemoteException {
        this.f1594i.f1596d.f1611n = (IInterface) this.f1594i.f1596d.f1606i.a(this.f1593e);
        C0433f.r(this.f1594i.f1596d);
        this.f1594i.f1596d.f1604g = false;
        Iterator it = this.f1594i.f1596d.f1601d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f1594i.f1596d.f1601d.clear();
    }
}
