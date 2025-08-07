package com.google.android.gms.measurement.internal;

final class RunnableC2279s2 implements Runnable {

    final long f17007d;

    final N2 f17008e;

    RunnableC2279s2(N2 n22, long j7) {
        this.f17008e = n22;
        this.f17007d = j7;
    }

    @Override
    public final void run() {
        this.f17008e.f16818a.F().f17089k.b(this.f17007d);
        this.f17008e.f16818a.b().q().b("Session timeout duration set", Long.valueOf(this.f17007d));
    }
}
