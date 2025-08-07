package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.common.api.internal.C1807g;
import l3.C2526a;

final class B extends AbstractC1809i {

    final C1807g.a f14067b;

    B(C1807g.a aVar, C1804d.a aVar2) {
        super(aVar2);
        this.f14067b = aVar;
    }

    @Override
    protected final void b(C2526a.b bVar, C1574k<Boolean> c1574k) throws RemoteException {
        this.f14067b.f14142b.accept(bVar, c1574k);
    }
}
