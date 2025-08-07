package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.l;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

public final class e {

    private static final AtomicInteger f19131a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private static int a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && g(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && g(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0 || !g(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e7) {
                String strValueOf = String.valueOf(e7);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(strValueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        return (i7 == 0 || !g(resources, i7)) ? R.drawable.sym_def_app_icon : i7;
    }

    private static PendingIntent b(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f19131a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    private static Bundle c(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    static d d(Context context, n nVar) throws JSONException, PackageManager.NameNotFoundException {
        Uri defaultUri;
        Intent intent;
        PendingIntent activity;
        Bundle bundleC = c(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        String strH = h(context, nVar.c("gcm.n.android_channel_id"), bundleC);
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        l.e eVar = new l.e(context, strH);
        eVar.m(e(packageName, nVar, packageManager, resources));
        CharSequence charSequenceB = nVar.b(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceB)) {
            eVar.l(charSequenceB);
            eVar.z(new l.c().h(charSequenceB));
        }
        eVar.x(a(packageManager, resources, packageName, nVar.c("gcm.n.icon"), bundleC));
        String strE = nVar.e();
        Integer num = null;
        if (TextUtils.isEmpty(strE)) {
            defaultUri = null;
        } else if ("default".equals(strE) || resources.getIdentifier(strE, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(strE).length());
            sb.append("android.resource://");
            sb.append(packageName);
            sb.append("/raw/");
            sb.append(strE);
            defaultUri = Uri.parse(sb.toString());
        }
        if (defaultUri != null) {
            eVar.y(defaultUri);
        }
        String strC = nVar.c("gcm.n.click_action");
        if (TextUtils.isEmpty(strC)) {
            Uri uriA = nVar.a();
            if (uriA != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                intent.setData(uriA);
            } else {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
                intent = launchIntentForPackage;
            }
        } else {
            intent = new Intent(strC);
            intent.setPackage(packageName);
            intent.setFlags(268435456);
        }
        if (intent == null) {
            activity = null;
        } else {
            intent.addFlags(67108864);
            intent.putExtras(nVar.l());
            activity = PendingIntent.getActivity(context, f19131a.incrementAndGet(), intent, 1073741824);
            if (nVar.g("google.c.a.e")) {
                activity = b(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(nVar.n()).putExtra("pending_intent", activity));
            }
        }
        eVar.k(activity);
        PendingIntent pendingIntentB = !nVar.g("google.c.a.e") ? null : b(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(nVar.n()));
        if (pendingIntentB != null) {
            eVar.o(pendingIntentB);
        }
        Integer numF = f(context, nVar.c("gcm.n.color"), bundleC);
        if (numF != null) {
            eVar.i(numF.intValue());
        }
        eVar.f(!nVar.g("gcm.n.sticky"));
        eVar.t(nVar.g("gcm.n.local_only"));
        CharSequence charSequenceC = nVar.c("gcm.n.ticker");
        if (charSequenceC != null) {
            eVar.A(charSequenceC);
        }
        Integer numH = nVar.h("gcm.n.notification_priority");
        if (numH == null) {
            numH = null;
        } else if (numH.intValue() < -2 || numH.intValue() > 2) {
            String strValueOf = String.valueOf(numH);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 72);
            sb2.append(HguUe.wSipTHvoRqTLVSA);
            sb2.append(strValueOf);
            sb2.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb2.toString());
            numH = null;
        }
        if (numH != null) {
            eVar.w(numH.intValue());
        }
        Integer numH2 = nVar.h("gcm.n.visibility");
        if (numH2 == null) {
            numH2 = null;
        } else if (numH2.intValue() < -1 || numH2.intValue() > 1) {
            String strValueOf2 = String.valueOf(numH2);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 53);
            sb3.append("visibility is invalid: ");
            sb3.append(strValueOf2);
            sb3.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb3.toString());
            numH2 = null;
        }
        if (numH2 != null) {
            eVar.C(numH2.intValue());
        }
        Integer numH3 = nVar.h("gcm.n.notification_count");
        if (numH3 != null) {
            if (numH3.intValue() < 0) {
                String strValueOf3 = String.valueOf(numH3);
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 67);
                sb4.append("notificationCount is invalid: ");
                sb4.append(strValueOf3);
                sb4.append(". Skipping setting notificationCount.");
                Log.w("FirebaseMessaging", sb4.toString());
            } else {
                num = numH3;
            }
        }
        if (num != null) {
            eVar.u(num.intValue());
        }
        Long lJ = nVar.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.D(lJ.longValue());
        }
        long[] jArrI = nVar.i();
        if (jArrI != null) {
            eVar.B(jArrI);
        }
        int[] iArrK = nVar.k();
        if (iArrK != null) {
            eVar.s(iArrK[0], iArrK[1], iArrK[2]);
        }
        boolean zG = nVar.g("gcm.n.default_sound");
        boolean z7 = zG;
        if (nVar.g("gcm.n.default_vibrate_timings")) {
            z7 = (zG ? 1 : 0) | 2;
        }
        int i7 = z7;
        if (nVar.g("gcm.n.default_light_settings")) {
            i7 = (z7 ? 1 : 0) | 4;
        }
        eVar.n(i7);
        String strC2 = nVar.c("gcm.n.tag");
        if (TextUtils.isEmpty(strC2)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb5 = new StringBuilder(37);
            sb5.append("FCM-Notification:");
            sb5.append(jUptimeMillis);
            strC2 = sb5.toString();
        }
        return new d(eVar, strC2, 0);
    }

    private static CharSequence e(String str, n nVar, PackageManager packageManager, Resources resources) {
        String strB = nVar.b(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e7) {
            String strValueOf = String.valueOf(e7);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return BuildConfig.FLAVOR;
        }
    }

    private static Integer f(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.c(context, i7));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static boolean g(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i7);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i7);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static String h(Context context, String str, Bundle bundle) {
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            boolean zIsEmpty = TextUtils.isEmpty(str);
            String str2 = KwdswzaUHE.YEhu;
            if (!zIsEmpty) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + com.appsflyer.R.styleable.AppCompatTheme_windowFixedWidthMajor);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w(str2, sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w(str2, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                Log.w(str2, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
