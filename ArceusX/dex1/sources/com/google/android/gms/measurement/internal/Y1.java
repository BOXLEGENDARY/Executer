package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class Y1 implements Runnable {

    final zzp f16658d;

    final BinderC2220g2 f16659e;

    Y1(BinderC2220g2 binderC2220g2, zzp zzpVar) {
        this.f16659e = binderC2220g2;
        this.f16658d = zzpVar;
    }

    @Override
    public final void run() {
        this.f16659e.f16802d.e();
        c4 c4Var = this.f16659e.f16802d;
        zzp zzpVar = this.f16658d;
        c4Var.a().h();
        c4Var.g();
        C2651i.f(zzpVar.f17168d);
        W3.a aVarB = W3.a.b(zzpVar.f17167O);
        W3.a aVarU = c4Var.U(zzpVar.f17168d);
        c4Var.b().v().c("Setting consent, package, consent", zzpVar.f17168d, aVarB);
        c4Var.y(zzpVar.f17168d, aVarB);
        if (aVarB.m(aVarU)) {
            c4Var.u(zzpVar);
        }
    }
}
