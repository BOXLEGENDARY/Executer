package com.google.android.gms.measurement.internal;

final class RunnableC2289u2 implements Runnable {

    final String f17048d;

    final String f17049e;

    final Object f17050i;

    final long f17051v;

    final N2 f17052w;

    RunnableC2289u2(N2 n22, String str, String str2, Object obj, long j7) {
        this.f17052w = n22;
        this.f17048d = str;
        this.f17049e = str2;
        this.f17050i = obj;
        this.f17051v = j7;
    }

    @Override
    public final void run() {
        this.f17052w.N(this.f17048d, this.f17049e, this.f17050i, this.f17051v);
    }
}
