package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.location.LocationAvailability;

final class d implements C1804d.b<U3.c> {

    final LocationAvailability f14606a;

    d(e eVar, LocationAvailability locationAvailability) {
        this.f14606a = locationAvailability;
    }

    @Override
    public final void a(U3.c cVar) {
        cVar.a(this.f14606a);
    }

    @Override
    public final void b() {
    }
}
