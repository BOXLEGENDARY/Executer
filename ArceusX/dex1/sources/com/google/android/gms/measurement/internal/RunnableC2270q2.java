package com.google.android.gms.measurement.internal;

final class RunnableC2270q2 implements Runnable {

    final boolean f16976d;

    final N2 f16977e;

    RunnableC2270q2(N2 n22, boolean z7) {
        this.f16977e = n22;
        this.f16976d = z7;
    }

    @Override
    public final void run() throws IllegalStateException {
        boolean zO = this.f16977e.f16818a.o();
        boolean zN = this.f16977e.f16818a.n();
        this.f16977e.f16818a.k(this.f16976d);
        if (zN == this.f16976d) {
            this.f16977e.f16818a.b().v().b("Default data collection state already set to", Boolean.valueOf(this.f16976d));
        }
        if (this.f16977e.f16818a.o() == zO || this.f16977e.f16818a.o() != this.f16977e.f16818a.n()) {
            this.f16977e.f16818a.b().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f16976d), Boolean.valueOf(zO));
        }
        this.f16977e.R();
    }
}
