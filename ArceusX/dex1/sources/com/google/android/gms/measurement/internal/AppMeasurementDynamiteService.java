package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractBinderC1874g0;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import com.google.android.gms.internal.measurement.InterfaceC1922m0;
import com.google.android.gms.internal.measurement.InterfaceC1938o0;
import com.google.android.gms.internal.measurement.zzcl;
import g0.C2457a;
import java.util.Map;
import n3.C2651i;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

public class AppMeasurementDynamiteService extends AbstractBinderC1874g0 {

    N1 f16261d = null;

    private final Map<Integer, W3.r> f16262e = new C2457a();

    private final void O0(InterfaceC1906k0 interfaceC1906k0, String str) {
        zzb();
        this.f16261d.N().I(interfaceC1906k0, str);
    }

    private final void zzb() {
        if (this.f16261d == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override
    public void beginAdUnitExposure(String str, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.y().l(str, j7);
    }

    @Override
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().h0(str, str2, bundle);
    }

    @Override
    public void clearMeasurementEnabled(long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().J(null);
    }

    @Override
    public void endAdUnitExposure(String str, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.y().m(str, j7);
    }

    @Override
    public void generateEventId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        zzb();
        long jR0 = this.f16261d.N().r0();
        zzb();
        this.f16261d.N().H(interfaceC1906k0, jR0);
    }

