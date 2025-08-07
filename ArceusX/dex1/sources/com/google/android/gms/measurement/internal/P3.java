package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class P3 {

    private final v3.e f16464a;

    private long f16465b;

    public P3(v3.e eVar) {
        C2651i.l(eVar);
        this.f16464a = eVar;
    }

    public final void a() {
        this.f16465b = 0L;
    }

    public final void b() {
        this.f16465b = this.f16464a.b();
    }

    public final boolean c(long j7) {
        return this.f16465b == 0 || this.f16464a.b() - this.f16465b >= 3600000;
    }
}
