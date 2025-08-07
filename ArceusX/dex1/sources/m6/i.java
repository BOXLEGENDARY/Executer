package M6;

import L6.d;
import L6.i;
import M6.d;
import O6.ValidatePurchaseResponsePayload;
import W0.JWp.kNUgEaOjcPdX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.android.billingclient.api.AbstractC1758b;
import com.android.billingclient.api.C1757a;
import com.android.billingclient.api.C1760d;
import com.android.billingclient.api.C1761e;
import com.android.billingclient.api.C1763g;
import com.android.billingclient.api.C1764h;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.roblox.client.a0;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import d6.C2400b;
import e2.C2412a;
import e2.C2415d;
import e2.InterfaceC2413b;
import e2.InterfaceC2414c;
import e2.InterfaceC2416e;
import e2.InterfaceC2417f;
import e2.InterfaceC2418g;
import ha.C2702h;
import ha.InterfaceC2700f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m6.InterfaceC2596M;
import w7.Jld.EZYiRMRTxKdo;
import y0.xyyu.hkVlaTTCDY;

public class i implements L6.c {

    private static i f2425D;

    private static List<String> f2427F;

    private static List<String> f2429H;

    public e2.i f2430A;

    public InterfaceC2418g f2431B;

    public InterfaceC2418g f2432C;

    private M6.l f2433a;

    private m f2434b;

    private m f2435c;

    private m f2436d;

    private Hashtable<String, C1763g> f2437e;

    private Hashtable<String, C1763g> f2438f;

    private Hashtable<String, Purchase> f2439g;

    private boolean f2440h;

    private M6.j f2441i;

    private Activity f2442j;

    private String f2443k;

    private String f2444l;

    private String f2445m;

    private String f2446n;

    private boolean f2447o;

    private long f2448p;

    private boolean f2449q;

    private String f2450r;

    private E6.h f2451s;

    private InterfaceC2700f f2452t;

    private L6.f f2453u;

    private final Hashtable<String, String> f2454v;

    private String f2455w;

    private String f2456x;

    private String f2457y;

    private d.InterfaceC0032d f2458z;

