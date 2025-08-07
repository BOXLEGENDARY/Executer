package com.roblox.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class W extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        h7.l.a("rbx.broadcast", getClass().getName() + ":onReceive");
        T7.a.c(context);
    }
}
