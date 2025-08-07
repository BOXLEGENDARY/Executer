package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFi1nSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1nSDK(long j7, long j8, String str, String str2) {
        this.getMonetizationNetwork = j7;
        this.getRevenue = j8;
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1nSDK)) {
            return false;
        }
        AFi1nSDK aFi1nSDK = (AFi1nSDK) obj;
        return this.getMonetizationNetwork == aFi1nSDK.getMonetizationNetwork && this.getRevenue == aFi1nSDK.getRevenue && Intrinsics.b(this.AFAdRevenueData, aFi1nSDK.AFAdRevenueData) && Intrinsics.b(this.getCurrencyIso4217Code, aFi1nSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.getMonetizationNetwork) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getCurrencyIso4217Code + ")";
    }
}
