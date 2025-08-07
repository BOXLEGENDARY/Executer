package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

public final class AFe1jSDK extends AFe1kSDK<String> {
    private final String component1;
    private final AFk1wSDK copy;
    private final AFc1kSDK hashCode;

    public AFe1jSDK(AFc1fSDK aFc1fSDK, String str, AFk1wSDK aFk1wSDK) {
        super(AFe1uSDK.IMPRESSIONS, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, aFc1fSDK, str);
        this.component1 = str;
        this.copy = aFk1wSDK;
        this.hashCode = aFc1fSDK.getRevenue();
    }

    @Override
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override
    protected final boolean copydefault() {
        return false;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFd1cSDK<Result> aFd1cSDK = ((AFe1kSDK) this).component2;
        if (aFd1cSDK != 0) {
            int statusCode = aFd1cSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component1);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.component1);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.component1);
            AFLogger.afInfoLog(sb3.toString(), false);
            String revenue = aFd1cSDK.getRevenue("Location");
            AFk1wSDK aFk1wSDK = this.copy;
            if (aFk1wSDK == null || revenue == null) {
                return;
            }
            aFk1wSDK.AFAdRevenueData = revenue;
            Context context = aFk1wSDK.getMonetizationNetwork.get();
            if (context != null) {
                try {
                    if (aFk1wSDK.AFAdRevenueData != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1wSDK.AFAdRevenueData)).setFlags(268435456));
                    }
                } catch (Exception e7) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e7)), e7);
                }
            }
        }
    }

    @Override
    protected final AFd1mSDK<String> getMediationNetwork(String str) {
        AFd1lSDK aFd1lSDK = ((AFe1kSDK) this).areAllFieldsValid;
        String currencyIso4217Code = this.hashCode.getCurrencyIso4217Code();
        return aFd1lSDK.getMediationNetwork(AFj1eSDK.getCurrencyIso4217Code(currencyIso4217Code) ? this.component1 : Uri.parse(this.component1).buildUpon().appendQueryParameter("advertising_id", currencyIso4217Code).build().toString());
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
