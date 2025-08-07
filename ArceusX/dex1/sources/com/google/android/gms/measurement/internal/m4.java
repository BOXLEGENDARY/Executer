package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1922m0;

final class m4 implements W3.r {

    public final InterfaceC1922m0 f16912a;

    final AppMeasurementDynamiteService f16913b;

    m4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1922m0 interfaceC1922m0) {
        this.f16913b = appMeasurementDynamiteService;
        this.f16912a = interfaceC1922m0;
    }

    @Override
    public final void a(String str, String str2, Bundle bundle, long j7) {
        try {
            this.f16912a.f1(str, str2, bundle, j7);
        } catch (RemoteException e7) {
            N1 n1 = this.f16913b.f16261d;
            if (n1 != null) {
                n1.b().w().b("Event listener threw exception", e7);
            }
        }
    }
}