    private static List<String> f2426E = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", kNUgEaOjcPdX.uHc, "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", kNUgEaOjcPdX.pBJmJDqGk, "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));

    private static List<String> f2428G = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    class a implements InterfaceC2418g {

        class C0038a implements e2.h {
            C0038a() {
            }

            @Override
            public void a(C1761e c1761e, List<Purchase> list) {
                if (c1761e.b() != 0) {
                    h7.l.c("Failed QueryPurchases. BillingResult: " + c1761e);
                    return;
                }
                i.this.f2451s.l("QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + i.this.p0(list));
                i.this.x0(list, true);
            }
        }

        a() {
        }

        @Override
        public void a(C1761e c1761e, List<PurchaseHistoryRecord> list) {
            boolean z7 = c1761e.b() == 0;
            i.this.f2451s.l("OnInAppPurchaseHistoryResponse. Success: " + z7 + ". Message: " + c1761e.toString() + ".");
            if (i.this.C0()) {
                if (z7) {
                    i.this.f2433a.b(e2.k.a().b("inapp").a(), new C0038a());
                    return;
                }
                h7.l.d("rbx.purchaseflow", "Failed QueryPurchaseHistory: " + c1761e);
            }
        }
    }

    class b implements InterfaceC2418g {

        class a implements e2.h {
            a() {
            }

            @Override
            public void a(C1761e c1761e, List<Purchase> list) {
                if (c1761e.b() != 0) {
                    h7.l.c("Failed QueryPurchases. BillingResult: " + c1761e);
                    return;
                }
                i.this.f2451s.l("QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + i.this.p0(list));
                i.this.x0(list, true);
            }
        }

        b() {
        }

        @Override
        public void a(C1761e c1761e, List<PurchaseHistoryRecord> list) {
            boolean z7 = c1761e.b() == 0;
            i.this.f2451s.l("OnSubsPurchaseHistoryResponse. Success: " + z7 + ". Message: " + c1761e.toString() + ".");
            if (i.this.C0()) {
                if (z7) {
                    i.this.f2433a.b(e2.k.a().b("subs").a(), new a());
                    return;
                }
                h7.l.d("rbx.purchaseflow", "Failed QueryPurchaseHistory: " + c1761e);
            }
        }
    }

    static class c {

        static final int[] f2463a;

        static final int[] f2464b;

        static {
            int[] iArr = new int[i.b.values().length];
            f2464b = iArr;
            try {
                iArr[i.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2464b[i.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2464b[i.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.c.values().length];
            f2463a = iArr2;
            try {
                iArr2[d.c.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2463a[d.c.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2463a[d.c.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2463a[d.c.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2463a[d.c.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2463a[d.c.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    class d implements InterfaceC2414c {
        d() {
        }

        @Override
        public void a(C1761e c1761e) {
            if (c1761e.b() == 0) {
                h7.l.g("rbx.purchaseflow", "Google Billing Client is setup");
                i.this.f2434b = m.READY;
            } else {
                h7.l.d("rbx.purchaseflow", "Google Billing Client is not setup");
                i.this.f2434b = m.NONE;
            }
        }

        @Override
        public void b() {
            h7.l.g("rbx.purchaseflow", "Google Billing Client disconnected");
            i.this.f2434b = m.NONE;
        }
    }

    class e implements InterfaceC2417f {

        final p f2466a;

        e(p pVar) {
            this.f2466a = pVar;
        }

        @Override
        public void a(C1761e c1761e, List<C1763g> list) {
            if (c1761e.b() == 0) {
                h7.l.a("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + list.size());
                for (C1763g c1763g : list) {
                    if (c1763g != i.this.f2437e.put(c1763g.c(), c1763g)) {
                        i.this.f2437e.remove(c1763g.c());
                        i.this.f2437e.put(c1763g.c(), c1763g);
                    }
                }
                h7.l.a("rbx.purchaseflow", "queryInAppProduct Success. Count = " + i.this.f2437e.size());
                i.this.f2435c = m.READY;
            } else {
                h7.l.d("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + c1761e);
                i.this.f2435c = m.NONE;
            }
            p pVar = this.f2466a;
            if (pVar != null) {
                pVar.a();
            }
        }
    }

    class f implements InterfaceC2417f {

        final p f2468a;

        f(p pVar) {
            this.f2468a = pVar;
        }

        @Override
        public void a(C1761e c1761e, List<C1763g> list) {
            if (c1761e.b() == 0) {
                h7.l.a("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + list.size());
                for (C1763g c1763g : list) {
                    if (c1763g != i.this.f2438f.put(c1763g.c(), c1763g)) {
                        i.this.f2438f.remove(c1763g.c());
                        i.this.f2438f.put(c1763g.c(), c1763g);
                    }
                }
                h7.l.a("rbx.purchaseflow", "querySubsProduct Success. Count = " + i.this.f2438f.size());
                i.this.f2436d = m.READY;
            } else {
                h7.l.d("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + c1761e);
                i.this.f2436d = m.NONE;
            }
            p pVar = this.f2468a;
            if (pVar != null) {
                pVar.a();
            }
        }
    }

    class g implements p {

        final String f2470a;

        g(String str) {
            this.f2470a = str;
        }

        @Override
        public void a() {
            i iVar = i.this;
            C1763g c1763gQ0 = iVar.q0(this.f2470a, iVar.f2447o);
            i iVar2 = i.this;
            if (iVar2.G0(this.f2470a, c1763gQ0, iVar2.f2447o)) {
                i iVar3 = i.this;
                iVar3.f2445m = iVar3.t0(c1763gQ0, iVar3.f2447o);
                i.this.f2451s.e0(new L6.e(i.this.f2446n, this.f2470a, false));
                i.this.l0();
            }
        }
    }

    class h implements d.InterfaceC0032d {
        h() {
        }

        @Override
        public void a(d.c cVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            i.this.f2451s.l("ValidationCheck: " + cVar + ".");
            switch (c.f2463a[cVar.ordinal()]) {
                case 1:
                    i.this.m0(validatePurchaseResponsePayload);
                    break;
                case 2:
                    i.this.d1();
                    i.this.O0(str, d.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    i.this.g1();
                    i.this.O0(str, d.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    i.this.e1();
                    i.this.O0(str, d.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    i.this.e1();
                    i.this.O0(str, d.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    i.this.c1();
                    i.this.O0(str, d.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    i.this.h1();
                    i.this.O0(str, d.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    class C0039i implements e2.i {
        C0039i() {
        }

        @Override
        public void a(C1761e c1761e, List<Purchase> list) {
            if (i.this.f2433a == null) {
                return;
            }
            int iB = c1761e.b();
            if (j6.d.a().M0()) {
                if (list != null) {
                    for (Purchase purchase : list) {
                        IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(purchase.g(), purchase.d());
                    }
                }
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(i.this.f2444l, iB);
                i.this.T0();
                i.this.f2440h = false;
                return;
            }
            if (iB == 0) {
                i.this.x0(list, false);
                return;
            }
            if (iB == 1) {
                i iVar = i.this;
                iVar.O0(iVar.f2443k, d.b.USER_CANCELLED, "User cancelled");
            } else if (iB == 7) {
                i.this.v0();
            } else {
                i iVar2 = i.this;
                iVar2.O0(iVar2.f2443k, d.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            }
        }
    }

    class j implements i.c {

        final Purchase f2474a;

        j(Purchase purchase) {
            this.f2474a = purchase;
        }

        @Override
        public void a(i.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
            i.this.f2451s.l("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f2474a.b());
            if (i.this.f2453u != null) {
                i.this.f2453u.c();
            }
            if (bVar != i.b.OK && !this.f2474a.i()) {
                i.this.m1();
            }
            int i7 = c.f2464b[bVar.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    i.this.p1();
                    i iVar = i.this;
                    iVar.O0(iVar.e0(this.f2474a), d.b.RECEIPT_VERIFICATION_ERROR, EZYiRMRTxKdo.RYIvMeG);
                    return;
                } else if (i7 != 3) {
                    i.this.q1();
                    i iVar2 = i.this;
                    iVar2.O0(iVar2.e0(this.f2474a), d.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    i.this.o1();
                    i iVar3 = i.this;
                    iVar3.O0(iVar3.e0(this.f2474a), d.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String strE0 = i.this.e0(this.f2474a);
            if (i.this.E0(this.f2474a)) {
                h7.l.g("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (i.this.B0(strE0)) {
                    g7.c.c().r(g7.c.c().f() + L6.g.d(strE0));
                }
                boolean zE0 = i.this.E0(this.f2474a);
                C1763g c1763gQ0 = i.this.q0(strE0, zE0);
                if (i.this.H0(strE0, c1763gQ0, zE0, false)) {
                    i.this.f2451s.m(strE0, i.r0(c1763gQ0, zE0), i.this.t0(c1763gQ0, zE0), i.s0(c1763gQ0, zE0));
                } else {
                    h7.l.g("rbx.purchaseflow", "Unable to find skuDetails: " + strE0);
                }
            }
            i.this.f0(this.f2474a, purchaseVerificationResponse);
        }
    }

    class k implements InterfaceC2413b {

        final Purchase f2476a;

        final boolean f2477b;

        final PurchaseVerificationResponse f2478c;

        k(Purchase purchase, boolean z7, PurchaseVerificationResponse purchaseVerificationResponse) {
            this.f2476a = purchase;
            this.f2477b = z7;
            this.f2478c = purchaseVerificationResponse;
        }

        @Override
        public void a(C1761e c1761e) {
            int iB = c1761e.b();
            boolean z7 = false;
            boolean z8 = iB == 0;
            i.this.f2451s.l("OnAcknowledgePurchaseResponse. Success: " + z8 + ". Message: " + c1761e.toString() + ".");
            if (j6.d.a().F2()) {
                boolean z9 = M6.a.k(this.f2476a) != null;
                if (z9) {
                    i.this.f2451s.p("Android-Purchase-Completed-With-Checkout-Session-Id");
                }
                z7 = z9;
            }
            if (z8) {
                if (this.f2477b) {
                    i.this.f2451s.p("Play-Points-Ack-Purchase-Succeed");
                }
                i.this.h0(this.f2476a, d.b.SUCCESS, M6.o.b(this.f2478c));
                return;
            }
            if (this.f2477b) {
                i.this.f2451s.p("Play-Points-Ack-Purchase-Fail");
            }
            h7.l.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
            i.this.U0();
            if (!j6.d.a().F2()) {
                i iVar = i.this;
                iVar.O0(iVar.e0(this.f2476a), d.b.ACKNOWLEDGE_ERROR, "OnAcknowledgePurchaseResponse failure");
            } else if (z7) {
                i.this.w0(this.f2476a, iB);
            }
        }
    }

    class l implements InterfaceC2416e {

        final String f2480a;

        final Purchase f2481b;

        l(String str, Purchase purchase) {
            this.f2480a = str;
            this.f2481b = purchase;
        }

        @Override
        public void a(C1761e c1761e, String str) {
            boolean z7 = c1761e.b() == 0;
            i.this.f2451s.l("OnConsumeResponse. Success: " + z7 + jUbDmI.KZlTxZssIPy + c1761e.toString() + ".");
            if (z7) {
                if (M6.k.b(this.f2480a)) {
                    i.this.f2451s.p("Play-Points-Consume-Purchase-Succeed");
                }
                i.this.N0(this.f2480a, d.b.SUCCESS);
                C1763g c1763gQ0 = i.this.q0(this.f2480a, false);
                if (i.this.H0(this.f2480a, c1763gQ0, false, false)) {
                    i.this.f2451s.m(this.f2480a, i.r0(c1763gQ0, false), i.this.t0(c1763gQ0, false), i.s0(c1763gQ0, false));
                } else {
                    h7.l.g("rbx.purchaseflow", "Unable to find skuDetails: " + this.f2480a);
                }
                String strC = M6.m.c(this.f2481b);
                if (i.this.f2439g.containsKey(strC)) {
                    i.this.f2439g.remove(strC);
                }
            } else {
                if (M6.k.b(this.f2480a)) {
                    i.this.f2451s.p("Play-Points-Consume-Purchase-Fail");
                }
                i.this.V0();
                i iVar = i.this;
                iVar.O0(iVar.e0(this.f2481b), d.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            h7.l.g("rbx.purchaseflow", "End consume flow.");
        }
    }

    private enum m {
        NONE,
        CONNECTING,
        READY
    }

    private class n {

        public String f2487a;

        public String f2488b;

        n(String str, String str2) {
            this.f2487a = str;
            this.f2488b = str2;
        }

        public String toString() {
            return "{ productType: " + this.f2488b + ", providerProductId: " + this.f2487a + " }";
        }
    }

    public interface o {
        void a(List<C1763g> list);
    }

    public interface p {
        void a();
    }

    i(M6.l lVar, InterfaceC2700f interfaceC2700f, E6.h hVar) {
        m mVar = m.NONE;
        this.f2434b = mVar;
        this.f2435c = mVar;
        this.f2436d = mVar;
        this.f2437e = new Hashtable<>();
        this.f2438f = new Hashtable<>();
        this.f2439g = new Hashtable<>();
        this.f2440h = false;
        this.f2441i = null;
        this.f2443k = null;
        this.f2444l = null;
        this.f2445m = null;
        this.f2446n = BuildConfig.FLAVOR;
        this.f2448p = 0L;
        this.f2449q = true;
        this.f2450r = null;
        this.f2454v = new Hashtable<>();
        this.f2456x = null;
        this.f2457y = null;
        this.f2458z = new h();
        this.f2430A = new C0039i();
        this.f2431B = new a();
        this.f2432C = new b();
        this.f2433a = lVar;
        this.f2452t = interfaceC2700f;
        this.f2451s = hVar;
    }

    public boolean B0(String str) {
        return u0().contains(str);
    }

    public boolean E0(Purchase purchase) {
        String strE0 = e0(purchase);
        return B0(strE0) || !(o0().contains(strE0) || M6.k.b(strE0));
    }

    private boolean F0(String str) {
        String str2 = this.f2443k;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    public boolean G0(String str, C1763g c1763g, boolean z7) {
        return H0(str, c1763g, z7, true);
    }

    public boolean H0(String str, C1763g c1763g, boolean z7, boolean z8) {
        if (c1763g == null) {
            h7.l.a("rbx.purchaseflow", "Product details not found after query.");
            if (z8) {
                O0(str, d.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z7 && c1763g.e() == null) {
            if (z8) {
                O0(this.f2443k, d.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z7 || c1763g.b() != null) {
            return true;
        }
        if (z8) {
            O0(this.f2443k, d.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    public void I0(Map map, boolean z7, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1763g c1763g = (C1763g) it.next();
            if (c1763g == null) {
                h7.l.d("rbx.purchaseflow", "Null product details in list");
            } else {
                String strC = c1763g.c();
                if (map.containsKey(strC)) {
                    y0((Purchase) map.get(strC), z7);
                } else {
                    h7.l.d("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strC);
                }
            }
        }
    }

    public void J0(boolean z7, long j7, String str, String str2, Activity activity, C1761e c1761e, List list) {
        if (c1761e.b() != 0) {
            h7.l.g("rbx.purchaseflow", "PaymentsProtocol: Failed to get product details.");
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        C1763g c1763g = null;
        while (it.hasNext()) {
            c1763g = (C1763g) it.next();
            c1763g.d().equals("subs");
        }
        ArrayList arrayList = new ArrayList();
        if (z7) {
            arrayList.add(C1760d.b.a().c(c1763g).b(c1763g.e().get(0).a()).a());
        } else {
            arrayList.add(C1760d.b.a().c(c1763g).a());
        }
        if (j7 > 0) {
            str = Long.toString(j7);
        }
        C1760d.a aVarD = C1760d.a().b(str).d(arrayList);
        String str3 = this.f2456x;
        if (str3 != null) {
            aVarD.c(str3);
            this.f2451s.p("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else {
            String str4 = this.f2457y;
            if (str4 != null) {
                aVarD.c(str4);
                this.f2451s.p("Android-Purchase-Initiated-With-Checkout-Session-Id");
            } else {
                h7.l.k("rbx.purchaseflow", "Both mStoredChargeRequestId and mCurrentCheckoutSessionId is null.");
                this.f2451s.p("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
            }
        }
        C1760d c1760dA = aVarD.a();
        this.f2444l = str2;
        if (this.f2433a.i(activity, c1760dA).b() != 0) {
            h7.l.a("rbx.purchaseflow", "PaymentsProtocol: Purchase failed!");
        }
    }

    public void K0(List list, o oVar, C1761e c1761e, List list2) {
        if (c1761e.b() != 0) {
            h7.l.d("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + c1761e);
        } else {
            if (list2.isEmpty()) {
                h7.l.g("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C1763g c1763g = (C1763g) it.next();
                if (c1763g.d().equals("subs")) {
                    this.f2438f.put(c1763g.c(), c1763g);
                } else {
                    this.f2437e.put(c1763g.c(), c1763g);
                }
            }
            h7.l.g("rbx.purchaseflow", hkVlaTTCDY.GvrH + list);
        }
        oVar.a(list2);
    }

    public void L0(M6.b bVar, boolean z7, List list) {
        if (list == null || list.isEmpty()) {
            O0(bVar.d(), d.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        C1763g c1763g = (C1763g) list.get(0);
        if (G0(bVar.d(), c1763g, bVar.c())) {
            this.f2445m = t0(c1763g, bVar.c());
            this.f2451s.e0(new L6.e(this.f2446n, bVar.d(), !z7));
            m0(null);
        }
    }

    private void M0(Purchase purchase, boolean z7) {
        if (this.f2453u != null && F0(e0(purchase))) {
            this.f2453u.b();
        }
        new L6.i(this.f2452t).b(a0.W0(), new M6.c(purchase, z7, this.f2449q), new j(purchase));
    }

    public void N0(String str, d.b bVar) {
        d.b bVar2 = d.b.SUCCESS;
        if (bVar == bVar2) {
            l1();
        } else if (bVar == d.b.USER_CANCELLED) {
            j1();
        } else if (bVar == d.b.ALREADY_ACKNOWLEDGED) {
            i1();
        } else {
            k1();
        }
        if (this.f2453u != null && F0(str)) {
            L6.f fVar = this.f2453u;
            if (fVar instanceof InterfaceC2596M) {
                if (this.f2448p != 0) {
                    if (this.f2454v.containsKey(str)) {
                        ((InterfaceC2596M) this.f2453u).d(bVar == bVar2, this.f2448p, this.f2454v.get(str));
                        return;
                    }
                    ((InterfaceC2596M) this.f2453u).d(bVar == bVar2, this.f2448p, this.f2443k);
                } else {
                    h7.l.k("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f2448p + ". mProductId=" + this.f2443k + ".");
                }
            } else if (fVar != null) {
                fVar.a(new M6.d(bVar, this.f2443k));
            }
        }
        if (F0(str)) {
            T0();
        }
    }

    public void O0(String str, d.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f2451s.l(str2);
        }
        N0(str, bVar);
    }

    private void Q0(final List<n> list, final o oVar) {
        if (this.f2433a.a("fff").b() != 0) {
            h7.l.d("rbx.purchaseflow", "ProductDetails feature is not supported.");
            f1();
            oVar.a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (n nVar : list) {
            arrayList.add(C1764h.b.a().b(nVar.f2487a).c(nVar.f2488b).a());
        }
        this.f2433a.f(C1764h.a().b(arrayList).a(), new InterfaceC2417f() {
            @Override
            public final void a(C1761e c1761e, List list2) {
                this.f2422a.K0(list, oVar, c1761e, list2);
            }
        });
    }

    private void R0(p pVar) {
        h7.l.a("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f2433a.a(vxbbqXNtzfMxs.OIAHoJuXiV).b() != 0) {
            h7.l.d("rbx.purchaseflow", "ProductDetails feature is not supported.");
            f1();
            if (pVar != null) {
                pVar.a();
                return;
            }
            return;
        }
        m mVar = this.f2435c;
        if (mVar == m.READY) {
            h7.l.a("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (pVar != null) {
                pVar.a();
                return;
            }
            return;
        }
        if (mVar != m.NONE) {
            h7.l.a("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listO0 = o0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listO0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1764h.b.a().b(it.next()).c("inapp").a());
        }
        C1764h c1764hA = C1764h.a().b(arrayList).a();
        this.f2435c = m.CONNECTING;
        this.f2433a.f(c1764hA, new e(pVar));
    }

    private void S0(p pVar) {
        String str = wtzgsqRsIZB.lVTPYfxyZfXM;
        h7.l.a("rbx.purchaseflow", str);
        if (this.f2433a.a("subscriptions").b() != 0) {
            h7.l.d("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f2433a.a("fff").b() != 0) {
            h7.l.d("rbx.purchaseflow", "ProductDetails feature is not supported.");
            f1();
            if (pVar != null) {
                pVar.a();
                return;
            }
            return;
        }
        h7.l.a("rbx.purchaseflow", str);
        m mVar = this.f2436d;
        if (mVar == m.READY) {
            h7.l.a("rbx.purchaseflow", "querySubsProduct is setup already");
            if (pVar != null) {
                pVar.a();
                return;
            }
            return;
        }
        if (mVar != m.NONE) {
            h7.l.a("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listU0 = u0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listU0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1764h.b.a().b(it.next()).c("subs").a());
        }
        C1764h c1764hA = C1764h.a().b(arrayList).a();
        this.f2436d = m.CONNECTING;
        h7.l.a("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f2433a.f(c1764hA, new f(pVar));
    }

    public void T0() {
        this.f2442j = null;
        this.f2453u = null;
        this.f2443k = null;
        this.f2448p = 0L;
        this.f2455w = null;
        this.f2445m = null;
        this.f2449q = true;
        this.f2450r = null;
    }

    public void U0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.n(this.f2449q);
    }

    public void V0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.o(this.f2449q);
    }

    private void W0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.s();
    }

    private void X0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.t();
    }

    private void Y0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.u();
    }

    private void Z0() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.v();
    }

    private void a1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.w();
    }

    private void b1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.O();
    }

    public void c1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.P(this.f2449q, false);
    }

    public void d1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.Q(this.f2449q, false);
    }

    public void e1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.X(this.f2449q, false);
    }

    public void f0(Purchase purchase, PurchaseVerificationResponse purchaseVerificationResponse) {
        boolean zB = M6.k.b(e0(purchase));
        if (!purchase.i() || zB) {
            h7.l.g("rbx.purchaseflow", "Acknowledging Purchase");
            g0(purchase, new k(purchase, zB, purchaseVerificationResponse));
        } else {
            h7.l.g("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            h0(purchase, d.b.ALREADY_ACKNOWLEDGED, M6.o.b(purchaseVerificationResponse));
        }
    }

    private void f1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.R(this.f2449q, false);
    }

    private void g0(Purchase purchase, InterfaceC2413b interfaceC2413b) {
        h7.l.g("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f2433a.d(C2412a.b().b(purchase.g()).a(), interfaceC2413b);
    }

    public void g1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.S(this.f2449q, false);
    }

    public void h0(Purchase purchase, d.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        h7.l.g("rbx.purchaseflow", "Acknowledged Purchase");
        if (E0(purchase)) {
            this.f2439g.remove(M6.m.c(purchase));
            N0(e0(purchase), bVar);
            return;
        }
        String strE0 = e0(purchase);
        String strC = M6.m.c(purchase);
        boolean zB = M6.k.b(strE0);
        M6.j jVar = this.f2441i;
        boolean z7 = jVar != null && jVar.c(strC);
        if (zB) {
            if (z7) {
                this.f2451s.p("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f2451s.p("Play-Points-Show-Confirmation-Screen");
                C1763g c1763gQ0 = q0(strE0, false);
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strE0).setNativeProductId(strE0).setRobuxAmount(0).setDescription(c1763gQ0.a()).setDisplayPrice(M6.m.b(c1763gQ0)).setPrice(M6.m.d(c1763gQ0)).setCurrencyCode(M6.m.a(c1763gQ0)).setRobloxPurchaseInfo(M6.o.a(robloxPurchaseInfo)).build());
                M6.j jVar2 = this.f2441i;
                if (jVar2 != null) {
                    jVar2.a(strC);
                }
            }
        }
        k0(purchase);
    }

    public void h1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.T(this.f2449q, false);
    }

    private void i1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.U(this.f2449q, false);
    }

    private void j1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.V(this.f2449q, false);
    }

    private void k0(Purchase purchase) {
        String strE0 = e0(purchase);
        if (j6.d.a().l1() || !M6.k.a(strE0)) {
            h7.l.g("rbx.purchaseflow", "Consuming Purchase");
            this.f2433a.c(C2415d.b().b(purchase.g()).a(), new l(strE0, purchase));
        } else if (M6.k.b(strE0)) {
            this.f2451s.p("Play-Points-Not-Consume-Purchase");
        }
    }

    private void k1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.W(this.f2449q, false);
    }

    public void l0() {
        L6.f fVar = this.f2453u;
        if (fVar != null) {
            fVar.e();
        }
        L6.d dVar = new L6.d(this.f2452t);
        if (!j6.d.a().l3()) {
            if (this.f2449q) {
                dVar.d(a0.V0(), this.f2443k, this.f2445m, this.f2458z);
                return;
            } else {
                dVar.b(a0.V0(), this.f2443k, this.f2445m, this.f2458z);
                return;
            }
        }
        String str = this.f2450r;
        String str2 = (str == null || str.isEmpty()) ? null : this.f2450r;
        if (this.f2449q) {
            dVar.e(a0.V0(), this.f2443k, this.f2445m, str2, this.f2458z);
        } else {
            dVar.c(a0.V0(), this.f2443k, this.f2445m, str2, this.f2458z);
        }
    }

    private void l1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.Y(this.f2449q, false);
    }

    public void m0(ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        C1760d c1760dA;
        L6.f fVar = this.f2453u;
        if (fVar != null) {
            fVar.c();
        }
        this.f2451s.l("PurchaseStarted.");
        C1763g c1763gQ0 = q0(this.f2443k, this.f2447o);
        if (G0(this.f2443k, c1763gQ0, this.f2447o)) {
            ArrayList arrayList = new ArrayList();
            if (this.f2447o) {
                arrayList.add(C1760d.b.a().c(c1763gQ0).b(c1763gQ0.e().get(0).a()).a());
            } else {
                arrayList.add(C1760d.b.a().c(c1763gQ0).a());
            }
            if (j6.d.a().F2()) {
                C1760d.a aVarD = C1760d.a().b((validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getUserId() == null || validatePurchaseResponsePayload.getUserId().longValue() <= 0) ? this.f2446n : String.valueOf(validatePurchaseResponsePayload.getUserId())).d(arrayList);
                String str = this.f2455w;
                if (str != null) {
                    aVarD.c(str);
                    this.f2451s.p("Android-Purchase-Initiated-With-Charge-Request-Id");
                } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
                    h7.l.k("rbx.purchaseflow", "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null.");
                    this.f2451s.p("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
                } else {
                    aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
                    this.f2451s.p("Android-Purchase-Initiated-With-Checkout-Session-Id");
                }
                c1760dA = aVarD.a();
            } else {
                c1760dA = this.f2455w != null ? C1760d.a().b(this.f2446n).c(this.f2455w).d(arrayList).a() : C1760d.a().b(this.f2446n).d(arrayList).a();
            }
            if (this.f2442j.getIntent() == null) {
                this.f2442j.setIntent(new Intent());
            }
            if (this.f2433a.i(this.f2442j, c1760dA).b() != 0) {
                O0(this.f2443k, d.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    public void m1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.Z();
    }

    public static i n0(Context context) {
        if (f2425D == null) {
            f2425D = new i(new M6.a(), new C2702h(), E6.h.b());
            f2425D.s1(AbstractC1758b.f(context).d(f2425D.f2430A).b().a());
            f2425D.r1(new M6.j(context));
        }
        return f2425D;
    }

    private void n1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.a0();
    }

    private static List<String> o0() {
        String strY1 = j6.d.a().y1();
        if (strY1.isEmpty()) {
            return f2426E;
        }
        if (f2427F == null) {
            f2427F = Arrays.asList(strY1.split(","));
        }
        return f2427F;
    }

    public void o1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.b0(this.f2449q, false);
    }

    public String p0(List<Purchase> list) {
        Iterator<Purchase> it = list.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            str = str + e0(it.next()) + "; ";
        }
        return str;
    }

    public void p1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.c0(this.f2449q, false);
    }

    public C1763g q0(String str, boolean z7) {
        if (str == null) {
            return null;
        }
        if (z7 && this.f2438f.containsKey(str)) {
            return this.f2438f.get(str);
        }
        if (!z7 && this.f2437e.containsKey(str)) {
            return this.f2437e.get(str);
        }
        h7.l.c("Unable to get product details for productId: " + str);
        return null;
    }

    public void q1() {
        if (C2400b.a()) {
            return;
        }
        this.f2451s.d0(this.f2449q, false);
    }

    public static String r0(C1763g c1763g, boolean z7) {
        if (z7) {
            List<C1763g.e> listE = c1763g.e();
            Objects.requireNonNull(listE);
            return listE.get(0).b().a().get(0).a();
        }
        C1763g.b bVarB = c1763g.b();
        Objects.requireNonNull(bVarB);
        return bVarB.a();
    }

    public static long s0(C1763g c1763g, boolean z7) {
        if (z7) {
            List<C1763g.e> listE = c1763g.e();
            Objects.requireNonNull(listE);
            return listE.get(0).b().a().get(0).b();
        }
        C1763g.b bVarB = c1763g.b();
        Objects.requireNonNull(bVarB);
        return bVarB.b();
    }

    public String t0(C1763g c1763g, boolean z7) {
        if (z7) {
            List<C1763g.e> listE = c1763g.e();
            Objects.requireNonNull(listE);
            return listE.get(0).b().a().get(0).c();
        }
        C1763g.b bVarB = c1763g.b();
        Objects.requireNonNull(bVarB);
        return bVarB.c();
    }

    private boolean t1(String str, String str2, Activity activity, long j7, L6.f fVar, boolean z7) {
        h7.l.g("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z7 + "isInApp: " + this.f2449q);
        this.f2446n = str;
        if (!C0()) {
            return false;
        }
        this.f2453u = fVar;
        this.f2448p = j7;
        this.f2443k = str2;
        this.f2442j = activity;
        this.f2447o = B0(str2);
        g gVar = new g(str2);
        if (this.f2447o) {
            S0(gVar);
            return true;
        }
        R0(gVar);
        return true;
    }

    private static List<String> u0() {
        String strI1 = j6.d.a().I1();
        if (strI1.isEmpty()) {
            return f2428G;
        }
        if (f2429H == null) {
            f2429H = Arrays.asList(strI1.split(","));
        }
        return f2429H;
    }

    private void u1(Purchase purchase, String str, boolean z7) {
        boolean zB = M6.k.b(e0(purchase));
        M6.j jVar = this.f2441i;
        boolean z8 = jVar != null && jVar.c(str);
        if (!purchase.i() || (zB && !z8)) {
            M0(purchase, z7);
        } else {
            h0(purchase, d.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }

    public void v0() {
        h7.l.g("rbx.purchaseflow", "Do Google Purchase GrantPending");
        e2.j jVarA = e2.j.a().b("inapp").a();
        e2.j jVarA2 = e2.j.a().b("subs").a();
        this.f2433a.j(jVarA, this.f2431B);
        this.f2433a.j(jVarA2, this.f2432C);
    }

    public void w0(Purchase purchase, int i7) {
        h7.l.g("rbx.purchaseflow", "Acknowledge error, response code: " + i7 + ", skipping client side acknowledge purchase.");
        this.f2451s.p("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        String strC = M6.m.c(purchase);
        if (this.f2439g.containsKey(strC)) {
            this.f2439g.remove(strC);
        }
        String strE0 = e0(purchase);
        if (!E0(purchase)) {
            C1763g c1763gQ0 = q0(strE0, false);
            if (H0(strE0, c1763gQ0, false, false)) {
                this.f2451s.m(strE0, r0(c1763gQ0, false), t0(c1763gQ0, false), s0(c1763gQ0, false));
            } else {
                h7.l.g("rbx.purchaseflow", "Unable to find skuDetails: " + strE0);
            }
        }
        N0(strE0, d.b.SUCCESS);
    }

    public void x0(List<Purchase> list, final boolean z7) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (Purchase purchase : list) {
            String strE0 = e0(purchase);
            boolean zE0 = E0(purchase);
            if (q0(strE0, zE0) != null) {
                y0(purchase, z7);
            } else {
                if (zE0) {
                    arrayList2.add(new n(strE0, "subs"));
                } else {
                    arrayList.add(new n(strE0, "inapp"));
                }
                hashtable.put(strE0, purchase);
            }
        }
        o oVar = new o() {
            @Override
            public final void a(List list2) {
                this.f2416a.I0(hashtable, z7, list2);
            }
        };
        if (!arrayList.isEmpty()) {
            Q0(arrayList, oVar);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Q0(arrayList2, oVar);
    }

    private void y0(Purchase purchase, boolean z7) {
        h7.l.g("rbx.purchaseflow", "Handle single purchase. Product id: " + e0(purchase) + ". Order id: " + purchase.b() + ". isAcknowledged: " + purchase.i());
        int iF = purchase.f();
        if (iF == 0) {
            n1();
        } else if (iF == 2) {
            b1();
        }
        if (purchase.f() != 1) {
            return;
        }
        this.f2439g.put(M6.m.c(purchase), purchase);
        if (!M6.k.b(e0(purchase))) {
            C1757a c1757aA = purchase.a();
            String strA = c1757aA.a();
            String strB = c1757aA.b();
            String str = this.f2446n;
            if (str == null || !str.equals(strA)) {
                long j7 = this.f2448p;
                if ((j7 <= 0 || !Long.toString(j7).equals(strA)) && (strB == null || strB.equals(BuildConfig.FLAVOR))) {
                    W0();
                    if (j6.d.a().M1()) {
                        String str2 = this.f2446n;
                        if (str2 == null) {
                            a1();
                        } else if (!str2.equals(strA)) {
                            Z0();
                        }
                        long j8 = this.f2448p;
                        if (j8 <= 0) {
                            X0();
                            return;
                        } else {
                            if (Long.toString(j8).equals(strA)) {
                                return;
                            }
                            Y0();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        u1(purchase, M6.m.c(purchase), z7);
    }

    private boolean z0() {
        return this.f2439g.size() > 0;
    }

    public boolean A0() {
        return this.f2443k != null;
    }

    public boolean C0() {
        return !this.f2446n.isEmpty() && D0();
    }

    public boolean D0() {
        M6.l lVar = this.f2433a;
        return lVar != null && this.f2434b == m.READY && lVar.e();
    }

    public void P0(long j7, String str, boolean z7) {
        if (!D0()) {
            h7.l.a("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup.");
            return;
        }
        if (A0()) {
            h7.l.a("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress.");
        } else if (z7 || !this.f2440h) {
            e2.j.a().b("inapp").a();
        } else {
            h7.l.a("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume.");
        }
    }

    @Override
    public String a(String str) {
        return new M6.b(str).a();
    }

    @Override
    public boolean b(long j7, String str, String str2, Activity activity, final boolean z7, L6.f fVar) {
        final M6.b bVar = new M6.b(str2);
        if (!bVar.b()) {
            h7.l.d("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (bVar.c() && this.f2433a.a("subscriptions").b() != 0) {
            h7.l.d("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        h7.l.g("rbx.purchaseflow", "Initiated purchase. Params: " + bVar);
        this.f2446n = Long.toString(j7);
        if (!C0()) {
            h7.l.d("rbx.purchaseflow", "Purchasing is not enabled. Params: " + bVar);
            return false;
        }
        this.f2448p = j7;
        this.f2443k = bVar.d();
        this.f2455w = bVar.a();
        this.f2442j = activity;
        this.f2449q = !z7;
        this.f2453u = fVar;
        this.f2447o = bVar.c();
        if (bVar.c()) {
            this.f2454v.put(bVar.d(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new n(bVar.d(), bVar.e()));
        Q0(arrayList, new o() {
            @Override
            public final void a(List list) {
                this.f2419a.L0(bVar, z7, list);
            }
        });
        return true;
    }

    @Override
    public boolean c(String str, String str2, Activity activity, L6.f fVar, boolean z7) {
        this.f2449q = true;
        return t1(str, str2, activity, 0L, fVar, z7);
    }

    @Override
    public boolean d(String str, String str2, Activity activity, long j7, L6.f fVar) {
        this.f2449q = false;
        return t1(str, str2, activity, j7, fVar, false);
    }

    @Override
    public boolean e(String str) {
        this.f2456x = str;
        return !TextUtils.isEmpty(str);
    }

    public String e0(Purchase purchase) {
        return M6.a.l(purchase);
    }

    @Override
    public boolean f(String str, String str2, Activity activity, L6.f fVar, boolean z7, String str3) {
        this.f2449q = true;
        if (str3 != null) {
            this.f2450r = str3;
        }
        h7.l.g("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z7 + ", paymentSessionId: " + this.f2450r);
        return t1(str, str2, activity, 0L, fVar, z7);
    }

    @Override
    public boolean g(final String str, final long j7, final String str2, final Activity activity) {
        this.f2451s.l("PurchaseStarted.");
        final boolean zB0 = B0(str);
        if (this.f2433a.a("fff").b() != 0) {
            f1();
            return false;
        }
        this.f2443k = str;
        String str3 = zB0 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1764h.b.a().b(str).c(str3).a());
        this.f2433a.f(C1764h.a().b(arrayList).a(), new InterfaceC2417f() {
            @Override
            public final void a(C1761e c1761e, List list) {
                this.f2410a.J0(zB0, j7, str2, str, activity, c1761e, list);
            }
        });
        return true;
    }

    @Override
    public boolean h(String str) {
        this.f2457y = str;
        return !TextUtils.isEmpty(str);
    }

    @Override
    public boolean i(String str, long j7, long j8) {
        boolean z7;
        int i7 = (int) j7;
        if (i7 != 0) {
            if (i7 == 1) {
                j1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new M6.d(d.b.USER_CANCELLED, this.f2443k));
            } else if (i7 != 7) {
                k1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new M6.d(d.b.FAILED_PURCHASE_RESPONSE, this.f2443k));
            } else {
                i1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new M6.d(d.b.SUCCESS, this.f2443k));
            }
            z7 = false;
            NativeGLInterface.nativeInGamePurchaseFinished(z7, j8, str);
            return true;
        }
        l1();
        IAPPurchaseManager.paymentsProtocolPurchaseFinished(new M6.d(d.b.SUCCESS, this.f2443k));
        z7 = true;
        NativeGLInterface.nativeInGamePurchaseFinished(z7, j8, str);
        return true;
    }

    public void i0(long j7, String str, boolean z7) {
        this.f2448p = j7;
        j0(str, z7);
    }

    public void j0(String str, boolean z7) {
        this.f2446n = str;
        h7.l.a("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z7);
        if (!D0()) {
            h7.l.a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (A0()) {
            h7.l.a("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z7) {
            v0();
            return;
        }
        if (!z0()) {
            if (this.f2440h) {
                return;
            }
            v0();
            this.f2440h = true;
            return;
        }
        h7.l.a("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f2439g.size());
        v0();
    }

    public void r1(M6.j jVar) {
        this.f2441i = jVar;
    }

    public void s1(AbstractC1758b abstractC1758b) {
        m mVar = this.f2434b;
        if (mVar == m.READY) {
            h7.l.g("rbx.purchaseflow", tAjeAKSIqDqzNP.FVnwtKCpbAYadZR);
            return;
        }
        m mVar2 = m.CONNECTING;
        if (mVar == mVar2) {
            h7.l.g("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f2433a.g(abstractC1758b);
        this.f2434b = mVar2;
        h7.l.g("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f2433a.h(new d());
    }
}
