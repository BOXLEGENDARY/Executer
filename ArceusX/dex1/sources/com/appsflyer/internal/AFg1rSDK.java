package com.appsflyer.internal;

import android.content.Context;

public final class AFg1rSDK {
    public static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
