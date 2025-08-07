package B3;

import K3.b1;
import a4.C1574k;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import m3.m;

final class c extends b1 {

    final C1574k f357d;

    c(a aVar, C1574k c1574k) {
        this.f357d = c1574k;
    }

    @Override
    public final void V5(Status status, PendingIntent pendingIntent) throws RemoteException {
        m.b(status, pendingIntent, this.f357d);
    }
}
