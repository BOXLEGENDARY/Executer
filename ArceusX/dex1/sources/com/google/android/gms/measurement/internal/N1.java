package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.S5;
import com.google.android.gms.internal.measurement.V5;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;
import x3.C2989c;

public final class N1 implements InterfaceC2235j2 {

    private static volatile N1 f16392H;

    private volatile Boolean f16393A;

    protected Boolean f16394B;

    protected Boolean f16395C;

    private volatile boolean f16396D;

    private int f16397E;

    final long f16399G;

    private final Context f16400a;

    private final String f16401b;

    private final String f16402c;

    private final String f16403d;

    private final boolean f16404e;

    private final C2192b f16405f;

    private final C2212f f16406g;

    private final C2303x1 f16407h;

    private final C2234j1 f16408i;

    private final L1 f16409j;

    private final O3 f16410k;

    private final i4 f16411l;

    private final C2209e1 f16412m;

    private final v3.e f16413n;

    private final Z2 f16414o;

    private final N2 f16415p;

    private final A0 f16416q;

    private final Q2 f16417r;

    private final String f16418s;

    private C2204d1 f16419t;

    private C2315z3 f16420u;

    private C2247m f16421v;

    private C2194b1 f16422w;

    private Boolean f16424y;

    private long f16425z;

    private boolean f16423x = false;

    private final AtomicInteger f16398F = new AtomicInteger(0);

