package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.ConnectionResult;
import g0.C2458b;
import m3.C2571b;
import m3.InterfaceC2575f;
import n3.C2651i;

public final class C1813m extends N {

    private final C2458b f14162y;

    private final C1803c f14163z;

    C1813m(InterfaceC2575f interfaceC2575f, C1803c c1803c, C1818c c1818c) {
        super(interfaceC2575f, c1818c);
        this.f14162y = new C2458b();
        this.f14163z = c1803c;
        this.f14095d.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C1803c c1803c, C2571b c2571b) {
        InterfaceC2575f interfaceC2575fC = LifecycleCallback.c(activity);
        C1813m c1813m = (C1813m) interfaceC2575fC.d("ConnectionlessLifecycleHelper", C1813m.class);
        if (c1813m == null) {
            c1813m = new C1813m(interfaceC2575fC, c1803c, C1818c.n());
        }
        C2651i.m(c2571b, "ApiKey cannot be null");
        c1813m.f14162y.add(c2571b);
        c1803c.b(c1813m);
    }

    private final void v() {
        if (this.f14162y.isEmpty()) {
            return;
        }
        this.f14163z.b(this);
    }

    @Override
    public final void h() {
        super.h();
        v();
    }

    @Override
    public final void j() {
        super.j();
        v();
    }

    @Override
    public final void k() {
        super.k();
        this.f14163z.c(this);
    }

    @Override
    protected final void m(ConnectionResult connectionResult, int i7) throws Resources.NotFoundException {
        this.f14163z.H(connectionResult, i7);
    }

    @Override
    protected final void n() {
        this.f14163z.I();
    }

    final C2458b t() {
        return this.f14162y;
    }
}
