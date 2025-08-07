package com.google.android.gms.common.api.internal;

import H3.QdLC.QcdySgfdST;
import a4.C1574k;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1804d;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g0.C2458b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l3.AbstractC2531f;
import m3.C2566G;
import m3.C2571b;
import m3.InterfaceC2580k;
import n3.C2651i;
import n3.C2652j;
import n3.C2654l;
import n3.C2666x;
import n3.InterfaceC2655m;

public class C1803c implements Handler.Callback {

    public static final Status f14110I = new Status(4, "Sign-out occurred while this API call was in progress.");

    private static final Status f14111J = new Status(4, QcdySgfdST.wGioNXKSC);

    private static final Object f14112K = new Object();

    private static C1803c f14113L;

    private final Handler f14120G;

    private volatile boolean f14121H;

    private TelemetryData f14124i;

    private InterfaceC2655m f14125v;

    private final Context f14126w;

    private final C1818c f14127y;

    private final C2666x f14128z;

    private long f14122d = 10000;

    private boolean f14123e = false;

    private final AtomicInteger f14114A = new AtomicInteger(1);

    private final AtomicInteger f14115B = new AtomicInteger(0);

    private final Map f14116C = new ConcurrentHashMap(5, 0.75f, 1);

    private C1813m f14117D = null;

    private final Set f14118E = new C2458b();

    private final Set f14119F = new C2458b();

