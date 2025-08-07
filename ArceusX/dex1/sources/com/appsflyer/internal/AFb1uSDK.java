package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AFb1uSDK<T> {
    public final String AFAdRevenueData;
    public final FutureTask<T> getCurrencyIso4217Code = new FutureTask<>(new Callable<T>() {
        @Override
        public final T call() {
            if (AFb1uSDK.this.getMonetizationNetwork()) {
                return (T) AFb1uSDK.this.getRevenue();
            }
            return null;
        }
    });
    private final String[] getMediationNetwork;
    public final Context getMonetizationNetwork;
    public final Executor getRevenue;

    public AFb1uSDK(Context context, Executor executor, String str, String... strArr) {
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = strArr;
        this.getRevenue = executor;
    }

    public T AFAdRevenueData() {
        try {
            return this.getCurrencyIso4217Code.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e9) {
            AFLogger.afErrorLog(e9.getMessage(), e9, false, false);
            return null;
        }
    }

    public final boolean getMonetizationNetwork() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128);
            if (providerInfoResolveContentProvider != null) {
                if (Arrays.asList(this.getMediationNetwork).contains(AFj1nSDK.L_(this.getMonetizationNetwork.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7, false, true);
            return false;
        }
    }

    protected abstract T getRevenue();
}
