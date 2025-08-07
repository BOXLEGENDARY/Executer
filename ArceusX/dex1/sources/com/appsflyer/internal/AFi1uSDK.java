package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1uSDK extends AFi1xSDK {
    private String getCurrencyIso4217Code;
    private Network getRevenue;

    public static final class AFa1zSDK extends ConnectivityManager.NetworkCallback {
        AFa1zSDK() {
        }

        @Override
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, BuildConfig.FLAVOR);
            AFi1uSDK.this.getRevenue = network;
        }

        @Override
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, BuildConfig.FLAVOR);
            AFi1uSDK.this.getRevenue = network;
            AFi1uSDK.this.getCurrencyIso4217Code = "NetworkLost";
        }
    }

    public AFi1uSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = "unknown";
        AFa1zSDK aFa1zSDK = new AFa1zSDK();
        try {
            ConnectivityManager connectivityManager = this.getRevenue;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1zSDK);
            }
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override
    public final boolean AFAdRevenueData() {
        Network network = this.getRevenue;
        if (network == null) {
            return false;
        }
        if (Intrinsics.b(this.getCurrencyIso4217Code, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getRevenue;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return w_(networkCapabilities);
        }
        return false;
    }

    @Override
    protected final String getCurrencyIso4217Code() {
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getRevenue;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }
}
