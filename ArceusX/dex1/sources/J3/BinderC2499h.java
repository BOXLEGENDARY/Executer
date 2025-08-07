package j3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class BinderC2499h extends BinderC2494c {

    final C2500i f21137d;

    BinderC2499h(C2500i c2500i) {
        this.f21137d = c2500i;
    }

    @Override
    public final void x4(Status status) throws RemoteException {
        this.f21137d.f(status);
    }
}
