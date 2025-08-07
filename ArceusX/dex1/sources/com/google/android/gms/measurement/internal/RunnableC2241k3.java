package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class RunnableC2241k3 implements Runnable {

    final InterfaceC1906k0 f16872d;

    final String f16873e;

    final String f16874i;

    final boolean f16875v;

    final AppMeasurementDynamiteService f16876w;

    RunnableC2241k3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1906k0 interfaceC1906k0, String str, String str2, boolean z7) {
        this.f16876w = appMeasurementDynamiteService;
        this.f16872d = interfaceC1906k0;
        this.f16873e = str;
        this.f16874i = str2;
        this.f16875v = z7;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16876w.f16261d.L().V(this.f16872d, this.f16873e, this.f16874i, this.f16875v);
    }
}
