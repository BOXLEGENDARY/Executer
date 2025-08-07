package com.appsflyer.internal;

public final class AFh1cSDK {
    public final int AFAdRevenueData;
    public final String areAllFieldsValid;
    public final Throwable component1;
    public final AFh1dSDK component3;
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFh1cSDK(String str, String str2, long j7, long j8, int i7, AFh1dSDK aFh1dSDK, String str3, Throwable th) {
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = str2;
        this.getRevenue = j7;
        this.getMonetizationNetwork = j8;
        this.AFAdRevenueData = i7;
        this.component3 = aFh1dSDK;
        this.areAllFieldsValid = str3;
        this.component1 = th;
    }
}
