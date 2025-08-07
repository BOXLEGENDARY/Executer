package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class k4 implements Runnable {

    final InterfaceC1906k0 f16877d;

    final AppMeasurementDynamiteService f16878e;

    k4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1906k0 interfaceC1906k0) {
        this.f16878e = appMeasurementDynamiteService;
        this.f16877d = interfaceC1906k0;
    }

    @Override
    public final void run() {
        this.f16878e.f16261d.N().C(this.f16877d, this.f16878e.f16261d.n());
    }
}
