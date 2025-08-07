package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class AFc1kSDK {
    private static String getMonetizationNetwork = "340";
    public final AFc1hSDK AFAdRevenueData;
    private final Executor component2;
    public final AFc1oSDK getMediationNetwork;
    public final AFc1sSDK getRevenue;
    private Bundle areAllFieldsValid = null;
    public String getCurrencyIso4217Code = BuildConfig.FLAVOR;

    public AFc1kSDK(AFc1hSDK aFc1hSDK, AFc1sSDK aFc1sSDK, AFc1oSDK aFc1oSDK, Executor executor) {
        this.AFAdRevenueData = aFc1hSDK;
        this.getRevenue = aFc1sSDK;
        this.getMediationNetwork = aFc1oSDK;
        this.component2 = executor;
    }

    public static String AFAdRevenueData() {
        return UUID.randomUUID().toString();
    }

    public static String areAllFieldsValid() {
        StringBuilder sb = new StringBuilder("version: 6.16.2 (build ");
        sb.append(getMonetizationNetwork);
        sb.append(")");
        return sb.toString();
    }

    public static String getMediationNetwork() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String getMonetizationNetwork() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getRevenue() {
        return "6.16.2";
    }

    public final String component1() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getCurrencyIso4217Code("CHANNEL");
        }
        if (string == null || !string.equals(BuildConfig.FLAVOR)) {
            return string;
        }
        return null;
    }

    public final boolean component3() {
        return !this.getMediationNetwork.getRevenue();
    }

    public final String getCurrencyIso4217Code(String str) {
        Object obj;
        try {
            if (this.areAllFieldsValid == null) {
                this.areAllFieldsValid = ((PackageItemInfo) this.AFAdRevenueData.getMonetizationNetwork.getPackageManager().getApplicationInfo(this.AFAdRevenueData.getMonetizationNetwork.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.areAllFieldsValid;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final String getMediationNetwork(Context context) {
        try {
            return new AFb1mSDK(context, this.component2).getCurrencyIso4217Code();
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th, true, false, false);
            return null;
        }
    }

    public final boolean getRevenue(String str, boolean z7) {
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        return currencyIso4217Code != null ? Boolean.parseBoolean(currencyIso4217Code) : z7;
    }

    public static boolean getRevenue(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.INSTANCE.e(AFh1zSDK.PUBLIC_API, "Could not check if app is pre installed", e7);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    public final String getMediationNetwork(String str) {
        try {
            int identifier = this.AFAdRevenueData.getMonetizationNetwork.getResources().getIdentifier(str, "string", this.AFAdRevenueData.getMonetizationNetwork.getPackageName());
            if (identifier != 0) {
                return this.AFAdRevenueData.getMonetizationNetwork.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e7) {
            StringBuilder sb = new StringBuilder("Could not load string resource!");
            sb.append(e7.getMessage());
            AFLogger.afErrorLog(sb.toString(), e7);
            return null;
        }
    }

    public final String getCurrencyIso4217Code() {
        AdvertisingIdData advertisingIdData = this.getMediationNetwork.component2;
        AFb1lSDK aFb1lSDK = advertisingIdData != null ? new AFb1lSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
        if (aFb1lSDK != null) {
            return aFb1lSDK.getMonetizationNetwork;
        }
        return null;
    }
}
