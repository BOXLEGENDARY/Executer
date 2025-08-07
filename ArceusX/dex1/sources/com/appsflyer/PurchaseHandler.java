package com.appsflyer;

import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFe1sSDK;
import com.appsflyer.internal.AFj1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

public final class PurchaseHandler {
    public final AFe1sSDK getCurrencyIso4217Code;
    public final AFc1kSDK getMediationNetwork;
    public final AFc1fSDK getMonetizationNetwork;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFc1fSDK aFc1fSDK) {
        this.getMonetizationNetwork = aFc1fSDK;
        this.getMediationNetwork = aFc1fSDK.getRevenue();
        this.getCurrencyIso4217Code = aFc1fSDK.equals();
    }

    public final boolean getMediationNetwork(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) throws IllegalStateException {
        boolean zAFAdRevenueData = AFj1hSDK.AFAdRevenueData(map, strArr, this.getMediationNetwork);
        if (!zAFAdRevenueData && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zAFAdRevenueData;
    }
}
