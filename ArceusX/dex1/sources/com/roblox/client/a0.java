package com.roblox.client;

import H3.QdLC.QcdySgfdST;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.room.kU.HguUe;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.C2368p;
import com.roblox.client.analytics.CrashpadHandler;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import com.roblox.universalapp.logging.LoggingProtocol;
import d6.C2400b;
import e2.vb.oyfFwvPUKctyaG;
import f6.ck.ZJZXBWla;
import j0.tkB.pkcpMQSgx;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import t4.gYZ.uCYQMIHsy;

public class a0 {

    private static h7.e f19880a = null;

    private static String f19881b = "";

    private static boolean f19882c;

    private static String f19883d;

    private static boolean f19884e;

    private static String f19885f;

    private static boolean f19886g;

    private static boolean f19887h;

    private static String f19888i;

    private static String f19889j;

    private static boolean f19890k;

    static Pattern f19891l;

    private static boolean f19892m;

    public static SharedPreferences f19893n;

    public static AtomicBoolean f19894o;

    public static String f19895p;

    static boolean f19896q;

    class a implements C2368p.b {

        final ApplicationInfo f19897a;

        a(ApplicationInfo applicationInfo) {
            this.f19897a = applicationInfo;
        }

        @Override
        public void a(String str, r rVar) {
            if (rVar != null) {
                h7.l.a("roblox.config", "crashpad init error " + rVar);
                return;
            }
            String[] strArr = {"ANDROID_DATA=" + System.getenv("ANDROID_DATA"), "ANDROID_ROOT=" + System.getenv("ANDROID_ROOT"), HguUe.YOCWMVnpCg + System.getenv("ANDROID_STORAGE"), vxbbqXNtzfMxs.sgQBzuXfAOwz + str, "CLASSPATH=.:" + this.f19897a.sourceDir};
            if (j6.d.a().u3()) {
                if (NativeSettingsInterface.nativeInitAppCrashpadReporter(NativeInitCrashpadParams.builder().c(a0.X0()).d(a0.i()).f(a0.J()).k(j6.d.a().Y()).j(j6.d.a().F1()).h(CrashpadHandler.class.getCanonicalName()).g(Arrays.asList(strArr)).i(a0.f0()).e(h7.h.a()).b())) {
                    a0.f19884e = true;
                    h7.l.g("roblox.config", "Crashpad monitoring with API unification is ON");
                    return;
                }
                return;
            }
            if (NativeSettingsInterface.nativeInitCrashpad(NativeInitCrashpadParams.builder().c(a0.X0()).d(a0.i()).f(a0.J()).k(j6.d.a().Y()).j(j6.d.a().F1()).h(CrashpadHandler.class.getCanonicalName()).g(Arrays.asList(strArr)).i(a0.f0()).e(h7.h.a()).b())) {
                a0.f19884e = true;
                h7.l.g("roblox.config", "Crashpad monitoring with API unification is ON");
            }
        }
    }

    static {
        I0("www.roblox.com");
        L0(BuildConfig.FLAVOR);
        if (!f19881b.isEmpty()) {
            f19882c = true;
        }
        f19892m = false;
        f19893n = null;
        f19894o = new AtomicBoolean(false);
        f19895p = BuildConfig.FLAVOR;
        f19896q = false;
    }

    static String A(String str) {
        return i() + "games/?SortFilter=" + str;
    }

