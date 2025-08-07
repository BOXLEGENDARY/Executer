package com.appsflyer.internal;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1ySDK {
    public final Context AFAdRevenueData;
    public AFi1xSDK getRevenue;

    public AFi1ySDK(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.AFAdRevenueData = context;
    }
}
