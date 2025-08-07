package E4;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

final class C0397c extends s0 {

    final IBinder f1114e;

    final ServiceConnectionC0400f f1115i;

    C0397c(ServiceConnectionC0400f serviceConnectionC0400f, IBinder iBinder) {
        this.f1115i = serviceConnectionC0400f;
        this.f1114e = iBinder;
    }

    @Override
    public final void c() throws RemoteException {
        this.f1115i.f1119d.f1133m = J.O0(this.f1114e);
        C0401g.q(this.f1115i.f1119d);
        this.f1115i.f1119d.f1127g = false;
        Iterator it = this.f1115i.f1119d.f1124d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f1115i.f1119d.f1124d.clear();
    }
}
