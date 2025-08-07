package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFh1xSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", BuildConfig.FLAVOR, "p1", "p2", "p3", "p4", "p5", "p6", BuildConfig.FLAVOR, "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "component2", "getRevenue", "Ljava/lang/Boolean;", "AFAdRevenueData", "getCurrencyIso4217Code", "component3", "component4", "Ljava/util/Map;", "areAllFieldsValid"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdvertisingIdData {

    public Boolean isGaidWithGps;

    public Boolean retry;

    public String gaidError;

    public Map<String, Object> metadata;

    public Boolean isLimited;

    public String advertisingId;

    public Boolean isGaidWithSamsungCloudDev;

    public Boolean isEnabled;

    private AdvertisingIdData(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.advertisingId = str;
        this.isLimited = bool;
        this.isEnabled = bool2;
        this.isGaidWithGps = bool3;
        this.isGaidWithSamsungCloudDev = bool4;
        this.gaidError = str2;
        this.retry = bool5;
        this.metadata = map;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AdvertisingIdData)) {
            return false;
        }
        AdvertisingIdData advertisingIdData = (AdvertisingIdData) p02;
        return Intrinsics.b(this.advertisingId, advertisingIdData.advertisingId) && Intrinsics.b(this.isLimited, advertisingIdData.isLimited) && Intrinsics.b(this.isEnabled, advertisingIdData.isEnabled) && Intrinsics.b(this.isGaidWithGps, advertisingIdData.isGaidWithGps) && Intrinsics.b(this.isGaidWithSamsungCloudDev, advertisingIdData.isGaidWithSamsungCloudDev) && Intrinsics.b(this.gaidError, advertisingIdData.gaidError) && Intrinsics.b(this.retry, advertisingIdData.retry) && Intrinsics.b(this.metadata, advertisingIdData.metadata);
    }

    public final int hashCode() {
        String str = this.advertisingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLimited;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isGaidWithGps;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGaidWithSamsungCloudDev;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.gaidError;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.retry;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.metadata.hashCode();
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.advertisingId + ", isLimited=" + this.isLimited + ", isEnabled=" + this.isEnabled + ", isGaidWithGps=" + this.isGaidWithGps + ", isGaidWithSamsungCloudDev=" + this.isGaidWithSamsungCloudDev + ", gaidError=" + this.gaidError + ", retry=" + this.retry + ", metadata=" + this.metadata + ")";
    }

    public AdvertisingIdData(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? null : bool2, (i7 & 8) != 0 ? null : bool3, (i7 & 16) != 0 ? null : bool4, (i7 & 32) != 0 ? null : str2, (i7 & 64) == 0 ? bool5 : null, (i7 & 128) != 0 ? new HashMap() : map);
    }

    public AdvertisingIdData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
