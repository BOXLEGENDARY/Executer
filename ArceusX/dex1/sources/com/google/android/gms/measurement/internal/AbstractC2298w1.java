package com.google.android.gms.measurement.internal;

abstract class AbstractC2298w1 extends C2189a1 {

    private boolean f17072b;

    AbstractC2298w1(N1 n1) {
        super(n1);
        this.f16818a.i();
    }

    protected final void i() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f17072b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        this.f16818a.g();
        this.f17072b = true;
    }

    public final void k() {
        if (this.f17072b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f16818a.g();
        this.f17072b = true;
    }

    protected void l() {
    }

    final boolean m() {
        return this.f17072b;
    }

    protected abstract boolean n();
}
