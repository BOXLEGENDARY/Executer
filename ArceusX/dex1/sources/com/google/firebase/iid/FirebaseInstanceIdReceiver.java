package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;

public final class FirebaseInstanceIdReceiver extends P0.a {

    private static q f19021i;

    public static int d(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z7 = v3.m.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z8 = (intent.getFlags() & 268435456) != 0;
        if (z7 && !z8) {
            return g(broadcastReceiver, context, intent);
        }
        int iA = C2350h.b().a(context, intent);
        if (!v3.m.i() || iA != 402) {
            return iA;
        }
        g(broadcastReceiver, context, intent);
        return 403;
    }

    private static synchronized q e(Context context, String str) {
        try {
            if (f19021i == null) {
                f19021i = new q(context, str);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19021i;
    }

    public final void f(Context context, Intent intent) {
        int iD;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(stringExtra.length() + 21 + strValueOf.length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(strValueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.a().w();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.a().y();
                }
            }
            iD = -1;
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            iD = d(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(iD);
        }
    }

    private static int g(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        e(context, "com.google.firebase.MESSAGING_EVENT").b(intent, broadcastReceiver.goAsync());
        return -1;
    }

    @Override
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            f(context, intent2);
        } else {
            f(context, intent);
        }
    }
}
