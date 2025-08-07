package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class RunnableC2255n2 implements Runnable {

    final InterfaceC1906k0 f16927d;

    final AppMeasurementDynamiteService f16928e;

    RunnableC2255n2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1906k0 interfaceC1906k0) {
        this.f16928e = appMeasurementDynamiteService;
        this.f16927d = interfaceC1906k0;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16928e.f16261d.L().R(this.f16927d);
    }
}
