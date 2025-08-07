package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFa1jSDK implements AFa1lSDK {
    private final AFc1sSDK getMonetizationNetwork;

    public AFa1jSDK(AFc1sSDK aFc1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1sSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1sSDK;
    }

    @Override
    public final void AFAdRevenueData() {
        this.getMonetizationNetwork.getMediationNetwork("deeplink_data");
    }

    @Override
    public final Map<String, Object> getCurrencyIso4217Code() {
        if (this.getMonetizationNetwork.getCurrencyIso4217Code("deeplink_data")) {
            try {
                String strAFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData("deeplink_data", (String) null);
                return strAFAdRevenueData == null ? kotlin.collections.F.h() : AFj1iSDK.getRevenue(new JSONObject(strAFAdRevenueData));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return kotlin.collections.F.h();
    }

    @Override
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.getMonetizationNetwork.getRevenue("deeplink_data", new JSONObject(map).toString());
    }
}
