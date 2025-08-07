package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

public final class AFe1bSDK extends AFe1mSDK {
    public AFe1bSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.PURCHASE_VALIDATE, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, map, purchaseValidationCallback);
        this.getRevenue.add(AFe1uSDK.CONVERSION);
    }

    @Override
    public final AFd1mSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2) {
        return ((AFe1kSDK) this).areAllFieldsValid.getMonetizationNetwork(map, str, str2);
    }
}
