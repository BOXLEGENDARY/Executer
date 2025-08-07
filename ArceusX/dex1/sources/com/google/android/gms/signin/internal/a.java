package com.google.android.gms.signin.internal;

import X3.f;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zat;
import j3.C2493b;
import l3.AbstractC2532g;
import n3.C2644b;
import n3.C2651i;

public class a extends com.google.android.gms.common.internal.c<c> implements f {

    public static final int f17175f0 = 0;

    private final boolean f17176b0;

    private final C2644b f17177c0;

    private final Bundle f17178d0;

    private final Integer f17179e0;

    public a(Context context, Looper looper, boolean z7, C2644b c2644b, Bundle bundle, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        super(context, looper, 44, c2644b, aVar, bVar);
        this.f17176b0 = true;
        this.f17177c0 = c2644b;
        this.f17178d0 = bundle;
        this.f17179e0 = c2644b.i();
    }

    public static Bundle m0(C2644b c2644b) {
        c2644b.h();
        Integer numI = c2644b.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2644b.a());
        if (numI != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numI.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f17177c0.f())) {
            this.f17178d0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17177c0.f());
        }
        return this.f17178d0;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final void b(Y3.c cVar) {
        C2651i.m(cVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f17177c0.c();
            ((c) D()).h3(new zai(1, new zat(accountC, ((Integer) C2651i.l(this.f17179e0)).intValue(), "<<default account>>".equals(accountC.name) ? C2493b.b(y()).c() : null)), cVar);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.h2(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final boolean o() {
        return this.f17176b0;
    }

    @Override
    public final void p() {
        h(new b.d());
    }

    @Override
    protected final IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }
}
