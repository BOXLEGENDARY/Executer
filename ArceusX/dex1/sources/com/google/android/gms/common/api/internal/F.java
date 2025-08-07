package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import n3.C2651i;

public final class F extends J {

    protected final AbstractC1802b f14084b;

    public F(int i7, AbstractC1802b abstractC1802b) {
        super(i7);
        this.f14084b = (AbstractC1802b) C2651i.m(abstractC1802b, "Null methods are not runnable.");
    }

    @Override
    public final void a(Status status) {
        try {
            this.f14084b.p(status);
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override
    public final void b(Exception exc) {
        try {
            this.f14084b.p(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e7) {
            Log.w("ApiCallRunner", "Exception reporting failure", e7);
        }
    }

    @Override
    public final void c(t tVar) throws DeadObjectException {
        try {
            this.f14084b.n(tVar.t());
        } catch (RuntimeException e7) {
            b(e7);
        }
    }

    @Override
    public final void d(C1812l c1812l, boolean z7) {
        c1812l.c(this.f14084b, z7);
    }
}
