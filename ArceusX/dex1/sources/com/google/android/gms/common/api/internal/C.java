package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import l3.C2526a;

final class C extends AbstractC1808h {

    final AbstractC1808h.a f14082d;

    C(AbstractC1808h.a aVar, Feature[] featureArr, boolean z7, int i7) {
        super(featureArr, z7, i7);
        this.f14082d = aVar;
    }

    @Override
    protected final void b(C2526a.b bVar, C1574k c1574k) throws RemoteException {
        this.f14082d.f14151a.accept(bVar, c1574k);
    }
}