    public static void A0(String str, String str2, long j7) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        try {
            JSONArray jSONArray = new JSONArray(P().getString(str, "[]"));
            jSONArray.put(str2 + "_" + j7);
            P().edit().putString(str, jSONArray.toString()).apply();
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    private static String B(Context context) {
        SharedPreferences sharedPreferencesQ = Q(context);
        String string = sharedPreferencesQ.getString(AppsFlyerProperties.CHANNEL, BuildConfig.FLAVOR);
        sharedPreferencesQ.edit().remove(AppsFlyerProperties.CHANNEL).apply();
        return string;
    }

    public static String B0() {
        return "https://ecsv2." + L() + "mobile/pbe";
    }

    public static String C() {
        return "AppAndroidV";
    }

    public static boolean C0() {
        return false;
    }

    public static String D() {
        return f19883d;
    }

    public static String D0() {
        return i() + "upgrades/robux";
    }

    public static String E() {
        return f19880a.c();
    }

    static String E0(String str) {
        return i() + "catalog?Keyword=" + str;
    }

    public static String F() {
        return f19880a.d();
    }

    static String F0(String str) {
        return i() + "games/?Keyword=" + str;
    }

    public static String G() {
        return "36042502";
    }

    static String G0(String str) {
        return i() + "search/groups?keyword=" + str;
    }

    public static SharedPreferences H(Context context) {
        u0(context);
        return h7.s.e(context).c("cached_app_settings_prefs");
    }

    static String H0(String str) {
        return i() + uCYQMIHsy.tltbv + str;
    }

    public static String I() {
        return "GoogleAndroidApp";
    }

    public static void I0(String str) {
        h7.l.g("roblox.config", "setBaseUrl() " + f19880a + " => " + str);
        f19880a = new h7.e(str);
        f19891l = Pattern.compile(q0(), 2);
    }

    public static String J() {
        return h7.n.i() ? oyfFwvPUKctyaG.fTObWiy : k0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    public static boolean J0(X5.c cVar) {
        if (cVar == null) {
            return false;
        }
        String strA = cVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        I0(strA);
        return true;
    }

    public static String K() {
        return f19880a.a();
    }

    public static void K0(String str) {
        if (str != null) {
            f19883d = new h7.f().d(str);
        } else {
            f19883d = null;
        }
    }

    public static String L() {
        return f19880a.b();
    }

    public static void L0(String str) {
        if (str == null || Q5.c.d(str)) {
            return;
        }
        h7.l.g("roblox.config", "setChannel() " + f19881b + " => " + str);
        f19881b = str.trim();
    }

    public static String M(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + N() + "\",\"title\":\"" + context.getString(M.f19601K) + "\",\"animated\":true}";
    }

    public static void M0(boolean z7) {
        f19892m = z7;
    }

    public static String N() {
        return i() + "/users/friends#!/friend-requests";
    }

    public static void N0(Context context) {
        f19886g = context.getResources().getBoolean(F.f19433a);
        f19887h = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    public static String O() {
        return "application/json;charset=UTF-8";
    }

    public static void O0() {
        String strB = t7.i.c().b(i());
        if (strB == null) {
            strB = BuildConfig.FLAVOR;
        }
        NativeSettingsInterface.nativeSetMultipleCookies(i(), strB);
    }

    public static SharedPreferences P() {
        return f19893n;
    }

    public static void P0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", BuildConfig.FLAVOR), Long.getLong("http.proxyPort", 0L).longValue());
    }

    public static SharedPreferences Q(Context context) {
        u0(context);
        return h7.s.a(context, "prefs");
    }

    public static void Q0() {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(z());
        NativeSettingsInterface.nativeSetBaseUrl(i(), j());
        NativeSettingsInterface.nativeSetRobloxChannel(T());
        NativeSettingsInterface.nativeOverrideChannelPlatformName(I());
        String str = f19888i;
        if (str == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        NativeSettingsInterface.nativeSetCacheDirectory(str);
        NativeSettingsInterface.nativeSetFilesDirectory(f19889j);
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(X0());
        h7.c.d.c(new Runnable() {
            @Override
            public final void run() {
                a0.p0();
            }
        }, com.google.common.util.concurrent.q.a());
        d0();
        if (C2400b.a() && com.roblox.client.startup.d.W()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        O0();
    }

    public static String R(String str) {
        Matcher matcher = f19891l.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void R0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f19895p, "googleplay", h7.c.d());
    }

    public static V5.k S() {
        return V5.k.e(j6.d.a().n());
    }

    static String S0() {
        return e() + "v1/mobile-client-version?appVersion=" + C() + X0();
    }

    public static String T() {
        return f19881b;
    }

    public static String T0() {
        return f19885f;
    }

    public static String U() {
        return "my/account#!/notifications";
    }

    public static String U0() {
        return m() + "v1/users/authenticated";
    }

    public static String V(long j7) {
        return h7.t.b("%sv1/users/%d", new Object[]{m(), Long.valueOf(j7)});
    }

    public static String V0() {
        return n() + "v1/google/validate";
    }

    public static String W(long j7) {
        return i() + "users/" + j7 + "/friends#!/friend-requests";
    }

    public static String W0() {
        return n() + pkcpMQSgx.yOuGUey;
    }

    public static String X(long j7) {
        return i() + "users/" + j7 + "/friends#!/friends";
    }

    public static String X0() {
        return "2.684.688";
    }

    public static String Y(long j7) {
        return i() + "users/" + j7 + "/profile";
    }

    static String Z(String str) {
        long jG = E6.k.e().g();
        if (jG == -1) {
            return i() + "users/" + str;
        }
        return i() + "users/" + jG + "/" + str;
    }

    public static String a0() {
        return i() + "home";
    }

    public static boolean b0() {
        return f19881b.isEmpty();
    }

    public static void c0(Context context) {
        f19889j = context.getFilesDir().getAbsolutePath();
        f19888i = context.getCacheDir().getAbsolutePath();
        f19895p = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String d(Context context) {
        StringBuilder sb;
        int i7;
        String str = g7.c.c().k() + " ";
        if (g7.c.c().m()) {
            sb = new StringBuilder();
            sb.append(str);
            i7 = M.f19593G;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            i7 = M.f19591F;
        }
        sb.append(context.getString(i7));
        return sb.toString();
    }

    private static void d0() {
        if (f19884e) {
            return;
        }
        C2368p.h(new a(RobloxApplication.a().getApplicationInfo()));
    }

    public static String e() {
        return sMlEMqrxoGI.tKSKWGkGsXyoeB + L();
    }

    public static void e0(Context context, X5.c cVar) {
        if (cVar != null) {
            if (!f19882c) {
                L0(cVar.f());
            }
            String strA = cVar.a();
            if (J0(cVar)) {
                h7.l.g("roblox.config", "initConfig: Set base-URL from: " + f19880a + " => " + strA);
            }
        }
        K0(h7.s.b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f19893n = Q(context);
        String strB = B(context);
        if (!f19882c && !strB.isEmpty()) {
            h7.l.g("roblox.config", "Found channel from preferences: " + strB);
            L0(strB);
        }
        N0(context);
        if (cVar == null || TextUtils.isEmpty(cVar.i())) {
            f19885f = o(context);
            return;
        }
        f19885f = cVar.i();
        f19890k = true;
        h7.l.k("roblox.config", ZJZXBWla.qjytsSjWnVIikO + f19885f);
    }

    public static String f(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        sb.append("v2/settings");
        if (z7) {
            sb.append("-compressed");
        }
        sb.append("/application/");
        sb.append(I());
        String strT = T();
        if (!strT.isEmpty()) {
            sb.append("/bucket/");
            sb.append(strT);
        }
        if (z7) {
            sb.append("/");
            sb.append("0dfe233e4b5591b93d5e4a95ee3f2b8ed825875a71c88b44654eba2bdccec9f8");
            sb.append(".dcz");
        }
        return sb.toString();
    }

    public static boolean f0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static String g(long j7) {
        return "catalog/" + j7 + "/itempage";
    }

    public static boolean g0() {
        return f19887h;
    }

    public static String h() {
        return l() + "v1/user/currency";
    }

    public static boolean h0(String str) {
        String strR = R(str);
        return (!i0(str)) & ((strR == null || strR.isEmpty()) ? false : true);
    }

    public static String i() {
        return "https://" + f19880a.d();
    }

    public static boolean i0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    public static String j() {
        if (f19883d == null) {
            return "https://api." + L();
        }
        return "https://" + f19883d;
    }

    public static boolean j0() {
        return !f19886g;
    }

    public static String k() {
        return "https://auth." + L();
    }

    public static boolean k0() {
        return false;
    }

    public static String l() {
        return "https://economy." + L();
    }

    public static boolean l0() {
        return S() == V5.k.ALL && E6.k.e().i();
    }

    public static String m() {
        return "https://users." + L();
    }

    public static boolean m0() {
        return f19886g;
    }

    static String n() {
        return i().replace("www.", "billing.");
    }

    public static boolean n0() {
        return f19880a.c().contains(".robloxlabs.com");
    }

    public static String o(Context context) {
        return p(context, "google");
    }

    public static boolean o0(String str, String str2, long j7) throws JSONException {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        try {
            JSONArray jSONArray = new JSONArray(P().getString(str, "[]"));
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                if (jSONArray.getString(i7).equals(str2 + "_" + j7)) {
                    return true;
                }
            }
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        return false;
    }

    public static String p(Context context, String str) {
        return s7.g.a(context, X0(), "AppleWebKit/537.36", "GlobalDist", "GooglePlayStore", "questvr".equals(str), j0(), g0());
    }

    public static void p0() {
        R0();
        LoggingProtocol.h().c("get_advertisingid_end");
    }

    public static String q() {
        return i() + "mobile-app-upgrades/native-ios/bc";
    }

    static String q0() {
        return "^(https?://" + Pattern.quote(F()) + "(?:login|newlogin))(?!/reset-password).*";
    }

    public static String r(String str, String str2) {
        return h7.t.b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", new Object[]{i(), str, str2});
    }

    public static String r0() {
        return k() + "/v2/logout";
    }

    public static String s() {
        return h7.t.b("%scaptcha/app/signup?hybrid-return-token=1", new Object[]{i()});
    }

    public static String s0(long j7) {
        return j() + "marketplace/productinfo?assetId=" + j7;
    }

    public static boolean t(Context context) {
        return Q(context).getBoolean("under13", true);
    }

    public static String t0() {
        return i() + "my/messages/#!/inbox";
    }

    public static String u() {
        if (!f19890k) {
            return "GlobalDist";
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f19885f);
        if (matcher.find()) {
            return matcher.group();
        }
        h7.l.d("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return "GlobalDist";
    }

    private static void u0(Context context) {
        if (f19894o.getAndSet(true)) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SharedPreferences sharedPreferencesQ = Q(context);
            String string = sharedPreferencesQ.getString("AndroidAppSettingsCache", null);
            if (string != null) {
                h7.l.g("roblox.config", "Migrating AppSettings cache");
                SharedPreferences sharedPreferencesH = H(context);
                if (!sharedPreferencesH.contains("AndroidAppSettingsCache")) {
                    h7.l.g("roblox.config", "Updated AppSettings cache in new SharedPreferences instance");
                    sharedPreferencesH.edit().putString("AndroidAppSettingsCache", string).apply();
                }
                sharedPreferencesQ.edit().remove("AndroidAppSettingsCache").apply();
            }
            h7.l.g("roblox.config", "migrateAppSettingsCache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
        } catch (RuntimeException e7) {
            h7.l.e("roblox.config", "Error in migrateAppSettingsCache: " + e7, e7);
        }
    }

    public static String v(String str, int i7) {
        return "&counterName=" + str + "&amount=" + i7;
    }

    public static boolean v0() {
        return f19892m;
    }

    public static String w() {
        return "https://ephemeralcounters.api." + L() + "v1.1/Counters/Increment/?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String w0() {
        return i() + j6.d.a().C3();
    }

    public static String x(String str, long j7) {
        return "&sequenceName=" + str + "&value=" + j7;
    }

    public static String x0() {
        return i() + "login/resetpasswordrequest/success";
    }

    public static String y() {
        return "https://ephemeralcounters.api." + L() + "v1.0/SequenceStatistics/AddToSequence?apiKey=" + QcdySgfdST.YFDzVultEKLRwN;
    }

    public static String y0(long j7) {
        return i() + "my/messages/#!/inbox?conversationId=" + j7;
    }

    static String z() {
        return "exception_reason.txt";
    }

    public static String z0() {
        return Z("profile");
    }
}
