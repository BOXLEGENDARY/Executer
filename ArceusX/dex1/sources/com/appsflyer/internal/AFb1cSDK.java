package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFb1cSDK {
    public final String AFAdRevenueData;
    public final int getCurrencyIso4217Code;

    public AFb1cSDK(int i7, String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = i7;
        this.AFAdRevenueData = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1cSDK)) {
            return false;
        }
        AFb1cSDK aFb1cSDK = (AFb1cSDK) obj;
        return this.getCurrencyIso4217Code == aFb1cSDK.getCurrencyIso4217Code && Intrinsics.b(this.AFAdRevenueData, aFb1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.getCurrencyIso4217Code) * 31) + this.AFAdRevenueData.hashCode();
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.getCurrencyIso4217Code + ", id=" + this.AFAdRevenueData + ")";
    }
}
