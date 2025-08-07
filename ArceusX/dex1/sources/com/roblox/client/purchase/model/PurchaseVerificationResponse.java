package com.roblox.client.purchase.model;

import com.github.luben.zstd.BuildConfig;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;", BuildConfig.FLAVOR, "providerPayload", "Lcom/roblox/client/purchase/model/ProviderPayload;", "<init>", "(Lcom/roblox/client/purchase/model/ProviderPayload;)V", "getProviderPayload", "()Lcom/roblox/client/purchase/model/ProviderPayload;", "setProviderPayload", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseVerificationResponse {

    @SerializedName("providerPayload")
    private ProviderPayload providerPayload;

    public PurchaseVerificationResponse() {
        ProviderPayload providerPayload = null;
        this(providerPayload, 1, providerPayload);
    }

    public static PurchaseVerificationResponse copy$default(PurchaseVerificationResponse purchaseVerificationResponse, ProviderPayload providerPayload, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            providerPayload = purchaseVerificationResponse.providerPayload;
        }
        return purchaseVerificationResponse.copy(providerPayload);
    }

    public final ProviderPayload getProviderPayload() {
        return this.providerPayload;
    }

    public final PurchaseVerificationResponse copy(ProviderPayload providerPayload) {
        return new PurchaseVerificationResponse(providerPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PurchaseVerificationResponse) && Intrinsics.b(this.providerPayload, ((PurchaseVerificationResponse) other).providerPayload);
    }

    public final ProviderPayload getProviderPayload() {
        return this.providerPayload;
    }

    public int hashCode() {
        ProviderPayload providerPayload = this.providerPayload;
        if (providerPayload == null) {
            return 0;
        }
        return providerPayload.hashCode();
    }

    public final void setProviderPayload(ProviderPayload providerPayload) {
        this.providerPayload = providerPayload;
    }

    public String toString() {
        return "PurchaseVerificationResponse(providerPayload=" + this.providerPayload + ")";
    }

    public PurchaseVerificationResponse(ProviderPayload providerPayload) {
        this.providerPayload = providerPayload;
    }

    public PurchaseVerificationResponse(ProviderPayload providerPayload, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : providerPayload);
    }
}
