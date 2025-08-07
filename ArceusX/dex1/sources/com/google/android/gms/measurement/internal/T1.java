package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class T1 implements Callable<List<g4>> {

    final String f16522d;

    final String f16523e;

    final String f16524i;

    final BinderC2220g2 f16525v;

    T1(BinderC2220g2 binderC2220g2, String str, String str2, String str3) {
        this.f16525v = binderC2220g2;
        this.f16522d = str;
        this.f16523e = str2;
        this.f16524i = str3;
    }

    @Override
    public final List<g4> call() throws Exception {
        this.f16525v.f16802d.e();
        return this.f16525v.f16802d.V().f0(this.f16522d, this.f16523e, this.f16524i);
    }
}
