package com.appsflyer.internal;

import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1zSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFa1tSDK implements Runnable {
    private final Map<String, Object> AFAdRevenueData;
    private final AFc1fSDK getMonetizationNetwork;
    private final AFh1tSDK getRevenue;

    public AFa1tSDK(AFc1fSDK aFc1fSDK, AFh1tSDK aFh1tSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1fSDK;
        this.getRevenue = aFh1tSDK;
        this.AFAdRevenueData = map;
    }

    @Override
    public final void run() {
        AFf1tSDK aFf1xSDK;
        if (this.getRevenue.AFAdRevenueData()) {
            AFf1rSDK aFf1rSDK = new AFf1rSDK(this.getRevenue, this.getMonetizationNetwork);
            aFf1rSDK.copy = this.AFAdRevenueData;
            aFf1xSDK = aFf1rSDK;
        } else {
            aFf1xSDK = this.getRevenue instanceof AFh1pSDK ? new AFf1xSDK((AFh1pSDK) this.getRevenue, this.getMonetizationNetwork) : new AFf1tSDK(this.getRevenue, this.getMonetizationNetwork);
        }
        AFe1sSDK aFe1sSDKEquals = this.getMonetizationNetwork.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFf1xSDK));
        this.getMonetizationNetwork.AFInAppEventType();
        if (AFe1ySDK.getRevenue()) {
            AFe1vSDK currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code();
            AFh1tSDK aFh1tSDK = this.getRevenue;
            Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
            if (AFj1nSDK.getMediationNetwork(currencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork)) {
                AFe1zSDK.Companion companion = AFe1zSDK.INSTANCE;
                AFe1zSDK aFe1zSDKAFAdRevenueData = AFe1zSDK.Companion.AFAdRevenueData(aFh1tSDK);
                if (aFe1zSDKAFAdRevenueData == null) {
                    return;
                }
                currencyIso4217Code.getCurrencyIso4217Code(aFe1zSDKAFAdRevenueData, AFe1vSDK.AnonymousClass1.getMediationNetwork);
            }
        }
    }
}
