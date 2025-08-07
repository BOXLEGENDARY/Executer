package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1wSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFi1wSDK(String str, String str2, String str3, boolean z7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMediationNetwork = z7;
    }

    public final boolean getMediationNetwork() {
        return this.getMediationNetwork;
    }
}
