package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1vSDK {
    public final String AFAdRevenueData;
    public final Intent getCurrencyIso4217Code;
    public final String getMediationNetwork;

    public AFh1vSDK(Activity activity, AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1rSDK, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = activity.getIntent();
        this.getMediationNetwork = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getRevenue(activity);
    }
}
