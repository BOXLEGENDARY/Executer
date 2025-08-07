package com.google.android.play.core.integrity;

import a4.C1574k;
import android.os.Bundle;
import l3.C2527b;

final class BinderC2327j extends H4.S {

    private final H4.U f18854d = new H4.U("OnRequestIntegrityTokenCallback");

    private final C1574k f18855e;

    final C2328k f18856i;

    BinderC2327j(C2328k c2328k, C1574k c1574k) {
        this.f18856i = c2328k;
        this.f18855e = c1574k;
    }

    @Override
    public final void w0(Bundle bundle) {
        this.f18856i.f18863f.v(this.f18855e);
        this.f18854d.c("onRequestIntegrityToken", new Object[0]);
        C2527b c2527bN0 = this.f18856i.f18862e.n0(bundle);
        if (c2527bN0 != null) {
            this.f18855e.d(c2527bN0);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f18855e.d(new C2318a(-100, null));
            return;
        }
        C2326i c2326i = new C2326i(this, this.f18856i.f18859b, bundle.getLong("request.token.sid"));
        C1574k c1574k = this.f18855e;
        C2321d c2321d = new C2321d();
        c2321d.b(string);
        c2321d.a(c2326i);
        c1574k.e(c2321d.c());
    }
}