    N1(C2245l2 c2245l2) throws IllegalStateException {
        Bundle bundle;
        C2651i.l(c2245l2);
        C2192b c2192b = new C2192b(c2245l2.f16884a);
        this.f16405f = c2192b;
        W0.f16552a = c2192b;
        Context context = c2245l2.f16884a;
        this.f16400a = context;
        this.f16401b = c2245l2.f16885b;
        this.f16402c = c2245l2.f16886c;
        this.f16403d = c2245l2.f16887d;
        this.f16404e = c2245l2.f16891h;
        this.f16393A = c2245l2.f16888e;
        this.f16418s = c2245l2.f16893j;
        this.f16396D = true;
        zzcl zzclVar = c2245l2.f16890g;
        if (zzclVar != null && (bundle = zzclVar.f15395z) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f16394B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f15395z.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f16395C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.P2.d(context);
        v3.e eVarC = v3.h.c();
        this.f16413n = eVarC;
        Long l7 = c2245l2.f16892i;
        this.f16399G = l7 != null ? l7.longValue() : eVarC.a();
        this.f16406g = new C2212f(this);
        C2303x1 c2303x1 = new C2303x1(this);
        c2303x1.l();
        this.f16407h = c2303x1;
        C2234j1 c2234j1 = new C2234j1(this);
        c2234j1.l();
        this.f16408i = c2234j1;
        i4 i4Var = new i4(this);
        i4Var.l();
        this.f16411l = i4Var;
        this.f16412m = new C2209e1(new C2240k2(c2245l2, this));
        this.f16416q = new A0(this);
        Z2 z22 = new Z2(this);
        z22.j();
        this.f16414o = z22;
        N2 n22 = new N2(this);
        n22.j();
        this.f16415p = n22;
        O3 o32 = new O3(this);
        o32.j();
        this.f16410k = o32;
        Q2 q22 = new Q2(this);
        q22.l();
        this.f16417r = q22;
        L1 l1 = new L1(this);
        l1.l();
        this.f16409j = l1;
        zzcl zzclVar2 = c2245l2.f16890g;
        boolean z7 = zzclVar2 == null || zzclVar2.f15390e == 0;
        if (context.getApplicationContext() instanceof Application) {
            N2 n2I = I();
            if (n2I.f16818a.f16400a.getApplicationContext() instanceof Application) {
                Application application = (Application) n2I.f16818a.f16400a.getApplicationContext();
                if (n2I.f16426c == null) {
                    n2I.f16426c = new L2(n2I, null);
                }
                if (z7) {
                    application.unregisterActivityLifecycleCallbacks(n2I.f16426c);
                    application.registerActivityLifecycleCallbacks(n2I.f16426c);
                    n2I.f16818a.b().v().a("Registered activity lifecycle callback");
                }
            }
        } else {
            b().w().a("Application context is not an Application");
        }
        l1.z(new M1(this, c2245l2));
    }

    public static N1 H(Context context, zzcl zzclVar, Long l7) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f15393w == null || zzclVar.f15394y == null)) {
            zzclVar = new zzcl(zzclVar.f15389d, zzclVar.f15390e, zzclVar.f15391i, zzclVar.f15392v, null, null, zzclVar.f15395z, null);
        }
        C2651i.l(context);
        C2651i.l(context.getApplicationContext());
        if (f16392H == null) {
            synchronized (N1.class) {
                try {
                    if (f16392H == null) {
                        f16392H = new N1(new C2245l2(context, zzclVar, l7));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f15395z) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C2651i.l(f16392H);
            f16392H.f16393A = Boolean.valueOf(zzclVar.f15395z.getBoolean("dataCollectionDefaultEnabled"));
        }
        C2651i.l(f16392H);
        return f16392H;
    }

    static void e(N1 n1, C2245l2 c2245l2) {
        n1.a().h();
        n1.f16406g.w();
        C2247m c2247m = new C2247m(n1);
        c2247m.l();
        n1.f16421v = c2247m;
        C2194b1 c2194b1 = new C2194b1(n1, c2245l2.f16889f);
        c2194b1.j();
        n1.f16422w = c2194b1;
        C2204d1 c2204d1 = new C2204d1(n1);
        c2204d1.j();
        n1.f16419t = c2204d1;
        C2315z3 c2315z3 = new C2315z3(n1);
        c2315z3.j();
        n1.f16420u = c2315z3;
        n1.f16411l.m();
        n1.f16407h.m();
        n1.f16422w.k();
        C2224h1 c2224h1U = n1.b().u();
        n1.f16406g.q();
        c2224h1U.b("App measurement initialized, version", 46000L);
        n1.b().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strS = c2194b1.s();
        if (TextUtils.isEmpty(n1.f16401b)) {
            if (n1.N().S(strS)) {
                n1.b().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C2224h1 c2224h1U2 = n1.b().u();
                String strValueOf = String.valueOf(strS);
                c2224h1U2.a(strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        n1.b().q().a("Debug-level message logging enabled");
        if (n1.f16397E != n1.f16398F.get()) {
            n1.b().r().c("Not all components initialized", Integer.valueOf(n1.f16397E), Integer.valueOf(n1.f16398F.get()));
        }
        n1.f16423x = true;
    }

    static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void u(C2225h2 c2225h2) {
        if (c2225h2 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void v(AbstractC2298w1 abstractC2298w1) {
        if (abstractC2298w1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2298w1.m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2298w1.getClass())));
        }
    }

    private static final void w(AbstractC2230i2 abstractC2230i2) {
        if (abstractC2230i2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2230i2.n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2230i2.getClass())));
        }
    }

    public final C2247m A() {
        w(this.f16421v);
        return this.f16421v;
    }

    public final C2194b1 B() {
        v(this.f16422w);
        return this.f16422w;
    }

    public final C2204d1 C() {
        v(this.f16419t);
        return this.f16419t;
    }

    public final C2209e1 D() {
        return this.f16412m;
    }

    public final C2234j1 E() {
        C2234j1 c2234j1 = this.f16408i;
        if (c2234j1 == null || !c2234j1.n()) {
            return null;
        }
        return this.f16408i;
    }

    public final C2303x1 F() {
        u(this.f16407h);
        return this.f16407h;
    }

    final L1 G() {
        return this.f16409j;
    }

    public final N2 I() {
        v(this.f16415p);
        return this.f16415p;
    }

    public final Q2 J() {
        w(this.f16417r);
        return this.f16417r;
    }

    public final Z2 K() {
        v(this.f16414o);
        return this.f16414o;
    }

    public final C2315z3 L() {
        v(this.f16420u);
        return this.f16420u;
    }

    public final O3 M() {
        v(this.f16410k);
        return this.f16410k;
    }

    public final i4 N() {
        u(this.f16411l);
        return this.f16411l;
    }

    public final String O() {
        return this.f16401b;
    }

    public final String P() {
        return this.f16402c;
    }

    public final String Q() {
        return this.f16403d;
    }

    public final String R() {
        return this.f16418s;
    }

    @Override
    public final L1 a() {
        w(this.f16409j);
        return this.f16409j;
    }

    @Override
    public final C2234j1 b() {
        w(this.f16408i);
        return this.f16408i;
    }

    @Override
    public final v3.e c() {
        return this.f16413n;
    }

    @Override
    public final C2192b d() {
        return this.f16405f;
    }

    @Override
    public final Context f() {
        return this.f16400a;
    }

    final void g() {
        this.f16398F.incrementAndGet();
    }

    final void h(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N1.h(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void i() {
        this.f16397E++;
    }

    public final void j() throws IllegalStateException {
        a().h();
        w(J());
        String strS = B().s();
        Pair<String, Boolean> pairP = F().p(strS);
        if (!this.f16406g.A() || ((Boolean) pairP.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairP.first)) {
            b().q().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        Q2 q2J = J();
        q2J.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) q2J.f16818a.f16400a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            b().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        i4 i4VarN = N();
        B().f16818a.f16406g.q();
        URL urlR = i4VarN.r(46000L, strS, (String) pairP.first, (-1) + F().f17097s.a());
        if (urlR != null) {
            Q2 q2J2 = J();
            W3.l lVar = new W3.l(this);
            q2J2.h();
            q2J2.k();
            C2651i.l(urlR);
            C2651i.l(lVar);
            q2J2.f16818a.a().y(new P2(q2J2, strS, urlR, null, null, lVar, null));
        }
    }

    final void k(boolean z7) {
        this.f16393A = Boolean.valueOf(z7);
    }

    public final void l(boolean z7) {
        a().h();
        this.f16396D = z7;
    }

    protected final void m(zzcl zzclVar) throws ClassNotFoundException {
        W3.a aVar;
        a().h();
        W3.a aVarQ = F().q();
        C2303x1 c2303x1F = F();
        N1 n1 = c2303x1F.f16818a;
        c2303x1F.h();
        int i7 = 100;
        int i8 = c2303x1F.o().getInt("consent_source", 100);
        C2212f c2212f = this.f16406g;
        N1 n12 = c2212f.f16818a;
        Boolean boolT = c2212f.t("google_analytics_default_allow_ad_storage");
        C2212f c2212f2 = this.f16406g;
        N1 n13 = c2212f2.f16818a;
        Boolean boolT2 = c2212f2.t("google_analytics_default_allow_analytics_storage");
        if (!(boolT == null && boolT2 == null) && F().w(-10)) {
            aVar = new W3.a(boolT, boolT2);
            i7 = -10;
        } else {
            if (TextUtils.isEmpty(B().u()) || !(i8 == 0 || i8 == 30 || i8 == 10 || i8 == 30 || i8 == 30 || i8 == 40)) {
                V5.b();
                if ((!this.f16406g.B(null, Y0.f16645t0) || TextUtils.isEmpty(B().u())) && zzclVar != null && zzclVar.f15395z != null && F().w(30)) {
                    aVar = W3.a.a(zzclVar.f15395z);
                    if (!aVar.equals(W3.a.f7645c)) {
                        i7 = 30;
                    }
                }
            } else {
                I().G(W3.a.f7645c, -10, this.f16399G);
            }
            aVar = null;
        }
        if (aVar != null) {
            I().G(aVar, i7, this.f16399G);
            aVarQ = aVar;
        }
        I().K(aVarQ);
        if (F().f17083e.a() == 0) {
            b().v().b("Persisting first open", Long.valueOf(this.f16399G));
            F().f17083e.b(this.f16399G);
        }
        I().f16437n.c();
        if (r()) {
            if (!TextUtils.isEmpty(B().u()) || !TextUtils.isEmpty(B().r())) {
                i4 i4VarN = N();
                String strU = B().u();
                C2303x1 c2303x1F2 = F();
                c2303x1F2.h();
                String string = c2303x1F2.o().getString("gmp_app_id", null);
                String strR = B().r();
                C2303x1 c2303x1F3 = F();
                c2303x1F3.h();
                if (i4VarN.b0(strU, string, strR, c2303x1F3.o().getString("admob_app_id", null))) {
                    b().u().a("Rechecking which service to use due to a GMP App Id change");
                    C2303x1 c2303x1F4 = F();
                    c2303x1F4.h();
                    Boolean boolR = c2303x1F4.r();
                    SharedPreferences.Editor editorEdit = c2303x1F4.o().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolR != null) {
                        c2303x1F4.s(boolR);
                    }
                    C().q();
                    this.f16420u.Q();
                    this.f16420u.P();
                    F().f17083e.b(this.f16399G);
                    F().f17085g.b(null);
                }
                C2303x1 c2303x1F5 = F();
                String strU2 = B().u();
                c2303x1F5.h();
                SharedPreferences.Editor editorEdit2 = c2303x1F5.o().edit();
                editorEdit2.putString("gmp_app_id", strU2);
                editorEdit2.apply();
                C2303x1 c2303x1F6 = F();
                String strR2 = B().r();
                c2303x1F6.h();
                SharedPreferences.Editor editorEdit3 = c2303x1F6.o().edit();
                editorEdit3.putString("admob_app_id", strR2);
                editorEdit3.apply();
            }
            if (!F().q().k()) {
                F().f17085g.b(null);
            }
            I().C(F().f17085g.a());
            S5.b();
            if (this.f16406g.B(null, Y0.f16625j0)) {
                try {
                    N().f16818a.f16400a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().f17098t.a())) {
                        b().w().a("Remote config removed with active feature rollouts");
                        F().f17098t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().u()) || !TextUtils.isEmpty(B().r())) {
                boolean zO = o();
                if (!F().u() && !this.f16406g.E()) {
                    F().t(!zO);
                }
                if (zO) {
                    I().g0();
                }
                M().f16452d.a();
                L().S(new AtomicReference<>());
                L().v(F().f17101w.a());
            }
        } else if (o()) {
            if (!N().R("android.permission.INTERNET")) {
                b().r().a("App is missing INTERNET permission");
            }
            if (!N().R("android.permission.ACCESS_NETWORK_STATE")) {
                b().r().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2989c.a(this.f16400a).g() && !this.f16406g.G()) {
                if (!i4.X(this.f16400a)) {
                    b().r().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!i4.Y(this.f16400a, false)) {
                    b().r().a("AppMeasurementService not registered/enabled");
                }
            }
            b().r().a("Uploading is not possible. App measurement disabled");
        }
        F().f17092n.a(true);
    }

    public final boolean n() {
        return this.f16393A != null && this.f16393A.booleanValue();
    }

    public final boolean o() {
        return x() == 0;
    }

    public final boolean p() {
        a().h();
        return this.f16396D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f16401b);
    }

    protected final boolean r() {
        if (!this.f16423x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        a().h();
        Boolean bool = this.f16424y;
        if (bool == null || this.f16425z == 0 || (!bool.booleanValue() && Math.abs(this.f16413n.b() - this.f16425z) > 1000)) {
            this.f16425z = this.f16413n.b();
            boolean z7 = true;
            Boolean boolValueOf = Boolean.valueOf(N().R("android.permission.INTERNET") && N().R("android.permission.ACCESS_NETWORK_STATE") && (C2989c.a(this.f16400a).g() || this.f16406g.G() || (i4.X(this.f16400a) && i4.Y(this.f16400a, false))));
            this.f16424y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!N().K(B().u(), B().r(), B().t()) && TextUtils.isEmpty(B().r())) {
                    z7 = false;
                }
                this.f16424y = Boolean.valueOf(z7);
            }
        }
        return this.f16424y.booleanValue();
    }

    public final boolean s() {
        return this.f16404e;
    }

    public final int x() {
        a().h();
        if (this.f16406g.E()) {
            return 1;
        }
        Boolean bool = this.f16395C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        a().h();
        if (!this.f16396D) {
            return 8;
        }
        Boolean boolR = F().r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        C2212f c2212f = this.f16406g;
        C2192b c2192b = c2212f.f16818a.f16405f;
        Boolean boolT = c2212f.t("firebase_analytics_collection_enabled");
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f16394B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f16406g.B(null, Y0.f16600U) || this.f16393A == null || this.f16393A.booleanValue()) ? 0 : 7;
    }

    public final A0 y() {
        A0 a02 = this.f16416q;
        if (a02 != null) {
            return a02;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2212f z() {
        return this.f16406g;
    }
}
