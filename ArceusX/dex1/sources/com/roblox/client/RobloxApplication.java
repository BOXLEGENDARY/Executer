package com.roblox.client;

import W0.JWp.kNUgEaOjcPdX;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.C1667A;
import c7.L0;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Iterator;
import java.util.Locale;
import m6.EnumC2597N;
import z6.C3086b;

public class RobloxApplication extends Application {

    private static Context f19829e;

    private static Locale f19830i;

    private final long f19831d = SystemClock.elapsedRealtime();

    static class a {

        static final int[] f19832a;

        static {
            int[] iArr = new int[EnumC2597N.values().length];
            f19832a = iArr;
            try {
                iArr[EnumC2597N.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19832a[EnumC2597N.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RobloxApplication() {
        LoggingProtocol.h().i();
        c7.s sVarN = c7.s.n();
        sVarN.B();
        sVarN.E();
        sVarN.p();
    }

    public static Context a() {
        return f19829e;
    }

    public static void b(String str, EnumC2597N enumC2597N, int i7) {
        int i8 = a.f19832a[enumC2597N.ordinal()];
        String str2 = "unknown";
        String str3 = i8 != 1 ? i8 != 2 ? "unknown" : "experience" : "app";
        if (i7 == 5) {
            str2 = "TRIM_MEMORY_RUNNING_MODERATE";
        } else if (i7 == 10) {
            str2 = "TRIM_MEMORY_RUNNING_LOW";
        } else if (i7 == 15) {
            str2 = "TRIM_MEMORY_RUNNING_CRITICAL";
        } else if (i7 == 20) {
            str2 = "TRIM_MEMORY_UI_HIDDEN";
        } else if (i7 == 40) {
            str2 = "TRIM_MEMORY_BACKGROUND";
        } else if (i7 == 60) {
            str2 = "TRIM_MEMORY_MODERATE";
        } else if (i7 == 80) {
            str2 = "TRIM_MEMORY_COMPLETE";
        }
        h7.l.k(str, "Mode: " + str3 + ", TrimLevel: " + str2);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ka.h.a(this);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3086b.f().q(configuration.getLocales().get(0));
    }

    @Override
    public void onCreate() throws RuntimeException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f19829e = getApplicationContext();
        com.roblox.client.flags.c.c().d(a0.Q(this));
        c7.s sVarN = c7.s.n();
        sVarN.I();
        sVarN.F();
        Q5.c.c(f19829e);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        L0.c(f19829e);
        Q5.c.h();
        if (j6.d.a().n3()) {
            com.roblox.client.startup.a.s();
            JNIAAssetManagerSetup.a(f19829e);
            C2368p.i(f19829e, C2368p.f20150g, f19829e.getCacheDir().getPath());
            C1667A.l().getLifecycle().a(new JNIAppLifecycleNativeAdapter());
            h7.l.g("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        com.roblox.client.startup.a.u(f19829e);
        com.roblox.client.startup.a.G("main");
        JNIAAssetManagerSetup.a(f19829e);
        LocalStorageManager.a(f19829e);
        f19830i = Locale.getDefault();
        C2368p.i(f19829e, C2368p.f20150g, f19829e.getCacheDir().getPath());
        LoggingProtocol loggingProtocolH = LoggingProtocol.h();
        loggingProtocolH.g("application_constructor", this.f19831d);
        loggingProtocolH.g("flag_prefetch_begin", jElapsedRealtime2);
        loggingProtocolH.g("application_oncreate", jElapsedRealtime);
        if (!h7.p.a(this).equals(tAjeAKSIqDqzNP.LPWUQO)) {
            h7.l.d("rbx.application", "Background process detected");
            loggingProtocolH.c("background_process_detected");
        }
        if (j6.d.a().q()) {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager != null) {
                Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.AppTask next = it.next();
                    if (next.getTaskInfo().baseIntent.getComponent() != null && next.getTaskInfo().baseIntent.getComponent().getClassName().equals(ActivitySplash.class.getName())) {
                        h7.l.g("rbx.application", kNUgEaOjcPdX.UensF);
                        loggingProtocolH.c("activity_splash_cold_start");
                        break;
                    }
                }
            } else {
                h7.l.d("rbx.application", "Failed to get ActivityManager service");
            }
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        if (j6.d.a().k1()) {
            JNIAppRestarter.init(getApplicationContext());
        }
        C1667A.l().getLifecycle().a(new JNIAppLifecycleNativeAdapter());
    }
}
