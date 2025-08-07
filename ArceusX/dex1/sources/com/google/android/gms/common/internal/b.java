package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n3.C2637M;
import n3.C2651i;
import n3.C2652j;
import n3.InterfaceC2647e;

public abstract class b<T extends IInterface> {

    private final Context f14267A;

    private final Looper f14268B;

    private final com.google.android.gms.common.internal.d f14269C;

    private final C1819d f14270D;

    final Handler f14271E;

    private final Object f14272F;

    private final Object f14273G;

    private InterfaceC2647e f14274H;

    protected c f14275I;

    private IInterface f14276J;

    private final ArrayList f14277K;

    private o f14278L;

    private int f14279M;

    private final a f14280N;

    private final InterfaceC0152b f14281O;

    private final int f14282P;

    private final String f14283Q;

    private volatile String f14284R;

    private ConnectionResult f14285S;

    private boolean f14286T;

    private volatile zzk f14287U;

    protected AtomicInteger f14288V;

    private int f14289d;

    private long f14290e;

    private long f14291i;

    private int f14292v;

    private long f14293w;

    private volatile String f14294y;

    w f14295z;

    private static final Feature[] f14266X = new Feature[0];

    public static final String[] f14265W = {"service_esmobile", "service_googleme"};

    public interface a {
        void E0(int i7);

        void V0(Bundle bundle);
    }

    public interface InterfaceC0152b {
        void O0(ConnectionResult connectionResult);
    }

    public interface c {
        void a(ConnectionResult connectionResult);
    }

    protected class d implements c {
        public d() {
        }

