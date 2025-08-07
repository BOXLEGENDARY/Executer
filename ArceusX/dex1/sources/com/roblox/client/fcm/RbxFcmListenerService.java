package com.roblox.client.fcm;

import E6.c;
import Q6.m;
import Q6.t;
import S6.k;
import android.content.Intent;
import androidx.core.app.p;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import h7.l;
import j6.d;
import java.util.Map;
import z6.C3086b;

public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override
    public void onCreate() {
        super.onCreate();
        T7.a.c(this);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        c.e().k(getApplicationContext());
        Map<String, String> mapL = remoteMessage.l();
        com.roblox.client.startup.a.r(this);
        String str = mapL.get("version");
        l.g("rbx.push", "RGLS.onMessageReceived() NotificationVersion: " + str);
        C3086b.f().u(this);
        if (!d.a().Y0() || p.b(this).a()) {
            if (str != null) {
                new T6.a().d(this, mapL);
                return;
            }
            String str2 = mapL.get("message");
            l.g("rbx.push", "RGLS.onMessageReceived() Message: " + str2);
            new t().e(this, str2);
        }
    }

    @Override
    public void onNewToken(String str) {
        super.onNewToken(str);
        l.g("rbx.push", "Token refresh triggered.");
        if (m.c().f(this) == k.FIREBASE_CLOUD_MESSAGING) {
            RegistrationIntentService.i(this, new Intent(this, (Class<?>) RegistrationIntentService.class));
        }
    }
}
