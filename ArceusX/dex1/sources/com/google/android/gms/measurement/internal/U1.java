package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class U1 implements Callable<List<zzab>> {

    final String f16534d;

    final String f16535e;

    final String f16536i;

    final BinderC2220g2 f16537v;

    U1(BinderC2220g2 binderC2220g2, String str, String str2, String str3) {
        this.f16537v = binderC2220g2;
        this.f16534d = str;
        this.f16535e = str2;
        this.f16536i = str3;
    }

    @Override
    public final List<zzab> call() throws Exception {
        this.f16537v.f16802d.e();
        return this.f16537v.f16802d.V().c0(this.f16534d, this.f16535e, this.f16536i);
    }
}
