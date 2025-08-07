package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class e extends U3.m {

    private final C1804d<U3.c> f14607d;

    @Override
    public final void D1(LocationResult locationResult) {
        this.f14607d.c(new c(this, locationResult));
    }

    @Override
    public final void P2(LocationAvailability locationAvailability) {
        this.f14607d.c(new d(this, locationAvailability));
    }
}
