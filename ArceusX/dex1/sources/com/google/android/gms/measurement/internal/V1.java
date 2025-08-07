package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class V1 implements Callable<List<zzab>> {

    final String f16544d;

    final String f16545e;

    final String f16546i;

    final BinderC2220g2 f16547v;

    V1(BinderC2220g2 binderC2220g2, String str, String str2, String str3) {
        this.f16547v = binderC2220g2;
        this.f16544d = str;
        this.f16545e = str2;
        this.f16546i = str3;
    }

    @Override
    public final List<zzab> call() throws Exception {
        this.f16547v.f16802d.e();
        return this.f16547v.f16802d.V().c0(this.f16544d, this.f16545e, this.f16546i);
    }
}
