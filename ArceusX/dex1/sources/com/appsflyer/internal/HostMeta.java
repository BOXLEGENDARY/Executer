package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "p1", "Lcom/appsflyer/internal/AFe1wSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1wSDK;)V", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1wSDK;", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HostMeta {

    public final AFe1wSDK method;

    public final String prefix;

    public final String name;

    public HostMeta(String str, String str2, AFe1wSDK aFe1wSDK) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1wSDK, BuildConfig.FLAVOR);
        this.name = str;
        this.prefix = str2;
        this.method = aFe1wSDK;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof HostMeta)) {
            return false;
        }
        HostMeta hostMeta = (HostMeta) p02;
        return Intrinsics.b(this.name, hostMeta.name) && Intrinsics.b(this.prefix, hostMeta.prefix) && this.method == hostMeta.method;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.prefix;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode();
    }

    public final String toString() {
        return "HostMeta(name=" + this.name + ", prefix=" + this.prefix + ", method=" + this.method + ")";
    }
}
