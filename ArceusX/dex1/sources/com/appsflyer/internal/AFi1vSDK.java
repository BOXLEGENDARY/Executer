package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class AFi1vSDK extends AFi1xSDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Network;", "p0", "Landroid/net/NetworkInfo;", "v_", "(Landroid/net/Network;)Landroid/net/NetworkInfo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function1<Network, NetworkInfo> {
        AnonymousClass1() {
            super(1);
        }

        public final NetworkInfo invoke(Network network) {
            ConnectivityManager connectivityManager = AFi1vSDK.this.getRevenue;
            Intrinsics.d(connectivityManager);
            return connectivityManager.getNetworkInfo(network);
        }
    }

    public AFi1vSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    private static boolean u_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override
    public final boolean AFAdRevenueData() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getRevenue;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getRevenue;
                Intrinsics.d(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (u_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            AFLogger.afErrorLog(tAjeAKSIqDqzNP.INuIR, e7);
            return false;
        }
    }

    @Override
    protected final String getCurrencyIso4217Code() {
        Network[] allNetworks;
        Sequence sequenceT;
        Sequence sequenceR;
        Object next;
        ConnectivityManager connectivityManager = this.getRevenue;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceT = kotlin.collections.i.t(allNetworks)) != null && (sequenceR = kotlin.sequences.g.r(sequenceT, new AnonymousClass1())) != null) {
            Iterator it = sequenceR.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AFi1xSDK.t_((NetworkInfo) next)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }
}
