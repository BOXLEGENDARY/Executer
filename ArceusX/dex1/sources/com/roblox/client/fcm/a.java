package com.roblox.client.fcm;

import Q6.n;
import S6.k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.p;
import h7.l;

public class a implements n {
    @Override
    public k a() {
        return k.FIREBASE_CLOUD_MESSAGING;
    }

    @Override
    public String b() {
        return "GcmPlatform";
    }

    @Override
    public String c() {
        return "GcmToken";
    }

    @Override
    public void d(Context context, boolean z7) {
        f(context, z7, e(context));
    }

    public boolean e(Context context) {
        return h7.n.b(context);
    }

    void f(Context context, boolean z7, boolean z8) {
        if (z8 && Build.VERSION.SDK_INT >= 33 && !p.b(context).a()) {
            l.g("rbx.push", "New token but notifications disabled. Not registering.");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) RegistrationIntentService.class);
        intent.putExtra("AuthorizePushNotificationsForUser", z7);
        RegistrationIntentService.i(context, intent);
    }
}
