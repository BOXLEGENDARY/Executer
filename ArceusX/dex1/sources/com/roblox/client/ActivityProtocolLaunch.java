package com.roblox.client;

import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;

public class ActivityProtocolLaunch extends S {
    private static boolean H0(String str) {
        for (String str2 : j6.d.a().d().split(",")) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    protected void I0() {
        startActivity(C2374w.h().i(this));
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (j6.d.a().n3()) {
            h7.l.g("rbx.externallaunch", "GameActivity = ON. Start new GameActivity to handle intent...");
            U7.e.n().k(intent);
            if (!com.roblox.client.startup.a.k()) {
                C2374w.h().d().h(intent);
            }
            startActivity(MainGameActivity.y0(this, StartedForEnum.PROTOCOL_LAUNCH));
            finish();
            return;
        }
        if (com.roblox.client.startup.a.k()) {
            h7.l.g("rbx.externallaunch", "onCreate() activity on existing stack - checking to launch data");
            I0();
            String dataString = intent.getDataString();
            U7.e.n().c(dataString);
            if (!j6.d.a().i2() && (!j6.d.a().M() || !H0(dataString))) {
                C2374w.h().f().g(true);
            }
        } else {
            h7.l.g("rbx.externallaunch", "onCreate() activity is root - starting splash (regular start-up flow)");
            String dataString2 = intent.getDataString();
            if (JNIBaseUrlProtocol.maybeHandleColdStartProtocolLaunch(dataString2)) {
                h7.l.a("rbx.externallaunch", "Base URL is switched for cold launch, cancel flag fetching for prefetch() and restart it.");
                com.roblox.client.startup.a.y(getApplicationContext());
            }
            JNIWebLoginProtocol.maybeHandleColdStartProtocolLaunch(dataString2);
            startActivity(ActivitySplash.J0(this, StartedForEnum.PROTOCOL_LAUNCH));
            U7.e.n().k(intent);
            C2374w.h().d().h(intent);
        }
        finish();
    }
}
