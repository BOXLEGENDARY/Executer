package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1ySDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AFj1zSDK {
    public final List<AFj1ySDK> AFAdRevenueData = new ArrayList();
    public final AFc1fSDK getMonetizationNetwork;

    public AFj1zSDK(AFc1fSDK aFc1fSDK) {
        this.getMonetizationNetwork = aFc1fSDK;
    }

    public void AFAdRevenueData(AFi1iSDK aFi1iSDK, Runnable runnable) {
        AFc1sSDK aFc1sSDKComponent1 = this.getMonetizationNetwork.component1();
        int iAFAdRevenueData = this.getMonetizationNetwork.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        boolean zAFAdRevenueData = aFc1sSDKComponent1.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z7 = aFi1iSDK.component1 == AFj1ySDK.AFa1vSDK.NOT_STARTED;
        if (iAFAdRevenueData == 1) {
            if (z7 || zAFAdRevenueData) {
                runnable.run();
            }
        }
    }

    public void component2(final Runnable runnable) {
        AFi1cSDK aFi1cSDK = new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.INSTAGRAM, runnable, new Runnable() {
            @Override
            public final void run() {
                this.f13626d.AFAdRevenueData(runnable);
            }
        });
        getMonetizationNetwork(aFi1cSDK);
        aFi1cSDK.getRevenue(this.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
    }

    public void getCurrencyIso4217Code(Runnable runnable) {
        try {
            if (getRevenue(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public static void getMonetizationNetwork() {
    }

    public final void getMediationNetwork(final Runnable runnable) {
        getMonetizationNetwork(new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.FACEBOOK, runnable, new Runnable() {
            @Override
            public final void run() {
                this.f13632d.component2(runnable);
            }
        }));
    }

    public final synchronized AFj1ySDK[] getRevenue() {
        return (AFj1ySDK[]) this.AFAdRevenueData.toArray(new AFj1ySDK[0]);
    }

    public void getRevenue(final Runnable runnable) {
        AFj1gSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork(), new Runnable() {
            @Override
            public final void run() {
                this.f13628d.getCurrencyIso4217Code(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void getMonetizationNetwork(AFj1ySDK aFj1ySDK) {
        this.AFAdRevenueData.add(aFj1ySDK);
    }

    public final AFi1iSDK getMonetizationNetwork(final Runnable runnable) {
        return new AFi1iSDK(new Runnable() {
            @Override
            public final void run() {
                this.f13630d.getRevenue(runnable);
            }
        }, this.getMonetizationNetwork.AFAdRevenueData(), this.getMonetizationNetwork.getRevenue());
    }

    public final boolean getRevenue(AFh1tSDK aFh1tSDK) {
        int iAFAdRevenueData = this.getMonetizationNetwork.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        return (!this.getMonetizationNetwork.component1().AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, false) && iAFAdRevenueData == 1) || (iAFAdRevenueData == 1 && !(aFh1tSDK instanceof AFh1oSDK));
    }

    public final Runnable getMediationNetwork(final AFi1iSDK aFi1iSDK, final Runnable runnable) {
        return new Runnable() {
            @Override
            public final void run() {
                this.f13623d.AFAdRevenueData(aFi1iSDK, runnable);
            }
        };
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork.getRevenue().getRevenue("AF_PREINSTALL_DISABLED", false);
    }

    public void AFAdRevenueData(Runnable runnable) {
        AFi1cSDK aFi1cSDK = new AFi1cSDK(this.getMonetizationNetwork.getRevenue(), this.getMonetizationNetwork.AFAdRevenueData(), AFi1eSDK.FACEBOOK_LITE, runnable, new Runnable() {
            @Override
            public final void run() {
                AFj1zSDK.getMonetizationNetwork();
            }
        });
        getMonetizationNetwork(aFi1cSDK);
        aFi1cSDK.getRevenue(this.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
    }
}
