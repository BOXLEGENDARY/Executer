package E6;

import G6.c;
import Z.tNT.PexNRiLSd;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import c7.L0;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.roblox.client.C2370s;
import com.roblox.client.C2371t;
import com.roblox.client.C2374w;
import com.roblox.client.M;
import com.roblox.client.P;
import com.roblox.client.S;
import com.roblox.client.a0;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.user.NativeUserJavaInterface;
import h7.l;
import h7.s;
import j0.tkB.pkcpMQSgx;
import java.util.Locale;
import k7.h;
import org.webrtc.ContextUtils;
import x6.C2996c;
import z6.C3086b;
import z6.h;

public class c {

    private static boolean f1174d;

    private static boolean f1175e;

    public static boolean f1176f;

    private volatile boolean f1177a;

    private boolean f1178b;

    private boolean f1179c;

    class a implements c.b {

        final Activity f1180a;

        final S f1181b;

        final Bundle f1182c;

        class C0015a implements h.c {
            C0015a() {
            }

            @Override
            public void a(boolean z7) {
                l.a("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                S s7 = a.this.f1181b;
                if (s7 != null && !s7.isFinishing()) {
                    a.this.f1181b.s0();
                }
                f.c().f(2, a.this.f1182c);
                c.f1174d = false;
            }
        }

        a(Activity activity, S s7, Bundle bundle) {
            this.f1180a = activity;
            this.f1181b = s7;
            this.f1182c = bundle;
        }

        @Override
        public void a() {
            l.a("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new z6.h().a(this.f1180a, new C0015a());
        }
    }

    static class b {

        static final int[] f1185a;

