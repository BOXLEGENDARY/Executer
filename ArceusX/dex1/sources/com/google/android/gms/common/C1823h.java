package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.C2651i;
import x3.C2989c;

public class C1823h {

    @Deprecated
    public static final int f14217a = 12451000;

    private static boolean f14219c;

    static boolean f14220d;

    @Deprecated
    static final AtomicBoolean f14218b = new AtomicBoolean();

    private static final AtomicBoolean f14221e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i7) {
        return ConnectionResult.r(i7);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f14220d) {
                try {
                    PackageInfo packageInfoF = C2989c.a(context).f("com.google.android.gms", 64);
                    C1824i.a(context);
                    if (packageInfoF == null || C1824i.e(packageInfoF, false) || !C1824i.e(packageInfoF, true)) {
                        f14219c = false;
                    } else {
                        f14219c = true;
                    }
                    f14220d = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f14220d = true;
                }
            }
            return f14219c || !v3.i.e();
        } catch (Throwable th) {
            f14220d = true;
            throw th;
        }
    }

    @java.lang.Deprecated
    public static int f(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C1823h.f(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean g(Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(Context context) {
        if (!v3.m.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C2651i.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    @Deprecated
    public static boolean j(Context context, int i7, String str) {
        return v3.s.b(context, i7, str);
    }

    static boolean k(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (v3.m.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
