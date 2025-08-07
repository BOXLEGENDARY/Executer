package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1bSDK {
    public final String AFAdRevenueData;
    public final long getMediationNetwork;
    public final boolean getRevenue;

    public AFf1bSDK(String str, long j7, boolean z7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.AFAdRevenueData = str;
        this.getMediationNetwork = j7;
        this.getRevenue = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return Intrinsics.b(this.AFAdRevenueData, aFf1bSDK.AFAdRevenueData) && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.getRevenue == aFf1bSDK.getRevenue;
    }

    public final int hashCode() {
        int iHashCode = ((this.AFAdRevenueData.hashCode() * 31) + Long.hashCode(this.getMediationNetwork)) * 31;
        boolean z7 = this.getRevenue;
        int i7 = z7;
        if (z7 != 0) {
            i7 = 1;
        }
        return iHashCode + i7;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.AFAdRevenueData + ", receivedTime=" + this.getMediationNetwork + ", isQueued=" + this.getRevenue + wtzgsqRsIZB.NDsLd;
    }
}
