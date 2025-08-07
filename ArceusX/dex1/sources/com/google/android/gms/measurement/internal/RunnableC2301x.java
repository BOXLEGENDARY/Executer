package com.google.android.gms.measurement.internal;

final class RunnableC2301x implements Runnable {

    final String f17076d;

    final long f17077e;

    final A0 f17078i;

    RunnableC2301x(A0 a02, String str, long j7) {
        this.f17078i = a02;
        this.f17076d = str;
        this.f17077e = j7;
    }

    @Override
    public final void run() {
        A0.j(this.f17078i, this.f17076d, this.f17077e);
    }
}
