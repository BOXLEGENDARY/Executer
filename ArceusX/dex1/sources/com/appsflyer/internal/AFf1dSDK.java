package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1dSDK implements AFf1eSDK {
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFf1cSDK getRevenue;

    public AFf1dSDK(AFf1cSDK aFf1cSDK, AFc1oSDK aFc1oSDK, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFf1cSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1oSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, BuildConfig.FLAVOR);
        this.getRevenue = aFf1cSDK;
        this.getMonetizationNetwork = aFc1oSDK;
        this.AFAdRevenueData = appsFlyerProperties;
    }

    @Override
    public final void getMediationNetwork(Map<String, Object> map, AFe1uSDK aFe1uSDK) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1uSDK, BuildConfig.FLAVOR);
        AFf1fSDK mediationNetwork = this.getRevenue.getMediationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.getMonetizationNetwork.component4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (mediationNetwork != null) {
            boolean z7 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getRevenue));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.AFAdRevenueData));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.getMonetizationNetwork));
            if (z7) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", BuildConfig.FLAVOR);
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", mediationNetwork.getCurrencyIso4217Code);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1uSDK != AFe1uSDK.CONVERSION || this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> mapAFAdRevenueData = AFa1zSDK.AFAdRevenueData(map);
        Intrinsics.checkNotNullExpressionValue(mapAFAdRevenueData, BuildConfig.FLAVOR);
        mapAFAdRevenueData.put("api", kotlin.collections.F.f(P9.t.a(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
