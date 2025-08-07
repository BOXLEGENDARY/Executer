package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFg1hSDK {
    private static String AFAdRevenueData(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 == 0 || i7 == str.length() - 1) {
                sb.append(str.charAt(i7));
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static void getRevenue(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", AFAdRevenueData(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(jSONObject);
                aFLogger.i(aFh1zSDK, sb.toString());
            } catch (JSONException e7) {
                AFLogger.INSTANCE.e(AFh1zSDK.OTHER, "Not able to log the payload", e7);
            }
        }
    }
}
