package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class ServiceConnectionC2313z1 implements ServiceConnection {

    private final String f17117d;

    final A1 f17118e;

    ServiceConnectionC2313z1(A1 a12, String str) {
        this.f17118e = a12;
        this.f17117d = str;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f17118e.f16247a.b().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.V vO0 = com.google.android.gms.internal.measurement.U.O0(iBinder);
            if (vO0 == null) {
                this.f17118e.f16247a.b().w().a("Install Referrer Service implementation was not found");
            } else {
                this.f17118e.f16247a.b().v().a("Install Referrer Service connected");
                this.f17118e.f16247a.a().z(new RunnableC2308y1(this, vO0, this));
            }
        } catch (RuntimeException e7) {
            this.f17118e.f16247a.b().w().b("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17118e.f16247a.b().v().a("Install Referrer Service disconnected");
    }
}
