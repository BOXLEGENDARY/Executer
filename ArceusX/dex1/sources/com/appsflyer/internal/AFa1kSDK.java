package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFa1kSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "Lcom/appsflyer/internal/AFa1lSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V", BuildConfig.FLAVOR, "getRevenue", "(Ljava/lang/String;)Z", BuildConfig.FLAVOR, "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/Object;)V", "getCurrencyIso4217Code", "Ljava/util/Map;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFa1lSDK;", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1kSDK {

    public static final Companion INSTANCE = new Companion(null);
    final Map<String, Object> getCurrencyIso4217Code;
    final AFa1lSDK getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/appsflyer/internal/AFh1tSDK;", "p0", "Lcom/appsflyer/internal/AFa1kSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1tSDK;)Lcom/appsflyer/internal/AFa1kSDK;", "Lcom/appsflyer/internal/AFa1lSDK;", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static AFa1kSDK getCurrencyIso4217Code(AFa1lSDK p02) {
            Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
            return new AFa1kSDK(new LinkedHashMap(), p02, null);
        }

        public static AFa1kSDK getMediationNetwork(AFh1tSDK p02) {
            Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
            Map<String, Object> map = p02.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
            AFa1lSDK aFa1lSDK = null;
            return new AFa1kSDK(map, aFa1lSDK, 2, aFa1lSDK);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1kSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = aFa1lSDK;
    }

    public static final AFa1kSDK getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        return Companion.getMediationNetwork(aFh1tSDK);
    }

    public static final AFa1kSDK getMonetizationNetwork(AFa1lSDK aFa1lSDK) {
        return Companion.getCurrencyIso4217Code(aFa1lSDK);
    }

    public final void AFAdRevenueData(String p02, Object p1) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code.put(p02, p1);
        AFa1lSDK aFa1lSDK = this.getMonetizationNetwork;
        if (aFa1lSDK != null) {
            aFa1lSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
        }
    }

    public final boolean getRevenue(String p02) {
        Intrinsics.checkNotNullParameter(p02, BuildConfig.FLAVOR);
        return this.getCurrencyIso4217Code.containsKey(p02);
    }

    AFa1kSDK(Map map, AFa1lSDK aFa1lSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i7 & 2) != 0 ? null : aFa1lSDK);
    }

    public AFa1kSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }
}
