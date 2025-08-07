package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import t4.gYZ.uCYQMIHsy;

public final class AFa1vSDK implements Runnable {
    private final String AFAdRevenueData;
    private final String component2;
    private final Map<String, String> component3;
    private final String component4;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    final String getMonetizationNetwork;
    private final WeakReference<Context> getRevenue;

    AFa1vSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getRevenue = new WeakReference<>(context);
        this.AFAdRevenueData = str;
        this.component4 = str2;
        this.getCurrencyIso4217Code = str4;
        this.getMonetizationNetwork = str5;
        this.getMediationNetwork = str6;
        this.component3 = map;
        this.component2 = str3;
    }

    private static AFf1tSDK getCurrencyIso4217Code(Context context, AFh1jSDK aFh1jSDK) {
        AFa1zSDK.getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFc1fSDK aFc1fSDKAFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData();
        aFh1jSDK.getRevenue(aFc1fSDKAFAdRevenueData.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        AFf1tSDK aFf1tSDK = new AFf1tSDK(aFh1jSDK, aFc1fSDKAFAdRevenueData);
        AFe1sSDK aFe1sSDKEquals = aFc1fSDKAFAdRevenueData.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFf1tSDK));
        return aFf1tSDK;
    }

    static void getMediationNetwork(boolean z7, String str, String str2, String str3, String str4) {
        if (AFa1zSDK.getMediationNetwork != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z7) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1zSDK.getMediationNetwork.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1zSDK.getMediationNetwork;
            if (str4 == null) {
                str4 = GObvYfBKohxpYX.IrRB;
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override
    public final void run() {
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getRevenue.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.component4);
            map.put("sig-data", this.getCurrencyIso4217Code);
            map.put("signature", this.component2);
            Object map2 = new HashMap(map);
            Object obj = this.component3;
            String strAFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().component1().AFAdRevenueData("referrer", BuildConfig.FLAVOR);
            AFh1eSDK aFh1eSDK = new AFh1eSDK();
            aFh1eSDK.areAllFieldsValid = strAFAdRevenueData;
            AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
            Map<String, Object> monetizationNetwork2 = monetizationNetwork.getMonetizationNetwork(aFh1eSDK);
            monetizationNetwork2.put("price", this.getMonetizationNetwork);
            monetizationNetwork2.put("currency", this.getMediationNetwork);
            monetizationNetwork2.put("receipt_data", map2);
            if (obj != null) {
                monetizationNetwork2.put("extra_prms", obj);
            }
            monetizationNetwork2.putAll(monetizationNetwork.AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code());
            aFh1eSDK.getCurrencyIso4217Code(monetizationNetwork2);
            getCurrencyIso4217Code(context, aFh1eSDK);
            map.put("dev_key", this.AFAdRevenueData);
            map.put(uCYQMIHsy.jxyITyFzNpyeSr, context.getPackageName());
            map.put(JmBUOGMwkkxg.KwptzUHbyBC, AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AdvertisingIdData advertisingIdData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().getRevenue().getMediationNetwork.component2;
            AFb1lSDK aFb1lSDK = advertisingIdData != null ? new AFb1lSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null;
            String str2 = aFb1lSDK != null ? aFb1lSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1kSDK aFh1kSDK = (AFh1kSDK) new AFh1kSDK().getCurrencyIso4217Code(map);
            final AFf1tSDK currencyIso4217Code = getCurrencyIso4217Code(context, aFh1kSDK);
            aFh1kSDK.AFAdRevenueData = new AppsFlyerRequestListener() {
                @Override
                public final void onError(int i7, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i7 == 50 && (responseNetwork = ((AFe1kSDK) currencyIso4217Code).component2) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                    AFa1vSDK.getMediationNetwork(false, aFa1vSDK.getCurrencyIso4217Code, aFa1vSDK.getMonetizationNetwork, aFa1vSDK.getMediationNetwork, str3);
                }

                @Override
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1kSDK) currencyIso4217Code).component2.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean("result");
                        AFa1vSDK aFa1vSDK = AFa1vSDK.this;
                        AFa1vSDK.getMediationNetwork(zOptBoolean, aFa1vSDK.getCurrencyIso4217Code, aFa1vSDK.getMonetizationNetwork, aFa1vSDK.getMediationNetwork, jSONObject.toString());
                    } catch (Exception e7) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e7)), e7);
                        AFa1vSDK aFa1vSDK2 = AFa1vSDK.this;
                        AFa1vSDK.getMediationNetwork(false, aFa1vSDK2.getCurrencyIso4217Code, aFa1vSDK2.getMonetizationNetwork, aFa1vSDK2.getMediationNetwork, e7.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1zSDK.getMediationNetwork != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMediationNetwork(false, this.getCurrencyIso4217Code, this.getMonetizationNetwork, this.getMediationNetwork, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
