package com.roblox.client.pushnotification.v2.receiver;

import E6.c;
import E6.k;
import Q6.m;
import Q6.s;
import U7.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.roblox.client.C2374w;
import com.roblox.client.P;
import com.roblox.client.S;
import com.roblox.client.W;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import h7.l;
import h7.p;
import ha.C2697c;

public class Sendr1PushNotificationReceiver extends W {

    class a implements Runnable {

        final Context f20217d;

        final Intent f20218e;

        a(Context context, Intent intent) {
            this.f20217d = context;
            this.f20218e = intent;
        }

        @Override
        public void run() {
            Intent intentN = Sendr1PushNotificationReceiver.this.n(C2374w.h().i(this.f20217d), this.f20218e);
            intentN.setFlags(268435456);
            Bundle extras = intentN.getExtras();
            if (extras != null) {
                m.c().r(extras);
            }
            String strG = Sendr1PushNotificationReceiver.this.g(this.f20218e);
            this.f20217d.startActivity(intentN);
            e.n().c(strG);
            Sendr1PushNotificationReceiver.this.d(this.f20218e, strG);
        }
    }

    public void d(Intent intent, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        P.m(h(intent), f(intent), i(intent), str);
    }

    private void e(String str, Context context, Intent intent, boolean z7) {
        P.o(str, new s().a(context, "GcmPlatform"), h(intent), f(intent), p.a(context), z7, i(intent), "sendr1");
    }

    private String f(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_ID");
    }

    public String g(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION");
    }

    private String h(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
    }

    private String i(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
    }

    private void j(Context context, Intent intent) {
        if (k.e().f()) {
            l.g("rbx.push", "loadTheApp: (v2) ...(logged in) launch Main.");
            new Handler(Looper.getMainLooper()).postDelayed(new a(context, intent), S.f19839G == 0 ? 1000 : 0);
            return;
        }
        l.g("rbx.push", "loadTheApp: (v2) ...(not logged in) launch Splash.");
        Intent intentN = n(ActivitySplash.J0(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
        Bundle extras = intentN.getExtras();
        if (extras != null) {
            m.c().r(extras);
        }
        intentN.setFlags(268468224);
        String strG = g(intent);
        context.startActivity(intentN);
        e.n().c(strG);
        d(intent, strG);
    }

    private void k(Intent intent, Context context) {
    }

    private void l(Context context, Intent intent) {
        j(context, intent);
        k(intent, context);
        e("clicked", context, intent, true);
    }

    private void m(Context context, Intent intent) {
        l.i("rbx.push", "cleared notifications of type: " + h(intent));
        e("dismissed", context, intent, false);
    }

    public Intent n(Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", intent2.getStringExtra("EXTRA_NOTIFICATION_TYPE"));
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", intent2.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
        return intent;
    }

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