    private C1803c(Context context, Looper looper, C1818c c1818c) {
        this.f14121H = true;
        this.f14126w = context;
        I3.j jVar = new I3.j(looper, this);
        this.f14120G = jVar;
        this.f14127y = c1818c;
        this.f14128z = new C2666x(c1818c);
        if (v3.i.a(context)) {
            this.f14121H = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f14112K) {
            try {
                C1803c c1803c = f14113L;
                if (c1803c != null) {
                    c1803c.f14115B.incrementAndGet();
                    Handler handler = c1803c.f14120G;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status g(C2571b c2571b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c2571b.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @ResultIgnorabilityUnspecified
    private final t h(AbstractC2531f abstractC2531f) {
        Map map = this.f14116C;
        C2571b c2571bL = abstractC2531f.l();
        t tVar = (t) map.get(c2571bL);
        if (tVar == null) {
            tVar = new t(this, abstractC2531f);
            this.f14116C.put(c2571bL, tVar);
        }
        if (tVar.a()) {
            this.f14119F.add(c2571bL);
        }
        tVar.C();
        return tVar;
    }

    private final InterfaceC2655m i() {
        if (this.f14125v == null) {
            this.f14125v = C2654l.a(this.f14126w);
        }
        return this.f14125v;
    }

    private final void j() {
        TelemetryData telemetryData = this.f14124i;
        if (telemetryData != null) {
            if (telemetryData.l() > 0 || e()) {
                i().c(telemetryData);
            }
            this.f14124i = null;
        }
    }

    private final void k(C1574k c1574k, int i7, AbstractC2531f abstractC2531f) {
        y yVarA;
        if (i7 == 0 || (yVarA = y.a(this, i7, abstractC2531f.l())) == null) {
            return;
        }
        Task taskA = c1574k.a();
        final Handler handler = this.f14120G;
        handler.getClass();
        taskA.b(new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, yVarA);
    }

    public static C1803c u() {
        C1803c c1803c;
        synchronized (f14112K) {
            C2651i.m(f14113L, "Must guarantee manager is non-null before using getInstance");
            c1803c = f14113L;
        }
        return c1803c;
    }

    @ResultIgnorabilityUnspecified
    public static C1803c v(Context context) {
        C1803c c1803c;
        synchronized (f14112K) {
            try {
                if (f14113L == null) {
                    f14113L = new C1803c(context.getApplicationContext(), com.google.android.gms.common.internal.d.c().getLooper(), C1818c.n());
                }
                c1803c = f14113L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1803c;
    }

    public final void E(AbstractC2531f abstractC2531f, int i7, AbstractC1802b abstractC1802b) {
        this.f14120G.sendMessage(this.f14120G.obtainMessage(4, new m3.w(new F(i7, abstractC1802b), this.f14115B.get(), abstractC2531f)));
    }

    public final void F(AbstractC2531f abstractC2531f, int i7, AbstractC1808h abstractC1808h, C1574k c1574k, InterfaceC2580k interfaceC2580k) {
        k(c1574k, abstractC1808h.d(), abstractC2531f);
        this.f14120G.sendMessage(this.f14120G.obtainMessage(4, new m3.w(new H(i7, abstractC1808h, c1574k, interfaceC2580k), this.f14115B.get(), abstractC2531f)));
    }

    final void G(MethodInvocation methodInvocation, int i7, long j7, int i8) {
        this.f14120G.sendMessage(this.f14120G.obtainMessage(18, new z(methodInvocation, i7, j7, i8)));
    }

    public final void H(ConnectionResult connectionResult, int i7) throws Resources.NotFoundException {
        if (f(connectionResult, i7)) {
            return;
        }
        Handler handler = this.f14120G;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, connectionResult));
    }

    public final void I() {
        Handler handler = this.f14120G;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void J(AbstractC2531f abstractC2531f) {
        Handler handler = this.f14120G;
        handler.sendMessage(handler.obtainMessage(7, abstractC2531f));
    }

    public final void b(C1813m c1813m) {
        synchronized (f14112K) {
            try {
                if (this.f14117D != c1813m) {
                    this.f14117D = c1813m;
                    this.f14118E.clear();
                }
                this.f14118E.addAll(c1813m.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void c(C1813m c1813m) {
        synchronized (f14112K) {
            try {
                if (this.f14117D == c1813m) {
                    this.f14117D = null;
                    this.f14118E.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean e() {
        if (this.f14123e) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = C2652j.b().a();
        if (rootTelemetryConfigurationA != null && !rootTelemetryConfigurationA.o()) {
            return false;
        }
        int iA = this.f14128z.a(this.f14126w, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean f(ConnectionResult connectionResult, int i7) throws Resources.NotFoundException {
        return this.f14127y.x(this.f14126w, connectionResult, i7);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        t tVar = null;
        switch (i7) {
            case 1:
                this.f14122d = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f14120G.removeMessages(12);
                for (C2571b c2571b : this.f14116C.keySet()) {
                    Handler handler = this.f14120G;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2571b), this.f14122d);
                }
                return true;
            case 2:
                C2566G c2566g = (C2566G) message.obj;
                Iterator it = c2566g.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C2571b c2571b2 = (C2571b) it.next();
                        t tVar2 = (t) this.f14116C.get(c2571b2);
                        if (tVar2 == null) {
                            c2566g.c(c2571b2, new ConnectionResult(13), null);
                        } else if (tVar2.N()) {
                            c2566g.c(c2571b2, ConnectionResult.f14034w, tVar2.t().g());
                        } else {
                            ConnectionResult connectionResultR = tVar2.r();
                            if (connectionResultR != null) {
                                c2566g.c(c2571b2, connectionResultR, null);
                            } else {
                                tVar2.H(c2566g);
                                tVar2.C();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (t tVar3 : this.f14116C.values()) {
                    tVar3.B();
                    tVar3.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                m3.w wVar = (m3.w) message.obj;
                t tVarH = (t) this.f14116C.get(wVar.f22046c.l());
                if (tVarH == null) {
                    tVarH = h(wVar.f22046c);
                }
                if (!tVarH.a() || this.f14115B.get() == wVar.f22045b) {
                    tVarH.D(wVar.f22044a);
                } else {
                    wVar.f22044a.a(f14110I);
                    tVarH.J();
                }
                return true;
            case 5:
                int i8 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f14116C.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        t tVar4 = (t) it2.next();
                        if (tVar4.p() == i8) {
                            tVar = tVar4;
                        }
                    }
                }
                if (tVar == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i8 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.l() == 13) {
                    tVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f14127y.e(connectionResult.l()) + ": " + connectionResult.n()));
                } else {
                    tVar.e(g(tVar.f14180i, connectionResult));
                }
                return true;
            case 6:
                if (this.f14126w.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1801a.c((Application) this.f14126w.getApplicationContext());
                    ComponentCallbacks2C1801a.b().a(new C1815o(this));
                    if (!ComponentCallbacks2C1801a.b().e(true)) {
                        this.f14122d = 300000L;
                    }
                }
                return true;
            case 7:
                h((AbstractC2531f) message.obj);
                return true;
            case 9:
                if (this.f14116C.containsKey(message.obj)) {
                    ((t) this.f14116C.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it3 = this.f14119F.iterator();
                while (it3.hasNext()) {
                    t tVar5 = (t) this.f14116C.remove((C2571b) it3.next());
                    if (tVar5 != null) {
                        tVar5.J();
                    }
                }
                this.f14119F.clear();
                return true;
            case 11:
                if (this.f14116C.containsKey(message.obj)) {
                    ((t) this.f14116C.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f14116C.containsKey(message.obj)) {
                    ((t) this.f14116C.get(message.obj)).b();
                }
                return true;
            case 14:
                C1814n c1814n = (C1814n) message.obj;
                C2571b c2571bA = c1814n.a();
                if (this.f14116C.containsKey(c2571bA)) {
                    c1814n.b().c(Boolean.valueOf(((t) this.f14116C.get(c2571bA)).o(false)));
                } else {
                    c1814n.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                u uVar = (u) message.obj;
                if (this.f14116C.containsKey(uVar.f14185a)) {
                    t.z((t) this.f14116C.get(uVar.f14185a), uVar);
                }
                return true;
            case 16:
                u uVar2 = (u) message.obj;
                if (this.f14116C.containsKey(uVar2.f14185a)) {
                    t.A((t) this.f14116C.get(uVar2.f14185a), uVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                z zVar = (z) message.obj;
                if (zVar.f14204c == 0) {
                    i().c(new TelemetryData(zVar.f14203b, Arrays.asList(zVar.f14202a)));
                } else {
                    TelemetryData telemetryData = this.f14124i;
                    if (telemetryData != null) {
                        List listN = telemetryData.n();
                        if (telemetryData.l() != zVar.f14203b || (listN != null && listN.size() >= zVar.f14205d)) {
                            this.f14120G.removeMessages(17);
                            j();
                        } else {
                            this.f14124i.o(zVar.f14202a);
                        }
                    }
                    if (this.f14124i == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zVar.f14202a);
                        this.f14124i = new TelemetryData(zVar.f14203b, arrayList);
                        Handler handler2 = this.f14120G;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zVar.f14204c);
                    }
                }
                return true;
            case 19:
                this.f14123e = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }

    public final int l() {
        return this.f14114A.getAndIncrement();
    }

    final t t(C2571b c2571b) {
        return (t) this.f14116C.get(c2571b);
    }

    public final Task x(Iterable iterable) {
        C2566G c2566g = new C2566G(iterable);
        this.f14120G.sendMessage(this.f14120G.obtainMessage(2, c2566g));
        return c2566g.a();
    }

    public final Task y(AbstractC2531f abstractC2531f, AbstractC1806f abstractC1806f, AbstractC1809i abstractC1809i, Runnable runnable) {
        C1574k c1574k = new C1574k();
        k(c1574k, abstractC1806f.e(), abstractC2531f);
        this.f14120G.sendMessage(this.f14120G.obtainMessage(8, new m3.w(new G(new m3.x(abstractC1806f, abstractC1809i, runnable), c1574k), this.f14115B.get(), abstractC2531f)));
        return c1574k.a();
    }

    public final Task z(AbstractC2531f abstractC2531f, C1804d.a aVar, int i7) {
        C1574k c1574k = new C1574k();
        k(c1574k, i7, abstractC2531f);
        this.f14120G.sendMessage(this.f14120G.obtainMessage(13, new m3.w(new I(aVar, c1574k), this.f14115B.get(), abstractC2531f)));
        return c1574k.a();
    }
}
