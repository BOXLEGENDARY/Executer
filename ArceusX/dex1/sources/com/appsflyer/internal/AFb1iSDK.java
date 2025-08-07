package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;

public final class AFb1iSDK {
    public static String AFAdRevenueData;
    public static Boolean getRevenue;

    public static com.appsflyer.internal.AFb1lSDK getMonetizationNetwork(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1iSDK.getMonetizationNetwork(android.content.Context):com.appsflyer.internal.AFb1lSDK");
    }

    public static AFb1lSDK k_(ContentResolver contentResolver) {
        String string;
        if (!getMonetizationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i7 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i7 == 0) {
            return new AFb1lSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i7 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = BuildConfig.FLAVOR;
        }
        return new AFb1lSDK(string, Boolean.TRUE);
    }

    private static boolean getMonetizationNetwork() {
        Boolean bool = getRevenue;
        return bool == null || bool.booleanValue();
    }
}
