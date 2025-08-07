package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

final class RunnableC2284t2 implements Runnable {

    final String f17028A;

    final N2 f17029B;

    final String f17030d;

    final String f17031e;

    final long f17032i;

    final Bundle f17033v;

    final boolean f17034w;

    final boolean f17035y;

    final boolean f17036z;

    RunnableC2284t2(N2 n22, String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f17029B = n22;
        this.f17030d = str;
        this.f17031e = str2;
        this.f17032i = j7;
        this.f17033v = bundle;
        this.f17034w = z7;
        this.f17035y = z8;
        this.f17036z = z9;
        this.f17028A = str3;
    }

    @Override
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f17029B.w(this.f17030d, this.f17031e, this.f17032i, this.f17033v, this.f17034w, this.f17035y, this.f17036z, this.f17028A);
    }
}
