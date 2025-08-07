package com.appsflyer.internal;

import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFh1gSDK {
    public final int AFAdRevenueData;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getRevenue;

    public AFh1gSDK(String str, int i7, int i8, long j7) {
        this.getRevenue = str;
        this.AFAdRevenueData = i7;
        this.getCurrencyIso4217Code = i8;
        this.getMediationNetwork = j7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1gSDK.class == obj.getClass()) {
            AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
            if (this.AFAdRevenueData == aFh1gSDK.AFAdRevenueData && this.getCurrencyIso4217Code == aFh1gSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFh1gSDK.getMediationNetwork && (str = this.getRevenue) != null && str.equals(aFh1gSDK.getRevenue)) {
                return true;
            }
        }
        return false;
    }

    public final String getMediationNetwork() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(GObvYfBKohxpYX.wiJH, this.getRevenue);
            jSONObject.put("min", this.AFAdRevenueData);
            jSONObject.put("expire", this.getCurrencyIso4217Code);
            jSONObject.put("ttl", this.getMediationNetwork);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getRevenue;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.AFAdRevenueData) * 31) + this.getCurrencyIso4217Code) * 31) + ((int) this.getMediationNetwork);
    }
}
