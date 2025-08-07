package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1922m0;

final class l4 implements W3.q {

    public final InterfaceC1922m0 f16895a;

    final AppMeasurementDynamiteService f16896b;

    l4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1922m0 interfaceC1922m0) {
        this.f16896b = appMeasurementDynamiteService;
        this.f16895a = interfaceC1922m0;
    }

    @Override
    public final void a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f16895a.f1(str, str2, bundle, j7);
        } catch (RemoteException e7) {
            N1 n1 = this.f16896b.f16261d;
            if (n1 != null) {
                n1.b().w().b("Event interceptor threw exception", e7);
            }
        }
    }
}
