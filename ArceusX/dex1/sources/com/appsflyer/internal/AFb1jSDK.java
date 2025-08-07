package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

final class AFb1jSDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFAdRevenueData;
    private boolean component2;
    private boolean component3;
    private final AFi1rSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    final AFb1aSDK.AFa1uSDK getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    public AFb1jSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1rSDK aFi1rSDK, AFb1aSDK.AFa1uSDK aFa1uSDK) {
        Intrinsics.checkNotNullParameter(executor, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(scheduledExecutorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFa1oSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1rSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFa1uSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getCurrencyIso4217Code = aFi1rSDK;
        this.getMonetizationNetwork = aFa1uSDK;
    }

    public static final void AFAdRevenueData(final AFb1jSDK aFb1jSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, BuildConfig.FLAVOR);
        aFb1jSDK.component2 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFb1jSDK.getMediationNetwork;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    AFb1jSDK.getMonetizationNetwork(this.f13645d);
                }
            };
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getCurrencyIso4217Code(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    public static final void getMediationNetwork(AFb1jSDK aFb1jSDK, AFh1vSDK aFh1vSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1vSDK, BuildConfig.FLAVOR);
        if (!aFb1jSDK.component3) {
            try {
                aFb1jSDK.getMonetizationNetwork.getMonetizationNetwork(aFh1vSDK);
            } catch (Exception e7) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e7, true);
            }
        }
        aFb1jSDK.component2 = false;
        aFb1jSDK.component3 = true;
    }

    public static final void getMonetizationNetwork(AFb1jSDK aFb1jSDK) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, BuildConfig.FLAVOR);
        if (aFb1jSDK.component3 && aFb1jSDK.component2) {
            aFb1jSDK.component3 = false;
            try {
                aFb1jSDK.getMonetizationNetwork.getRevenue();
            } catch (Exception e7) {
                AFLogger.afErrorLog("Listener threw exception! ", e7);
            }
        }
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.getCurrencyIso4217Code) {
            aFa1oSDK.getCurrencyIso4217Code = intent;
        }
        this.getCurrencyIso4217Code.getMonetizationNetwork(activity);
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        this.AFAdRevenueData.execute(new Runnable() {
            @Override
            public final void run() {
                AFb1jSDK.AFAdRevenueData(this.f13648d);
            }
        });
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        final AFh1vSDK aFh1vSDK = new AFh1vSDK(activity, this.getCurrencyIso4217Code);
        this.AFAdRevenueData.execute(new Runnable() {
            @Override
            public final void run() {
                AFb1jSDK.getMediationNetwork(this.f13646d, aFh1vSDK);
            }
        });
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bundle, BuildConfig.FLAVOR);
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
    }
}
