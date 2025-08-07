package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.github.luben.zstd.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;

public final class AFf1ySDK extends AFe1kSDK<String> {
    private final AFh1rSDK component1;

    public AFf1ySDK(AFh1rSDK aFh1rSDK, AFc1fSDK aFc1fSDK) {
        AFe1uSDK aFe1uSDK = aFh1rSDK.toString;
        AFe1uSDK aFe1uSDK2 = aFe1uSDK == null ? AFe1uSDK.CACHED_EVENT : aFe1uSDK;
        AFe1uSDK[] aFe1uSDKArr = {AFe1uSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1rSDK.getCurrencyIso4217Code);
        sb.append("-");
        sb.append(getMediationNetwork(aFh1rSDK));
        super(aFe1uSDK2, aFe1uSDKArr, aFc1fSDK, sb.toString(), aFh1rSDK.getCurrencyIso4217Code);
        this.component1 = aFh1rSDK;
    }

    @Override
    protected final AppsFlyerRequestListener component2() {
        return this.component1.AFAdRevenueData;
    }

    @Override
    protected final boolean copydefault() {
        return false;
    }

    @Override
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        String strEncodeToString = Base64.encodeToString(this.component1.getRevenue(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        this.component3.getCurrencyIso4217Code(this.component1.component2, strEncodeToString);
        return ((AFe1kSDK) this).areAllFieldsValid.getCurrencyIso4217Code(this.component1);
    }

    @Override
    public final boolean getMonetizationNetwork() {
        ResponseNetwork responseNetwork;
        AFe1uSDK aFe1uSDK = this.component1.toString;
        if (aFe1uSDK == null) {
            aFe1uSDK = AFe1uSDK.CACHED_EVENT;
        }
        return (aFe1uSDK == AFe1uSDK.ARS_VALIDATE && (responseNetwork = ((AFe1kSDK) this).component2) != null && responseNetwork.getStatusCode() == 424) || super.getMonetizationNetwork();
    }

    private static String getMediationNetwork(AFh1rSDK aFh1rSDK) {
        try {
            return new URL(aFh1rSDK.component2).getHost();
        } catch (MalformedURLException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
