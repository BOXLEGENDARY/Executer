package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import ya.HnSi.PLHvHoayk;

public final class AFg1cSDK extends AFg1gSDK {
    private final AFc1fSDK getCurrencyIso4217Code;
    private final boolean getMonetizationNetwork;

    public AFg1cSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMonetizationNetwork = true;
    }

    @Override
    public final void d(AFh1zSDK aFh1zSDK, String str, boolean z7) {
        String str2 = PLHvHoayk.NStprgQPglqphH;
        Intrinsics.checkNotNullParameter(aFh1zSDK, str2);
        Intrinsics.checkNotNullParameter(str, str2);
        if (z7) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("D", getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override
    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        if (z10) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("E", getMonetizationNetwork(str, aFh1zSDK));
        }
        if (z10) {
            this.getCurrencyIso4217Code.copy().AFAdRevenueData(th);
        }
    }

    @Override
    public final void force(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code.copy().getMonetizationNetwork("F", getMonetizationNetwork(str, aFh1zSDK));
    }

    @Override
    public final boolean getShouldExtendMsg() {
        return this.getMonetizationNetwork;
    }

    @Override
    public final void i(AFh1zSDK aFh1zSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (z7) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("I", getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override
    public final void v(AFh1zSDK aFh1zSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (z7) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("V", getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override
    public final void w(AFh1zSDK aFh1zSDK, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (z7) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("W", getMonetizationNetwork(str, aFh1zSDK));
        }
    }
}
