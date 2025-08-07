package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFd1oSDK;", "Lcom/appsflyer/internal/AFd1aSDK;", BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "p2", "p3", BuildConfig.FLAVOR, "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1oSDK extends AFd1aSDK {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1oSDK$AFa1tSDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "p0", "p1", "p2", "p3", "p4", "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String AFAdRevenueData(String p02, String p1, String p22, String p32, String p42) {
            Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(p1, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(p32, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(p42, BuildConfig.FLAVOR);
            return AFj1hSDK.AFAdRevenueData(TextUtils.join("\u2063", new String[]{p42, p22, p02 + p1}), p32);
        }

        static String getMediationNetwork(String p02, String p1, String p22) {
            return String.format(AFd1lSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName()) + p02 + p22 + "?device_id=" + p1;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    AFd1oSDK(String str, Map map, byte[] bArr, String str2, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i7 & 4) != 0 ? null : bArr, (i7 & 8) != 0 ? "GET" : str2, (i7 & 16) != 0 ? false : z7);
    }

    public static final AFd1oSDK getMonetizationNetwork(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        String mediationNetwork = Companion.getMediationNetwork(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1oSDK aFd1oSDK = new AFd1oSDK(mediationNetwork, kotlin.collections.F.k(new Pair[]{P9.t.a("Connection", "close"), P9.t.a("af_request_epoch_ms", strValueOf), P9.t.a("af_sig", Companion.AFAdRevenueData(str, str3, str2, str4, strValueOf))}), null, null, false, 28, null);
        aFd1oSDK.component2 = 10000;
        return aFd1oSDK;
    }

    private AFd1oSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z7) {
        super(str, bArr, str2, map, z7);
    }
}
