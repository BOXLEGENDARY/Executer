package com.roblox.client.fcm;

import Q6.m;
import Wa.c;
import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import a5.InterfaceC1578a;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.h;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import g6.k;
import h7.l;
import ha.C2697c;

public class RegistrationIntentService extends h {

    private static final String[] f19985C = {"friends", "chat"};

    class a implements InterfaceC1570g<InterfaceC1578a> {

        final Intent f19986a;

        a(Intent intent) {
            this.f19986a = intent;
        }

        @Override
        public void onSuccess(InterfaceC1578a interfaceC1578a) {
            String strA = interfaceC1578a.a();
            l.g("rbx.push", "RegistrationIntentService.onHandleIntent() Token: " + strA);
            m.c().m(new S6.l(strA, RegistrationIntentService.this, this.f19986a.getBooleanExtra("AuthorizePushNotificationsForUser", false)));
        }
    }

    class b implements InterfaceC1569f {
        b() {
        }

        @Override
        public void onFailure(Exception exc) {
            l.e("rbx.push", "Unable to retrieve push notification token", exc);
            c.d().j(new k("PushNotificationRegistrationFailed"));
        }
    }

    static void i(Context context, Intent intent) {
        h.c(context, intent.getComponent(), 1100, intent);
    }

    @Override
    protected void f(Intent intent) {
        E6.c.e().k(this);
        C2697c.e(this);
        if (intent == null) {
            return;
        }
        try {
            Task<InterfaceC1578a> taskB = FirebaseInstanceId.a().b();
            taskB.e(new a(intent));
            taskB.c(new b());
        } catch (IllegalStateException e7) {
            l.e("rbx.push", "Unable to initialize Firebase", e7);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        T7.a.c(this);
    }
}
