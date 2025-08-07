package E6;

import H3.QdLC.QcdySgfdST;
import android.content.Context;
import backtraceio.library.models.BacktraceAttributeConsts;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.C2371t;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import com.roblox.client.a0;
import com.roblox.engine.jni.NativeGLInterface;
import e2.vb.oyfFwvPUKctyaG;
import h7.l;
import h7.n;
import h7.u;
import h7.v;
import ha.r;
import k0.BAKp.xAQOwX;
import t2.Dbl.hgESaf;
import v6.C2951a;

public class h {

    private static h f1206e;

    private final boolean f1207a;

    private final u f1208b;

    private long f1209c;

    private L6.e f1210d;

    h(boolean z7, u uVar) {
        this.f1207a = z7;
        this.f1208b = uVar;
    }

    public static void a(String str) {
        P.g(str, "sessionCheck");
    }

    public static h b() {
        h hVar = f1206e;
        if (hVar != null) {
            return hVar;
        }
        synchronized (h.class) {
            try {
                if (f1206e == null) {
                    f1206e = new h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1206e;
    }

    private static String c(boolean z7) {
        return a0.k0() ? z7 ? "Quest-ROBLOXPlayer-Session-Inferred-Crash" : "Quest-ROBLOXPlayer-Session-Inferred-Success" : z7 ? "Android-ROBLOXPlayer-Session-Inferred-Crash" : "Android-ROBLOXPlayer-Session-Inferred-Success";
    }

    static String d(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length >= 2 ? strArrSplit[1] : "Unknown";
        return (a0.k0() ? "Quest-AppStartup-Version-" : n.d() ? "Amazon-AppStartup-Version-" : "Android-AppStartup-Version-") + str2;
    }

    static String e() {
        return a0.k0() ? "Quest-AppStartup-Version-Total" : n.d() ? "Amazon-AppStartup-Version-Total" : "Android-AppStartup-Version-Total";
    }

    private static void h(String str, int i7) {
        new r(a0.w() + a0.v(str, i7)).c();
    }

    public void A() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-400" : "Android-Payments-Api-V1-Precheck-Response-400");
    }

    public void B() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-401" : "Android-Payments-Api-V1-Precheck-Response-401");
    }

    public void C() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-403" : "Android-Payments-Api-V1-Precheck-Response-403");
    }

    public void D() {
        p(n.h() ? QcdySgfdST.Xdwu : "Android-Payments-Api-V1-Precheck-Response-404");
    }

