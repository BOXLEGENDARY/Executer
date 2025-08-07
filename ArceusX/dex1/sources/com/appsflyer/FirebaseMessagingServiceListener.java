package com.appsflyer;

import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }
}
