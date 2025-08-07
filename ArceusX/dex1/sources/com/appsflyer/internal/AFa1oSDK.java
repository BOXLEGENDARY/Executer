package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1oSDK {
    public String AFAdRevenueData;
    public final AFc1fSDK areAllFieldsValid;
    public long component1;
    public String[] component4;
    public Intent getCurrencyIso4217Code;
    public DeepLinkListener getMonetizationNetwork;
    public Map<String, String> getRevenue;
    public List<List<String>> getMediationNetwork = new ArrayList();
    public final List<String> component3 = new ArrayList();

    public AFa1oSDK(AFc1fSDK aFc1fSDK) {
        this.areAllFieldsValid = aFc1fSDK;
    }

    private boolean g_(android.content.Intent r10, com.appsflyer.internal.AFa1kSDK r11) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1oSDK.g_(android.content.Intent, com.appsflyer.internal.AFa1kSDK):boolean");
    }

    private static void getMonetizationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private Uri h_(Object obj, Iterator<String> it) throws JSONException {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e7);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork == null) {
            getMonetizationNetwork(str);
        } else {
            AFLogger.INSTANCE.d(AFh1zSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getCurrencyIso4217Code(new DeepLinkResult(null, error));
        }
    }

    public final void e_(AFa1kSDK aFa1kSDK, Intent intent, Context context) {
        AFc1gSDK aFc1gSDK = (AFc1gSDK) this.areAllFieldsValid;
        if (context != null) {
            aFc1gSDK.AFAdRevenueData.getMonetizationNetwork = context.getApplicationContext();
        }
        if (!g_(intent, aFa1kSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component1().AFAdRevenueData("ddl_sent", false)) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1sSDK aFe1sSDKEquals = this.areAllFieldsValid.equals();
            aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(new AFf1zSDK(aFa1pSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.component1().getCurrencyIso4217Code("ddl_sent", true);
    }

    public final void f_(AFa1kSDK aFa1kSDK, Uri uri) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(this, aFa1kSDK, uri, this.component3);
        AFe1sSDK aFe1sSDKEquals = this.areAllFieldsValid.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFf1wSDK));
        this.getCurrencyIso4217Code = null;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFh1zSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(aFh1zSDK, sb.toString());
        try {
            this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void getMediationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink monetizationNetwork = DeepLink.getMonetizationNetwork(map);
                    monetizationNetwork.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(monetizationNetwork, null);
                } catch (JSONException e7) {
                    AFLogger.INSTANCE.e(AFh1zSDK.DDL, "Error occurred", e7, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getCurrencyIso4217Code(deepLinkResult);
                return;
            } catch (Throwable th) {
                getCurrencyIso4217Code(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1zSDK.getMonetizationNetwork().getRevenue;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void i_(AFa1kSDK aFa1kSDK, Uri uri, Uri uri2) {
        if (!aFa1kSDK.getRevenue("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? BuildConfig.FLAVOR : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb.toString());
                }
            }
            String str2 = this.AFAdRevenueData;
            if (str2 != null && this.getRevenue != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", BuildConfig.FLAVOR);
                aFa1kSDK.getCurrencyIso4217Code.put("appended_query_params", encodedQuery);
                AFa1lSDK aFa1lSDK = aFa1kSDK.getMonetizationNetwork;
                if (aFa1lSDK != null) {
                    aFa1lSDK.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", BuildConfig.FLAVOR);
            aFa1kSDK.getCurrencyIso4217Code.put("af_deeplink", string);
            AFa1lSDK aFa1lSDK2 = aFa1kSDK.getMonetizationNetwork;
            if (aFa1lSDK2 != null) {
                aFa1lSDK2.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
            }
        }
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1nSDK.K_(this.areAllFieldsValid.AFLogger().getMonetizationNetwork, map, uri);
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFe1aSDK.equals()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", BuildConfig.FLAVOR);
            aFa1kSDK.getCurrencyIso4217Code.put("isBrandedDomain", bool);
            AFa1lSDK aFa1lSDK3 = aFa1kSDK.getMonetizationNetwork;
            if (aFa1lSDK3 != null) {
                aFa1lSDK3.getMonetizationNetwork(aFa1kSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFe1aSDK.copy()) {
            this.areAllFieldsValid.e().getMediationNetwork(map);
            return;
        }
        aFe1aSDK.component1 = new AFe1aSDK.AFa1ySDK() {
            @Override
            public final void getMediationNetwork(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1oSDK.this.getMediationNetwork(map);
            }

            @Override
            public final void getMonetizationNetwork(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }
        };
        AFe1sSDK aFe1sSDKEquals = this.areAllFieldsValid.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFe1aSDK));
    }
}
