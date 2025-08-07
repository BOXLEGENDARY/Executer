package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1aSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class AFb1gSDK implements AFb1aSDK {
    private AFb1jSDK AFAdRevenueData;
    private final AFi1rSDK getCurrencyIso4217Code;
    private final Executor getMediationNetwork;
    private final ScheduledExecutorService getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    public AFb1gSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(executor, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(scheduledExecutorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFa1oSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1rSDK, BuildConfig.FLAVOR);
        this.getMediationNetwork = executor;
        this.getMonetizationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getCurrencyIso4217Code = aFi1rSDK;
    }

    @Override
    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData != null;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        AFb1aSDK.AFa1uSDK aFa1uSDK;
        AFb1jSDK aFb1jSDK = this.AFAdRevenueData;
        if (aFb1jSDK == null || (aFa1uSDK = aFb1jSDK.getMonetizationNetwork) == null) {
            return;
        }
        aFa1uSDK.getRevenue();
    }

    @Override
    public final void getMonetizationNetwork(Context context, AFb1aSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFa1uSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.e(applicationContext, BuildConfig.FLAVOR);
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFb1jSDK aFb1jSDK = new AFb1jSDK(this.getMediationNetwork, this.getMonetizationNetwork, this.getRevenue, this.getCurrencyIso4217Code, aFa1uSDK);
        this.AFAdRevenueData = aFb1jSDK;
        if (context instanceof Activity) {
            aFb1jSDK.onActivityResumed((Activity) context);
        }
        Application applicationM_ = AFj1nSDK.M_(context);
        if (applicationM_ != null) {
            applicationM_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }
}
