package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1804d;

public final class G extends D {

    public final m3.x f14085c;

    public G(m3.x xVar, C1574k c1574k) {
        super(3, c1574k);
        this.f14085c = xVar;
    }

    @Override
    public final void d(C1812l c1812l, boolean z7) {
    }

    @Override
    public final boolean f(t tVar) {
        return this.f14085c.f22047a.f();
    }

    @Override
    public final Feature[] g(t tVar) {
        return this.f14085c.f22047a.c();
    }

    @Override
    public final void h(t tVar) throws RemoteException {
        this.f14085c.f22047a.d(tVar.t(), this.f14083b);
        C1804d.a aVarB = this.f14085c.f22047a.b();
        if (aVarB != null) {
            tVar.v().put(aVarB, this.f14085c);
        }
    }
}
