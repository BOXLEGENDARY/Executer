package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1iSDK<T> {
    public final Function0<T> getMonetizationNetwork;

    public AFc1iSDK(Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = function0;
    }
}
