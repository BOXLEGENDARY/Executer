package O5;

import E6.e;
import E6.h;
import U7.e;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.P;
import com.roblox.client.datastructures.NameValuePair;
import d6.C2400b;
import h7.l;
import h7.s;
import j6.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import t4.gYZ.uCYQMIHsy;

public class b extends e {

    private Context f3697b;

    private s f3698c;

    private SharedPreferences f3699d;

    private boolean f3700e = false;

    class a implements AppsFlyerConversionListener {
        a() {
        }

        @Override
        public void onAppOpenAttribution(Map<String, String> map) {
            String str = map.get("af_dp");
            if (str != null) {
                String str2 = map.get("link");
                if (str2 != null) {
                    U7.e.n().d(str, str2);
                } else {
                    l.d("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                    U7.e.n().c(str);
                }
            }
        }

        @Override
        public void onAttributionFailure(String str) {
        }

        @Override
        public void onConversionDataFail(String str) {
        }

        @Override
        public void onConversionDataSuccess(Map<String, Object> map) {
            String str = (String) map.get("media_source");
            l.g("AppsFlyerManager", "media-source: " + str);
            if ("Facebook Ads".equals(str)) {
                l.g("AppsFlyerManager", "isUserAcquiredFromFacebookAd set to true");
                b.this.f3700e = true;
                if (b.this.f3699d != null) {
                    b.this.f3699d.edit().putBoolean("IsUserAcquiredFromFacebook", true).apply();
                }
            }
            if (Boolean.TRUE.equals(map.get("is_first_launch")) && map.containsKey("af_dp")) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    map2.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                onAppOpenAttribution(map2);
            }
        }
    }

    class C0043b implements DeepLinkListener {
        C0043b() {
        }

