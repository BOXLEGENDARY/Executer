package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class M2 implements Runnable {

    final InterfaceC1906k0 f16382d;

    final zzat f16383e;

    final String f16384i;

    final AppMeasurementDynamiteService f16385v;

    M2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1906k0 interfaceC1906k0, zzat zzatVar, String str) {
        this.f16385v = appMeasurementDynamiteService;
        this.f16382d = interfaceC1906k0;
        this.f16383e = zzatVar;
        this.f16384i = str;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16385v.f16261d.L().p(this.f16382d, this.f16383e, this.f16384i);
    }
}
