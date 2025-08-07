package com.android.billingclient.api;

import H3.QdLC.QcdySgfdST;
import K0.wJ.BtcVLuo;
import Za.qhkq.dHkZSUxHu;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.android.billingclient.api.C1764h;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2073g4;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2103l4;
import com.google.android.gms.internal.play_billing.C2115n4;
import com.google.android.gms.internal.play_billing.C2121o4;
import com.google.android.gms.internal.play_billing.C2144s4;
import com.google.android.gms.internal.play_billing.C2145t;
import com.google.android.gms.internal.play_billing.C4;
import com.google.android.gms.internal.play_billing.E4;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.I4;
import com.google.android.gms.internal.play_billing.InterfaceC2050d;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC2183z1;
import com.google.android.gms.internal.play_billing.M4;
import com.google.android.gms.internal.play_billing.g5;
import com.google.android.gms.internal.play_billing.i5;
import d2.C2381a;
import e2.C2412a;
import e2.C2415d;
import e2.InterfaceC2411A;
import e2.InterfaceC2413b;
import e2.InterfaceC2414c;
import e2.InterfaceC2416e;
import e2.InterfaceC2417f;
import e2.InterfaceC2418g;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import z3.AdxZ.bpTQi;

class C1759c extends AbstractC1758b {

    private boolean f13425A;

    private C1762f f13426B;

    private boolean f13427C;

    private ExecutorService f13428D;

    private volatile InterfaceExecutorServiceC2183z1 f13429E;

    private final Long f13430F;

    private final Object f13431a;

    private volatile int f13432b;

    private final String f13433c;

    private final Handler f13434d;

    private volatile T f13435e;

    private Context f13436f;

    private I f13437g;

    private volatile InterfaceC2050d f13438h;

    private volatile ServiceConnectionC1776u f13439i;

    private boolean f13440j;

    private boolean f13441k;

    private int f13442l;

    private boolean f13443m;

    private boolean f13444n;

    private boolean f13445o;

    private boolean f13446p;

    private boolean f13447q;

    private boolean f13448r;

    private boolean f13449s;

    private boolean f13450t;

    private boolean f13451u;

    private boolean f13452v;

    private boolean f13453w;

    private boolean f13454x;

    private boolean f13455y;

    private boolean f13456z;

    C1759c(String str, Context context, I i7, ExecutorService executorService) {
        this.f13431a = new Object();
        this.f13432b = 0;
        this.f13434d = new Handler(Looper.getMainLooper());
        this.f13442l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f13430F = lValueOf;
        String strK = K();
        this.f13433c = strK;
        this.f13436f = context.getApplicationContext();
        C4 c4I = E4.I();
        c4I.t(strK);
        c4I.s(this.f13436f.getPackageName());
        c4I.r(lValueOf.longValue());
        this.f13437g = new K(this.f13436f, (E4) c4I.l());
        this.f13436f.getPackageName();
    }

    public final C1761e I() {
        C1761e c1761e;
        int i7 = 0;
        int[] iArr = {0, 3};
        synchronized (this.f13431a) {
            while (true) {
                if (i7 >= 2) {
                    c1761e = J.f13358k;
                    break;
                }
                if (this.f13432b == iArr[i7]) {
                    c1761e = J.f13360m;
                    break;
                }
                i7++;
            }
        }
        return c1761e;
    }

    private final String J(C1764h c1764h) {
        if (TextUtils.isEmpty(null)) {
            return this.f13436f.getPackageName();
        }
        return null;
    }

