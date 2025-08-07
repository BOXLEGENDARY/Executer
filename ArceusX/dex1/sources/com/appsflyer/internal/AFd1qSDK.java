package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00168\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", BuildConfig.FLAVOR, "p1", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p2", BuildConfig.FLAVOR, "p3", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;[BLjava/util/Map;I)V", "getCurrencyIso4217Code", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1kSDK;", "component4", "Lcom/appsflyer/internal/AFd1kSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1kSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1kSDK;", BuildConfig.FLAVOR, "Z", "getMonetizationNetwork", "()Z", "()Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1qSDK extends AFc1eSDK {

    private final boolean getMonetizationNetwork;

    private final AFd1kSDK getCurrencyIso4217Code;
    public AFc1kSDK getMediationNetwork;

    public AFd1qSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map map, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, bArr, (i8 & 4) != 0 ? null : map, (i8 & 8) != 0 ? 2000 : i7);
    }

    @Override
    public final AFd1kSDK getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override
    public final String getCurrencyIso4217Code(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return "[RD]: " + str;
    }

    @Override
    public final String getMediationNetwork() {
        AFj1kSDK aFj1kSDK = new AFj1kSDK(this.getMediationNetwork, null, 2, null);
        return aFj1kSDK.getMonetizationNetwork(aFj1kSDK.getRevenue.getMediationNetwork(AFj1kSDK.component1));
    }

    @Override
    public final boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    private AFd1qSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map<String, String> map, int i7) {
        super(bArr, map, i7);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
        this.getMediationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = AFd1kSDK.OCTET_STREAM;
    }

    public AFd1qSDK(AFc1kSDK aFc1kSDK, byte[] bArr) {
        this(aFc1kSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
    }
}
