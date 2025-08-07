package com.appsflyer.internal;

import P9.o;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u000e\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFf1nSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFf1nSDK;)V", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "()J", BuildConfig.FLAVOR, "getRevenue", "()Z", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1kSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFf1nSDK;", "LP9/h;", "getMediationNetwork", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1pSDK {
    private static final long getMediationNetwork = TimeUnit.HOURS.toSeconds(24);

    private final AFc1kSDK getMonetizationNetwork;

    private final P9.h AFAdRevenueData;

    private final AFf1nSDK getCurrencyIso4217Code;

    private final P9.h getMediationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "AFAdRevenueData", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends kotlin.jvm.internal.l implements Function0<Boolean> {
        AnonymousClass3() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getMediationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends kotlin.jvm.internal.l implements Function0<Boolean> {
        AnonymousClass5() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
        }
    }

    public AFf1pSDK(AFc1kSDK aFc1kSDK, AFf1nSDK aFf1nSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1nSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = aFf1nSDK;
        this.AFAdRevenueData = P9.i.b(new AnonymousClass3());
        this.getMediationNetwork = P9.i.b(new AnonymousClass5());
    }

    public final boolean AFAdRevenueData() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }

    public final boolean getRevenue() {
        AFh1bSDK aFh1bSDK;
        AFi1zSDK aFi1zSDK = this.getCurrencyIso4217Code.getMediationNetwork;
        if (aFi1zSDK == null) {
            AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1iSDK aFh1iSDK = aFi1zSDK.getRevenue;
        boolean currencyIso4217Code = (aFh1iSDK == null || (aFh1bSDK = aFh1iSDK.getRevenue) == null) ? false : aFh1bSDK.getCurrencyIso4217Code();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1nSDK aFf1nSDK = this.getCurrencyIso4217Code;
        return currencyIso4217Code || jCurrentTimeMillis - aFf1nSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1nSDK.getMonetizationNetwork);
    }

    public final long getCurrencyIso4217Code() {
        Object objB;
        String currencyIso4217Code = this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMediationNetwork;
        }
        try {
            o.a aVar = P9.o.e;
            objB = P9.o.b(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        Throwable thE = P9.o.e(objB);
        if (thE != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thE.getMessage(), thE);
            objB = Long.valueOf(getMediationNetwork);
        }
        return ((Number) objB).longValue();
    }
}