        @Override
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            String deepLinkValue;
            if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND || deepLinkResult.getDeepLink() == null || (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) == null || deepLinkValue.isEmpty()) {
                return;
            }
            U7.e.n().c(deepLinkValue);
        }
    }

    private static class c {

        static final b f3703a = new b();
    }

    public b() {
        l.g("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    private void A(String str) {
        h.b().p(str);
    }

    private void B(String str, List<NameValuePair> list) {
        P.h(str, "appsFlyer", list);
    }

    private void C(Context context, String str, boolean z7) {
        SharedPreferences.Editor editorEdit = t(context).edit();
        editorEdit.putBoolean(str, z7);
        editorEdit.apply();
    }

    private static void D(Context context, String str, long j7) {
        SharedPreferences.Editor editorEdit = t(context).edit();
        editorEdit.putLong(str, j7);
        editorEdit.apply();
    }

    private void m(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        C(context, "enableTracking", false);
    }

    private String n() {
        return (d.a().r3() && this.f3700e) ? "fbads_" : BuildConfig.FLAVOR;
    }

    private void o(Context context) {
        C(context, "enableTracking", true);
        v(true);
    }

    private void p() {
        if (!d.a().T2() || g7.c.c().m()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    private boolean q(Context context, String str, boolean z7) {
        return t(context).getBoolean(str, z7);
    }

    public static b r() {
        return c.f3703a;
    }

    private static long s(Context context, String str, long j7) {
        return t(context).getLong(str, j7);
    }

    private static SharedPreferences t(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    private static String u(long j7) {
        return "signupReportedTimeInSeconds_" + j7;
    }

    private void v(boolean z7) {
        if (z7) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    private boolean w() {
        return (g7.c.c().m() || C2400b.a()) ? false : true;
    }

    public void x(boolean z7) {
        E(this.f3697b, z7);
    }

    private void y(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair(AppsFlyerProperties.CURRENCY_CODE, str3));
        B("purchaseReported", arrayList);
        A(vxbbqXNtzfMxs.GTdAgNNnaLSxle);
    }

    private void z(Context context) {
        boolean zW = w();
        l.g("AppsFlyerManager", "Login retention: enabled=" + zW);
        if (zW) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long jConvert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long j7 = g7.c.c().j();
            long jS = s(context, u(j7), 0L);
            if (jS > 0) {
                long jConvert2 = TimeUnit.DAYS.convert(jConvert - jS, timeUnit);
                if (jConvert2 < 1 || jConvert2 > 3) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(n());
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "af_retention_d%d", Long.valueOf(jConvert2)));
                String string = sb.toString();
                String str = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(jConvert2));
                String str2 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(jConvert2));
                String str3 = str2 + "_" + j7;
                if (q(context, str3, false)) {
                    return;
                }
                C(context, str3, true);
                l.g("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + d.a().r3() + ", isUserAcquiredFromFacebookAd: " + this.f3700e + ", eventName: " + string);
                if (!d.a().I3()) {
                    AppsFlyerLib.getInstance().logEvent(this.f3697b, string, null);
                }
                B(str2, null);
                A(str);
            }
        }
    }

    public void E(Context context, boolean z7) {
        C(context, "disableDeeplinkTracking", !z7);
        if (z7 && AppsFlyerLib.getInstance().isStopped()) {
            AppsFlyerLib.getInstance().start(context, "Quwp4RGsFwE6rVnyTFm6jQ");
        } else {
            if (z7 || AppsFlyerLib.getInstance().isStopped()) {
                return;
            }
            AppsFlyerLib.getInstance().stop(true, context);
        }
    }

    @Override
    public void a(Context context) {
        boolean zA = C2400b.a();
        StringBuilder sb = new StringBuilder();
        sb.append("init: initEnabled=");
        sb.append(!zA);
        l.g("AppsFlyerManager", sb.toString());
        if (zA) {
            return;
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.setMinTimeBetweenSessions(90);
        s sVarE = s.e(context);
        this.f3698c = sVarE;
        SharedPreferences sharedPreferencesC = sVarE.c("AppsFlyerPreferences");
        this.f3699d = sharedPreferencesC;
        if (sharedPreferencesC != null) {
            this.f3700e = sharedPreferencesC.getBoolean("IsUserAcquiredFromFacebook", false);
        }
        appsFlyerLib.setOneLinkCustomDomain("roblox.onelink.me", "ro.blox.com", "go.roblox.com");
        v(q(context, uCYQMIHsy.QiO, true));
        a aVar = new a();
        appsFlyerLib.setCollectIMEI(false);
        appsFlyerLib.setCollectAndroidID(false);
        if (d.a().T2()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", aVar, context);
        appsFlyerLib.subscribeForDeepLink(new C0043b());
        if (!d.a().u2() || !q(context, "disableDeeplinkTracking", false)) {
            appsFlyerLib.start(context, "Quwp4RGsFwE6rVnyTFm6jQ");
        }
        this.f3697b = context;
        if (d.a().Y1()) {
            U7.e.n().i(new e.g() {
                public final void a(boolean z7) {
                    this.f3696a.x(z7);
                }
            });
        }
        U7.e.n().m(appsFlyerLib.getAppsFlyerUID(context));
        Intent intent = this.f1194a;
        if (intent != null) {
            appsFlyerLib.performOnDeepLinking(intent, context);
        }
    }

    @Override
    public void b() {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
    }

    @Override
    public void c(Context context) {
        boolean zW = w();
        l.g("AppsFlyerManager", "first play: enabled=" + zW);
        if (zW) {
            String str = "firstPlayReported_" + g7.c.c().j();
            if (q(context, str, false)) {
                return;
            }
            C(context, str, true);
            if (!d.a().w1()) {
                String str2 = (d.a().r3() && this.f3700e) ? "fbads_af_level_achieved" : AFInAppEventType.LEVEL_ACHIEVED;
                l.g("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + d.a().r3() + ", isUserAcquiredFromFacebookAd: " + this.f3700e + ", eventName: " + str2);
                AppsFlyerLib.getInstance().logEvent(this.f3697b, str2, null);
            }
            B("firstPlayReported", null);
            A("Android-AppsFlyer-FirstPlay");
        }
    }

    @Override
    public void d(Context context) {
        boolean zW = w();
        l.g("AppsFlyerManager", "login: enabled=" + zW);
        if (!zW) {
            m(context);
            return;
        }
        p();
        B("loginReported", null);
        A("Android-AppsFlyer-Login");
        z(context);
        o(context);
    }

    @Override
    public void e(Context context, long j7) {
        boolean zW = w();
        l.g("AppsFlyerManager", "playtime: enabled=" + zW);
        if (zW) {
            String str = "experiencePlaytimeReported_" + g7.c.c().j();
            if (q(context, str, false) || j7 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            if (!d.a().s3()) {
                String str2 = n() + String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15);
                l.g("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + d.a().r3() + ", isUserAcquiredFromFacebookAd: " + this.f3700e + ", eventName: " + str2);
                AppsFlyerLib.getInstance().logEvent(this.f3697b, str2, null);
            }
            B("experiencePlaytimeReported", null);
            A("Android-AppsFlyer-ExperiencePlaytime");
            C(context, str, true);
        }
    }

    @Override
    public void f(String str, String str2, String str3, long j7, boolean z7) {
        boolean zW = w();
        l.g("AppsFlyerManager", "Purchase. enabled=" + zW + ". Price: " + str2 + ".");
        if (zW) {
            y(str, str2, str3);
        }
    }

    @Override
    public void g(Context context) {
        boolean zW = w();
        l.g("AppsFlyerManager", "signup: enabled=" + zW);
        if (!zW) {
            m(context);
            return;
        }
        p();
        B("signUpReported", null);
        A("Android-AppsFlyer-Registration");
        D(context, u(g7.c.c().j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        o(context);
    }

    @Override
    public void i(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }
}
