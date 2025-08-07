package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1804d;
import l3.C2526a;
import l3.C2526a.b;

public abstract class AbstractC1809i<A extends C2526a.b, L> {

    private final C1804d.a f14155a;

    protected AbstractC1809i(C1804d.a<L> aVar) {
        this.f14155a = aVar;
    }

    public C1804d.a<L> a() {
        return this.f14155a;
    }

    protected abstract void b(A a2, C1574k<Boolean> c1574k) throws RemoteException;
}
