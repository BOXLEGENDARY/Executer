package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import w7.Jld.EZYiRMRTxKdo;

public final class AFf1xSDK extends AFf1tSDK {
    private final AFh1pSDK copy;

    public AFf1xSDK(AFh1pSDK aFh1pSDK, AFc1fSDK aFc1fSDK) {
        super(aFh1pSDK, aFc1fSDK);
        Intrinsics.checkNotNullParameter(aFh1pSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        this.copy = aFh1pSDK;
    }

    @Override
    protected final void getRevenue(AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        super.getRevenue(aFh1tSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copy.hashCode;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, BuildConfig.FLAVOR);
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copy.toString;
        if (map != null && !map.isEmpty()) {
            List listM = CollectionsKt.m(new String[]{EZYiRMRTxKdo.DnLnj, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listM.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, BuildConfig.FLAVOR);
        map2.put("ad_network", linkedHashMap3);
    }
}
