package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AFe1gSDK extends AFe1kSDK<String> {
    private final AFe1uSDK component1;
    private final Map<String, Object> copy;
    private final AFc1sSDK copydefault;
    private final AFf1eSDK equals;
    private final AFc1kSDK hashCode;
    private final AFg1tSDK toString;

    public AFe1gSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, AFc1fSDK aFc1fSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1uSDK, aFe1uSDKArr, aFc1fSDK, null);
        Intrinsics.checkNotNullParameter(aFe1uSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1uSDKArr, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.component1 = aFe1uSDK;
        this.copy = map;
        AFc1kSDK revenue = aFc1fSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, BuildConfig.FLAVOR);
        this.hashCode = revenue;
        AFc1sSDK aFc1sSDKComponent1 = aFc1fSDK.component1();
        Intrinsics.checkNotNullExpressionValue(aFc1sSDKComponent1, BuildConfig.FLAVOR);
        this.copydefault = aFc1sSDKComponent1;
        AFg1tSDK aFg1tSDKComponent3 = aFc1fSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFg1tSDKComponent3, BuildConfig.FLAVOR);
        this.toString = aFg1tSDKComponent3;
        AFf1eSDK aFf1eSDKV = aFc1fSDK.v();
        Intrinsics.checkNotNullExpressionValue(aFf1eSDKV, BuildConfig.FLAVOR);
        this.equals = aFf1eSDKV;
    }

    public abstract AFd1mSDK<String> AFAdRevenueData(Map<String, Object> map, String str, String str2);

    protected boolean component1() {
        return false;
    }

    @Override
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override
    protected final boolean copydefault() {
        return true;
    }

    protected String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        return null;
    }

    @Override
    protected final AFd1mSDK<String> getMediationNetwork(String str) throws JSONException {
        AFd1aSDK aFd1aSDK;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Map<String, Object> mapU = kotlin.collections.F.u(this.copy);
        String monetizationNetwork = getMonetizationNetwork(mapU);
        String currencyIso4217Code = getCurrencyIso4217Code(mapU);
        Map<String, Object> mapU2 = kotlin.collections.F.u(mapU);
        getRevenue(mapU2, monetizationNetwork);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String currencyIso4217Code2 = this.hashCode.getCurrencyIso4217Code();
        if (currencyIso4217Code2 != null && !StringsKt.Y(currencyIso4217Code2)) {
            linkedHashMap.put("advertising_id", currencyIso4217Code2);
        }
        AFb1lSDK monetizationNetwork2 = AFb1iSDK.getMonetizationNetwork(this.hashCode.AFAdRevenueData.getMonetizationNetwork);
        String str2 = null;
        String str3 = monetizationNetwork2 != null ? monetizationNetwork2.getMonetizationNetwork : null;
        if (str3 != null && !StringsKt.Y(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1lSDK aFb1lSDKK_ = AFb1iSDK.k_(this.hashCode.AFAdRevenueData.getMonetizationNetwork.getContentResolver());
        String str4 = aFb1lSDKK_ != null ? aFb1lSDKK_.getMonetizationNetwork : null;
        if (str4 != null && !StringsKt.Y(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mapU2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            AFf1iSDK aFf1iSDK = ((AFe1kSDK) this).component4;
            String str5 = (String) AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDK, this.copydefault}, 527487030, -527487030, System.identityHashCode(aFf1iSDK));
            if (str5 != null && !StringsKt.Y(str5)) {
                linkedHashMap.put("imei", str5);
            }
        }
        String monetizationNetwork3 = AFb1kSDK.getMonetizationNetwork(this.hashCode.getRevenue);
        if (monetizationNetwork3 == null) {
            monetizationNetwork3 = BuildConfig.FLAVOR;
        }
        linkedHashMap.put("appsflyer_id", monetizationNetwork3);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.16.2");
        if (currencyIso4217Code != null && !StringsKt.Y(currencyIso4217Code)) {
            linkedHashMap.put("sdk_connector_version", currencyIso4217Code);
        }
        mapU2.put("device_data", linkedHashMap);
        this.equals.getMediationNetwork(mapU2, this.component1);
        AFd1mSDK<String> aFd1mSDKAFAdRevenueData = AFAdRevenueData(mapU2, str, monetizationNetwork);
        if (aFd1mSDKAFAdRevenueData != null && (aFd1aSDK = aFd1mSDKAFAdRevenueData.getMediationNetwork) != null) {
            str2 = aFd1aSDK.getCurrencyIso4217Code;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(mapU2);
            AFg1hSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1sSDK aFd1sSDK = this.component3;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            aFd1sSDK.getCurrencyIso4217Code(str2, string);
        }
        return aFd1mSDKAFAdRevenueData;
    }

    protected String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        return null;
    }

    protected void getRevenue(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        map.put("app_id", this.hashCode.AFAdRevenueData.getMonetizationNetwork.getPackageName());
        String mediationNetwork = AFc1kSDK.getMediationNetwork();
        if (mediationNetwork != null) {
            map.put("cuid", mediationNetwork);
        }
        Context context = this.hashCode.AFAdRevenueData.getMonetizationNetwork;
        map.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(context, context.getPackageName()));
        if (component1()) {
            map.put("event_timestamp", Long.valueOf(this.toString.AFAdRevenueData()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
