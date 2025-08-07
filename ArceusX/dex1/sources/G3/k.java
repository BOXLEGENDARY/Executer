package G3;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

final class k extends y {

    final C1574k f1346d;

    k(o oVar, C1574k c1574k) {
        this.f1346d = c1574k;
    }

    @Override
    public final void Y1(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        m3.m.b(status, beginSignInResult, this.f1346d);
    }
}
