package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import k0.BAKp.xAQOwX;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AFg1fSDK extends AFg1gSDK {
    private final AFc1fSDK getRevenue;

    public AFg1fSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        this.getRevenue = aFc1fSDK;
    }

    @Override
    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        if (z9) {
            if (StringsKt.Y(str)) {
                str = xAQOwX.XLypOUPZdKYQFR;
            }
            this.getRevenue.afRDLog().getRevenue(th, withTag$SDK_prodRelease(str, aFh1zSDK));
        }
    }
}
