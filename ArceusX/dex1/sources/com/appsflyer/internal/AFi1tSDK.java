package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1tSDK extends AFi1xSDK {
    public AFi1tSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, wtzgsqRsIZB.osLOqmYnGV);
    }

    @Override
    public final boolean AFAdRevenueData() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, BuildConfig.FLAVOR);
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, BuildConfig.FLAVOR);
            if (list == null || !list.isEmpty()) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface.isUp() && Intrinsics.b(networkInterface.getName(), "tun0")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e7) {
            AFLogger.afErrorLog("Failed collecting ivc data", e7);
            return false;
        }
    }

    @Override
    protected final String getCurrencyIso4217Code() {
        ConnectivityManager connectivityManager = this.getRevenue;
        if (connectivityManager != null) {
            if (AFi1xSDK.t_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1xSDK.t_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }
}
