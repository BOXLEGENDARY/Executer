package com.roblox.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;

public class ShareAppChosenReceiver extends W {
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get(JmBUOGMwkkxg.mWZ);
            if (obj instanceof ComponentName) {
                b7.b.b(((ComponentName) obj).getPackageName());
            }
        }
    }
}
