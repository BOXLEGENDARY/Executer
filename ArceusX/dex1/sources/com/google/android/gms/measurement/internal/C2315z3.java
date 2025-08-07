package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;
import u3.C2928b;

public final class C2315z3 extends AbstractC2298w1 {

    private final ServiceConnectionC2310y3 f17123c;

    private W3.d f17124d;

    private volatile Boolean f17125e;

    private final AbstractC2242l f17126f;

    private final P3 f17127g;

    private final List<Runnable> f17128h;

    private final AbstractC2242l f17129i;

    protected C2315z3(N1 n1) {
        super(n1);
        this.f17128h = new ArrayList();
        this.f17127g = new P3(n1.c());
        this.f17123c = new ServiceConnectionC2310y3(this);
        this.f17126f = new C2231i3(this, n1);
        this.f17129i = new C2246l3(this, n1);
    }

    private final zzp C(boolean z7) {
        Pair<String, Long> pairA;
        this.f16818a.d();
        C2194b1 c2194b1B = this.f16818a.B();
        String string = null;
        if (z7) {
            C2234j1 c2234j1B = this.f16818a.b();
            if (c2234j1B.f16818a.F().f17082d != null && (pairA = c2234j1B.f16818a.F().f17082d.a()) != null && pairA != C2303x1.f17080x) {
                String strValueOf = String.valueOf(pairA.second);
                String str = (String) pairA.first;
                StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb.append(strValueOf);
                sb.append(":");
                sb.append(str);
                string = sb.toString();
            }
        }
        return c2194b1B.q(string);
    }

