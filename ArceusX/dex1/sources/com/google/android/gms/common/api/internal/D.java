package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l3.C2527b;

abstract class D extends m3.t {

    protected final C1574k f14083b;

    public D(int i7, C1574k c1574k) {
        super(i7);
        this.f14083b = c1574k;
    }

    @Override
    public final void a(Status status) {
        this.f14083b.d(new C2527b(status));
    }

    @Override
    public final void b(Exception exc) {
        this.f14083b.d(exc);
    }

    @Override
    public final void c(t tVar) throws DeadObjectException {
        try {
            h(tVar);
        } catch (DeadObjectException e7) {
            a(J.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(J.e(e8));
        } catch (RuntimeException e9) {
            this.f14083b.d(e9);
        }
    }

    protected abstract void h(t tVar) throws RemoteException;
}
