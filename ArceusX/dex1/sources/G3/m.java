package G3;

import a4.C1574k;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class m extends D {

    final C1574k f1348d;

    m(o oVar, C1574k c1574k) {
        this.f1348d = c1574k;
    }

    @Override
    public final void D0(Status status, PendingIntent pendingIntent) throws RemoteException {
        m3.m.b(status, pendingIntent, this.f1348d);
    }
}
