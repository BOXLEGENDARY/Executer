package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import n3.C2651i;

final class K {

    private final int f14091a;

    private final ConnectionResult f14092b;

    K(ConnectionResult connectionResult, int i7) {
        C2651i.l(connectionResult);
        this.f14092b = connectionResult;
        this.f14091a = i7;
    }

    final int a() {
        return this.f14091a;
    }

    final ConnectionResult b() {
        return this.f14092b;
    }
}