    @Override
    public void getAppInstanceId(InterfaceC1906k0 interfaceC1906k0) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.a().z(new RunnableC2255n2(this, interfaceC1906k0));
    }

    @Override
    public void getCachedAppInstanceId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        zzb();
        O0(interfaceC1906k0, this.f16261d.I().X());
    }

    @Override
    public void getConditionalUserProperties(String str, String str2, InterfaceC1906k0 interfaceC1906k0) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.a().z(new j4(this, interfaceC1906k0, str, str2));
    }

    @Override
    public void getCurrentScreenClass(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        zzb();
        O0(interfaceC1906k0, this.f16261d.I().Y());
    }

    @Override
    public void getCurrentScreenName(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        zzb();
        O0(interfaceC1906k0, this.f16261d.I().Z());
    }

    @Override
    public void getGmpAppId(InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        String strB;
        zzb();
        N2 n2I = this.f16261d.I();
        if (n2I.f16818a.O() != null) {
            strB = n2I.f16818a.O();
        } else {
            try {
                strB = W3.u.b(n2I.f16818a.f(), "google_app_id", n2I.f16818a.R());
            } catch (IllegalStateException e7) {
                n2I.f16818a.b().r().b("getGoogleAppId failed with exception", e7);
                strB = null;
            }
        }
        O0(interfaceC1906k0, strB);
    }

    @Override
    public void getMaxUserProperties(String str, InterfaceC1906k0 interfaceC1906k0) throws RemoteException {
        zzb();
        this.f16261d.I().S(str);
        zzb();
        this.f16261d.N().G(interfaceC1906k0, 25);
    }

    @Override
    public void getTestFlag(InterfaceC1906k0 interfaceC1906k0, int i7) throws RemoteException {
        zzb();
        if (i7 == 0) {
            this.f16261d.N().I(interfaceC1906k0, this.f16261d.I().a0());
            return;
        }
        if (i7 == 1) {
            this.f16261d.N().H(interfaceC1906k0, this.f16261d.I().W().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f16261d.N().G(interfaceC1906k0, this.f16261d.I().V().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f16261d.N().C(interfaceC1906k0, this.f16261d.I().T().booleanValue());
                return;
            }
        }
        i4 i4VarN = this.f16261d.N();
        double dDoubleValue = this.f16261d.I().U().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            i4VarN.f16818a.b().w().b("Error returning double value to wrapper", e7);
        }
    }

    @Override
    public void getUserProperties(String str, String str2, boolean z7, InterfaceC1906k0 interfaceC1906k0) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.a().z(new RunnableC2241k3(this, interfaceC1906k0, str, str2, z7));
    }

    @Override
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override
    public void initialize(InterfaceC3023a interfaceC3023a, zzcl zzclVar, long j7) throws RemoteException {
        N1 n1 = this.f16261d;
        if (n1 == null) {
            this.f16261d = N1.H((Context) C2651i.l((Context) BinderC3024b.V0(interfaceC3023a)), zzclVar, Long.valueOf(j7));
        } else {
            n1.b().w().a("Attempting to initialize multiple times");
        }
    }

    @Override
    public void isDataCollectionEnabled(InterfaceC1906k0 interfaceC1906k0) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.a().z(new k4(this, interfaceC1906k0));
    }

    @Override
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().s(str, str2, bundle, z7, z8, j7);
    }

    @Override
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1906k0 interfaceC1906k0, long j7) throws IllegalStateException, RemoteException {
        zzb();
        C2651i.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f16261d.a().z(new M2(this, interfaceC1906k0, new zzat(str2, new zzar(bundle), "app", j7), str));
    }

    @Override
    public void logHealthData(int i7, String str, InterfaceC3023a interfaceC3023a, InterfaceC3023a interfaceC3023a2, InterfaceC3023a interfaceC3023a3) throws RemoteException {
        zzb();
        this.f16261d.b().F(i7, true, false, str, interfaceC3023a == null ? null : BinderC3024b.V0(interfaceC3023a), interfaceC3023a2 == null ? null : BinderC3024b.V0(interfaceC3023a2), interfaceC3023a3 != null ? BinderC3024b.V0(interfaceC3023a3) : null);
    }

    @Override
    public void onActivityCreated(InterfaceC3023a interfaceC3023a, Bundle bundle, long j7) throws RemoteException {
        zzb();
        L2 l22 = this.f16261d.I().f16426c;
        if (l22 != null) {
            this.f16261d.I().o();
            l22.onActivityCreated((Activity) BinderC3024b.V0(interfaceC3023a), bundle);
        }
    }

    @Override
    public void onActivityDestroyed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        zzb();
        L2 l22 = this.f16261d.I().f16426c;
        if (l22 != null) {
            this.f16261d.I().o();
            l22.onActivityDestroyed((Activity) BinderC3024b.V0(interfaceC3023a));
        }
    }

    @Override
    public void onActivityPaused(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        zzb();
        L2 l22 = this.f16261d.I().f16426c;
        if (l22 != null) {
            this.f16261d.I().o();
            l22.onActivityPaused((Activity) BinderC3024b.V0(interfaceC3023a));
        }
    }

    @Override
    public void onActivityResumed(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        zzb();
        L2 l22 = this.f16261d.I().f16426c;
        if (l22 != null) {
            this.f16261d.I().o();
            l22.onActivityResumed((Activity) BinderC3024b.V0(interfaceC3023a));
        }
    }

    @Override
    public void onActivitySaveInstanceState(InterfaceC3023a interfaceC3023a, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException {
        zzb();
        L2 l22 = this.f16261d.I().f16426c;
        Bundle bundle = new Bundle();
        if (l22 != null) {
            this.f16261d.I().o();
            l22.onActivitySaveInstanceState((Activity) BinderC3024b.V0(interfaceC3023a), bundle);
        }
        try {
            interfaceC1906k0.P(bundle);
        } catch (RemoteException e7) {
            this.f16261d.b().w().b("Error returning bundle value to wrapper", e7);
        }
    }

    @Override
    public void onActivityStarted(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        zzb();
        if (this.f16261d.I().f16426c != null) {
            this.f16261d.I().o();
        }
    }

    @Override
    public void onActivityStopped(InterfaceC3023a interfaceC3023a, long j7) throws RemoteException {
        zzb();
        if (this.f16261d.I().f16426c != null) {
            this.f16261d.I().o();
        }
    }

    @Override
    public void performAction(Bundle bundle, InterfaceC1906k0 interfaceC1906k0, long j7) throws RemoteException {
        zzb();
        interfaceC1906k0.P(null);
    }

    @Override
    public void registerOnMeasurementEventListener(InterfaceC1922m0 interfaceC1922m0) throws RemoteException {
        W3.r m4Var;
        zzb();
        synchronized (this.f16262e) {
            try {
                m4Var = this.f16262e.get(Integer.valueOf(interfaceC1922m0.d()));
                if (m4Var == null) {
                    m4Var = new m4(this, interfaceC1922m0);
                    this.f16262e.put(Integer.valueOf(interfaceC1922m0.d()), m4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16261d.I().x(m4Var);
    }

    @Override
    public void resetAnalyticsData(long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().y(j7);
    }

    @Override
    public void setConditionalUserProperty(Bundle bundle, long j7) throws IllegalStateException, RemoteException {
        zzb();
        if (bundle == null) {
            this.f16261d.b().r().a("Conditional user property must not be null");
        } else {
            this.f16261d.I().E(bundle, j7);
        }
    }

    @Override
    public void setConsent(Bundle bundle, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().H(bundle, j7);
    }

    @Override
    public void setConsentThirdParty(Bundle bundle, long j7) throws RemoteException {
        zzb();
        this.f16261d.I().F(bundle, -20, j7);
    }

    @Override
    public void setCurrentScreen(InterfaceC3023a interfaceC3023a, String str, String str2, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.K().E((Activity) BinderC3024b.V0(interfaceC3023a), str, str2);
    }

    @Override
    public void setDataCollectionEnabled(boolean z7) throws IllegalStateException, RemoteException {
        zzb();
        N2 n2I = this.f16261d.I();
        n2I.i();
        n2I.f16818a.a().z(new RunnableC2270q2(n2I, z7));
    }

    @Override
    public void setDefaultEventParameters(Bundle bundle) throws IllegalStateException {
        zzb();
        final N2 n2I = this.f16261d.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        n2I.f16818a.a().z(new Runnable() {
            @Override
            public final void run() {
                n2I.q(bundle2);
            }
        });
    }

    @Override
    public void setEventInterceptor(InterfaceC1922m0 interfaceC1922m0) throws IllegalStateException, RemoteException {
        zzb();
        l4 l4Var = new l4(this, interfaceC1922m0);
        if (this.f16261d.a().C()) {
            this.f16261d.I().I(l4Var);
        } else {
            this.f16261d.a().z(new K3(this, l4Var));
        }
    }

    @Override
    public void setInstanceIdProvider(InterfaceC1938o0 interfaceC1938o0) throws RemoteException {
        zzb();
    }

    @Override
    public void setMeasurementEnabled(boolean z7, long j7) throws IllegalStateException, RemoteException {
        zzb();
        this.f16261d.I().J(Boolean.valueOf(z7));
    }

    @Override
    public void setMinimumSessionDuration(long j7) throws RemoteException {
        zzb();
    }

    @Override
    public void setSessionTimeoutDuration(long j7) throws IllegalStateException, RemoteException {
        zzb();
        N2 n2I = this.f16261d.I();
        n2I.f16818a.a().z(new RunnableC2279s2(n2I, j7));
    }

    @Override
    public void setUserId(String str, long j7) throws IllegalStateException, RemoteException {
        zzb();
        if (str == null || str.length() != 0) {
            this.f16261d.I().M(null, "_id", str, true, j7);
        } else {
            this.f16261d.b().w().a("User ID must be non-empty");
        }
    }

    @Override
    public void setUserProperty(String str, String str2, InterfaceC3023a interfaceC3023a, boolean z7, long j7) throws IllegalStateException, SecurityException, RemoteException {
        zzb();
        this.f16261d.I().M(str, str2, BinderC3024b.V0(interfaceC3023a), z7, j7);
    }

    @Override
    public void unregisterOnMeasurementEventListener(InterfaceC1922m0 interfaceC1922m0) throws RemoteException {
        W3.r rVarRemove;
        zzb();
        synchronized (this.f16262e) {
            rVarRemove = this.f16262e.remove(Integer.valueOf(interfaceC1922m0.d()));
        }
        if (rVarRemove == null) {
            rVarRemove = new m4(this, interfaceC1922m0);
        }
        this.f16261d.I().O(rVarRemove);
    }
}
