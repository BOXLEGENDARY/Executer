package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1fSDK {
    final int AFAdRevenueData;
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFf1fSDK(int i7, int i8, int i9, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.getRevenue = i7;
        this.getMediationNetwork = i8;
        this.AFAdRevenueData = i9;
        this.getMonetizationNetwork = i10;
        this.getCurrencyIso4217Code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        return this.getRevenue == aFf1fSDK.getRevenue && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && Intrinsics.b(this.getCurrencyIso4217Code, aFf1fSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getRevenue) * 31) + Integer.hashCode(this.getMediationNetwork)) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + Integer.hashCode(this.getMonetizationNetwork)) * 31) + this.getCurrencyIso4217Code.hashCode();
    }

    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getRevenue + ", gdprApplies=" + this.getMediationNetwork + ", cmpSdkId=" + this.AFAdRevenueData + ", cmpSdkVersion=" + this.getMonetizationNetwork + ", tcString=" + this.getCurrencyIso4217Code + ")";
    }
}
