package D4;

import a4.C1574k;
import android.os.Bundle;
import android.os.RemoteException;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import java.util.List;

class B extends E4.L {

    final C1574k f891d;

    final C f892e;

    B(C c2, C1574k c1574k) {
        this.f892e = c2;
        this.f891d = c1574k;
    }

    @Override
    public final void A0(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        int i7 = bundle.getInt(sMlEMqrxoGI.scgCjbyTB);
        C.f893c.b("onError(%d)", Integer.valueOf(i7));
        this.f891d.d(new C0370a(i7));
    }

    public void I4(int i7, Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onStartInstall(%d)", Integer.valueOf(i7));
    }

    @Override
    public void M5(int i7, Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onGetSession(%d)", Integer.valueOf(i7));
    }

    @Override
    public final void N3(int i7, Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onCompleteInstall(%d)", Integer.valueOf(i7));
    }

    @Override
    public void P(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override
    public void T2(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override
    public void Z3(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onDeferredInstall", new Object[0]);
    }

    @Override
    public final void c5(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override
    public void i1(List list) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onGetSessionStates", new Object[0]);
    }

    @Override
    public void o0(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onDeferredUninstall", new Object[0]);
    }

    @Override
    public void r0(int i7, Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onCancelInstall(%d)", Integer.valueOf(i7));
    }

    @Override
    public final void x0(Bundle bundle) throws RemoteException {
        this.f892e.f896b.u(this.f891d);
        C.f893c.d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
