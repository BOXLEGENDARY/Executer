package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class J {

    public final int f14090a;

    public J(int i7) {
        this.f14090a = i7;
    }

    static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(t tVar) throws DeadObjectException;

    public abstract void d(C1812l c1812l, boolean z7);
}
