package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import n3.C2651i;

final class Y3 implements Callable<String> {

    final zzp f16661d;

    final c4 f16662e;

    Y3(c4 c4Var, zzp zzpVar) {
        this.f16662e = c4Var;
        this.f16661d = zzpVar;
    }

    @Override
    public final String call() throws Exception {
        if (this.f16662e.U((String) C2651i.l(this.f16661d.f17168d)).k() && W3.a.b(this.f16661d.f17167O).k()) {
            return this.f16662e.R(this.f16661d).f0();
        }
        this.f16662e.b().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
