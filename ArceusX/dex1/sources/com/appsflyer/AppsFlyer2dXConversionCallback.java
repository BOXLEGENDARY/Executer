package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
import org.json.JSONException;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    private void getMonetizationNetwork(java.lang.String r7, java.lang.String r8) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.getMonetizationNetwork(java.lang.String, java.lang.String):void");
    }

    @Override
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override
    public void onAttributionFailure(String str) throws JSONException {
        getMonetizationNetwork("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override
    public void onConversionDataFail(String str) throws JSONException {
        getMonetizationNetwork("onAttributionFailure", str);
    }

    @Override
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
