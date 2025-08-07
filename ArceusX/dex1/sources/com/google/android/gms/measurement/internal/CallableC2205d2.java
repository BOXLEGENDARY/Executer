package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class CallableC2205d2 implements Callable<List<g4>> {

    final String f16763d;

    final BinderC2220g2 f16764e;

    CallableC2205d2(BinderC2220g2 binderC2220g2, String str) {
        this.f16764e = binderC2220g2;
        this.f16763d = str;
    }

    @Override
    public final List<g4> call() throws Exception {
        this.f16764e.f16802d.e();
        return this.f16764e.f16802d.V().e0(this.f16763d);
    }
}
