package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class j4 implements Runnable {

    final InterfaceC1906k0 f16860d;

    final String f16861e;

    final String f16862i;

    final AppMeasurementDynamiteService f16863v;

    j4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1906k0 interfaceC1906k0, String str, String str2) {
        this.f16863v = appMeasurementDynamiteService;
        this.f16860d = interfaceC1906k0;
        this.f16861e = str;
        this.f16862i = str2;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16863v.f16261d.L().T(this.f16860d, this.f16861e, this.f16862i);
    }
}
