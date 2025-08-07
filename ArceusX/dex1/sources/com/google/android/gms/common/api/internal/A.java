package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1807g;
import l3.C2526a;

final class A extends AbstractC1806f {

    final C1807g.a f14066e;

    A(C1807g.a aVar, C1804d c1804d, Feature[] featureArr, boolean z7, int i7) {
        super(c1804d, featureArr, z7, i7);
        this.f14066e = aVar;
    }

    @Override
    protected final void d(C2526a.b bVar, C1574k<Void> c1574k) throws RemoteException {
        this.f14066e.f14141a.accept(bVar, c1574k);
    }
}
