package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class RunnableC2290u3 implements Runnable {

    final ComponentName f17053d;

    final ServiceConnectionC2310y3 f17054e;

    RunnableC2290u3(ServiceConnectionC2310y3 serviceConnectionC2310y3, ComponentName componentName) {
        this.f17054e = serviceConnectionC2310y3;
        this.f17053d = componentName;
    }

    @Override
    public final void run() {
        C2315z3.M(this.f17054e.f17114i, this.f17053d);
    }
}
