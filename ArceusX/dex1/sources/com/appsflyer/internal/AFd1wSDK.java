package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1wSDK implements AFd1vSDK {
    private final AFc1aSDK AFAdRevenueData;

    public AFd1wSDK(AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1aSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = aFc1aSDK;
    }

    @Override
    public final void getMonetizationNetwork(byte[] bArr, Map<String, String> map, int i7) {
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
        if (new AFd1uSDK(bArr, map, 2000).getCurrencyIso4217Code()) {
            this.AFAdRevenueData.getMonetizationNetwork();
        }
    }
}
