package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C1804d;

public final class I extends D {

    public final C1804d.a f14089c;

    public I(C1804d.a aVar, C1574k c1574k) {
        super(4, c1574k);
        this.f14089c = aVar;
    }

    @Override
    public final void d(C1812l c1812l, boolean z7) {
    }

    @Override
    public final boolean f(t tVar) {
        m3.x xVar = (m3.x) tVar.v().get(this.f14089c);
        return xVar != null && xVar.f22047a.f();
    }

    @Override
    public final Feature[] g(t tVar) {
        m3.x xVar = (m3.x) tVar.v().get(this.f14089c);
        if (xVar == null) {
            return null;
        }
        return xVar.f22047a.c();
    }

    @Override
    public final void h(t tVar) throws RemoteException {
        m3.x xVar = (m3.x) tVar.v().remove(this.f14089c);
        if (xVar == null) {
            this.f14083b.e(Boolean.FALSE);
            return;
        }
        xVar.f22048b.b(tVar.t(), this.f14083b);
        xVar.f22047a.a();
    }
}
