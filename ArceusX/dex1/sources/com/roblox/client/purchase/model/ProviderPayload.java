package com.roblox.client.purchase.model;

import com.github.luben.zstd.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/purchase/model/ProviderPayload;", BuildConfig.FLAVOR, "granted_asset_ids", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<init>", "(Ljava/util/List;)V", "getGranted_asset_ids", "()Ljava/util/List;", "setGranted_asset_ids", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProviderPayload {

    @SerializedName("granted_asset_ids")
    private List<Long> granted_asset_ids;

    public ProviderPayload() {
        List list = null;
        this(list, 1, list);
    }

    public static ProviderPayload copy$default(ProviderPayload providerPayload, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = providerPayload.granted_asset_ids;
        }
        return providerPayload.copy(list);
    }

    public final List<Long> component1() {
        return this.granted_asset_ids;
    }

    public final ProviderPayload copy(List<Long> granted_asset_ids) {
        return new ProviderPayload(granted_asset_ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProviderPayload) && Intrinsics.b(this.granted_asset_ids, ((ProviderPayload) other).granted_asset_ids);
    }

    public final List<Long> getGranted_asset_ids() {
        return this.granted_asset_ids;
    }

    public int hashCode() {
        List<Long> list = this.granted_asset_ids;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGranted_asset_ids(List<Long> list) {
        this.granted_asset_ids = list;
    }

    public String toString() {
        return "ProviderPayload(granted_asset_ids=" + this.granted_asset_ids + ")";
    }

    public ProviderPayload(List<Long> list) {
        this.granted_asset_ids = list;
    }

    public ProviderPayload(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }
}
