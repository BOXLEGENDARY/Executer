package com.google.android.gms.measurement.internal;

import Za.qhkq.dHkZSUxHu;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.gms.internal.measurement.C1848c6;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.S5;
import com.google.android.gms.internal.measurement.V5;
import g0.C2457a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;
import ya.HnSi.PLHvHoayk;

public final class N2 extends AbstractC2298w1 {

    protected L2 f16426c;

    private W3.q f16427d;

    private final Set<W3.r> f16428e;

    private boolean f16429f;

    private final AtomicReference<String> f16430g;

    private final Object f16431h;

    private W3.a f16432i;

    private int f16433j;

    private final AtomicLong f16434k;

    private long f16435l;

    private int f16436m;

    final o4 f16437n;

    protected boolean f16438o;

    private final h4 f16439p;

    protected N2(N1 n1) {
        super(n1);
        this.f16428e = new CopyOnWriteArraySet();
        this.f16431h = new Object();
        this.f16438o = true;
        this.f16439p = new B2(this);
        this.f16430g = new AtomicReference<>();
        this.f16432i = new W3.a(null, null);
        this.f16433j = 100;
        this.f16435l = -1L;
        this.f16436m = 100;
        this.f16434k = new AtomicLong(0L);
        this.f16437n = new o4(n1);
    }

    public final void p(Bundle bundle, long j7) {
        V5.b();
        if (!this.f16818a.z().B(null, Y0.f16645t0) || TextUtils.isEmpty(this.f16818a.B().u())) {
            F(bundle, 0, j7);
        } else {
            this.f16818a.b().x().a("Using developer consent only; google app id found");
        }
    }

    public final void Q(Boolean bool, boolean z7) throws IllegalStateException {
        h();
        i();
        this.f16818a.b().q().b("Setting app measurement enabled (FE)", bool);
        this.f16818a.F().s(bool);
        if (z7) {
            C2303x1 c2303x1F = this.f16818a.F();
            N1 n1 = c2303x1F.f16818a;
            c2303x1F.h();
            SharedPreferences.Editor editorEdit = c2303x1F.o().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f16818a.p() || !(bool == null || bool.booleanValue())) {
            R();
        }
    }

