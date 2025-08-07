package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public final class C2350h {

    private static C2350h f19042e;

    private String f19043a = null;

    private Boolean f19044b = null;

    private Boolean f19045c = null;

    private final Queue<Intent> f19046d = new ArrayDeque();

    private C2350h() {
    }

    public static synchronized C2350h b() {
        try {
            if (f19042e == null) {
                f19042e = new C2350h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19042e;
    }

    private final int d(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strG = g(context, intent);
        if (strG != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", strG.length() != 0 ? "Restricting intent to a specific service: ".concat(strG) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), strG);
        }
        try {
            if (c(context)) {
                componentNameStartService = a5.l.a(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(strValueOf);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        } catch (SecurityException e8) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e8);
            return 401;
        }
    }

    private final synchronized String g(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f19043a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        String strValueOf = String.valueOf(context.getPackageName());
                        String strValueOf2 = String.valueOf(serviceInfo.name);
                        this.f19043a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                    } else {
                        this.f19043a = serviceInfo.name;
                    }
                    return this.f19043a;
                }
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append("/");
                sb.append(str4);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f19046d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return d(context, intent2);
    }

    final boolean c(Context context) {
        if (this.f19044b == null) {
            this.f19044b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f19044b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19044b.booleanValue();
    }

    public final Intent e() {
        return this.f19046d.poll();
    }

    final boolean f(Context context) {
        if (this.f19045c == null) {
            this.f19045c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f19044b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f19045c.booleanValue();
    }
}
