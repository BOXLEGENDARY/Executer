package com.google.android.gms.internal.location;

import U3.p;
import android.location.Location;
import com.google.android.gms.common.api.internal.C1804d;

final class h extends p {

    private final C1804d<U3.d> f14609d;

    @Override
    public final synchronized void m1(Location location) {
        this.f14609d.c(new g(this, location));
    }
}