    public final void R() throws IllegalStateException {
        h();
        String strA = this.f16818a.F().f17091m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                N("app", "_npa", null, this.f16818a.c().a());
            } else {
                N("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), this.f16818a.c().a());
            }
        }
        if (!this.f16818a.o() || !this.f16438o) {
            this.f16818a.b().q().a("Updating Scion state (FE)");
            this.f16818a.L().w();
            return;
        }
        this.f16818a.b().q().a("Recording app launch after enabling measurement for the first time (FE)");
        g0();
        C1848c6.b();
        if (this.f16818a.z().B(null, Y0.f16627k0)) {
            this.f16818a.M().f16452d.a();
        }
        this.f16818a.a().z(new RunnableC2274r2(this));
    }

    static void d0(N2 n22, W3.a aVar, int i7, long j7, boolean z7, boolean z8) {
        n22.h();
        n22.i();
        if (j7 <= n22.f16435l && W3.a.l(n22.f16436m, i7)) {
            n22.f16818a.b().u().b("Dropped out-of-date consent setting, proposed settings", aVar);
            return;
        }
        C2303x1 c2303x1F = n22.f16818a.F();
        N1 n1 = c2303x1F.f16818a;
        c2303x1F.h();
        if (!c2303x1F.w(i7)) {
            n22.f16818a.b().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i7));
            return;
        }
        SharedPreferences.Editor editorEdit = c2303x1F.o().edit();
        editorEdit.putString("consent_settings", aVar.i());
        editorEdit.putInt("consent_source", i7);
        editorEdit.apply();
        n22.f16435l = j7;
        n22.f16436m = i7;
        n22.f16818a.L().t(z7);
        if (z8) {
            n22.f16818a.L().S(new AtomicReference<>());
        }
    }

    protected final void A(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) throws IllegalStateException {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i7 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i7 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i7];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelable);
                        }
                        i7++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i7 < list.size()) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                        i7++;
                    }
                }
            }
        }
        this.f16818a.a().z(new RunnableC2284t2(this, str, str2, j7, bundle2, z7, z8, z9, str3));
    }

    final void B(String str, String str2, long j7, Object obj) throws IllegalStateException {
        this.f16818a.a().z(new RunnableC2289u2(this, str, str2, obj, j7));
    }

    final void C(String str) {
        this.f16430g.set(str);
    }

    public final void D(Bundle bundle) throws IllegalStateException {
        E(bundle, this.f16818a.c().a());
    }

    public final void E(Bundle bundle, long j7) throws IllegalStateException {
        C2651i.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f16818a.b().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C2651i.l(bundle2);
        W3.m.a(bundle2, "app_id", String.class, null);
        W3.m.a(bundle2, "origin", String.class, null);
        W3.m.a(bundle2, "name", String.class, null);
        String str = PLHvHoayk.BthZsEWT;
        W3.m.a(bundle2, str, Object.class, null);
        W3.m.a(bundle2, "trigger_event_name", String.class, null);
        W3.m.a(bundle2, "trigger_timeout", Long.class, 0L);
        W3.m.a(bundle2, "timed_out_event_name", String.class, null);
        W3.m.a(bundle2, "timed_out_event_params", Bundle.class, null);
        W3.m.a(bundle2, "triggered_event_name", String.class, null);
        W3.m.a(bundle2, "triggered_event_params", Bundle.class, null);
        W3.m.a(bundle2, "time_to_live", Long.class, 0L);
        W3.m.a(bundle2, "expired_event_name", String.class, null);
        W3.m.a(bundle2, "expired_event_params", Bundle.class, null);
        C2651i.f(bundle2.getString("name"));
        C2651i.f(bundle2.getString("origin"));
        C2651i.l(bundle2.get(str));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(str);
        if (this.f16818a.N().n0(string) != 0) {
            this.f16818a.b().r().b("Invalid conditional user property name", this.f16818a.D().f(string));
            return;
        }
        if (this.f16818a.N().j0(string, obj) != 0) {
            this.f16818a.b().r().c("Invalid conditional user property value", this.f16818a.D().f(string), obj);
            return;
        }
        Object objP = this.f16818a.N().p(string, obj);
        if (objP == null) {
            this.f16818a.b().r().c("Unable to normalize conditional user property value", this.f16818a.D().f(string), obj);
            return;
        }
        W3.m.b(bundle2, objP);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.f16818a.z();
            if (j8 > 15552000000L || j8 < 1) {
                this.f16818a.b().r().c("Invalid conditional user property timeout", this.f16818a.D().f(string), Long.valueOf(j8));
                return;
            }
        }
        long j9 = bundle2.getLong("time_to_live");
        this.f16818a.z();
        if (j9 > 15552000000L || j9 < 1) {
            this.f16818a.b().r().c("Invalid conditional user property time to live", this.f16818a.D().f(string), Long.valueOf(j9));
        } else {
            this.f16818a.a().z(new RunnableC2299w2(this, bundle2));
        }
    }

    public final void F(Bundle bundle, int i7, long j7) {
        i();
        String strH = W3.a.h(bundle);
        if (strH != null) {
            this.f16818a.b().x().b(sMlEMqrxoGI.qHbH, strH);
            this.f16818a.b().x().a("Valid consent values are 'granted', 'denied'");
        }
        G(W3.a.a(bundle), i7, j7);
    }

    public final void G(W3.a aVar, int i7, long j7) {
        boolean z7;
        W3.a aVar2;
        boolean z8;
        boolean zM;
        i();
        if (i7 != -10 && aVar.e() == null && aVar.f() == null) {
            this.f16818a.b().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f16431h) {
            try {
                z7 = false;
                if (W3.a.l(i7, this.f16433j)) {
                    zM = aVar.m(this.f16432i);
                    if (aVar.k() && !this.f16432i.k()) {
                        z7 = true;
                    }
                    W3.a aVarD = aVar.d(this.f16432i);
                    this.f16432i = aVarD;
                    this.f16433j = i7;
                    aVar2 = aVarD;
                    z8 = z7;
                    z7 = true;
                } else {
                    aVar2 = aVar;
                    z8 = false;
                    zM = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            this.f16818a.b().u().b("Ignoring lower-priority consent settings, proposed settings", aVar2);
            return;
        }
        long andIncrement = this.f16434k.getAndIncrement();
        if (zM) {
            this.f16430g.set(null);
            this.f16818a.a().A(new H2(this, aVar2, j7, i7, andIncrement, z8));
        } else if (i7 == 30 || i7 == -10) {
            this.f16818a.a().A(new I2(this, aVar2, i7, andIncrement, z8));
        } else {
            this.f16818a.a().z(new J2(this, aVar2, i7, andIncrement, z8));
        }
    }

    public final void H(final Bundle bundle, final long j7) throws IllegalStateException {
        V5.b();
        if (this.f16818a.z().B(null, Y0.f16647u0)) {
            this.f16818a.a().A(new Runnable() {
                @Override
                public final void run() {
                    this.f16956d.p(bundle, j7);
                }
            });
        } else {
            p(bundle, j7);
        }
    }

    public final void I(W3.q qVar) {
        W3.q qVar2;
        h();
        i();
        if (qVar != null && qVar != (qVar2 = this.f16427d)) {
            C2651i.q(qVar2 == null, "EventInterceptor already set.");
        }
        this.f16427d = qVar;
    }

    public final void J(Boolean bool) throws IllegalStateException {
        i();
        this.f16818a.a().z(new G2(this, bool));
    }

    final void K(W3.a aVar) {
        h();
        boolean z7 = (aVar.k() && aVar.j()) || this.f16818a.L().A();
        if (z7 != this.f16818a.p()) {
            this.f16818a.l(z7);
            C2303x1 c2303x1F = this.f16818a.F();
            N1 n1 = c2303x1F.f16818a;
            c2303x1F.h();
            Boolean boolValueOf = c2303x1F.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(c2303x1F.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z7 || boolValueOf == null || boolValueOf.booleanValue()) {
                Q(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void L(String str, String str2, Object obj, boolean z7) throws IllegalStateException {
        M("auto", "_ldl", obj, true, this.f16818a.c().a());
    }

    public final void M(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) throws java.lang.IllegalStateException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N2.M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    final void N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N2.N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void O(W3.r rVar) {
        i();
        C2651i.l(rVar);
        if (this.f16428e.remove(rVar)) {
            return;
        }
        this.f16818a.b().w().a("OnEventListener had not been registered");
    }

    public final int S(String str) {
        C2651i.f(str);
        this.f16818a.z();
        return 25;
    }

    public final Boolean T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f16818a.a().r(atomicReference, 15000L, "boolean test flag value", new RunnableC2309y2(this, atomicReference));
    }

    public final Double U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f16818a.a().r(atomicReference, 15000L, "double test flag value", new F2(this, atomicReference));
    }

    public final Integer V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f16818a.a().r(atomicReference, 15000L, "int test flag value", new E2(this, atomicReference));
    }

    public final Long W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f16818a.a().r(atomicReference, 15000L, "long test flag value", new D2(this, atomicReference));
    }

    public final String X() {
        return this.f16430g.get();
    }

    public final String Y() {
        S2 s2S = this.f16818a.K().s();
        if (s2S != null) {
            return s2S.f16514b;
        }
        return null;
    }

    public final String Z() {
        S2 s2S = this.f16818a.K().s();
        if (s2S != null) {
            return s2S.f16513a;
        }
        return null;
    }

    public final String a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f16818a.a().r(atomicReference, 15000L, "String test flag value", new C2(this, atomicReference));
    }

    public final ArrayList<Bundle> b0(String str, String str2) {
        if (this.f16818a.a().C()) {
            this.f16818a.b().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f16818a.d();
        if (C2192b.a()) {
            this.f16818a.b().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f16818a.a().r(atomicReference, 5000L, "get conditional user properties", new RunnableC2314z2(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return i4.u(list);
        }
        this.f16818a.b().r().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> c0(String str, String str2, boolean z7) {
        if (this.f16818a.a().C()) {
            this.f16818a.b().r().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f16818a.d();
        if (C2192b.a()) {
            this.f16818a.b().r().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f16818a.a().r(atomicReference, 5000L, "get user properties", new A2(this, atomicReference, null, str, str2, z7));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.f16818a.b().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
            return Collections.emptyMap();
        }
        C2457a c2457a = new C2457a(list.size());
        for (zzkv zzkvVar : list) {
            Object objL = zzkvVar.l();
            if (objL != null) {
                c2457a.put(zzkvVar.f17147e, objL);
            }
        }
        return c2457a;
    }

    public final void g0() {
        h();
        i();
        if (this.f16818a.r()) {
            if (this.f16818a.z().B(null, Y0.f16609b0)) {
                C2212f c2212fZ = this.f16818a.z();
                c2212fZ.f16818a.d();
                Boolean boolT = c2212fZ.t(sMlEMqrxoGI.fIiqLOVNvOC);
                if (boolT != null && boolT.booleanValue()) {
                    this.f16818a.b().q().a("Deferred Deep Link feature enabled.");
                    this.f16818a.a().z(new Runnable() {
                        @Override
                        public final void run() throws IllegalStateException {
                            N2 n22 = this.f16909d;
                            n22.h();
                            if (n22.f16818a.F().f17096r.b()) {
                                n22.f16818a.b().q().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = n22.f16818a.F().f17097s.a();
                            n22.f16818a.F().f17097s.b(1 + jA);
                            n22.f16818a.z();
                            if (jA < 5) {
                                n22.f16818a.j();
                            } else {
                                n22.f16818a.b().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                n22.f16818a.F().f17096r.a(true);
                            }
                        }
                    });
                }
            }
            this.f16818a.L().O();
            this.f16438o = false;
            C2303x1 c2303x1F = this.f16818a.F();
            c2303x1F.h();
            String string = c2303x1F.o().getString("previous_os_version", null);
            c2303x1F.f16818a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c2303x1F.o().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f16818a.A().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            u("auto", "_ou", bundle);
        }
    }

    public final void h0(String str, String str2, Bundle bundle) throws IllegalStateException {
        long jA = this.f16818a.c().a();
        C2651i.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f16818a.a().z(new RunnableC2304x2(this, bundle2));
    }

    @Override
    protected final boolean n() {
        return false;
    }

    public final void o() {
        if (!(this.f16818a.f().getApplicationContext() instanceof Application) || this.f16426c == null) {
            return;
        }
        ((Application) this.f16818a.f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16426c);
    }

    final void q(Bundle bundle) {
        if (bundle == null) {
            this.f16818a.F().f17101w.b(new Bundle());
            return;
        }
        Bundle bundleA = this.f16818a.F().f17101w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f16818a.N().T(obj)) {
                    this.f16818a.N().A(this.f16439p, null, 27, null, null, 0);
                }
                this.f16818a.b().x().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (i4.V(str)) {
                this.f16818a.b().x().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else {
                i4 i4VarN = this.f16818a.N();
                this.f16818a.z();
                if (i4VarN.N(dHkZSUxHu.hKhoNpAko, str, 100, obj)) {
                    this.f16818a.N().B(bundleA, str, obj);
                }
            }
        }
        this.f16818a.N();
        int iM = this.f16818a.z().m();
        if (bundleA.size() > iM) {
            int i7 = 0;
            for (String str2 : new TreeSet(bundleA.keySet())) {
                i7++;
                if (i7 > iM) {
                    bundleA.remove(str2);
                }
            }
            this.f16818a.N().A(this.f16439p, null, 26, null, null, 0);
            this.f16818a.b().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f16818a.F().f17101w.b(bundleA);
        this.f16818a.L().v(bundleA);
    }

    public final void r(String str, String str2, Bundle bundle) throws IllegalStateException {
        s(str, str2, bundle, true, true, this.f16818a.c().a());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) throws IllegalStateException {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (i4.Z(str2, "screen_view")) {
            this.f16818a.K().F(bundle2, j7);
            return;
        }
        boolean z9 = true;
        if (z8 && this.f16427d != null && !i4.V(str2)) {
            z9 = false;
        }
        A(str3, str2, j7, bundle2, z8, z9, z7, null);
    }

    public final void t(String str, String str2, Bundle bundle, String str3) throws IllegalStateException {
        N1.t();
        A("auto", str2, this.f16818a.c().a(), bundle, false, true, true, str3);
    }

    final void u(String str, String str2, Bundle bundle) {
        h();
        v(str, str2, this.f16818a.c().a(), bundle);
    }

    final void v(String str, String str2, long j7, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        h();
        w(str, str2, j7, bundle, true, this.f16427d == null || i4.V(str2), true, null);
    }

    protected final void w(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        String str4;
        long j8;
        String str5;
        String str6;
        Bundle[] bundleArr;
        C2651i.f(str);
        C2651i.l(bundle);
        h();
        i();
        if (!this.f16818a.o()) {
            this.f16818a.b().q().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listV = this.f16818a.B().v();
        if (listV != null && !listV.contains(str2)) {
            this.f16818a.b().q().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f16429f) {
            this.f16429f = true;
            try {
                try {
                    (!this.f16818a.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f16818a.f().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f16818a.f());
                } catch (Exception e7) {
                    this.f16818a.b().w().b("Failed to invoke Tag Manager's initialize() method", e7);
                }
            } catch (ClassNotFoundException unused) {
                this.f16818a.b().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.f16818a.d();
            N("auto", "_lgclid", bundle.getString("gclid"), this.f16818a.c().a());
        }
        this.f16818a.d();
        if (z7 && i4.a0(str2)) {
            this.f16818a.N().y(bundle, this.f16818a.F().f17101w.a());
        }
        if (!z9) {
            this.f16818a.d();
            if (!"_iap".equals(str2)) {
                i4 i4VarN = this.f16818a.N();
                int i7 = 2;
                if (i4VarN.Q("event", str2)) {
                    if (i4VarN.M("event", W3.n.f7652a, W3.n.f7653b, str2)) {
                        i4VarN.f16818a.z();
                        if (i4VarN.L("event", 40, str2)) {
                            i7 = 0;
                        }
                    } else {
                        i7 = 13;
                    }
                }
                if (i7 != 0) {
                    this.f16818a.b().s().b("Invalid public event name. Event will not be logged (FE)", this.f16818a.D().d(str2));
                    i4 i4VarN2 = this.f16818a.N();
                    this.f16818a.z();
                    this.f16818a.N().A(this.f16439p, null, i7, "_ev", i4VarN2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        N6.b();
        if (this.f16818a.z().B(null, Y0.f16580C0)) {
            this.f16818a.d();
            S2 s2T = this.f16818a.K().t(false);
            if (s2T != null && !bundle.containsKey("_sc")) {
                s2T.f16516d = true;
            }
            i4.x(s2T, bundle, z7 && !z9);
        } else {
            this.f16818a.d();
            S2 s2T2 = this.f16818a.K().t(false);
            if (s2T2 != null && !bundle.containsKey("_sc")) {
                s2T2.f16516d = true;
            }
            i4.x(s2T2, bundle, z7 && !z9);
        }
        boolean zEquals = "am".equals(str);
        boolean zV = i4.V(str2);
        if (!z7 || this.f16427d == null || zV) {
            z10 = zEquals;
        } else {
            if (!zEquals) {
                this.f16818a.b().q().c("Passing event to registered event handler (FE)", this.f16818a.D().d(str2), this.f16818a.D().b(bundle));
                C2651i.l(this.f16427d);
                this.f16427d.a(str, str2, bundle, j7);
                return;
            }
            z10 = true;
        }
        if (this.f16818a.r()) {
            int iK0 = this.f16818a.N().k0(str2);
            if (iK0 != 0) {
                this.f16818a.b().s().b("Invalid event name. Event will not be logged (FE)", this.f16818a.D().d(str2));
                i4 i4VarN3 = this.f16818a.N();
                this.f16818a.z();
                this.f16818a.N().A(this.f16439p, str3, iK0, "_ev", i4VarN3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleV0 = this.f16818a.N().v0(str3, str2, bundle, v3.f.b("_o", "_sn", "_sc", "_si"), z9);
            C2651i.l(bundleV0);
            this.f16818a.d();
            if (this.f16818a.K().t(false) != null && "_ae".equals(str2)) {
                M3 m32 = this.f16818a.M().f16453e;
                long jB = m32.f16389d.f16818a.c().b();
                long j9 = jB - m32.f16387b;
                m32.f16387b = jB;
                if (j9 > 0) {
                    this.f16818a.N().v(bundleV0, j9);
                }
            }
            S5.b();
            if (this.f16818a.z().B(null, Y0.f16625j0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    i4 i4VarN4 = this.f16818a.N();
                    String string = bundleV0.getString("_ffr");
                    if (v3.r.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (i4.Z(string, i4VarN4.f16818a.F().f17098t.a())) {
                        i4VarN4.f16818a.b().q().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    i4VarN4.f16818a.F().f17098t.b(string);
                } else if ("_ae".equals(str2)) {
                    String strA = this.f16818a.N().f16818a.F().f17098t.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleV0.putString("_ffr", strA);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleV0);
            if (this.f16818a.F().f17093o.a() > 0 && this.f16818a.F().v(j7) && this.f16818a.F().f17095q.b()) {
                this.f16818a.b().v().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j8 = 0;
                N(JmBUOGMwkkxg.MSdZOL, "_sid", null, this.f16818a.c().a());
                N("auto", "_sno", null, this.f16818a.c().a());
                N("auto", "_se", null, this.f16818a.c().a());
            } else {
                str4 = "_ae";
                j8 = 0;
            }
            if (bundleV0.getLong("extend_session", j8) == 1) {
                this.f16818a.b().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f16818a.M().f16452d.b(j7, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleV0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                String str7 = (String) arrayList2.get(i8);
                if (str7 != null) {
                    this.f16818a.N();
                    Object obj = bundleV0.get(str7);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleV0.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Bundle bundleU0 = (Bundle) arrayList.get(i9);
                if (i9 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundleU0.putString("_o", str5);
                if (z8) {
                    bundleU0 = this.f16818a.N().u0(bundleU0);
                }
                Bundle bundle2 = bundleU0;
                this.f16818a.L().o(new zzat(str6, new zzar(bundle2), str, j7), str3);
                if (!z10) {
                    Iterator<W3.r> it = this.f16428e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle2), j7);
                    }
                }
            }
            this.f16818a.d();
            if (this.f16818a.K().t(false) == null || !str4.equals(str2)) {
                return;
            }
            this.f16818a.M().f16453e.d(true, true, this.f16818a.c().b());
        }
    }

    public final void x(W3.r rVar) {
        i();
        C2651i.l(rVar);
        if (this.f16428e.add(rVar)) {
            return;
        }
        this.f16818a.b().w().a("OnEventListener already registered");
    }

    public final void y(long j7) throws IllegalStateException {
        this.f16430g.set(null);
        this.f16818a.a().z(new RunnableC2294v2(this, j7));
    }

    final void z(long j7, boolean z7) {
        h();
        i();
        this.f16818a.b().q().a("Resetting analytics data (FE)");
        O3 o3M = this.f16818a.M();
        o3M.h();
        o3M.f16453e.a();
        boolean zO = this.f16818a.o();
        C2303x1 c2303x1F = this.f16818a.F();
        c2303x1F.f17083e.b(j7);
        if (!TextUtils.isEmpty(c2303x1F.f16818a.F().f17098t.a())) {
            c2303x1F.f17098t.b(null);
        }
        C1848c6.b();
        C2212f c2212fZ = c2303x1F.f16818a.z();
        X0<Boolean> x02 = Y0.f16627k0;
        if (c2212fZ.B(null, x02)) {
            c2303x1F.f17093o.b(0L);
        }
        if (!c2303x1F.f16818a.z().E()) {
            c2303x1F.t(!zO);
        }
        c2303x1F.f17099u.b(null);
        c2303x1F.f17100v.b(0L);
        c2303x1F.f17101w.b(null);
        if (z7) {
            this.f16818a.L().q();
        }
        C1848c6.b();
        if (this.f16818a.z().B(null, x02)) {
            this.f16818a.M().f16452d.a();
        }
        this.f16438o = !zO;
    }
}
