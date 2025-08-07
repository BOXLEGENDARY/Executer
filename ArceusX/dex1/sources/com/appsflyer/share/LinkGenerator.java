package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1zSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1sSDK;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LinkGenerator {
    private final String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map<String, String> copy = new HashMap();
    private String equals;
    private String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    String getRevenue;
    private String hashCode;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFAdRevenueData = str;
    }

    private Map<String, String> AFAdRevenueData() {
        HashMap map = new HashMap();
        map.put("pid", this.AFAdRevenueData);
        String str = this.component4;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getMonetizationNetwork;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component2;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getCurrencyIso4217Code;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.areAllFieldsValid;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component3;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.hashCode != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashCode);
            String str7 = this.component1;
            if (str7 != null) {
                String str8 = BuildConfig.FLAVOR;
                this.component1 = str7.replaceFirst("^[/]", BuildConfig.FLAVOR);
                if (!this.hashCode.endsWith("/")) {
                    str8 = "/";
                }
                sb.append(str8);
                sb.append(this.component1);
            }
            map.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.copy.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1jSDK.AFAdRevenueData(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copy.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copy.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(AFj1fSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName()));
        } else {
            sb.append(this.getMediationNetwork);
        }
        if (this.getRevenue != null) {
            sb.append('/');
            sb.append(this.getRevenue);
        }
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapAFAdRevenueData.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.equals;
    }

    public String getCampaign() {
        return this.getCurrencyIso4217Code;
    }

    public String getChannel() {
        return this.getMonetizationNetwork;
    }

    public String getMediaSource() {
        return this.AFAdRevenueData;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copy);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.hashCode = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.getMediationNetwork = String.format("https://%s/%s", str2, str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.equals = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getCurrencyIso4217Code = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getMonetizationNetwork = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component4 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.equals;
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1zSDK.getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFc1fSDK aFc1fSDKAFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData();
        AFe1iSDK aFe1iSDK = new AFe1iSDK(aFc1fSDKAFAdRevenueData, UUID.randomUUID(), string, mapAFAdRevenueData, str, responseListener, this);
        AFe1sSDK aFe1sSDKEquals = aFc1fSDKAFAdRevenueData.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFe1iSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() {
            @Override
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
