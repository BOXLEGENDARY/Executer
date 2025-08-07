package com.roblox.client.pushnotification.notificationreceivers;

import E6.c;
import E6.k;
import Q6.m;
import Q6.p;
import Q6.s;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.room.kU.HguUe;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import com.roblox.client.W;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import h7.l;
import ha.C2697c;
import ha.C2710o;
import ha.C2711p;

public abstract class a extends W {
    protected static void h(Context context, String str) {
        new C2711p().a(context, str);
    }

    protected static void i(String str, String str2, String str3) {
        new C2710o().a(str, str2, str3);
    }

    public static void j(Intent intent, Context context) {
        if (intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            l.i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            i(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            return;
        }
        l.i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        h(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
    }

    protected void a(Context context, int i7) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i7);
    }

    public void b(String str) {
        p.c().d(str).clear();
    }

    protected void c(Context context) {
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    protected void d(String str, Context context, Intent intent, String str2, String str3, boolean z7, String str4) {
        P.n(str, new s().a(context, "GcmPlatform"), str4, intent.getStringExtra(HguUe.HajKvsBQtKkB), str2, str3, z7, f(intent), "base2");
    }

    protected void e(String str, Context context, Intent intent, boolean z7, String str2) {
        P.o(str, new s().a(context, "GcmPlatform"), str2, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), h7.p.a(context), z7, f(intent), "base");
    }

    protected String f(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        return (stringExtra == null || stringExtra.isEmpty()) ? "0" : stringExtra;
    }

    protected void g(Context context, Intent intent) {
        Intent intentN;
        if (k.e().f()) {
            l.g("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            intentN = n(context, C2374w.h().i(context), intent);
            intentN.setFlags(268435456);
        } else {
            l.g("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            intentN = n(context, ActivitySplash.J0(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
            intentN.setFlags(268468224);
        }
        Bundle extras = intentN.getExtras();
        if (extras != null) {
            m.c().r(extras);
        }
        context.startActivity(intentN);
    }

    protected void k(String str, Context context, Intent intent, String str2) {
        b(str);
        h(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        d("actionTaken", context, intent, str2, h7.p.a(context), true, "FriendRequestReceived");
    }

    protected void l(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        l.i("rbx.push", "notification of type " + stringExtra + " clicked");
        g(context, intent);
        b(stringExtra);
        j(intent, context);
        e("clicked", context, intent, true, stringExtra);
    }

    protected void m(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        l.i("rbx.push", "cleared notifications of type: " + stringExtra);
        b(stringExtra);
        e("dismissed", context, intent, false, stringExtra);
    }

    protected abstract Intent n(Context context, Intent intent, Intent intent2);

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        c.e().k(context);
        com.roblox.client.startup.a.r(context);
        C2697c.e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                m(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                l(context, intent);
            }
        }
    }
}
