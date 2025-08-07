package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1bSDK {
    final String getCurrencyIso4217Code;
    final String getRevenue;

    public AFd1bSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1bSDK)) {
            return false;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) obj;
        return Intrinsics.b(this.getCurrencyIso4217Code, aFd1bSDK.getCurrencyIso4217Code) && Intrinsics.b(this.getRevenue, aFd1bSDK.getRevenue);
    }

    public final int hashCode() {
        return (this.getCurrencyIso4217Code.hashCode() * 31) + this.getRevenue.hashCode();
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.getCurrencyIso4217Code + ", host=" + this.getRevenue + ")";
    }
}
