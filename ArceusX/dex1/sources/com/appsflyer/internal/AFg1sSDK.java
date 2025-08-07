package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1aSDK;

public final class AFg1sSDK implements AFf1aSDK {
    private static IntentFilter getCurrencyIso4217Code = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override
    public final AFf1aSDK.AFa1ySDK getMonetizationNetwork(Context context) {
        String str = null;
        float f7 = 0.0f;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, getCurrencyIso4217Code);
            if (intentRegisterReceiver != null) {
                if (2 == intentRegisterReceiver.getIntExtra("status", -1)) {
                    int intExtra = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f7 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFf1aSDK.AFa1ySDK(f7, str);
    }
}