        @Override
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.q()) {
                b bVar = b.this;
                bVar.d(null, bVar.C());
            } else if (b.this.f14281O != null) {
                b.this.f14281O.O0(connectionResult);
            }
        }
    }

    public interface e {
        void a();
    }

    protected b(Context context, Looper looper, int i7, a aVar, InterfaceC0152b interfaceC0152b, String str) {
        com.google.android.gms.common.internal.d dVarB = com.google.android.gms.common.internal.d.b(context);
        C1819d c1819dF = C1819d.f();
        C2651i.l(aVar);
        C2651i.l(interfaceC0152b);
        this(context, looper, dVarB, c1819dF, i7, aVar, interfaceC0152b, str);
    }

    static void c0(b bVar, zzk zzkVar) {
        bVar.f14287U = zzkVar;
        if (bVar.S()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f14353v;
            C2652j.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.r());
        }
    }

    static void d0(b bVar, int i7) {
        int i8;
        int i9;
        synchronized (bVar.f14272F) {
            i8 = bVar.f14279M;
        }
        if (i8 == 3) {
            bVar.f14286T = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = bVar.f14271E;
        handler.sendMessage(handler.obtainMessage(i9, bVar.f14288V.get(), 16));
    }

    static boolean g0(b bVar, int i7, int i8, IInterface iInterface) {
        synchronized (bVar.f14272F) {
            try {
                if (bVar.f14279M != i7) {
                    return false;
                }
                bVar.i0(i8, iInterface);
                return true;
            } finally {
            }
        }
    }

    static boolean h0(b bVar) throws ClassNotFoundException {
        if (bVar.f14286T || TextUtils.isEmpty(bVar.E()) || TextUtils.isEmpty(bVar.B())) {
            return false;
        }
        try {
            Class.forName(bVar.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void i0(int i7, IInterface iInterface) {
        w wVar;
        C2651i.a((i7 == 4) == (iInterface != null));
        synchronized (this.f14272F) {
            try {
                this.f14279M = i7;
                this.f14276J = iInterface;
                if (i7 == 1) {
                    o oVar = this.f14278L;
                    if (oVar != null) {
                        com.google.android.gms.common.internal.d dVar = this.f14269C;
                        String strB = this.f14295z.b();
                        C2651i.l(strB);
                        dVar.e(strB, this.f14295z.a(), 4225, oVar, X(), this.f14295z.c());
                        this.f14278L = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    o oVar2 = this.f14278L;
                    if (oVar2 != null && (wVar = this.f14295z) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + wVar.b() + " on " + wVar.a());
                        com.google.android.gms.common.internal.d dVar2 = this.f14269C;
                        String strB2 = this.f14295z.b();
                        C2651i.l(strB2);
                        dVar2.e(strB2, this.f14295z.a(), 4225, oVar2, X(), this.f14295z.c());
                        this.f14288V.incrementAndGet();
                    }
                    o oVar3 = new o(this, this.f14288V.get());
                    this.f14278L = oVar3;
                    w wVar2 = (this.f14279M != 3 || B() == null) ? new w(G(), F(), false, 4225, I()) : new w(y().getPackageName(), B(), true, 4225, false);
                    this.f14295z = wVar2;
                    if (wVar2.c() && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f14295z.b())));
                    }
                    com.google.android.gms.common.internal.d dVar3 = this.f14269C;
                    String strB3 = this.f14295z.b();
                    C2651i.l(strB3);
                    if (!dVar3.f(new C2637M(strB3, this.f14295z.a(), 4225, this.f14295z.c()), oVar3, X(), w())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f14295z.b() + " on " + this.f14295z.a());
                        e0(16, null, this.f14288V.get());
                    }
                } else if (i7 == 4) {
                    C2651i.l(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() throws DeadObjectException {
        T t7;
        synchronized (this.f14272F) {
            try {
                if (this.f14279M == 5) {
                    throw new DeadObjectException();
                }
                r();
                t7 = (T) this.f14276J;
                C2651i.m(t7, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t7;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration H() {
        zzk zzkVar = this.f14287U;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f14353v;
    }

    protected boolean I() {
        return l() >= 211700000;
    }

    public boolean J() {
        return this.f14287U != null;
    }

    protected void K(T t7) {
        this.f14291i = System.currentTimeMillis();
    }

    protected void L(ConnectionResult connectionResult) {
        this.f14292v = connectionResult.l();
        this.f14293w = System.currentTimeMillis();
    }

    protected void M(int i7) {
        this.f14289d = i7;
        this.f14290e = System.currentTimeMillis();
    }

    protected void N(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.f14271E.sendMessage(this.f14271E.obtainMessage(1, i8, -1, new p(this, i7, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f14284R = str;
    }

    public void Q(int i7) {
        this.f14271E.sendMessage(this.f14271E.obtainMessage(6, this.f14288V.get(), i7));
    }

    protected void R(c cVar, int i7, PendingIntent pendingIntent) {
        C2651i.m(cVar, "Connection progress callbacks cannot be null.");
        this.f14275I = cVar;
        this.f14271E.sendMessage(this.f14271E.obtainMessage(3, this.f14288V.get(), i7, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f14283Q;
        return str == null ? this.f14267A.getClass().getName() : str;
    }

    public boolean a() {
        boolean z7;
        synchronized (this.f14272F) {
            z7 = this.f14279M == 4;
        }
        return z7;
    }

    public void d(com.google.android.gms.common.internal.e eVar, Set<Scope> set) {
        Bundle bundleA = A();
        String str = this.f14284R;
        int i7 = C1819d.f14213a;
        Scope[] scopeArr = GetServiceRequest.f14233H;
        Bundle bundle = new Bundle();
        int i8 = this.f14282P;
        Feature[] featureArr = GetServiceRequest.f14234I;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i8, i7, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f14245v = this.f14267A.getPackageName();
        getServiceRequest.f14248z = bundleA;
        if (set != null) {
            getServiceRequest.f14247y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f14235A = accountU;
            if (eVar != null) {
                getServiceRequest.f14246w = eVar.asBinder();
            }
        } else if (O()) {
            getServiceRequest.f14235A = u();
        }
        getServiceRequest.f14236B = f14266X;
        getServiceRequest.f14237C = v();
        if (S()) {
            getServiceRequest.f14240F = true;
        }
        try {
            synchronized (this.f14273G) {
                try {
                    InterfaceC2647e interfaceC2647e = this.f14274H;
                    if (interfaceC2647e != null) {
                        interfaceC2647e.O1(new n(this, this.f14288V.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            Q(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f14288V.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f14288V.get());
        }
    }

    public void e(String str) {
        this.f14294y = str;
        i();
    }

    protected final void e0(int i7, Bundle bundle, int i8) {
        this.f14271E.sendMessage(this.f14271E.obtainMessage(7, i8, -1, new q(this, i7, null)));
    }

    public boolean f() {
        boolean z7;
        synchronized (this.f14272F) {
            int i7 = this.f14279M;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public String g() {
        w wVar;
        if (!a() || (wVar = this.f14295z) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return wVar.a();
    }

    public void h(c cVar) {
        C2651i.m(cVar, "Connection progress callbacks cannot be null.");
        this.f14275I = cVar;
        i0(2, null);
    }

    public void i() {
        this.f14288V.incrementAndGet();
        synchronized (this.f14277K) {
            try {
                int size = this.f14277K.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((m) this.f14277K.get(i7)).d();
                }
                this.f14277K.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f14273G) {
            this.f14274H = null;
        }
        i0(1, null);
    }

    public void j(e eVar) {
        eVar.a();
    }

    public boolean k() {
        return true;
    }

    public int l() {
        return C1819d.f14213a;
    }

    public final Feature[] m() {
        zzk zzkVar = this.f14287U;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f14351e;
    }

    public String n() {
        return this.f14294y;
    }

    public boolean o() {
        return false;
    }

    public void q() throws PackageManager.NameNotFoundException {
        int iH = this.f14270D.h(this.f14267A, l());
        if (iH == 0) {
            h(new d());
        } else {
            i0(1, null);
            R(new d(), iH, null);
        }
    }

    protected final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public Feature[] v() {
        return f14266X;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f14267A;
    }

    public int z() {
        return this.f14282P;
    }

    protected b(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, C1819d c1819d, int i7, a aVar, InterfaceC0152b interfaceC0152b, String str) {
        this.f14294y = null;
        this.f14272F = new Object();
        this.f14273G = new Object();
        this.f14277K = new ArrayList();
        this.f14279M = 1;
        this.f14285S = null;
        this.f14286T = false;
        this.f14287U = null;
        this.f14288V = new AtomicInteger(0);
        C2651i.m(context, "Context must not be null");
        this.f14267A = context;
        C2651i.m(looper, "Looper must not be null");
        this.f14268B = looper;
        C2651i.m(dVar, "Supervisor must not be null");
        this.f14269C = dVar;
        C2651i.m(c1819d, "API availability must not be null");
        this.f14270D = c1819d;
        this.f14271E = new l(this, looper);
        this.f14282P = i7;
        this.f14280N = aVar;
        this.f14281O = interfaceC0152b;
        this.f14283Q = str;
    }
}
