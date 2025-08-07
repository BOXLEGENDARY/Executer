package com.google.android.gms.measurement.internal;

final class RunnableC2215f2 implements Runnable {

    final String f16783d;

    final String f16784e;

    final String f16785i;

    final long f16786v;

    final BinderC2220g2 f16787w;

    RunnableC2215f2(BinderC2220g2 binderC2220g2, String str, String str2, String str3, long j7) {
        this.f16787w = binderC2220g2;
        this.f16783d = str;
        this.f16784e = str2;
        this.f16785i = str3;
        this.f16786v = j7;
    }

    @Override
    public final void run() {
        String str = this.f16783d;
        if (str == null) {
            this.f16787w.f16802d.b0().K().G(this.f16784e, null);
        } else {
            this.f16787w.f16802d.b0().K().G(this.f16784e, new S2(this.f16785i, str, this.f16786v));
        }
    }
}
