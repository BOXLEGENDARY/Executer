package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class RunnableC2300w3 implements Runnable {

    final ServiceConnectionC2310y3 f17075d;

    RunnableC2300w3(ServiceConnectionC2310y3 serviceConnectionC2310y3) {
        this.f17075d = serviceConnectionC2310y3;
    }

    @Override
    public final void run() {
        C2315z3 c2315z3 = this.f17075d.f17114i;
        Context contextF = c2315z3.f16818a.f();
        this.f17075d.f17114i.f16818a.d();
        C2315z3.M(c2315z3, new ComponentName(contextF, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
