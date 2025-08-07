package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFd1uSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, "p2", "<init>", "([BLjava/util/Map;I)V", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1kSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFd1kSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1kSDK;", "()Ljava/lang/String;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1uSDK extends AFc1eSDK {
    private final AFd1kSDK getMediationNetwork;
    public static String AFAdRevenueData = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    public AFd1uSDK(byte[] bArr, Map<String, String> map, int i7) {
        super(bArr, map, i7);
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
        this.getMediationNetwork = AFd1kSDK.JSON;
    }

    @Override
    public final AFd1kSDK getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @Override
    public final String getCurrencyIso4217Code(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return AFd1pSDK.AFAdRevenueData(str);
    }

    @Override
    public final String getMediationNetwork() {
        String str = String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, BuildConfig.FLAVOR);
        return str;
    }
}