        static {
            int[] iArr = new int[d.values().length];
            f1185a = iArr;
            try {
                iArr[d.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1185a[d.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1185a[d.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1185a[d.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1185a[d.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static class C0016c {

        static final c f1186a = new c();
    }

    public enum d {
        LOGOUT_BY_USER_IN_NATIVE,
        LOGOUT_BY_USER_IN_LUA,
        LOGOUT_BY_401_ERROR_IN_NATIVE,
        LOGOUT_BY_401_ERROR_IN_WEB,
        LOGOUT_BY_401_ERROR_IN_LUA
    }

    public static class e implements h.d {

        class a extends k7.h {
            a() {
            }

            protected void e(Context context, String str) {
                C2370s.c(context);
                NativeSettingsInterface.nativeSetDefaultAppPolicyFile("content/guac/defaultConfigs/GuacDefaultPolicy-" + a0.u() + ".json");
            }
        }

        public k7.h a() {
            return new a();
        }
    }

    private void c(d dVar) {
        int i7 = b.f1185a[dVar.ordinal()];
        if (i7 == 1) {
            P.i("manual", "manual");
            return;
        }
        if (i7 == 2) {
            P.i("manual", "luaapp");
            return;
        }
        if (i7 == 3) {
            P.i("failedSessionCheck", "native");
            return;
        }
        if (i7 == 4) {
            P.i("failedSessionCheck", "webview");
            return;
        }
        if (i7 == 5) {
            P.i("failedSessionCheck", "luaapp");
            return;
        }
        l.k("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + dVar);
    }

    public static boolean d() {
        if (!f1175e) {
            return false;
        }
        f1175e = false;
        return true;
    }

    public static c e() {
        return C0016c.f1186a;
    }

    public static d f(Bundle bundle) {
        d dVar;
        if (bundle != null && (dVar = (d) bundle.getSerializable("logout_type")) != null) {
            return dVar;
        }
        l.d("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return d.LOGOUT_BY_USER_IN_NATIVE;
    }

    private void j(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel("channel_general", context.getString(M.f19616R0), 3);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.deleteNotificationChannel("channel_games");
        if (a0.k0() || !j6.d.a().R()) {
            notificationManager.deleteNotificationChannel("channel_calls");
        } else {
            NotificationChannel notificationChannel2 = new NotificationChannel("channel_calls", context.getString(M.f19612P0), 4);
            notificationChannel2.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
            notificationChannel2.setVibrationPattern(Q6.l.f4880b);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
        NotificationChannel notificationChannel3 = new NotificationChannel(pkcpMQSgx.HHIViGGAQDQT, context.getString(M.U0), 4);
        NotificationChannel notificationChannel4 = new NotificationChannel("channel_default", context.getString(M.f19614Q0), 3);
        NotificationChannel notificationChannel5 = new NotificationChannel("channel_medium", context.getString(M.f19618S0), 2);
        NotificationChannel notificationChannel6 = new NotificationChannel("channel_minimum", context.getString(M.T0), 1);
        notificationManager.createNotificationChannel(notificationChannel3);
        notificationManager.createNotificationChannel(notificationChannel4);
        notificationManager.createNotificationChannel(notificationChannel5);
        notificationManager.createNotificationChannel(notificationChannel6);
    }

    private void l(Context context) {
        s.e(context.getApplicationContext());
        a0.c0(context);
        NativeSettingsInterface.nativeSetBaseUrl(a0.i(), a0.j());
        NativeSettingsInterface.nativeSetRobloxChannel(a0.T());
        NativeUserJavaInterface.setImplementation(new C2996c());
        L0.b(context);
        s7.g.i(C2374w.h().l());
        i.a(context, null);
        C2374w.h().p();
        k.e();
        C2371t.g().d(null);
        N5.a.e().g(context);
        d6.d.b();
        C3086b.f().q(Locale.getDefault());
        j(context);
        k7.a.c(new Z6.b());
        k7.h.r(new e());
        k7.h.j().q(context.getApplicationContext());
        ContextUtils.initialize(context.getApplicationContext());
        k7.h.j().w(context);
    }

    public static boolean m() {
        return f1176f;
    }

    private void n() {
        String strT0 = a0.T0();
        StringBuilder sb = new StringBuilder();
        sb.append("ROBLOX\n| User-Agent = ");
        sb.append(strT0);
        sb.append("\n| Build = ");
        sb.append(h7.h.a());
        sb.append(", ID = ");
        sb.append(a0.G());
        sb.append("\n| Version = ");
        sb.append("2.684.688");
        sb.append(", Code = ");
        sb.append(1864);
        sb.append("\n| BaseUrl = ");
        sb.append(a0.F());
        sb.append("\n| OS Ver. = ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", Lvl = ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\n| Arch = ");
        sb.append(C2371t.g().i().toString());
        sb.append("\n| Is domain set = ");
        sb.append(s7.g.c() != null);
        l.g("rbx.AppManager", sb.toString());
    }

    public static void o() {
        f1175e = true;
    }

    public void b(Context context) {
        SharedPreferences sharedPreferencesA = s.a(context, PexNRiLSd.twQZLdDgdCOO);
        boolean z7 = sharedPreferencesA.getBoolean("AppFirstLaunch", true);
        this.f1178b = z7;
        if (z7) {
            l.g("rbx.AppManager", JmBUOGMwkkxg.txYIwfjiB);
            h.b().f();
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putBoolean("AppFirstLaunch", false);
            editorEdit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public void g() {
        f1176f = true;
    }

    public void h(Activity activity, d dVar) {
        l.g("rbx.AppManager", "handleLogout: logoutType = " + dVar + ", activity = " + activity.getLocalClassName());
        f1174d = true;
        c(dVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", dVar);
        if (j6.d.a().T2()) {
            h7.c.g().c();
            a0.R0();
            C2374w.h().d().b();
        }
        if (dVar == d.LOGOUT_BY_USER_IN_NATIVE) {
            S s7 = activity instanceof S ? (S) activity : null;
            if (s7 != null) {
                s7.C0(s7);
            }
            com.roblox.client.startup.d.s(activity).C(activity, true, new a(activity, s7, bundle));
        } else {
            com.roblox.client.startup.d.s(activity).C(activity, false, (c.b) null);
            f.c().f(2, bundle);
            f1174d = false;
        }
        if (j6.d.a().E1()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f1176f = false;
    }

    public void i(Activity activity) {
        l.g("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f1174d = true;
        P.v();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", d.LOGOUT_BY_USER_IN_LUA);
        if (j6.d.a().T2()) {
            h7.c.g().c();
            a0.R0();
            C2374w.h().d().b();
        }
        com.roblox.client.startup.d.s(activity).C(activity, false, (c.b) null);
        f.c().f(2, bundle);
        f1174d = false;
        f1176f = false;
    }

    public void k(Context context) {
        synchronized (c.class) {
            try {
                l.g("rbx.AppManager", "initialize: Start...");
                if (this.f1177a) {
                    n();
                    l.g("rbx.AppManager", "initialize: Already initialized.");
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    l(context);
                    f1176f = false;
                    this.f1177a = true;
                    n();
                    l.g("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(boolean z7) {
        this.f1179c = z7;
    }

    private c() {
        this.f1177a = false;
        l.g("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
