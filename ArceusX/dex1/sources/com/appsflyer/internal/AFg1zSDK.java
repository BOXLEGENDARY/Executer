package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;

public final class AFg1zSDK {
    public final AFc1sSDK getMediationNetwork;

    public AFg1zSDK(Context context) {
        AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        this.getMediationNetwork = (AFc1sSDK) AFa1zSDK.AFAdRevenueData(new Object[]{monetizationNetwork, context}, -1165261210, 1165261210, System.identityHashCode(monetizationNetwork));
    }

    public static boolean AFAdRevenueData(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            int i7 = FirebaseMessagingService.f19122d;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFj1nSDK.J_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static boolean getRevenue(AFc1sSDK aFc1sSDK) {
        return aFc1sSDK.AFAdRevenueData("sentRegisterRequestToAF", false);
    }

    public final AFf1bSDK getMediationNetwork() {
        String string;
        String string2;
        String strAFAdRevenueData = this.getMediationNetwork.AFAdRevenueData("afUninstallToken", (String) null);
        long mediationNetwork = this.getMediationNetwork.getMediationNetwork("afUninstallToken_received_time", 0L);
        boolean zAFAdRevenueData = this.getMediationNetwork.AFAdRevenueData("afUninstallToken_queued", false);
        this.getMediationNetwork.getCurrencyIso4217Code("afUninstallToken_queued", false);
        if (strAFAdRevenueData == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            strAFAdRevenueData = string2.split(",")[r0.length - 1];
        }
        if (mediationNetwork == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 2) {
                try {
                    mediationNetwork = Long.parseLong(strArrSplit[strArrSplit.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (strAFAdRevenueData != null) {
            return new AFf1bSDK(strAFAdRevenueData, mediationNetwork, zAFAdRevenueData);
        }
        return null;
    }
}
