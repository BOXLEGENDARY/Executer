package com.google.android.gms.common.api.internal;

import a4.C1574k;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1804d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g0.C2457a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import l3.AbstractC2531f;
import l3.AbstractC2532g;
import l3.C2526a;
import l3.C2542q;
import m3.BinderC2564E;
import m3.C2566G;
import m3.C2571b;
import n3.C2649g;
import n3.C2651i;
import p3.C2722e;

public final class t implements AbstractC2532g.a, AbstractC2532g.b {

    private final BinderC2564E f14172A;

    private boolean f14173B;

    final C1803c f14177F;

    private final C2526a.f f14179e;

    private final C2571b f14180i;

    private final C1812l f14181v;

    private final int f14184z;

    private final Queue f14178d = new LinkedList();

    private final Set f14182w = new HashSet();

    private final Map f14183y = new HashMap();

    private final List f14174C = new ArrayList();

    private ConnectionResult f14175D = null;

    private int f14176E = 0;

    public t(C1803c c1803c, AbstractC2531f abstractC2531f) {
        this.f14177F = c1803c;
        C2526a.f fVarA = abstractC2531f.A(c1803c.f14120G.getLooper(), this);
        this.f14179e = fVarA;
        this.f14180i = abstractC2531f.l();
        this.f14181v = new C1812l();
        this.f14184z = abstractC2531f.z();
        if (fVarA.o()) {
            this.f14172A = abstractC2531f.B(c1803c.f14126w, c1803c.f14120G);
        } else {
            this.f14172A = null;
        }
    }

