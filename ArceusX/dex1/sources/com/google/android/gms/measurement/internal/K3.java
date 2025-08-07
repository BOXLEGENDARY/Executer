package com.google.android.gms.measurement.internal;

final class K3 implements Runnable {

    final l4 f16362d;

    final AppMeasurementDynamiteService f16363e;

    K3(AppMeasurementDynamiteService appMeasurementDynamiteService, l4 l4Var) {
        this.f16363e = appMeasurementDynamiteService;
        this.f16362d = l4Var;
    }

    @Override
    public final void run() {
        this.f16363e.f16261d.I().I(this.f16362d);
    }
}
