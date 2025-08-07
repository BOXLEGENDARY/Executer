package com.google.android.gms.measurement.internal;

final class RunnableC2187a implements Runnable {

    final String f16684d;

    final long f16685e;

    final A0 f16686i;

    RunnableC2187a(A0 a02, String str, long j7) {
        this.f16686i = a02;
        this.f16684d = str;
        this.f16685e = j7;
    }

    @Override
    public final void run() {
        A0.i(this.f16686i, this.f16684d, this.f16685e);
    }
}
