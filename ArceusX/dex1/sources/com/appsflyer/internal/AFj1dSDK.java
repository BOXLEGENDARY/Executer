package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1dSDK implements AFj1bSDK {
    @Override
    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        String str2 = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str2, BuildConfig.FLAVOR);
        return str2;
    }
}
