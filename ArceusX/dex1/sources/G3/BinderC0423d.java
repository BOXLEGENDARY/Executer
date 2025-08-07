package G3;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

final class BinderC0423d extends F {

    final C1574k f1334d;

    BinderC0423d(C0424e c0424e, C1574k c1574k) {
        this.f1334d = c1574k;
    }

    @Override
    public final void X5(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        m3.m.b(status, savePasswordResult, this.f1334d);
    }
}
