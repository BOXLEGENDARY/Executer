package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", BuildConfig.FLAVOR, "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1wSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFi1wSDK;", "Landroid/net/NetworkInfo;", BuildConfig.FLAVOR, "t_", "(Landroid/net/NetworkInfo;)Z", "AFAdRevenueData", "()Z", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "getRevenue", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFi1xSDK {

    ConnectivityManager getRevenue;

    private final TelephonyManager getMediationNetwork;

    public AFi1xSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Object systemService = context.getSystemService("connectivity");
        this.getRevenue = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.getMediationNetwork = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean t_(NetworkInfo p02) {
        if (p02 != null) {
            return p02.isConnectedOrConnecting();
        }
        return false;
    }

    public abstract boolean AFAdRevenueData();

    protected abstract String getCurrencyIso4217Code();

    public final AFi1wSDK getMediationNetwork() {
        Throwable th;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getMediationNetwork;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th2) {
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    th = th2;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                    return new AFi1wSDK(getCurrencyIso4217Code(), networkOperatorName, simOperatorName, AFAdRevenueData());
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFi1wSDK(getCurrencyIso4217Code(), networkOperatorName, simOperatorName, AFAdRevenueData());
    }
}
