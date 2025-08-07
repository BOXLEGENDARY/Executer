package com.appsflyer;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/appsflyer/AFPurchaseDetails;", BuildConfig.FLAVOR, "Lcom/appsflyer/AFPurchaseType;", "purchaseType", BuildConfig.FLAVOR, "purchaseToken", "productId", "price", "currency", "<init>", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/appsflyer/AFPurchaseType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/appsflyer/AFPurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/AFPurchaseDetails;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrency", "getPrice", "getProductId", "getPurchaseToken", "Lcom/appsflyer/AFPurchaseType;", "getPurchaseType"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFPurchaseDetails {
    public final String currency;
    public final String price;
    public final String productId;
    public final String purchaseToken;
    public final AFPurchaseType purchaseType;

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
        this.price = str3;
        this.currency = str4;
    }

    public static AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i7 & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        String str5 = str;
        if ((i7 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        String str6 = str2;
        if ((i7 & 8) != 0) {
            str3 = aFPurchaseDetails.price;
        }
        String str7 = str3;
        if ((i7 & 16) != 0) {
            str4 = aFPurchaseDetails.currency;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str5, str6, str7, str4);
    }

    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final AFPurchaseDetails copy(AFPurchaseType purchaseType, String purchaseToken, String productId, String price, String currency) {
        Intrinsics.checkNotNullParameter(purchaseType, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(purchaseToken, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(productId, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(price, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(currency, BuildConfig.FLAVOR);
        return new AFPurchaseDetails(purchaseType, purchaseToken, productId, price, currency);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) other;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.b(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.b(this.productId, aFPurchaseDetails.productId) && Intrinsics.b(this.price, aFPurchaseDetails.price) && Intrinsics.b(this.currency, aFPurchaseDetails.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return (((((((this.purchaseType.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.currency.hashCode();
    }

    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.purchaseType + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", price=" + this.price + ", currency=" + this.currency + ")";
    }
}
