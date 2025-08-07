package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import java.util.Map;

public final class AFh1pSDK extends AFh1tSDK {
    public final AFAdRevenueData hashCode;
    public final Map<String, Object> toString;

    public AFh1pSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.hashCode = aFAdRevenueData;
        this.toString = map;
    }

    @Override
    public final AFe1uSDK getMediationNetwork() {
        return AFe1uSDK.ADREVENUE;
    }
}