    static void A(t tVar, u uVar) {
        Feature[] featureArrG;
        if (tVar.f14174C.remove(uVar)) {
            tVar.f14177F.f14120G.removeMessages(15, uVar);
            tVar.f14177F.f14120G.removeMessages(16, uVar);
            Feature feature = uVar.f14186b;
            ArrayList arrayList = new ArrayList(tVar.f14178d.size());
            for (J j7 : tVar.f14178d) {
                if ((j7 instanceof m3.t) && (featureArrG = ((m3.t) j7).g(tVar)) != null && v3.b.c(featureArrG, feature)) {
                    arrayList.add(j7);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                J j8 = (J) arrayList.get(i7);
                tVar.f14178d.remove(j8);
                j8.b(new C2542q(feature));
            }
        }
    }

    private final Feature c(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] featureArrM = this.f14179e.m();
            if (featureArrM == null) {
                featureArrM = new Feature[0];
            }
            C2457a c2457a = new C2457a(featureArrM.length);
            for (Feature feature : featureArrM) {
                c2457a.put(feature.getName(), Long.valueOf(feature.l()));
            }
            for (Feature feature2 : featureArr) {
                Long l7 = (Long) c2457a.get(feature2.getName());
                if (l7 == null || l7.longValue() < feature2.l()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void d(ConnectionResult connectionResult) {
        Iterator it = this.f14182w.iterator();
        while (it.hasNext()) {
            ((C2566G) it.next()).c(this.f14180i, connectionResult, C2649g.b(connectionResult, ConnectionResult.f14034w) ? this.f14179e.g() : null);
        }
        this.f14182w.clear();
    }

    public final void e(Status status) {
        C2651i.d(this.f14177F.f14120G);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z7) {
        C2651i.d(this.f14177F.f14120G);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f14178d.iterator();
        while (it.hasNext()) {
            J j7 = (J) it.next();
            if (!z7 || j7.f14090a == 2) {
                if (status != null) {
                    j7.a(status);
                } else {
                    j7.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f14178d);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            J j7 = (J) arrayList.get(i7);
            if (!this.f14179e.a()) {
                return;
            }
            if (m(j7)) {
                this.f14178d.remove(j7);
            }
        }
    }

    public final void h() {
        B();
        d(ConnectionResult.f14034w);
        l();
        Iterator it = this.f14183y.values().iterator();
        while (it.hasNext()) {
            m3.x xVar = (m3.x) it.next();
            if (c(xVar.f22047a.c()) != null) {
                it.remove();
            } else {
                try {
                    xVar.f22047a.d(this.f14179e, new C1574k<>());
                } catch (DeadObjectException unused) {
                    E0(3);
                    this.f14179e.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    public final void i(int i7) {
        B();
        this.f14173B = true;
        this.f14181v.e(i7, this.f14179e.n());
        C2571b c2571b = this.f14180i;
        C1803c c1803c = this.f14177F;
        c1803c.f14120G.sendMessageDelayed(Message.obtain(c1803c.f14120G, 9, c2571b), 5000L);
        C2571b c2571b2 = this.f14180i;
        C1803c c1803c2 = this.f14177F;
        c1803c2.f14120G.sendMessageDelayed(Message.obtain(c1803c2.f14120G, 11, c2571b2), 120000L);
        this.f14177F.f14128z.c();
        Iterator it = this.f14183y.values().iterator();
        while (it.hasNext()) {
            ((m3.x) it.next()).f22049c.run();
        }
    }

    private final void j() {
        this.f14177F.f14120G.removeMessages(12, this.f14180i);
        C2571b c2571b = this.f14180i;
        C1803c c1803c = this.f14177F;
        c1803c.f14120G.sendMessageDelayed(c1803c.f14120G.obtainMessage(12, c2571b), this.f14177F.f14122d);
    }

    private final void k(J j7) {
        j7.d(this.f14181v, a());
        try {
            j7.c(this);
        } catch (DeadObjectException unused) {
            E0(1);
            this.f14179e.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f14173B) {
            C1803c c1803c = this.f14177F;
            c1803c.f14120G.removeMessages(11, this.f14180i);
            C1803c c1803c2 = this.f14177F;
            c1803c2.f14120G.removeMessages(9, this.f14180i);
            this.f14173B = false;
        }
    }

    private final boolean m(J j7) throws Resources.NotFoundException {
        if (!(j7 instanceof m3.t)) {
            k(j7);
            return true;
        }
        m3.t tVar = (m3.t) j7;
        Feature featureC = c(tVar.g(this));
        if (featureC == null) {
            k(j7);
            return true;
        }
        Log.w("GoogleApiManager", this.f14179e.getClass().getName() + " could not execute call because it requires feature (" + featureC.getName() + ", " + featureC.l() + ").");
        if (!this.f14177F.f14121H || !tVar.f(this)) {
            tVar.b(new C2542q(featureC));
            return true;
        }
        u uVar = new u(this.f14180i, featureC, null);
        int iIndexOf = this.f14174C.indexOf(uVar);
        if (iIndexOf >= 0) {
            u uVar2 = (u) this.f14174C.get(iIndexOf);
            this.f14177F.f14120G.removeMessages(15, uVar2);
            C1803c c1803c = this.f14177F;
            c1803c.f14120G.sendMessageDelayed(Message.obtain(c1803c.f14120G, 15, uVar2), 5000L);
            return false;
        }
        this.f14174C.add(uVar);
        C1803c c1803c2 = this.f14177F;
        c1803c2.f14120G.sendMessageDelayed(Message.obtain(c1803c2.f14120G, 15, uVar), 5000L);
        C1803c c1803c3 = this.f14177F;
        c1803c3.f14120G.sendMessageDelayed(Message.obtain(c1803c3.f14120G, 16, uVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (n(connectionResult)) {
            return false;
        }
        this.f14177F.f(connectionResult, this.f14184z);
        return false;
    }

    private final boolean n(ConnectionResult connectionResult) {
        synchronized (C1803c.f14112K) {
            try {
                C1803c c1803c = this.f14177F;
                if (c1803c.f14117D == null || !c1803c.f14118E.contains(this.f14180i)) {
                    return false;
                }
                this.f14177F.f14117D.s(connectionResult, this.f14184z);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(boolean z7) {
        C2651i.d(this.f14177F.f14120G);
        if (!this.f14179e.a() || !this.f14183y.isEmpty()) {
            return false;
        }
        if (!this.f14181v.g()) {
            this.f14179e.e("Timing out service connection.");
            return true;
        }
        if (!z7) {
            return false;
        }
        j();
        return false;
    }

    static void z(t tVar, u uVar) {
        if (tVar.f14174C.contains(uVar) && !tVar.f14173B) {
            if (tVar.f14179e.a()) {
                tVar.g();
            } else {
                tVar.C();
            }
        }
    }

    public final void B() {
        C2651i.d(this.f14177F.f14120G);
        this.f14175D = null;
    }

    public final void C() {
        C2651i.d(this.f14177F.f14120G);
        if (this.f14179e.a() || this.f14179e.f()) {
            return;
        }
        try {
            C1803c c1803c = this.f14177F;
            int iB = c1803c.f14128z.b(c1803c.f14126w, this.f14179e);
            if (iB == 0) {
                C1803c c1803c2 = this.f14177F;
                C2526a.f fVar = this.f14179e;
                w wVar = new w(c1803c2, fVar, this.f14180i);
                if (fVar.o()) {
                    ((BinderC2564E) C2651i.l(this.f14172A)).w6(wVar);
                }
                try {
                    this.f14179e.h(wVar);
                    return;
                } catch (SecurityException e7) {
                    F(new ConnectionResult(10), e7);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f14179e.getClass().getName() + " is not available: " + connectionResult.toString());
            F(connectionResult, null);
        } catch (IllegalStateException e8) {
            F(new ConnectionResult(10), e8);
        }
    }

    public final void D(J j7) {
        C2651i.d(this.f14177F.f14120G);
        if (this.f14179e.a()) {
            if (m(j7)) {
                j();
                return;
            } else {
                this.f14178d.add(j7);
                return;
            }
        }
        this.f14178d.add(j7);
        ConnectionResult connectionResult = this.f14175D;
        if (connectionResult == null || !connectionResult.p()) {
            C();
        } else {
            F(this.f14175D, null);
        }
    }

    final void E() {
        this.f14176E++;
    }

    @Override
    public final void E0(int i7) {
        if (Looper.myLooper() == this.f14177F.f14120G.getLooper()) {
            i(i7);
        } else {
            this.f14177F.f14120G.post(new q(this, i7));
        }
    }

    public final void F(ConnectionResult connectionResult, Exception exc) {
        C2651i.d(this.f14177F.f14120G);
        BinderC2564E binderC2564E = this.f14172A;
        if (binderC2564E != null) {
            binderC2564E.M6();
        }
        B();
        this.f14177F.f14128z.c();
        d(connectionResult);
        if ((this.f14179e instanceof C2722e) && connectionResult.l() != 24) {
            this.f14177F.f14123e = true;
            C1803c c1803c = this.f14177F;
            c1803c.f14120G.sendMessageDelayed(c1803c.f14120G.obtainMessage(19), 300000L);
        }
        if (connectionResult.l() == 4) {
            e(C1803c.f14111J);
            return;
        }
        if (this.f14178d.isEmpty()) {
            this.f14175D = connectionResult;
            return;
        }
        if (exc != null) {
            C2651i.d(this.f14177F.f14120G);
            f(null, exc, false);
            return;
        }
        if (!this.f14177F.f14121H) {
            e(C1803c.g(this.f14180i, connectionResult));
            return;
        }
        f(C1803c.g(this.f14180i, connectionResult), null, true);
        if (this.f14178d.isEmpty() || n(connectionResult) || this.f14177F.f(connectionResult, this.f14184z)) {
            return;
        }
        if (connectionResult.l() == 18) {
            this.f14173B = true;
        }
        if (!this.f14173B) {
            e(C1803c.g(this.f14180i, connectionResult));
            return;
        }
        C1803c c1803c2 = this.f14177F;
        c1803c2.f14120G.sendMessageDelayed(Message.obtain(c1803c2.f14120G, 9, this.f14180i), 5000L);
    }

    public final void G(ConnectionResult connectionResult) {
        C2651i.d(this.f14177F.f14120G);
        C2526a.f fVar = this.f14179e;
        fVar.e("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        F(connectionResult, null);
    }

    public final void H(C2566G c2566g) {
        C2651i.d(this.f14177F.f14120G);
        this.f14182w.add(c2566g);
    }

    public final void I() {
        C2651i.d(this.f14177F.f14120G);
        if (this.f14173B) {
            C();
        }
    }

    public final void J() {
        C2651i.d(this.f14177F.f14120G);
        e(C1803c.f14110I);
        this.f14181v.f();
        for (C1804d.a aVar : (C1804d.a[]) this.f14183y.keySet().toArray(new C1804d.a[0])) {
            D(new I(aVar, new C1574k()));
        }
        d(new ConnectionResult(4));
        if (this.f14179e.a()) {
            this.f14179e.j(new s(this));
        }
    }

    public final void K() {
        C2651i.d(this.f14177F.f14120G);
        if (this.f14173B) {
            l();
            C1803c c1803c = this.f14177F;
            e(c1803c.f14127y.g(c1803c.f14126w) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f14179e.e("Timing out connection while resuming.");
        }
    }

    final boolean N() {
        return this.f14179e.a();
    }

    @Override
    public final void O0(ConnectionResult connectionResult) {
        F(connectionResult, null);
    }

    @Override
    public final void V0(Bundle bundle) {
        if (Looper.myLooper() == this.f14177F.f14120G.getLooper()) {
            h();
        } else {
            this.f14177F.f14120G.post(new RunnableC1816p(this));
        }
    }

    public final boolean a() {
        return this.f14179e.o();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    public final int p() {
        return this.f14184z;
    }

    final int q() {
        return this.f14176E;
    }

    public final ConnectionResult r() {
        C2651i.d(this.f14177F.f14120G);
        return this.f14175D;
    }

    public final C2526a.f t() {
        return this.f14179e;
    }

    public final Map v() {
        return this.f14183y;
    }
}
