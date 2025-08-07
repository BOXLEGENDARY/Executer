package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.google.android.gms.common.api.Status;
import l3.AbstractC2532g;
import l3.C2526a;
import l3.C2526a.b;
import l3.InterfaceC2540o;
import n3.C2651i;

public abstract class AbstractC1802b<R extends InterfaceC2540o, A extends C2526a.b> extends BasePendingResult<R> {

    private final C2526a.c<A> f14108o;

    private final C2526a<?> f14109p;

    protected AbstractC1802b(C2526a<?> c2526a, AbstractC2532g abstractC2532g) {
        super((AbstractC2532g) C2651i.m(abstractC2532g, "GoogleApiClient must not be null"));
        C2651i.m(c2526a, "Api must not be null");
        this.f14108o = c2526a.b();
        this.f14109p = c2526a;
    }

    private void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void l(A a2) throws RemoteException;

    protected void m(R r7) {
    }

    public final void n(A a2) throws DeadObjectException {
        try {
            l(a2);
        } catch (DeadObjectException e7) {
            o(e7);
            throw e7;
        } catch (RemoteException e8) {
            o(e8);
        }
    }

    public final void p(Status status) {
        C2651i.b(!status.r(), vxbbqXNtzfMxs.zaeynh);
        R rC = c(status);
        f(rC);
        m(rC);
    }
}
