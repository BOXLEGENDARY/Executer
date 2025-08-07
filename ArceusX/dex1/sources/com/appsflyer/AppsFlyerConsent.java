package com.appsflyer;

import Y3.qE.KpBmp;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\n"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "isUserSubjectToGDPR", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "hasConsentForAdStorage", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/appsflyer/AppsFlyerConsent;", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getHasConsentForAdStorage", "getHasConsentForAdsPersonalization", "getHasConsentForDataUsage", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppsFlyerConsent {

    public static final Companion INSTANCE = new Companion(null);
    public final Boolean hasConsentForAdStorage;
    public final Boolean hasConsentForAdsPersonalization;
    public final Boolean hasConsentForDataUsage;
    public final Boolean isUserSubjectToGDPR;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent$Companion;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "Lcom/appsflyer/AppsFlyerConsent;", "forGDPRUser", "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", "forNonGDPRUser", "()Lcom/appsflyer/AppsFlyerConsent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final AppsFlyerConsent forGDPRUser(boolean hasConsentForDataUsage, boolean hasConsentForAdsPersonalization) {
            return new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(hasConsentForDataUsage), Boolean.valueOf(hasConsentForAdsPersonalization), null, 8, null);
        }

        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(Boolean.FALSE, null, null, null, 8, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.isUserSubjectToGDPR = bool;
        this.hasConsentForDataUsage = bool2;
        this.hasConsentForAdsPersonalization = bool3;
        this.hasConsentForAdStorage = bool4;
    }

    public static AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i7 & 2) != 0) {
            bool2 = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i7 & 4) != 0) {
            bool3 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        if ((i7 & 8) != 0) {
            bool4 = appsFlyerConsent.hasConsentForAdStorage;
        }
        return appsFlyerConsent.copy(bool, bool2, bool3, bool4);
    }

    public static final AppsFlyerConsent forGDPRUser(boolean z7, boolean z8) {
        return INSTANCE.forGDPRUser(z7, z8);
    }

    public static final AppsFlyerConsent forNonGDPRUser() {
        return INSTANCE.forNonGDPRUser();
    }

    public final Boolean getIsUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForAdStorage() {
        return this.hasConsentForAdStorage;
    }

    public final AppsFlyerConsent copy(Boolean isUserSubjectToGDPR, Boolean hasConsentForDataUsage, Boolean hasConsentForAdsPersonalization, Boolean hasConsentForAdStorage) {
        return new AppsFlyerConsent(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization, hasConsentForAdStorage);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) other;
        return Intrinsics.b(this.isUserSubjectToGDPR, appsFlyerConsent.isUserSubjectToGDPR) && Intrinsics.b(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.b(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization) && Intrinsics.b(this.hasConsentForAdStorage, appsFlyerConsent.hasConsentForAdStorage);
    }

    public final Boolean getHasConsentForAdStorage() {
        return this.hasConsentForAdStorage;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final int hashCode() {
        Boolean bool = this.isUserSubjectToGDPR;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasConsentForDataUsage;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasConsentForAdsPersonalization;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasConsentForAdStorage;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.isUserSubjectToGDPR + ", hasConsentForDataUsage=" + this.hasConsentForDataUsage + ", hasConsentForAdsPersonalization=" + this.hasConsentForAdsPersonalization + ", hasConsentForAdStorage=" + this.hasConsentForAdStorage + KpBmp.dDBxseS;
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bool, (i7 & 2) != 0 ? null : bool2, (i7 & 4) != 0 ? null : bool3, (i7 & 8) != 0 ? null : bool4);
    }

    public AppsFlyerConsent() {
        this(null, null, null, null, 15, null);
    }

    public AppsFlyerConsent(Boolean bool) {
        this(bool, null, null, null, 14, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2) {
        this(bool, bool2, null, null, 12, null);
    }

    public AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, null, 8, null);
    }
}
