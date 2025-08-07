package com.google.android.gms.measurement.internal;

abstract class AbstractC2230i2 extends C2225h2 {

    private boolean f16834b;

    AbstractC2230i2(N1 n1) {
        super(n1);
        this.f16818a.i();
    }

    protected void i() {
    }

    protected abstract boolean j();

    protected final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f16834b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.f16818a.g();
        this.f16834b = true;
    }

    public final void m() {
        if (this.f16834b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.f16818a.g();
        this.f16834b = true;
    }

    final boolean n() {
        return this.f16834b;
    }
}
