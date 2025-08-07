package com.google.android.gms.measurement.internal;

abstract class T3 extends S3 {

    private boolean f16531c;

    T3(c4 c4Var) {
        super(c4Var);
        this.f16519b.q();
    }

    protected final void i() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f16531c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f16519b.l();
        this.f16531c = true;
    }

    final boolean k() {
        return this.f16531c;
    }

    protected abstract boolean l();
}