    private static String K() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return C2381a.f20307a;
        }
    }

    private final synchronized ExecutorService L() {
        try {
            if (this.f13428D == null) {
                this.f13428D = Executors.newFixedThreadPool(C2046c1.f15998a, new ThreadFactoryC1772p(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13428D;
    }

    private final void M(C2415d c2415d, InterfaceC2416e interfaceC2416e) {
        InterfaceC2050d interfaceC2050d;
        int iT1;
        String strF;
        String strA = c2415d.a();
        try {
            C2046c1.i("BillingClient", "Consuming purchase with token: " + strA);
            synchronized (this.f13431a) {
                interfaceC2050d = this.f13438h;
            }
            if (interfaceC2050d == null) {
                b0(interfaceC2416e, strA, J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay, "Service has been reset to null.", null);
                return;
            }
            if (this.f13445o) {
                String packageName = this.f13436f.getPackageName();
                boolean z7 = this.f13445o;
                String str = this.f13433c;
                long jLongValue = this.f13430F.longValue();
                Bundle bundle = new Bundle();
                if (z7) {
                    C2046c1.c(bundle, str, jLongValue);
                }
                Bundle bundleZ1 = interfaceC2050d.z1(9, packageName, strA, bundle);
                iT1 = bundleZ1.getInt("RESPONSE_CODE");
                strF = C2046c1.f(bundleZ1, "BillingClient");
            } else {
                iT1 = interfaceC2050d.t1(3, this.f13436f.getPackageName(), strA);
                strF = BtcVLuo.dQQvk;
            }
            C1761e c1761eA = J.a(iT1, strF);
            if (iT1 == 0) {
                C2046c1.i(QcdySgfdST.omj, "Successfully consumed purchase.");
                interfaceC2416e.a(c1761eA, strA);
            } else {
                b0(interfaceC2416e, strA, c1761eA, 23, "Error consuming purchase with token. Response code: " + iT1, null);
            }
        } catch (DeadObjectException e7) {
            b0(interfaceC2416e, strA, J.f13360m, 29, "Error consuming purchase!", e7);
        } catch (Exception e8) {
            b0(interfaceC2416e, strA, J.f13358k, 29, "Error consuming purchase!", e8);
        }
    }

    private final void N(C2085i4 c2085i4) {
        try {
            this.f13437g.e(c2085i4, this.f13442l);
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void O(C2115n4 c2115n4) {
        try {
            this.f13437g.f(c2115n4, this.f13442l);
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
    }

    private final void P(String str, final InterfaceC2418g interfaceC2418g) {
        if (!d()) {
            C1761e c1761e = J.f13360m;
            t0(2, 11, c1761e);
            interfaceC2418g.a(c1761e, null);
        } else if (m(new r(this, str, interfaceC2418g), 30000L, new Runnable() {
            @Override
            public final void run() {
                this.f13535d.h0(interfaceC2418g);
            }
        }, p0(), L()) == null) {
            C1761e c1761eI = I();
            t0(25, 11, c1761eI);
            interfaceC2418g.a(c1761eI, null);
        }
    }

    private final void Q(String str, final e2.h hVar) {
        if (!d()) {
            C1761e c1761e = J.f13360m;
            t0(2, 9, c1761e);
            hVar.a(c1761e, AbstractC2057e0.r());
        } else {
            if (TextUtils.isEmpty(str)) {
                C2046c1.j("BillingClient", "Please provide a valid product type.");
                C1761e c1761e2 = J.f13355h;
                t0(50, 9, c1761e2);
                hVar.a(c1761e2, AbstractC2057e0.r());
                return;
            }
            if (m(new CallableC1773q(this, str, hVar), 30000L, new Runnable() {
                @Override
                public final void run() {
                    this.f13527d.i0(hVar);
                }
            }, p0(), L()) == null) {
                C1761e c1761eI = I();
                t0(25, 9, c1761eI);
                hVar.a(c1761eI, AbstractC2057e0.r());
            }
        }
    }

    public final void R(int i7) {
        synchronized (this.f13431a) {
            try {
                if (this.f13432b == 3) {
                    return;
                }
                C2046c1.i("BillingClient", "Setting clientState from " + U(this.f13432b) + " to " + U(i7));
                this.f13432b = i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S() {
        synchronized (this.f13431a) {
            if (this.f13439i != null) {
                try {
                    this.f13436f.unbindService(this.f13439i);
                } catch (Throwable th) {
                    try {
                        C2046c1.k("BillingClient", "There was an exception while unbinding service!", th);
                        this.f13438h = null;
                        this.f13439i = null;
                    } finally {
                        this.f13438h = null;
                        this.f13439i = null;
                    }
                }
            }
        }
    }

    private final boolean T() {
        return this.f13453w && this.f13426B.b();
    }

    private static final String U(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    private final C1777v V(C1761e c1761e, int i7, String str, Exception exc) {
        C2046c1.k("BillingClient", str, exc);
        u0(i7, 7, c1761e, H.a(exc));
        return new C1777v(c1761e.b(), c1761e.a(), new ArrayList());
    }

    private final C1778w W(C1761e c1761e, int i7, String str, Exception exc) {
        C2046c1.k("BillingClient", str, exc);
        u0(i7, 11, c1761e, H.a(exc));
        return new C1778w(c1761e, null);
    }

    private final e2.C X(int i7, C1761e c1761e, int i8, String str, Exception exc) {
        u0(i8, 9, c1761e, H.a(exc));
        C2046c1.k("BillingClient", str, exc);
        return new e2.C(c1761e, null);
    }

    public final e2.C Y(String str, int i7) {
        InterfaceC2050d interfaceC2050d;
        C2046c1.i("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = C2046c1.d(this.f13445o, this.f13453w, this.f13426B.a(), this.f13426B.b(), this.f13433c, this.f13430F.longValue());
        String string = null;
        do {
            try {
                synchronized (this.f13431a) {
                    interfaceC2050d = this.f13438h;
                }
                if (interfaceC2050d == null) {
                    return X(9, J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay, "Service has been reset to null", null);
                }
                Bundle bundleI6 = this.f13445o ? interfaceC2050d.i6(true != this.f13453w ? 9 : 19, this.f13436f.getPackageName(), str, string, bundleD) : interfaceC2050d.Z2(3, this.f13436f.getPackageName(), str, string);
                P pA = Q.a(bundleI6, "BillingClient", "getPurchase()");
                C1761e c1761eA = pA.a();
                if (c1761eA != J.f13359l) {
                    return X(9, c1761eA, pA.b(), dHkZSUxHu.vjijaNURg, null);
                }
                ArrayList<String> stringArrayList = bundleI6.getStringArrayList(ZJZXBWla.BGBNd);
                ArrayList<String> stringArrayList2 = bundleI6.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleI6.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z7 = false;
                for (int i8 = 0; i8 < stringArrayList2.size(); i8++) {
                    String str2 = stringArrayList2.get(i8);
                    String str3 = stringArrayList3.get(i8);
                    C2046c1.i("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i8))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.g())) {
                            C2046c1.j("BillingClient", "BUG: empty/null token!");
                            z7 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e7) {
                        return X(9, J.f13358k, 51, bpTQi.MNxBkoOfCnYCRs, e7);
                    }
                }
                if (z7) {
                    t0(26, 9, J.f13358k);
                }
                string = bundleI6.getString("INAPP_CONTINUATION_TOKEN");
                C2046c1.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e8) {
                return X(9, J.f13360m, 52, "Got exception trying to get purchases try to reconnect", e8);
            } catch (Exception e9) {
                return X(9, J.f13358k, 52, "Got exception trying to get purchases try to reconnect", e9);
            }
        } while (!TextUtils.isEmpty(string));
        return new e2.C(J.f13359l, arrayList);
    }

    private final void Z(C1761e c1761e, int i7, int i8) {
        C2115n4 c2115n4 = null;
        C2085i4 c2085i4 = null;
        if (c1761e.b() == 0) {
            int i9 = H.f13339a;
            try {
                C2103l4 c2103l4H = C2115n4.H();
                c2103l4H.s(5);
                I4 i4E = M4.E();
                i4E.q(i8);
                c2103l4H.q((M4) i4E.l());
                c2115n4 = (C2115n4) c2103l4H.l();
            } catch (Exception e7) {
                C2046c1.k("BillingLogger", "Unable to create logging payload", e7);
            }
            O(c2115n4);
            return;
        }
        int i10 = H.f13339a;
        try {
            C2073g4 c2073g4I = C2085i4.I();
            C2121o4 c2121o4I = C2144s4.I();
            c2121o4I.s(c1761e.b());
            c2121o4I.r(c1761e.a());
            c2121o4I.t(i7);
            c2073g4I.q(c2121o4I);
            c2073g4I.s(5);
            I4 i4E2 = M4.E();
            i4E2.q(i8);
            c2073g4I.r((M4) i4E2.l());
            c2085i4 = (C2085i4) c2073g4I.l();
        } catch (Exception e8) {
            C2046c1.k("BillingLogger", "Unable to create logging payload", e8);
        }
        N(c2085i4);
    }

    private final void a0(InterfaceC2413b interfaceC2413b, C1761e c1761e, int i7, Exception exc) {
        C2046c1.k("BillingClient", "Error in acknowledge purchase!", exc);
        u0(i7, 3, c1761e, H.a(exc));
        interfaceC2413b.a(c1761e);
    }

    private final void b0(InterfaceC2416e interfaceC2416e, String str, C1761e c1761e, int i7, String str2, Exception exc) {
        C2046c1.k("BillingClient", str2, exc);
        u0(i7, 4, c1761e, H.a(exc));
        interfaceC2416e.a(c1761e, str);
    }

    private void k(Context context, e2.i iVar, C1762f c1762f, e2.o oVar, String str, I i7) {
        this.f13436f = context.getApplicationContext();
        C4 c4I = E4.I();
        c4I.t(str);
        c4I.s(this.f13436f.getPackageName());
        c4I.r(this.f13430F.longValue());
        if (i7 != null) {
            this.f13437g = i7;
        } else {
            this.f13437g = new K(this.f13436f, (E4) c4I.l());
        }
        if (iVar == null) {
            C2046c1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f13435e = new T(this.f13436f, iVar, null, oVar, null, this.f13437g);
        this.f13426B = c1762f;
        this.f13427C = oVar != null;
        this.f13436f.getPackageName();
    }

    static boolean k0(C1759c c1759c) {
        boolean z7;
        synchronized (c1759c.f13431a) {
            z7 = true;
            if (c1759c.f13432b != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    public static Future m(Callable callable, long j7, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    C2046c1.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j7 * 0.95d));
            return futureSubmit;
        } catch (Exception e7) {
            C2046c1.k("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    public final Handler p0() {
        return Looper.myLooper() == null ? this.f13434d : new Handler(Looper.myLooper());
    }

    public final C1778w q0(String str) {
        InterfaceC2050d interfaceC2050d;
        C2046c1.i("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = C2046c1.d(this.f13445o, this.f13453w, this.f13426B.a(), this.f13426B.b(), this.f13433c, this.f13430F.longValue());
        String string = null;
        while (this.f13443m) {
            try {
                synchronized (this.f13431a) {
                    interfaceC2050d = this.f13438h;
                }
                if (interfaceC2050d == null) {
                    return W(J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay, "Service reset to null", null);
                }
                Bundle bundleS1 = interfaceC2050d.S1(6, this.f13436f.getPackageName(), str, string, bundleD);
                P pA = Q.a(bundleS1, "BillingClient", "getPurchaseHistory()");
                C1761e c1761eA = pA.a();
                if (c1761eA != J.f13359l) {
                    t0(pA.b(), 11, c1761eA);
                    return new C1778w(c1761eA, null);
                }
                ArrayList<String> stringArrayList = bundleS1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleS1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleS1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z7 = false;
                for (int i7 = 0; i7 < stringArrayList2.size(); i7++) {
                    String str2 = stringArrayList2.get(i7);
                    String str3 = stringArrayList3.get(i7);
                    C2046c1.i("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i7))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            C2046c1.j("BillingClient", "BUG: empty/null token!");
                            z7 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e7) {
                        return W(J.f13358k, 51, "Got an exception trying to decode the purchase!", e7);
                    }
                }
                if (z7) {
                    t0(26, 11, J.f13358k);
                }
                string = bundleS1.getString("INAPP_CONTINUATION_TOKEN");
                C2046c1.i("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new C1778w(J.f13359l, arrayList);
                }
            } catch (DeadObjectException e8) {
                return W(J.f13360m, 59, "Got exception trying to get purchase history", e8);
            } catch (Exception e9) {
                return W(J.f13358k, 59, "Got exception trying to get purchase history", e9);
            }
        }
        C2046c1.j("BillingClient", "getPurchaseHistory is not supported on current device");
        return new C1778w(J.f13364q, null);
    }

    private final C1761e r0() {
        C2046c1.i("BillingClient", "Service connection is valid. No need to re-initialize.");
        C2103l4 c2103l4H = C2115n4.H();
        c2103l4H.s(6);
        g5 g5VarE = i5.E();
        g5VarE.q(true);
        c2103l4H.r(g5VarE);
        O((C2115n4) c2103l4H.l());
        return J.f13359l;
    }

    public void t0(int i7, int i8, C1761e c1761e) {
        try {
            N(H.b(i7, i8, c1761e));
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
    }

    public final void u0(int i7, int i8, C1761e c1761e, String str) {
        try {
            N(H.c(i7, i8, c1761e, str));
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
    }

    public void v0(int i7) {
        try {
            O(H.d(i7));
        } catch (Throwable th) {
            C2046c1.k("BillingClient", "Unable to log.", th);
        }
    }

    final C1777v B0(C1764h c1764h) {
        InterfaceC2050d interfaceC2050d;
        ArrayList arrayList = new ArrayList();
        String strC = c1764h.c();
        AbstractC2057e0 abstractC2057e0B = c1764h.b();
        int size = abstractC2057e0B.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 20;
            ArrayList arrayList2 = new ArrayList(abstractC2057e0B.subList(i7, i8 > size ? size : i8));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList3.add(((C1764h.b) arrayList2.get(i9)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f13433c);
            try {
                synchronized (this.f13431a) {
                    interfaceC2050d = this.f13438h;
                }
                if (interfaceC2050d == null) {
                    return V(J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay, "Service has been reset to null.", null);
                }
                int i10 = true != this.f13454x ? 17 : 20;
                String packageName = this.f13436f.getPackageName();
                boolean zT = T();
                String str = this.f13433c;
                J(c1764h);
                J(c1764h);
                J(c1764h);
                J(c1764h);
                long jLongValue = this.f13430F.longValue();
                Bundle bundle2 = new Bundle();
                C2046c1.c(bundle2, str, jLongValue);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zT) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                int i11 = 0;
                boolean z7 = false;
                boolean z8 = false;
                while (i11 < size3) {
                    C1764h.b bVar = (C1764h.b) arrayList2.get(i11);
                    arrayList4.add(null);
                    z7 |= !TextUtils.isEmpty(null);
                    String strC2 = bVar.c();
                    ArrayList arrayList6 = arrayList2;
                    if (strC2.equals("first_party")) {
                        C2145t.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z8 = true;
                    }
                    i11++;
                    arrayList2 = arrayList6;
                }
                if (z7) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z8 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                Bundle bundleL1 = interfaceC2050d.l1(i10, packageName, strC, bundle, bundle2);
                if (bundleL1 == null) {
                    return V(J.f13343C, 44, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleL1.containsKey("DETAILS_LIST")) {
                    int iB = C2046c1.b(bundleL1, "BillingClient");
                    String strF = C2046c1.f(bundleL1, "BillingClient");
                    if (iB == 0) {
                        return V(J.a(6, strF), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return V(J.a(iB, strF), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleL1.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return V(J.f13343C, 46, "queryProductDetailsAsync got null response list", null);
                }
                for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                    try {
                        C1763g c1763g = new C1763g(stringArrayList.get(i12));
                        C2046c1.i("BillingClient", "Got product details: ".concat(c1763g.toString()));
                        arrayList.add(c1763g);
                    } catch (JSONException e7) {
                        return V(J.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e7);
                    }
                }
                i7 = i8;
            } catch (DeadObjectException e8) {
                return V(J.f13360m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e8);
            } catch (Exception e9) {
                return V(J.f13358k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e9);
            }
        }
        return new C1777v(0, BuildConfig.FLAVOR, arrayList);
    }

    final I E0() {
        return this.f13437g;
    }

    final C1761e G0(final C1761e c1761e) {
        if (Thread.interrupted()) {
            return c1761e;
        }
        this.f13434d.post(new Runnable() {
            @Override
            public final void run() {
                this.f13408d.e0(c1761e);
            }
        });
        return c1761e;
    }

    final synchronized InterfaceExecutorServiceC2183z1 I0() {
        try {
            if (this.f13429E == null) {
                this.f13429E = G1.a(L());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13429E;
    }

    final Object L0(InterfaceC2413b interfaceC2413b, C2412a c2412a) throws Exception {
        InterfaceC2050d interfaceC2050d;
        try {
            synchronized (this.f13431a) {
                interfaceC2050d = this.f13438h;
            }
            if (interfaceC2050d == null) {
                a0(interfaceC2413b, J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay, null);
                return null;
            }
            String packageName = this.f13436f.getPackageName();
            String strA = c2412a.a();
            String str = this.f13433c;
            long jLongValue = this.f13430F.longValue();
            Bundle bundle = new Bundle();
            C2046c1.c(bundle, str, jLongValue);
            Bundle bundleG6 = interfaceC2050d.G6(9, packageName, strA, bundle);
            interfaceC2413b.a(J.a(C2046c1.b(bundleG6, BtcVLuo.BwQtuV), C2046c1.f(bundleG6, "BillingClient")));
            return null;
        } catch (DeadObjectException e7) {
            a0(interfaceC2413b, J.f13360m, 28, e7);
            return null;
        } catch (Exception e8) {
            a0(interfaceC2413b, J.f13358k, 28, e8);
            return null;
        }
    }

    final Object M0(C2415d c2415d, InterfaceC2416e interfaceC2416e) throws Exception {
        M(c2415d, interfaceC2416e);
        return null;
    }

    @Override
    public void a(final C2412a c2412a, final InterfaceC2413b interfaceC2413b) {
        if (!d()) {
            C1761e c1761e = J.f13360m;
            t0(2, 3, c1761e);
            interfaceC2413b.a(c1761e);
            return;
        }
        if (TextUtils.isEmpty(c2412a.a())) {
            C2046c1.j("BillingClient", "Please provide a valid purchase token.");
            C1761e c1761e2 = J.f13357j;
            t0(26, 3, c1761e2);
            interfaceC2413b.a(c1761e2);
            return;
        }
        if (!this.f13445o) {
            C1761e c1761e3 = J.f13349b;
            t0(27, 3, c1761e3);
            interfaceC2413b.a(c1761e3);
        } else if (m(new Callable() {
            @Override
            public final Object call() throws Exception {
                this.f13413d.L0(interfaceC2413b, c2412a);
                return null;
            }
        }, 30000L, new Runnable() {
            @Override
            public final void run() {
                this.f13416d.d0(interfaceC2413b);
            }
        }, p0(), L()) == null) {
            C1761e c1761eI = I();
            t0(25, 3, c1761eI);
            interfaceC2413b.a(c1761eI);
        }
    }

    @Override
    public void b(final C2415d c2415d, final InterfaceC2416e interfaceC2416e) {
        if (!d()) {
            C1761e c1761e = J.f13360m;
            t0(2, 4, c1761e);
            interfaceC2416e.a(c1761e, c2415d.a());
        } else if (m(new Callable() {
            @Override
            public final Object call() throws Exception {
                this.f13529d.M0(c2415d, interfaceC2416e);
                return null;
            }
        }, 30000L, new Runnable() {
            @Override
            public final void run() {
                this.f13532d.f0(interfaceC2416e, c2415d);
            }
        }, p0(), L()) == null) {
            C1761e c1761eI = I();
            t0(25, 4, c1761eI);
            interfaceC2416e.a(c1761eI, c2415d.a());
        }
    }

    @Override
    public final com.android.billingclient.api.C1761e c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1759c.c(java.lang.String):com.android.billingclient.api.e");
    }

    @Override
    public final boolean d() {
        boolean z7;
        synchronized (this.f13431a) {
            try {
                z7 = false;
                if (this.f13432b == 2 && this.f13438h != null && this.f13439i != null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    final void d0(InterfaceC2413b interfaceC2413b) {
        C1761e c1761e = J.f13361n;
        t0(24, 3, c1761e);
        interfaceC2413b.a(c1761e);
    }

    @Override
    public com.android.billingclient.api.C1761e e(android.app.Activity r33, final com.android.billingclient.api.C1760d r34) {
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1759c.e(android.app.Activity, com.android.billingclient.api.d):com.android.billingclient.api.e");
    }

    final void e0(C1761e c1761e) {
        if (this.f13435e.d() != null) {
            this.f13435e.d().a(c1761e, null);
        } else {
            C2046c1.j("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final void f0(InterfaceC2416e interfaceC2416e, C2415d c2415d) {
        C1761e c1761e = J.f13361n;
        t0(24, 4, c1761e);
        interfaceC2416e.a(c1761e, c2415d.a());
    }

    @Override
    public void g(final C1764h c1764h, final InterfaceC2417f interfaceC2417f) {
        if (!d()) {
            C1761e c1761e = J.f13360m;
            t0(2, 7, c1761e);
            interfaceC2417f.a(c1761e, new ArrayList());
        } else {
            if (!this.f13451u) {
                C2046c1.j("BillingClient", "Querying product details is not supported.");
                C1761e c1761e2 = J.f13369v;
                t0(20, 7, c1761e2);
                interfaceC2417f.a(c1761e2, new ArrayList());
                return;
            }
            if (m(new Callable() {
                @Override
                public final Object call() {
                    C1777v c1777vB0 = this.f13537d.B0(c1764h);
                    interfaceC2417f.a(J.a(c1777vB0.a(), c1777vB0.b()), c1777vB0.c());
                    return null;
                }
            }, 30000L, new Runnable() {
                @Override
                public final void run() {
                    this.f13540d.g0(interfaceC2417f);
                }
            }, p0(), L()) == null) {
                C1761e c1761eI = I();
                t0(25, 7, c1761eI);
                interfaceC2417f.a(c1761eI, new ArrayList());
            }
        }
    }

    final void g0(InterfaceC2417f interfaceC2417f) {
        C1761e c1761e = J.f13361n;
        t0(24, 7, c1761e);
        interfaceC2417f.a(c1761e, new ArrayList());
    }

    @Override
    public final void h(e2.j jVar, InterfaceC2418g interfaceC2418g) {
        P(jVar.b(), interfaceC2418g);
    }

    final void h0(InterfaceC2418g interfaceC2418g) {
        C1761e c1761e = J.f13361n;
        t0(24, 11, c1761e);
        interfaceC2418g.a(c1761e, null);
    }

    @Override
    public final void i(e2.k kVar, e2.h hVar) {
        Q(kVar.b(), hVar);
    }

    final void i0(e2.h hVar) {
        C1761e c1761e = J.f13361n;
        t0(24, 9, c1761e);
        hVar.a(c1761e, AbstractC2057e0.r());
    }

    @Override
    public void j(InterfaceC2414c interfaceC2414c) {
        C1761e c1761eR0;
        synchronized (this.f13431a) {
            try {
                if (d()) {
                    c1761eR0 = r0();
                } else if (this.f13432b == 1) {
                    C2046c1.j("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1761eR0 = J.f13352e;
                    t0(37, 6, c1761eR0);
                } else if (this.f13432b == 3) {
                    C2046c1.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1761eR0 = J.f13360m;
                    t0(38, 6, c1761eR0);
                } else {
                    R(1);
                    S();
                    C2046c1.i("BillingClient", "Starting in-app billing setup.");
                    this.f13439i = new ServiceConnectionC1776u(this, interfaceC2414c, null);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f13436f.getPackageManager().queryIntentServices(intent, 0);
                    int i7 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        R(0);
                        C2046c1.i(KwdswzaUHE.JKMpMuuOrrlFeP, "Billing service unavailable on device.");
                        c1761eR0 = J.f13350c;
                        t0(i7, 6, c1761eR0);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i7 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                C2046c1.j("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f13433c);
                                synchronized (this.f13431a) {
                                    try {
                                        if (this.f13432b == 2) {
                                            c1761eR0 = r0();
                                        } else if (this.f13432b != 1) {
                                            C2046c1.j("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1761eR0 = J.f13360m;
                                            t0(R.styleable.AppCompatTheme_windowActionBar, 6, c1761eR0);
                                        } else {
                                            ServiceConnectionC1776u serviceConnectionC1776u = this.f13439i;
                                            if (this.f13436f.bindService(intent2, serviceConnectionC1776u, 1)) {
                                                C2046c1.i("BillingClient", "Service was bonded successfully.");
                                                c1761eR0 = null;
                                            } else {
                                                C2046c1.j("BillingClient", "Connection to Billing service is blocked.");
                                                i7 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            C2046c1.j("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        R(0);
                        C2046c1.i(KwdswzaUHE.JKMpMuuOrrlFeP, "Billing service unavailable on device.");
                        c1761eR0 = J.f13350c;
                        t0(i7, 6, c1761eR0);
                    }
                }
            } finally {
            }
        }
        if (c1761eR0 != null) {
            interfaceC2414c.a(c1761eR0);
        }
    }

    final Bundle x0(int i7, String str, String str2, C1760d c1760d, Bundle bundle) throws Exception {
        InterfaceC2050d interfaceC2050d;
        try {
            synchronized (this.f13431a) {
                interfaceC2050d = this.f13438h;
            }
            return interfaceC2050d == null ? C2046c1.l(J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay) : interfaceC2050d.L4(i7, this.f13436f.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e7) {
            return C2046c1.m(J.f13360m, 5, H.a(e7));
        } catch (Exception e8) {
            return C2046c1.m(J.f13358k, 5, H.a(e8));
        }
    }

    final Bundle y0(String str, String str2) throws Exception {
        InterfaceC2050d interfaceC2050d;
        try {
            synchronized (this.f13431a) {
                interfaceC2050d = this.f13438h;
            }
            return interfaceC2050d == null ? C2046c1.l(J.f13360m, R.styleable.AppCompatTheme_windowActionModeOverlay) : interfaceC2050d.i3(3, this.f13436f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e7) {
            return C2046c1.m(J.f13360m, 5, H.a(e7));
        } catch (Exception e8) {
            return C2046c1.m(J.f13358k, 5, H.a(e8));
        }
    }

    C1759c(String str, C1762f c1762f, Context context, InterfaceC2411A interfaceC2411A, I i7, ExecutorService executorService) {
        this.f13431a = new Object();
        this.f13432b = 0;
        this.f13434d = new Handler(Looper.getMainLooper());
        this.f13442l = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f13430F = lValueOf;
        this.f13433c = K();
        this.f13436f = context.getApplicationContext();
        C4 c4I = E4.I();
        c4I.t(K());
        c4I.s(this.f13436f.getPackageName());
        c4I.r(lValueOf.longValue());
        this.f13437g = new K(this.f13436f, (E4) c4I.l());
        C2046c1.j("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f13435e = new T(this.f13436f, null, null, null, null, this.f13437g);
        this.f13426B = c1762f;
        this.f13436f.getPackageName();
    }

    C1759c(String str, C1762f c1762f, Context context, e2.i iVar, e2.o oVar, I i7, ExecutorService executorService) {
        String strK = K();
        this.f13431a = new Object();
        this.f13432b = 0;
        this.f13434d = new Handler(Looper.getMainLooper());
        this.f13442l = 0;
        this.f13430F = Long.valueOf(new Random().nextLong());
        this.f13433c = strK;
        k(context, iVar, c1762f, null, strK, null);
    }
}