    public void E() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-429" : "Android-Payments-Api-V1-Precheck-Response-429");
    }

    public void F() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-500" : "Android-Payments-Api-V1-Precheck-Response-500");
    }

    public void G() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-503" : "Android-Payments-Api-V1-Precheck-Response-503");
    }

    public void H() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Unknown" : "Android-Payments-Api-V1-Precheck-Response-Unknown");
    }

    public void I() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Verify-Request" : "Android-Payments-Api-V1-Verify-Request");
    }

    public void J() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Verify-Response-200" : "Android-Payments-Api-V1-Verify-Response-200");
    }

    public void K() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Verify-Response-400" : "Android-Payments-Api-V1-Verify-Response-400");
    }

    public void L() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Verify-Response-401" : "Android-Payments-Api-V1-Verify-Response-401");
    }

    public void M() {
        p(n.h() ? xAQOwX.KEzs : "Android-Payments-Api-V1-Verify-Response-500");
    }

    public void N() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Verify-Response-Unknown" : "Android-Payments-Api-V1-Verify-Response-Unknown");
    }

    public void O() {
        p("Android-Payments-Pending-Purchase");
    }

    public void P(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PrecheckBalanceError-InApp" : "Android-Payments-PrecheckBalanceError-InApp" : z8 ? "Amazon-Payments-PrecheckBalanceError-InGame" : "Android-Payments-PrecheckBalanceError-InGame");
    }

    public void Q(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PrecheckError-InApp" : n.h() ? "MilkyWay-Payments-PrecheckError-InApp" : "Android-Payments-PrecheckError-InApp" : z8 ? "Amazon-Payments-PrecheckError-InGame" : n.h() ? GObvYfBKohxpYX.dXptI : "Android-Payments-PrecheckError-InGame");
    }

    public void R(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp" : "Android-Payments-PrecheckProductDetailsNotSupported-InApp" : z8 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame" : "Android-Payments-PrecheckProductDetailsNotSupported-InGame");
    }

    public void S(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PrecheckRetry-InApp" : n.h() ? "MilkyWay-Payments-PrecheckRetry-InApp" : "Android-Payments-PrecheckRetry-InApp" : z8 ? "Amazon-Payments-PrecheckRetry-InGame" : n.h() ? "MilkyWay-Payments-PrecheckRetry-InGame" : "Android-Payments-PrecheckRetry-InGame");
    }

    public void T(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PrecheckUnknownError-InApp" : n.h() ? "MilkyWay-Payments-PrecheckUnknownError-InApp" : "Android-Payments-PrecheckUnknownError-InApp" : z8 ? "Amazon-Payments-PrecheckUnknownError-InGame" : n.h() ? "MilkYWay-Payments-PrecheckUnknownError-InGame" : "Android-Payments-PrecheckUnknownError-InGame");
    }

    public void U(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp" : "Android-Payments-PurchaseAlreadyAcknowledged-InApp" : z8 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame" : "Android-Payments-PurchaseAlreadyAcknowledged-InGame");
    }

    public void V(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PurchaseCancelled-InApp" : "Android-Payments-PurchaseCancelled-InApp" : z8 ? "Amazon-Payments-PurchaseCancelled-InGame" : "Android-Payments-PurchaseCancelled-InGame");
    }

    public void W(boolean z7, boolean z8) {
        p(z7 ? z8 ? hgESaf.aExlfAdRpQWDw : "Android-Payments-PurchaseFailed-InApp" : z8 ? "Amazon-Payments-PurchaseFailed-InGame" : "Android-Payments-PurchaseFailed-InGame");
    }

    public void X(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PurchaseFlooded-InApp" : n.h() ? "MilkyWay-Payments-PurchaseFlooded-InApp" : "Android-Payments-PurchaseFlooded-InApp" : z8 ? "Amazon-Payments-PurchaseFlooded-InGame" : n.h() ? "MilkyWay-Payments-PurchaseFlooded-InGame" : "Android-Payments-PurchaseFlooded-InGame");
    }

    public void Y(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-PurchaseSuccess-InApp" : "Android-Payments-PurchaseSuccess-InApp" : z8 ? "Amazon-Payments-PurchaseSuccess-InGame" : "Android-Payments-PurchaseSuccess-InGame");
    }

    public void Z() {
        p("Android-Payments-Unacknowledged-Purchase-Failure");
    }

    public void a0() {
        p("Android-Payments-Unknown-State-Purchase");
    }

    public void b0(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-VerificationEmptyError-InApp" : n.h() ? "MilkyWay-Payments-VerificationEmptyError-InApp" : "Android-Payments-VerificationEmptyError-InApp" : z8 ? "Amazon-Payments-VerificationEmptyError-InGame" : n.h() ? "MilkyWay-Payments-VerificationEmptyError-InGame" : "Android-Payments-VerificationEmptyError-InGame");
    }

    public void c0(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-VerificationError-InApp" : n.h() ? "MilkyWay-Payments-VerificationError-InApp" : "Android-Payments-VerificationError-InApp" : z8 ? "Amazon-Payments-VerificationError-InGame" : n.h() ? "MilkyWay-Payments-VerificationError-InGame" : "Android-Payments-VerificationError-InGame");
    }

    public void d0(boolean z7, boolean z8) {
        p(z7 ? z8 ? "Amazon-Payments-VerificationUnknownError-InApp" : n.h() ? "MilkyWay-Payments-VerificationUnknownError-InApp" : "Android-Payments-VerificationUnknownError-InApp" : z8 ? "Amazon-Payments-VerificationUnknownError-InGame" : n.h() ? "MilkyWay-Payments-VerificationUnknownError-InGame" : "Android-Payments-VerificationUnknownError-InGame");
    }

    public void e0(L6.e eVar) {
        this.f1210d = eVar;
    }

    public void f() {
        b().p(n.d() ? "Mobile-DownloadCount-Amazon" : "Mobile-DownloadCount-Android");
    }

    public void f0() {
        long jB = this.f1208b.b();
        long j7 = this.f1209c;
        long j8 = jB - j7;
        if (j7 == 0 || j8 >= 3600000) {
            g();
            this.f1209c = jB;
        }
    }

    void g() {
        p(e());
        p(d(a0.X0()));
    }

    public void i(boolean z7) {
        new C2951a("Android-RobloxPlayer-SessionReport-Inferred").c("Session", z7 ? BacktraceAttributeConsts.CrashAttributeType : "Success").f();
        p(c(z7));
    }

    public void j(Context context) {
        if (context != null) {
            C2374w.h().d().c(context);
        }
    }

    public void k(Context context, long j7) {
        if (context != null) {
            C2374w.h().d().e(context, j7);
        }
    }

    public void l(String str) {
        l.g("rbx.purchaseflow", str);
        L6.e eVar = this.f1210d;
        if (eVar != null) {
            eVar.f2173d++;
            new C2951a("Android-PurchaseFlow").l(true).c("Username", this.f1210d.f2170a).d("InAppPurchase", this.f1210d.f2172c).c("ProductId", this.f1210d.f2171b).c(BacktraceAttributeConsts.MessageAttributeType, this.f1210d.f2173d + "- " + str).e("Rooted", Boolean.valueOf(C2371t.g().h())).f();
        }
    }

    public void m(String str, String str2, String str3, long j7) {
        C2374w.h().d().f(str, str2, str3, j7, n.d());
    }

    public void n(boolean z7) {
        p(z7 ? "Android-Payments-AcknowledgeError-InApp" : "Android-Payments-AcknowledgeError-InGame");
    }

    public void o(boolean z7) {
        p(z7 ? n.h() ? "MilkyWay-Payments-ConsumeError-InApp" : "Android-Payments-ConsumeError-InApp" : n.h() ? "MilkyWay-Payments-ConsumeError-InGame" : "Android-Payments-ConsumeError-InGame");
    }

    public void p(String str) {
        h(str, 1);
    }

    public void q(String str, long j7) {
        new r(a0.y() + a0.x(str, j7)).c();
        if (this.f1207a) {
            r(str, j7);
        }
    }

    public void r(String str, long j7) {
        NativeGLInterface.nativeReportToDiagByCountryCode("Mobile", str, j7);
    }

    public void s() {
        p(oyfFwvPUKctyaG.kURDIYNfsa);
    }

    public void t() {
        p("Android-Payments-Incorrect-User-Purchase-Userid-Invalid");
    }

    public void u() {
        p("Android-Payments-Incorrect-User-Purchase-Userid-Mismatch");
    }

    public void v() {
        p("Android-Payments-Incorrect-User-Purchase-Username-Mismatch");
    }

    public void w() {
        p("Android-Payments-Incorrect-User-Purchase-Username-Null");
    }

    public void x() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Payload-Parse-Error" : "Android-Payments-Api-V1-Precheck-Response-Payload-Parse-Error");
    }

    public void y() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Request" : "Android-Payments-Api-V1-Precheck-Request");
    }

    public void z() {
        p(n.h() ? "MilkyWay-Payments-Api-V1-Precheck-Response-200" : "Android-Payments-Api-V1-Precheck-Response-200");
    }

    private h() {
        this(Math.random() * 100.0d < ((double) j6.d.a().B()), new v());
    }
}
