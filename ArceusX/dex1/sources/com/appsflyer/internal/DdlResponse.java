package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFa1rSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/deeplink/DeepLink;", "AFAdRevenueData", "Z", "getMonetizationNetwork", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DdlResponse {

    private final boolean secondPing;

    public final DeepLink deepLink;

    public DdlResponse(boolean z7, DeepLink deepLink) {
        this.secondPing = z7;
        this.deepLink = deepLink;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof DdlResponse)) {
            return false;
        }
        DdlResponse ddlResponse = (DdlResponse) p02;
        return this.secondPing == ddlResponse.secondPing && Intrinsics.b(this.deepLink, ddlResponse.deepLink);
    }

    public final boolean getSecondPing() {
        return this.secondPing;
    }

    public final int hashCode() {
        boolean z7 = this.secondPing;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i7 = r02 * 31;
        DeepLink deepLink = this.deepLink;
        return i7 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final String toString() {
        return "DdlResponse(secondPing=" + this.secondPing + ", deepLink=" + this.deepLink + ")";
    }

    public DdlResponse(boolean z7, DeepLink deepLink, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z7, (i7 & 2) != 0 ? null : deepLink);
    }

    public DdlResponse() {
        DeepLink deepLink = null;
        this(false, deepLink, 3, deepLink);
    }
}
