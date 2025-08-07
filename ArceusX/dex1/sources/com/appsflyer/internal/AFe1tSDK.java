package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AFe1tSDK<Result> implements Comparable<AFe1tSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component3 = new AtomicInteger();
    public final Set<AFe1uSDK> AFAdRevenueData;
    private final int areAllFieldsValid;
    private Throwable component1;
    private final String component2;
    private long component4;
    private boolean equals;
    public volatile int getCurrencyIso4217Code;
    public AFe1rSDK getMediationNetwork;
    public final AFe1uSDK getMonetizationNetwork;
    public final Set<AFe1uSDK> getRevenue;

    public AFe1tSDK(AFe1uSDK aFe1uSDK, AFe1uSDK[] aFe1uSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFAdRevenueData = hashSet;
        this.getRevenue = new HashSet();
        int iIncrementAndGet = component3.incrementAndGet();
        this.areAllFieldsValid = iIncrementAndGet;
        this.equals = false;
        this.getCurrencyIso4217Code = 0;
        this.getMonetizationNetwork = aFe1uSDK;
        Collections.addAll(hashSet, aFe1uSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(iIncrementAndGet);
        }
    }

    protected abstract AFe1rSDK AFAdRevenueData() throws Exception;

    protected final boolean areAllFieldsValid() {
        return this.equals;
    }

    public final Throwable component3() {
        return this.component1;
    }

    @Override
    public final AFe1rSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMediationNetwork = null;
        this.component1 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getCurrencyIso4217Code++;
        try {
            AFe1rSDK aFe1rSDKAFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = aFe1rSDKAFAdRevenueData;
            return aFe1rSDKAFAdRevenueData;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1tSDK aFe1tSDK = (AFe1tSDK) obj;
        if (this.getMonetizationNetwork != aFe1tSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1tSDK.component2);
    }

    public void getCurrencyIso4217Code() {
    }

    public void getMediationNetwork() {
        this.equals = true;
    }

    protected void getMonetizationNetwork(Throwable th) {
    }

    protected abstract boolean getMonetizationNetwork();

    @Override
    public final int compareTo(AFe1tSDK<?> aFe1tSDK) {
        int i7 = this.getMonetizationNetwork.f13594w - aFe1tSDK.getMonetizationNetwork.f13594w;
        if (i7 != 0) {
            return i7;
        }
        if (this.component2.equals(aFe1tSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1tSDK.areAllFieldsValid;
    }

    protected abstract long getRevenue();

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component2.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMonetizationNetwork);
        sb.append("-");
        sb.append(this.component2);
        String string = sb.toString();
        if (String.valueOf(this.areAllFieldsValid).equals(this.component2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("-");
        sb2.append(this.areAllFieldsValid);
        return sb2.toString();
    }
}
