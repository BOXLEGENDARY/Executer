package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class R1 implements Callable<List<g4>> {

    final String f16472d;

    final String f16473e;

    final String f16474i;

    final BinderC2220g2 f16475v;

    R1(BinderC2220g2 binderC2220g2, String str, String str2, String str3) {
        this.f16475v = binderC2220g2;
        this.f16472d = str;
        this.f16473e = str2;
        this.f16474i = str3;
    }

    @Override
    public final List<g4> call() throws Exception {
        this.f16475v.f16802d.e();
        return this.f16475v.f16802d.V().f0(this.f16472d, this.f16473e, this.f16474i);
    }
}
