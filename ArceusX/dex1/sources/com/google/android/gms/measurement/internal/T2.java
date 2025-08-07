package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

final class T2 implements Runnable {

    final Bundle f16526d;

    final S2 f16527e;

    final S2 f16528i;

    final long f16529v;

    final Z2 f16530w;

    T2(Z2 z22, Bundle bundle, S2 s22, S2 s23, long j7) {
        this.f16530w = z22;
        this.f16526d = bundle;
        this.f16527e = s22;
        this.f16528i = s23;
        this.f16529v = j7;
    }

    @Override
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Z2.x(this.f16530w, this.f16526d, this.f16527e, this.f16528i, this.f16529v);
    }
}
