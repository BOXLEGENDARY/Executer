package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import n3.C2651i;

final class Z3 implements Runnable {

    final String f16680d;

    final String f16681e = "_err";

    final Bundle f16682i;

    final a4 f16683v;

    Z3(a4 a4Var, String str, String str2, Bundle bundle) {
        this.f16683v = a4Var;
        this.f16680d = str;
        this.f16682i = bundle;
    }

    @Override
    public final void run() {
        this.f16683v.f16697a.j((zzat) C2651i.l(this.f16683v.f16697a.g0().w0(this.f16680d, this.f16681e, this.f16682i, "auto", this.f16683v.f16697a.c().a(), false, true)), this.f16680d);
    }
}
