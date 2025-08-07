package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import j3.C2496e;
import j3.v;
import l3.AbstractC2532g;

final class b implements a.InterfaceC0107a {

    final SignInHubActivity f14026a;

    b(SignInHubActivity signInHubActivity, v vVar) {
        this.f14026a = signInHubActivity;
    }

    @Override
    public final void a(S0.b bVar) {
    }

    @Override
    public final S0.b b(int i7, Bundle bundle) {
        return new C2496e(this.f14026a, AbstractC2532g.b());
    }

    @Override
    public final void c(S0.b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f14026a;
        signInHubActivity.setResult(signInHubActivity.f14024v, signInHubActivity.f14025w);
        this.f14026a.finish();
    }
}
