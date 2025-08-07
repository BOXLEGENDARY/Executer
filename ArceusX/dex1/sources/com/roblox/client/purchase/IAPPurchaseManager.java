package com.roblox.client.purchase;

import L6.g;
import M6.i;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.C2374w;
import com.roblox.client.M;
import com.roblox.engine.jni.NativeGLInterface;
import h7.l;
import h7.n;
import m6.InterfaceC2596M;
import t2.Dbl.hgESaf;

public class IAPPurchaseManager {

    private static L6.a f20169h;

    private static boolean f20170i;

    private final boolean f20173c;

    private L6.a f20174d;

    private Handler f20175e;

    private long f20171a = 0;

    private String f20172b = BuildConfig.FLAVOR;

    private InterfaceC2596M f20176f = new e();

    private InterfaceC2596M f20177g = new e();

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            IAPPurchaseManager.this.i(M.f19632a1);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            IAPPurchaseManager.this.i(M.f19632a1);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override
        public void run() {
            IAPPurchaseManager.this.i(M.f19632a1);
        }
    }

    class d implements Runnable {

        final CharSequence f20181d;

        d(CharSequence charSequence) {
            this.f20181d = charSequence;
        }

        @Override
        public void run() {
            if (IAPPurchaseManager.f20170i) {
                IAPPurchaseManager.f20169h.r(this.f20181d.toString());
            } else {
                IAPPurchaseManager.f20169h.S().r(this.f20181d.toString());
            }
        }
    }

    public class e implements InterfaceC2596M {

        class a implements Runnable {

            final g f20183d;

            final CharSequence f20184e;

            a(g gVar, CharSequence charSequence) {
                this.f20183d = gVar;
                this.f20184e = charSequence;
            }

            @Override
            public void run() {
                if (this.f20183d.e()) {
                    IAPPurchaseManager.this.j(this.f20184e);
                } else {
                    IAPPurchaseManager.this.h(this.f20184e.toString());
                }
            }
        }

        public e() {
        }

        @Override
        public void a(g gVar) {
            Activity activityC = IAPPurchaseManager.this.f20173c ? IAPPurchaseManager.this.f20174d.C() : IAPPurchaseManager.this.f20174d.S();
            if (activityC == null) {
                return;
            }
            IAPPurchaseManager.this.m(new a(gVar, gVar.c() ? IAPPurchaseManager.this.k(M.f19635b1) : gVar.b(activityC)));
        }

        @Override
        public void b() {
        }

        @Override
        public void c() {
        }

        @Override
        public void d(boolean z7, long j7, String str) {
            IAPPurchaseManager.this.l(z7, j7, str);
        }

        @Override
        public void e() {
        }
    }

    public IAPPurchaseManager(L6.a aVar, boolean z7) {
        this.f20174d = aVar;
        this.f20173c = z7;
        f20169h = aVar;
        f20170i = z7;
        this.f20175e = new Handler(Looper.getMainLooper());
    }

    public static String getPlatformPaymentMethod() {
        return n.e() ? "GooglePlayStore" : BuildConfig.FLAVOR;
    }

    public static String getPlatformPaymentProviderType() {
        return n.e() ? "GooglePlayStore" : BuildConfig.FLAVOR;
    }

    public void h(String str) {
        if (this.f20173c) {
            this.f20174d.r(str);
        } else {
            this.f20174d.S().r(str);
        }
    }

    public void i(int i7) {
        if (this.f20173c) {
            this.f20174d.o(i7);
        } else {
            this.f20174d.S().o(i7);
        }
    }

    public static boolean invokeStore(String str) {
        if (!n.e()) {
            return false;
        }
        Activity activityC = f20170i ? f20169h.C() : f20169h.S();
        i.n0(activityC).g(str, g7.c.c().j(), g7.c.c().k(), activityC);
        return false;
    }

    public void l(boolean z7, long j7, String str) {
        String str2 = hgESaf.jkfhPPXOhkNyVxP;
        l.g(str2, "In-App purchase finished: success = " + z7 + ", player=" + j7 + ", productId=" + str);
        if (this.f20171a == 0) {
            l.g(str2, "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        l.g(str2, "Native call. Success=" + z7 + ", player=" + j7 + ", productId=" + str);
        NativeGLInterface.nativeInGamePurchaseFinished(z7, j7, str);
        this.f20172b = BuildConfig.FLAVOR;
        this.f20171a = 0L;
    }

    public static native void nativeBeginPaymentsProtocolPurchase(String str);

    public static native void nativeFinishPaymentsProtocolPurchase(String str, int i7);

    public static native void nativeSetPaymentsProtocolIsInApp(boolean z7);

    public static native void nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(String str, String str2);

    public static boolean paymentsProtocolConcludeTransaction(String str, long j7) {
        if (!n.e()) {
            return false;
        }
        i.n0(f20170i ? f20169h.C() : f20169h.S()).i(str, j7, g7.c.c().j());
        return true;
    }

    public static void paymentsProtocolPurchaseFinished(g gVar) {
        Activity activityC = f20170i ? f20169h.C() : f20169h.S();
        if (activityC == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new d(gVar.b(activityC)));
    }

    public static void q(Context context, boolean z7) {
        l.a("rbx.purchaseflow", "PaymentsProtocol: tryGrantPendingPurchases");
        if (!n.e()) {
            if (n.h()) {
                String strK = g7.c.c().k();
                long j7 = g7.c.c().j();
                l.a("rbx.purchaseflow", "tryGrantPendingPurchases: ... username = " + strK + ", userId = " + j7);
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (j7 > 0) {
                    P6.a.a(context);
                    throw null;
                }
                P6.a.a(context);
                throw null;
            }
            return;
        }
        if (j6.d.a().M0()) {
            i.n0(context).P0(g7.c.c().j(), g7.c.c().k(), z7);
            return;
        }
        String strK2 = g7.c.c().k();
        long j8 = g7.c.c().j();
        l.a("rbx.purchaseflow", "tryGrantPendingPurchases: ... username = " + strK2 + ", userId = " + j8);
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        if (j8 > 0) {
            i.n0(context).i0(j8, strK2, z7);
        } else {
            i.n0(context).j0(strK2, z7);
        }
    }

    public static boolean setCheckoutSessionId(String str) {
        if (n.e()) {
            return i.n0(f20170i ? f20169h.C() : f20169h.S()).h(str);
        }
        return false;
    }

    public void j(CharSequence charSequence) {
        Activity activityC = this.f20173c ? this.f20174d.C() : this.f20174d.S();
        if (activityC == null) {
            return;
        }
        androidx.appcompat.app.c cVarA = new c.a(activityC).a();
        TextView textView = new TextView(activityC);
        String strK = k(M.f19643e0);
        int iIndexOf = charSequence.toString().indexOf(strK);
        i7.b.b(textView, charSequence.toString(), new i7.a[]{new i7.c(activityC, (String) null, strK, iIndexOf, iIndexOf + strK.length())});
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        cVarA.n(textView, 150, 100, 150, 100);
        cVarA.setCanceledOnTouchOutside(true);
        try {
            cVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public String k(int i7) {
        return this.f20173c ? this.f20174d.C().getString(i7) : this.f20174d.S().getString(i7);
    }

    public void m(Runnable runnable) {
        this.f20175e.post(runnable);
    }

    public void n(long j7, String str) {
        l.g("rbx.purchaseflow", "promptNativePurchase: userId = " + j7 + ", productId = " + str);
        this.f20171a = j7;
        this.f20172b = str;
        if (n.i()) {
            Activity activityC = this.f20173c ? this.f20174d.C() : this.f20174d.S();
            if (activityC == null || activityC.isFinishing()) {
                return;
            }
            C2374w.h().j(activityC).a(activityC, str, j7, this.f20176f);
            return;
        }
        if (n.h()) {
            P6.a.a(this.f20173c ? this.f20174d.C() : this.f20174d.S());
            Long.toString(j7);
            throw null;
        }
        Activity activityC2 = this.f20173c ? this.f20174d.C() : this.f20174d.S();
        if (j6.d.a().M0()) {
            i.n0(activityC2).e(BuildConfig.FLAVOR);
            nativeSetPaymentsProtocolIsInApp(false);
            nativeBeginPaymentsProtocolPurchase(str);
        } else {
            if (i.n0(activityC2).d(Long.toString(j7), str, activityC2, j7, this.f20176f)) {
                return;
            }
            m(new b());
            l(false, j7, str);
        }
    }

    public void o(long j7, String str, String str2) {
        l.g("rbx.purchaseflow", "promptNativePurchase: player = " + j7 + ", productId = " + str);
        this.f20171a = j7;
        this.f20172b = str;
        if (n.i()) {
            Activity activityC = this.f20173c ? this.f20174d.C() : this.f20174d.S();
            if (activityC == null || activityC.isFinishing()) {
                return;
            }
            C2374w.h().j(activityC).a(activityC, str, j7, this.f20176f);
            return;
        }
        if (n.h()) {
            P6.a.a(this.f20173c ? this.f20174d.C() : this.f20174d.S());
            throw null;
        }
        Activity activityC2 = this.f20173c ? this.f20174d.C() : this.f20174d.S();
        if (j6.d.a().M0()) {
            i.n0(activityC2).e(BuildConfig.FLAVOR);
            nativeSetPaymentsProtocolIsInApp(false);
            nativeBeginPaymentsProtocolPurchase(str);
        } else {
            if (i.n0(activityC2).d(str2, str, activityC2, j7, this.f20176f)) {
                return;
            }
            m(new a());
            l(false, j7, str);
        }
    }

    public void p(long j7, String str, String str2) {
        l.g("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j7 + ", roblox-native-productId = " + str);
        this.f20171a = j7;
        if (n.i()) {
            l.d("rbx.purchaseflow", "Luobu purchasing not enabled");
            l(false, j7, str);
            return;
        }
        Activity activityC = this.f20173c ? this.f20174d.C() : this.f20174d.S();
        if (n.h()) {
            P6.a.a(activityC);
            throw null;
        }
        if (j6.d.a().M0()) {
            i iVarN0 = i.n0(activityC);
            iVarN0.e(iVarN0.a(str2));
            nativeSetPaymentsProtocolIsInApp(false);
            nativeBeginPaymentsProtocolPurchase(str);
            return;
        }
        if (i.n0(activityC).b(j7, str, str2, activityC, true, this.f20176f)) {
            return;
        }
        m(new c());
        l(false, j7, str);
    }
}