    public final void D() {
        h();
        this.f16818a.b().v().b("Processing queued up service tasks", Integer.valueOf(this.f17128h.size()));
        Iterator<Runnable> it = this.f17128h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e7) {
                this.f16818a.b().r().b("Task exception while flushing queue", e7);
            }
        }
        this.f17128h.clear();
        this.f17129i.b();
    }

    public final void E() {
        h();
        this.f17127g.b();
        AbstractC2242l abstractC2242l = this.f17126f;
        this.f16818a.z();
        abstractC2242l.d(Y0.f16590K.a(null).longValue());
    }

    private final void F(Runnable runnable) throws IllegalStateException {
        h();
        if (z()) {
            runnable.run();
            return;
        }
        int size = this.f17128h.size();
        this.f16818a.z();
        if (size >= 1000) {
            this.f16818a.b().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f17128h.add(runnable);
        this.f17129i.d(60000L);
        P();
    }

    private final boolean G() {
        this.f16818a.d();
        return true;
    }

    static void M(C2315z3 c2315z3, ComponentName componentName) {
        c2315z3.h();
        if (c2315z3.f17124d != null) {
            c2315z3.f17124d = null;
            c2315z3.f16818a.b().v().b("Disconnected from device MeasurementService", componentName);
            c2315z3.h();
            c2315z3.P();
        }
    }

    final boolean A() {
        h();
        i();
        return !B() || this.f16818a.N().o0() >= Y0.f16637p0.a(null).intValue();
    }

    final boolean B() {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2315z3.B():boolean");
    }

    final Boolean J() {
        return this.f17125e;
    }

    protected final void O() throws IllegalStateException {
        h();
        i();
        zzp zzpVarC = C(true);
        this.f16818a.C().r();
        F(new RunnableC2216f3(this, zzpVarC));
    }

    final void P() {
        h();
        i();
        if (z()) {
            return;
        }
        if (B()) {
            this.f17123c.c();
            return;
        }
        if (this.f16818a.z().G()) {
            return;
        }
        this.f16818a.d();
        List<ResolveInfo> listQueryIntentServices = this.f16818a.f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f16818a.f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            this.f16818a.b().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextF = this.f16818a.f();
        this.f16818a.d();
        intent.setComponent(new ComponentName(contextF, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f17123c.b(intent);
    }

    public final void Q() {
        h();
        i();
        this.f17123c.d();
        try {
            C2928b.b().c(this.f16818a.f(), this.f17123c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17124d = null;
    }

    public final void R(InterfaceC1906k0 interfaceC1906k0) throws IllegalStateException {
        h();
        i();
        F(new RunnableC2211e3(this, C(false), interfaceC1906k0));
    }

    public final void S(AtomicReference<String> atomicReference) {
        h();
        i();
        F(new RunnableC2206d3(this, atomicReference, C(false)));
    }

    protected final void T(InterfaceC1906k0 interfaceC1906k0, String str, String str2) throws IllegalStateException {
        h();
        i();
        F(new RunnableC2275r3(this, str, str2, C(false), interfaceC1906k0));
    }

    protected final void U(AtomicReference<List<zzab>> atomicReference, String str, String str2, String str3) throws IllegalStateException {
        h();
        i();
        F(new RunnableC2271q3(this, atomicReference, null, str2, str3, C(false)));
    }

    protected final void V(InterfaceC1906k0 interfaceC1906k0, String str, String str2, boolean z7) throws IllegalStateException {
        h();
        i();
        F(new RunnableC2191a3(this, str, str2, C(false), z7, interfaceC1906k0));
    }

    protected final void W(AtomicReference<List<zzkv>> atomicReference, String str, String str2, String str3, boolean z7) throws IllegalStateException {
        h();
        i();
        F(new RunnableC2280s3(this, atomicReference, null, str2, str3, C(false), z7));
    }

    @Override
    protected final boolean n() {
        return false;
    }

    protected final void o(zzat zzatVar, String str) {
        C2651i.l(zzatVar);
        h();
        i();
        G();
        F(new RunnableC2261o3(this, true, C(true), this.f16818a.C().v(zzatVar), zzatVar, str));
    }

    public final void p(InterfaceC1906k0 interfaceC1906k0, zzat zzatVar, String str) throws IllegalStateException {
        h();
        i();
        if (this.f16818a.N().p0(12451000) == 0) {
            F(new RunnableC2236j3(this, zzatVar, str, interfaceC1906k0));
        } else {
            this.f16818a.b().w().a("Not bundling data. Service unavailable or out of date");
            this.f16818a.N().F(interfaceC1906k0, new byte[0]);
        }
    }

    protected final void q() {
        h();
        i();
        zzp zzpVarC = C(false);
        G();
        this.f16818a.C().q();
        F(new RunnableC2201c3(this, zzpVarC));
    }

    final void r(W3.d dVar, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int size;
        h();
        i();
        G();
        this.f16818a.z();
        int i7 = 100;
        int i8 = 0;
        while (i8 < 1001 && i7 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> listP = this.f16818a.C().p(100);
            if (listP != null) {
                arrayList.addAll(listP);
                size = listP.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i9);
                if (abstractSafeParcelable2 instanceof zzat) {
                    try {
                        dVar.U3((zzat) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e7) {
                        this.f16818a.b().r().b("Failed to send event to the service", e7);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkv) {
                    try {
                        dVar.I5((zzkv) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e8) {
                        this.f16818a.b().r().b("Failed to send user property to the service", e8);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        dVar.q1((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e9) {
                        this.f16818a.b().r().b("Failed to send conditional user property to the service", e9);
                    }
                } else {
                    this.f16818a.b().r().a(YGBtcyQ.PGwMzy);
                }
            }
            i8++;
            i7 = size;
        }
    }

    protected final void s(zzab zzabVar) throws IllegalStateException {
        C2651i.l(zzabVar);
        h();
        i();
        this.f16818a.d();
        F(new RunnableC2266p3(this, true, C(true), this.f16818a.C().u(zzabVar), new zzab(zzabVar), zzabVar));
    }

    protected final void t(boolean z7) {
        h();
        i();
        if (z7) {
            G();
            this.f16818a.C().q();
        }
        if (A()) {
            F(new RunnableC2256n3(this, C(false)));
        }
    }

    protected final void u(S2 s22) {
        h();
        i();
        F(new RunnableC2221g3(this, s22));
    }

    public final void v(Bundle bundle) {
        h();
        i();
        F(new RunnableC2226h3(this, C(false), bundle));
    }

    protected final void w() {
        h();
        i();
        F(new RunnableC2251m3(this, C(true)));
    }

    protected final void x(W3.d dVar) {
        h();
        C2651i.l(dVar);
        this.f17124d = dVar;
        E();
        D();
    }

    protected final void y(zzkv zzkvVar) {
        h();
        i();
        G();
        F(new RunnableC2196b3(this, C(true), this.f16818a.C().w(zzkvVar), zzkvVar));
    }

    public final boolean z() {
        h();
        i();
        return this.f17124d != null;
    }
}
